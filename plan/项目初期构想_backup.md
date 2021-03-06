项目初期构想（项目以英文为主，后续删除）
============================================================
本项目是一个数据转换的抽象，现在完成了一个很初步的例子，证明了我的设想的可行性。
但因为喵喵酱脑子笨，这个设想没有找到什么现成的理论支持，空想起来特别郁闷，建模也很难建，
所以在这里说说这个项目的一些核心思想，让各位 dalao 帮帮忙和提提意见。
如果有什么轮子的话那就真是太好了，自己搞起来累得要死。

#### 项目灵感完全来自于 slick 的 shape

在很久以前做一个 slick 动态 create 插件的时候就发现了一个事情，slick 的列可以被转化成迭代的
tuple2（HList），然后动态化。后来这个插件经过几次完全的重构（地址[umr](https://github.com/djx314/umr)），
修复了一些调用上的问题，现在已经以另一种形式集成到本项目中了。
再加上开发了一个动态数据读写的工具（已经废了），这个项目的构想基本成型。

#### 一些参考实现的调用样例

首先看几段代码：[代码段1](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/circe/CirceModels.scala#L11)
，一眼你就看出了`class CirceModelReader0`这段 slick table 风格的属性声明代码（真是怀念没有 codegen 的那些日子），
然后再看`class CirceModelReader1`，这个类在`CirceModelReader0`的基础上复写了 2 个方法，
增加了一些验证逻辑。

然后是调用代码：[代码段2](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/circe/circe/CirceController.scala#L22)
，可见这里的 play action 用了一个`BodyParser`（抄某位 dalao 的代码，暴力膜），把刚才的
`CirceModelReader0`和`CirceModelReader1`作为参数传入，然后 2 个方法内部的`request.body`的类型判定
已经是`Student`类型了。

这个一般 play-json 库都能做的功能到了这里到底有什么不一样呢？我详细给大家分析一下。

一般的 play-json 库如果结合上业务，逻辑处理可以分为几个阶段（忽略 http 行为，只针对业务）：
* 判断请求 body 是不是 json，如果不是，返回 400
* 如果是 json，把 json decode 到 case class，如果 decode 失败，返回 400
* 如果解析成功，进行 dto 转换，或者干脆不转换直接用
* 各方面验证，如果验证失败，返回对应信息到前端，或者如果逻辑太复杂，干脆返回标准 400
* 如果验证成功，进行数据库操作，返回对应信息

而上述这个例子的话，可以看看测试用例：[代码段3](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/circe/circe/CirceSpec.scala#L58)  
大家可以看到，如果输入验证失败的信息，对应字段的错误信息将会被返回，其实，这段代码的实际过程如下：
* 判断请求 body 是不是 json 以及 jsonObject，如果不是，返回 400 和 json 格式的错误信息
* 如果是 jsonObject，则对每一个字段进行解析，因为字段属性本来就需要显式声明，所以可以实现类似 dto 的功能，
以及很方便地处理一些细微异构字段。
* 在解析属性的同时，将会对`CirceModelReader1`声明的逻辑进行验证操作，支持 future 验证，也就是说，
你可以在这里验证学生姓名是否唯一这些数据库相关的操作。
* 如果字段不能解析（非空字段为 null、类型不符合或其他错误），将会对应每一个字段返回验证失败信息。如果解析正确，
但是验证失败，则返回该字段的验证错误信息。两个阶段的信息将会一同返回前端。
* 如果所有验证信息都通过，将生成对象，进入 controller。

对比：
* dto，json decode，带逻辑验证都可以在`CirceModelReader1`内部一次性完成，得到的结果可以直接进行数据库操作。
* 验证逻辑十分灵活，支持 future 验证（当然这是附加的），不需要再在业务逻辑单独编写并且规划错误信息返回的具体格式。
* decode 的具体错误可以以可读的方式返回给前端。
* 各阶段错误一次性返回，不会出现先返回 json deocde 失败的 400 页面，再返回学号不唯一这些多阶段返回的情况。
* 都支持多字段同时参加一个验证（本来例子中没有体现此功能，但已有实现计划）。  

当然，这个库的功能并不止这些，具体功能我会在最后一节说明。

#### 原理

根据一个十分重要的概念：`type class`和`slick` `shape`的实现方式发展而来。参考一段代码：
```scala
trait Writer {
  type DataType
  val encoder: Encoder[DataType]
  val data: DataType
}
```
如果有这么一个 Writer，不管他的内部类型是什么，只要能够被实例化出来，他都能够把数据 encode 成一个 json 对象。  

但是数据一般都是跟 Writer 分离开来处理的。所以会有下面这个结构
```scala
trait Writer {
  type DataType
  val encoder: Encoder[DataType]
}

val writers: List[Writer] = ???
val data: List[Any] = ???

def encode(writers: List[Writer], data: List[Any]): List[Json] =
  writers.zip(data).map { case (eachWriter, eachData) => eachWriter.encoder.encode(eachData.asInstanceOf[eachWriter.DataType]) }
```

只要 writers 和 data 都遵循一定的规律，就可以顺利 encode。  
这时候问题来了，我得到的只是 List[Any]，如何变回熟悉的对象结构（例如 case class）呢？这就需要 shape 了。

shape 的作用有以下几个大方面：

##### 读
* 把复杂结构的 Reader（参考 slick 的 table 和 circe 的 Encoder）转化为 List[Reader]
* 把单一的 List[Any] 按照 Reader 的声明方式格式化成对应的对象（case class）

##### 写
* 把复杂结构的 Writer 转化为 List[Writer]
* 把复杂的 case class 转化为与 List[Writer] 一一对应的 List[Any]

于是，一个类似 slick table 的数据转换的库就实现了。但用法却不止这些。

这个库主要的目的并不在 encode 和 decode 方面，而是关注于类型相同，但 type class 行为却不同的情况。

其实上面所说的 Writer 不只有一个 encoder，一个 Writer 在设计上一般包含 3 个部分，每个部分都可以有很多元素：
* 类型不相关的列信息，最明显的就是列名。
* 类型相关，且相同类型表现一样的信息，就是 type class 本身的概念。
* 类型相关，但表现不同的信息，例如 validator。

有了这 3 类信息，我们才可以完成上述例子的所有功能。

有了这些要素，就可以在生成数据的时候使用 Writers 和 shape 来读取和生成目标对象（参考 slick）。  

其实 circe，play-json，play 的 form，slick 等库和框架都或多或少地使用了这个概念，
这个库只不过是把这个概念独立提取出来，让用户自己在一个统一规范的写法和一些基本工具的帮助下实现各式各样的、静态类型安全的、
动态数据类型兼容（例如 Map[String, Json]）的，甚至静态字段和动态数据混合（这个需求是本项目的初衷）的数据转换模型。  

例如这个例子[代码段5](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/aa/Def.scala#L34)
则体现了静态字段和动态数据混合（动态数据类型是：Map[String, Any]，可以类型安全地还原每一列数据）这一特性，很好地把现有的 slick
代码与 sangria 结合，在不影响原逻辑的情况下只对数据输出进行处理，做到动态部分按需获取列，静态部分无论如何都会求值，享受类型安全的好处。
当然本例子只是可行性测试阶段，很多地方还未完善，例如属性名需要声明两次。

此外，如果数据类型相同，多个数据转换的逻辑还可以在同一个声明字段中共存，
方便聚合相同字段的不同类逻辑，提取的时候会在编译器的帮助下分离不同范畴的列声明（这个用法是自由的，没有强制性）。  

例如在这个可行性测试的例子中[代码段6](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/slick/dynamic/SlickDynTest.scala#L17-L32)，name 和 age 都使用了 core 模块中的 mixin
方法，用不同的顺序混合 rep（slick 列数据输出）和 fitlerRep（针对 slick filter 的扩展）。
然后 umrUnwrap（已经定义好的帮助方法）则只提取了 rep 的逻辑，filterUnwrap 只提取了 fitlerRep 的逻辑。
这种写法是可选的，但这个功能可以帮助你有针对性地对两种或多种逻辑进行组合，降低代码量。  

#### 项目计划
* 实现有层级的数据结构，可以切换上下文（参考 json 的对象嵌套和数据库的一对多结构）
* 和 poi-collection 结合实现 excel 对象的读写，只做好单行数据的读写。
* slick <-> json，slick <-> poi，slick <-> singria 的按需读取和写入。  
本情况在某些情景下比较有用，例如一个 table，只有 id 等几列是确定不变的，
但除此之外的其他列只有文字信息（List[ColumnInfo]）并且在项目运行的时候也在变化中，连一个标准的
slick table 都不能构建，这时候就可以通过
match case 针对几种类型生成 column，然后建造由 column 到 column 的通道，达到在 sql
层面动态控制输出、渲染列和读取、更新列的效果，而且类型安全。
混合的数据类型可以使得在做表间链接的时候十分方便，而在输出的时候只需要把动态信息和静态信息合并即可。
（例如`model.caseClass.asJsonObject ++ JsonObject.fromMap(model.dynMap)`）
* json -> slick 的动态过滤。可以通过对字段的标记，声明哪些列可以被过滤，哪些列可以被排序，由输入的字符串
或者 json 决定。
* 更高级别的 sangria 封装。
* 解决任何变态数据验证逻辑，各类变态输出规格，甚至 case class 里面有一个 DBIO 属性你都可以用教科书式的
写法做转换。
* 分享我做的最可怕的 slick 例子（1k 行一个 query），在完全类型安全的情况下，4 个表动态
join，动态排序，动态过滤，动态列输出，多视图（json，poi）。
* 扩展：简化列声明逻辑，生成默认列声明，并且以 override 等形式去修改列信息，
做到生成的列声明源码文件不需要做任何的改动，减少因为 model 字段更新而需要重新生成的可维护性问题。
或者以其他奇淫手段减少代码量。

#### 其他例子

昨晚又贪玩加了一个例子（这些例子都是贪快撸出来的，所有命名包名都是随便来，跳过就好）  
这个例子是对 slick 的 filter 的一个扩展，做了一大坨封装之后（我是用了 2 个多小时，毕竟之前已经做过 N 遍了）  
[代码段4（建模部分）](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/slick/async/SlickFilterTest.scala)
[代码段4（调用部分）](https://github.com/scalax/asuna/blob/master/src/test/scala/net/scalax/asuna/slick/async/AsyncTest.scala#L67-L98)
第一个例子生成的 sql 是：
```sql
select "id", "name", "nick", "age" from "firend" where ("name" = 'jilen') and ("age" = 26)
```
第二个例子生成的 sql 是：
```sql
select "id", "name", "nick", "age" from "firend" where (("name" = '小莎莎') and ("age" = 20)) and ("nick" = '烟流')
```
可以看到第一个例子把 filter 的输入结构化成了 case class。在第二个例子中则更进一步，
体现了静态类型和动态数据结构混合的效果，case class 和 JsonObject
同时传入，而且会自动过滤不能 parse 成 json 的字段和自动过滤没有被标记为可 filter
的的字段。当然，以后某些写法可以简化。其中，第二个例子基本可以做到必要的输入和动态的输入共存的需求。
