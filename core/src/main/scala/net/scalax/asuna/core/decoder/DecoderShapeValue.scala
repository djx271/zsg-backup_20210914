package net.scalax.asuna.core.decoder

trait DecoderShapeValue[U, RepCol, DataCol] {
  self =>

  type RepType
  val rep: RepType
  val shape: DecoderShape.Aux[RepType, U, RepType, RepCol, DataCol]

  def dmap[F](cv: U => F): DecoderShapeValue[F, RepCol, DataCol] = new DecoderShapeValue[F, RepCol, DataCol] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DecoderShape[self.RepType, F, RepCol, DataCol] {
      innerSelf =>
      override type Target = self.RepType
      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType, oldRep: RepCol): RepCol = self.shape.toLawRep(self.rep, oldRep)
      override def takeData(currentRep: self.RepType, oldData: DataCol): SplitData[F, DataCol] = {
        val data = self.shape.takeData(currentRep, oldData)
        val current = cv(data.current)
        SplitData(
          current = current,
          left = data.left)
      }

    }
  }

}

object DecoderShapeValue {

  implicit def dataShapeValueShape[U, RepCol, DataCol]: DecoderShape.Aux[DecoderShapeValue[U, RepCol, DataCol], U, DecoderShapeValue[U, RepCol, DataCol], RepCol, DataCol] = {
    new DecoderShape[DecoderShapeValue[U, RepCol, DataCol], U, RepCol, DataCol] {
      self =>
      override type Target = DecoderShapeValue[U, RepCol, DataCol]
      override def wrapRep(base: DecoderShapeValue[U, RepCol, DataCol]): DecoderShapeValue[U, RepCol, DataCol] = base
      override def toLawRep(base: DecoderShapeValue[U, RepCol, DataCol], oldRep: RepCol): RepCol = base.shape.toLawRep(base.shape.wrapRep(base.rep), oldRep)
      override def takeData(rep: DecoderShapeValue[U, RepCol, DataCol], oldData: DataCol): SplitData[U, DataCol] = rep.shape.takeData(rep.rep, oldData)
    }
  }

}