package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import shapeless.Generic

trait HListEncoderShapeWrap[Rep, Data] {

  val rep: Rep
  val columnInfo: MacroColumnInfo

}

object HListEncoderShapeWrap {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]): DecoderShape.Aux[HListEncoderShapeWrap[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new DecoderShape[HListEncoderShapeWrap[D, T], T, RepCol, DataCol] {
      override type Target = M
      override def wrapRep(base: HListEncoderShapeWrap[D, T]): M = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol = shape1.toLawRep(base, oldRep)
      override def takeData(oldData: M, rep: DataCol): SplitData[T, DataCol] = shape1.takeData(oldData, rep)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]): EncoderShape.Aux[HListEncoderShapeWrap[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new EncoderShape[HListEncoderShapeWrap[D, T], T, RepCol, DataCol] {
      override type Target = M
      override def wrapRep(base: HListEncoderShapeWrap[D, T]): M = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol = shape1.toLawRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol = shape1.buildData(data, rep, oldData)
    }
  }
}

trait EncoderWitCol

object EncoderWitCol {
  def toWrap[T, D](rep: T, pro: PropertyType[D], columnInfo: MacroColumnInfo): HListEncoderShapeWrap[T, D] = {
    val rep1 = rep
    val columnInfo1 = columnInfo
    new HListEncoderShapeWrap[T, D] {
      override val rep: T = rep1
      override val columnInfo = columnInfo1
    }
  }
}

trait CaseRepWrap[Table, Case, RepCol, DataCol] {

  type Rep
  type HListData

  def input(table: Table): Rep

  def dataTransform(model: Case): HListData

  def withShape[Target1](implicit shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): Table => EncoderShapeValue[Case, RepCol, DataCol] = { table: Table =>
    val shape1 = shape
    val wrappedRep = shape1.wrapRep(input(table))
    val sv = new EncoderShapeValue[HListData, RepCol, DataCol] {
      override type RepType = Target1
      override val rep = wrappedRep
      override val shape = shape1.packed
    }
    sv.emap { (caseClass: Case) => dataTransform(caseClass) }
  }

}

object CaseRepWrap {
  type Aux[Table, Case, R, HD, RepCol, DatCol] = CaseRepWrap[Table, Case, RepCol, DatCol] { type Rep = R; type HListData = HD }

  trait WrapApply[RepCol, DataCol] {
    def withFunc[Table, Rep1, Case, HListData1](func: Table => Rep1, mg: ModelGen[Case], generic: Generic.Aux[Case, HListData1]): CaseRepWrap.Aux[Table, Case, Rep1, HListData1, RepCol, DataCol] = new CaseRepWrap[Table, Case, RepCol, DataCol] {
      override type Rep = Rep1
      override type HListData = HListData1
      override def input(table: Table): Rep = func(table)
      override def dataTransform(model: Case): HListData1 = generic.to(model)
    }
  }

  def value[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}
}

trait AsunaEncoderGenericContent[RepCol, DataCol] {

}