package org.scalax.asuna

import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric, ModelApply}
import org.scalax.asuna.mapper.item.BuildTagContect

object Test {

  case class Foo(i1: String, i2: String, i3: Int, i4: Int, i5: Long, i6: String, i7: String, i8: String, i9: Int, i10: Int)

  val value = Foo(i1 = "i1", i2 = "i2", i3 = 3, i4 = 4, i5 = 5L, i6 = "i6", i7 = "i7", i8 = "i8", i9 = 9, i10 = 10)

  val ap = new ModelApply[Foo]

  val implicit2 = AsunaGeneric
    .init[Foo]
    .init1(
      BuildTagContect.nodeTag(
        BuildTagContect.tag(ap.to(_.i1), ap.to(_.i2), ap.to(_.i3), ap.to(_.i4), ap.to(_.i5), ap.to(_.i6), ap.to(_.i7), ap.to(_.i8)),
        BuildTagContect.tag(ap.to(_.i9), ap.to(_.i10))
      ))
  implicit val implicit3: implicit2.type = implicit2

  val implicit4                          = AsunaNameGeneric.init[Foo].name(BuildTagContect.nodeItem2(BuildTagContect.item8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildTagContect.item2("i9", "i10")))
  implicit val implicit5: implicit4.type = implicit4

  val implicit6 = AsunaGetterGeneric.init((foo: Foo) => {
    BuildTagContect.nodeItem2(BuildTagContect.item8(foo.i1, foo.i2, foo.i3, foo.i4, foo.i5, foo.i6, foo.i7, foo.i8), BuildTagContect.item2(foo.i9, foo.i10))
  })
  implicit val implicit7: implicit6.type = implicit6

  import in._

  implicit val implicit8: ListEncoder[Foo] = encoder

  def main(arr: Array[String]): Unit = {
    println(implicit8.encode(value).mkString("|")) //(i1,i1)|(i2,i2)|(3,i3)|(4,i4)|(5,i5)|(i6,i6)|(i7,i7)|(i8,i8)|(9,i9)|(10,i10)
  }

}