package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }

trait EncoderProvenShape[U, RepCol, DataCol] {
  val dataShapeValue: EncoderShapeValue[U, RepCol, DataCol]
}

object EncoderProvenShape {

  implicit def dataProvenShapeShape[E, U, RepCol, DataCol, R <: EncoderProvenShape[U, RepCol, DataCol]]: EncoderShape.Aux[R, U, R, RepCol, DataCol] = {

    new EncoderShape[R, U, RepCol, DataCol] {
      self =>

      override type Target = R

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R, oldRep: RepCol): RepCol =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), oldRep)

      override def buildData(data: U, rep: R, oldData: DataCol): DataCol =
        rep.dataShapeValue.shape.buildData(data, rep.dataShapeValue.rep, oldData)

    }

  }

}