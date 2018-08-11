package net.scalax.asuna.circe.json4s

import net.scalax.asuna.helper.encoder.ForTableInput

sealed trait EncoderContentAbs[D]

trait CirceEncoderContent[D] extends EncoderContentAbs[D] {
  val circeEncoder: Json4sEncoder[D]

}

trait AsunaEncoderContent[D] extends EncoderContentAbs[D] {
  val asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder, Any]

}

object EncoderContentAbs extends AsunaCirceEncoderContentImplicit {

  implicit def circeEncoder[D](implicit encoder: Json4sEncoder[D]): EncoderContentAbs[D] = {
    val encoder1 = encoder
    object impl extends CirceEncoderContent[D] {
      override val circeEncoder = encoder1
    }
    impl
  }

}

trait AsunaCirceEncoderContentImplicit {

  implicit def asunaEncoder[D](implicit aeo: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder, Any]): EncoderContentAbs[D] = {
    object impl extends AsunaEncoderContent[D] {
      override val asunaEncoder = aeo
    }
    impl
  }

}