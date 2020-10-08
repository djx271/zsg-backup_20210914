package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_1_3 {
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum3[
    F[_, _, _],
    T <: Context3[F],
    Plus1_X1,
    Plus2_X1,
    Plus3_X1
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1]
  ): ApplicationX3[
    F,
    T,
    Tuple1[Plus1_X1],
    Tuple1[Plus2_X1],
    Tuple1[Plus3_X1]
  ] = new ApplicationX3[
    F,
    T,
    Tuple1[Plus1_X1],
    Tuple1[Plus2_X1],
    Tuple1[Plus3_X1]
  ] {
    override def application(context: T) =
      context.append(context.start, t1)(PlusToTuple3.plus3WithTypeParameter1)
  }
}
object ScalaTupleImplicits_1_3 extends ScalaTupleImplicits_1_3