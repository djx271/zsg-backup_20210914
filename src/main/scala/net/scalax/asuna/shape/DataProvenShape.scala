package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataProvenShape[U, T] {
  val dataShapeValue: DataShapeValue[U, T]
}

object DataProvenShape {

  implicit def dataProvenShapeShape[E, U, T, R <: DataProvenShape[U, T]]: DataShape[R, U, R, T] = {

    new DataShape[R, U, R, T] {
      self =>

      override def packed: DataShape[R, U, R, T] = self

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R): DataRepGroup[T] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep))

      override def takeData(oldData: DataGroup, rep: R): SplitData[U] =
        rep.dataShapeValue.shape.takeData(oldData, rep.dataShapeValue.rep)

    }

  }

}