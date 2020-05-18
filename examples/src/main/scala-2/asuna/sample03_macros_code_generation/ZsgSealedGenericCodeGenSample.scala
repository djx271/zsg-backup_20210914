package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.{SealedTag, ZsgSealedGeneric}

object ZsgSealedGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = implicitly[ZsgSealedGeneric.SealedGenericApply[Foo]]
    .value(BuildContent.nodeTuple2(BuildContent.tuple2(SealedTag[Bar1], SealedTag[Bar2]), BuildContent.tuple2(SealedTag[Bar3], SealedTag[Bar4])))

  sameType(
    implicitly[
      ZsgSealedGeneric.Aux[Foo, NodeTuple2[ZsgTuple2[SealedTag[Bar1], SealedTag[Bar2]], ZsgTuple2[SealedTag[Bar3], SealedTag[Bar4]]]]
    ],
    genResult
  )

}
