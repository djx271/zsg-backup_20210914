package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.circe.aaaa.{ CirceAsunaEncoder, CirceAsunaEncoderImpl }
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder._

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JsonObject
}

object asunaCirceImpl extends EncoderWrapperHelper[List[CirceAsunaEncoder], List[(String, Json)], ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder], List[(String, Json)]]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    val wrapRep = shape1.wrapRep(rep1)
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JsonObject = {
        val dataList = shape1.buildData(data, wrapRep, List.empty)
        JsonObject.fromIterable(dataList)
      }
    }
  }

}

trait CirceAsunaEncoderHelper extends HListEncoderShapeImplicit {

  implicit def dfgsdgdfgdfgsetrtrtdst[B, RepCol, DataCol](implicit someshape: Encoder[B]): EncoderShape.Aux[HListEncoderShapeWrap[Placeholder[B], B], B, CirceAsunaEncoderImpl[B], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[HListEncoderShapeWrap[Placeholder[B], B], B, List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[B]
      override def wrapRep(base: HListEncoderShapeWrap[Placeholder[B], B]): CirceAsunaEncoderImpl[B] = new CirceAsunaEncoderImpl[B] {
        override val key = base.columnInfo.modelColumnName
        override def write(data: B): Json = {
          if (data == null) {
            Json.Null
          } else {
            someshape(data)
          }
        }
      }
      override def toLawRep(base: CirceAsunaEncoderImpl[B], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: B, rep: CirceAsunaEncoderImpl[B], oldData: List[(String, Json)]): List[(String, Json)] = ((rep.key, rep.write(data))) :: oldData
    }
  }

  trait EncoderApply[T] {
    def func[R](key: String, f: T => R)(implicit encoder: Encoder[R]): CirceAsunaEncoderImpl[T] = {
      val key1 = key
      new CirceAsunaEncoderImpl[T] {
        override val key = key1
        override def write(data: T): Json = encoder(f(data))
      }
    }
  }

  def cusEncoder[T]: EncoderApply[T] = new EncoderApply[T] {}

  val asunaCirce = asunaCirceImpl

}