package net.scalax.asuna.temp

import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }
import scala.language.experimental.macros

import scala.reflect.macros.blackbox

trait EmptyTable

object EmptyTable {
  val value: EmptyTable = new EmptyTable {}
}

trait ToStringAbs {
  val key: String
  type DataType

  def bodyString(t: DataType): String
}

object ToStringAbs extends LawImplicit1 {
  implicit def casffdsafaetrbety[T](implicit column: => MacroColumnInfo, cv: => Convert[T]): EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] = {
    new EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] {
      override def wrapRep(base: Placeholder[T]): ToString[T] = new ToString[T] {
        override val key: String = column.modelColumnName

        override def bodyString(t: T): String = cv.convert(t)
      }

      override def toLawRep(base: ToString[T]): DataRepGroup[ToStringAbs] = DataRepGroup(List(base))

      override def buildData(data: T, rep: ToString[T]): DataGroup = DataGroup(List(data))
    }
  }
}

trait LawImplicit1 extends LawImplicit2 {
  implicit def umutyiyuitytui7[T, R](implicit column: => MacroColumnInfo, cv: => ForTableInput[EmptyTable, T, ToStringAbs]): EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] = {
    new EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] {
      override def wrapRep(base: Placeholder[T]): ToString[T] = new ToString[T] {
        override val key: String = column.modelColumnName

        override def bodyString(t: T): String = {
          if (t == null) {
            s"null"
          } else {
            val sv = cv.input(EmptyTable.value)
            val wrapRep = sv.shape.wrapRep(sv.rep)
            val reps = sv.shape.toLawRep(wrapRep).reps
            val dataList = sv.shape.buildData(t, wrapRep)
            val pair = dataList.items.zip(reps).map { case (data, rep) => (rep.key, rep.bodyString(data.asInstanceOf[rep.DataType])) }.map { case (key, value) => s"$key - $value" }
            s"object\n${pair.map(s => s.split('\n').toList.map(s => "  " + s).mkString("\n"))}"
          }
        }
      }

      override def toLawRep(base: ToString[T]): DataRepGroup[ToStringAbs] = DataRepGroup(List(base))

      override def buildData(data: T, rep: ToString[T]): DataGroup = DataGroup(List(data))
    }
  }
}

trait LawImplicit2 {
  implicit def styrddnyhnufyutyumtyyumdrtymr[T, R](implicit column: => MacroColumnInfo, cv1: => CirceEncoderConfirmOrder[T]): EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] = {
    val cv = cv1.inputTable
    new EncoderShape[Placeholder[T], T, ToString[T], ToStringAbs] {
      override def wrapRep(base: Placeholder[T]): ToString[T] = new ToString[T] {
        override val key: String = column.modelColumnName

        override def bodyString(t: T): String = {
          if (t == null) {
            s"null"
          } else {
            val sv = cv.input(EmptyTable.value)
            val wrapRep = sv.shape.wrapRep(sv.rep)
            val reps = sv.shape.toLawRep(wrapRep).reps
            val dataList = sv.shape.buildData(t, wrapRep)
            val pair = dataList.items.zip(reps).map { case (data, rep) => (rep.key, rep.bodyString(data.asInstanceOf[rep.DataType])) }.map { case (key, value) => s"$key - $value" }
            s"object\n${pair.map(s => s.split('\n').toList.map(s => "  " + s).mkString("\n")).mkString("\n")}"
          }
        }
      }

      override def toLawRep(base: ToString[T]): DataRepGroup[ToStringAbs] = DataRepGroup(List(base))

      override def buildData(data: T, rep: ToString[T]): DataGroup = DataGroup(List(data))
    }
  }
}

trait ToString[T] extends ToStringAbs with AtomicColumn[T, ToStringAbs] {
  self =>

  override def common: ToStringAbs = self

  override type DataType = T
}

trait Convert[T] {
  def convert(t: T): String
}

trait Test01Helper {

  implicit def implicit1: Convert[String] = {
    new Convert[String] {
      override def convert(t: String): String = t
    }
  }

  implicit def implicit2: Convert[Int] = {
    new Convert[Int] {
      override def convert(t: Int): String = t.toString
    }
  }

  trait ToStringEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
    def write(data: DataType): String
  }

  object stringUtil extends EncoderHelper[ToStringAbs] with EncoderWrapperHelper[ToStringAbs, ToStringEncoderWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, ToStringAbs]): ToStringEncoderWrapper[Out, D] = {
      new ToStringEncoderWrapper[Out, D] {
        override def write(data: D): String = {
          val wrapRep = shape.wrapRep(rep)
          val reps = shape.toLawRep(wrapRep).reps
          val dataList = shape.buildData(data, wrapRep).items
          reps.zip(dataList).map { case (rep, d) => s"${rep.key} - ${rep.bodyString(d.asInstanceOf[rep.DataType])}" }.mkString("\n")
        }
      }

    }
  }

}

trait CirceEncoderConfirmOrder[T] {
  val inputTable: ForTableInput[EmptyTable, T, ToStringAbs]
}

object CirceEncoderConfirmOrder {

  implicit def vsdfsdfsasfaf[D]: CirceEncoderConfirmOrder[D] = macro CirceMacro.AsunaCirceEncoderHelper.inferImpl[D]

  def needInputTable[D](it: ForTableInput[EmptyTable, D, ToStringAbs]): CirceEncoderConfirmOrder[D] = {
    new CirceEncoderConfirmOrder[D] {
      override val inputTable = it
    }
  }

}

object CirceMacro {

  object AsunaCirceEncoderHelper {

    def inferImpl[T: c.WeakTypeTag](c: blackbox.Context): c.Expr[CirceEncoderConfirmOrder[T]] = {
      import c.universe._
      val circeConfirm = weakTypeOf[CirceEncoderConfirmOrder[T]]
      val encoderHelper = weakTypeOf[EncoderHelper[ToStringAbs]]
      val t = weakTypeOf[T]
      val emptyCirceTable = weakTypeOf[EmptyTable]
      val q =
        q"${circeConfirm.typeSymbol.companion}.needInputTable[$t](new $encoderHelper { }.caseOnly[$emptyCirceTable, $t]): $circeConfirm"
      c.Expr[CirceEncoderConfirmOrder[T]](q)
    }

  }
}
