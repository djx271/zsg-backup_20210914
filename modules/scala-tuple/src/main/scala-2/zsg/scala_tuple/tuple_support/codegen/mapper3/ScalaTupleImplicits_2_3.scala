package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_2_3 {
  implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum3[
    F[_, _, _],
    T <: Context3[F],
    Plus1_X1,
    Plus1_X2,
    Plus2_X1,
    Plus2_X2,
    Plus3_X1,
    Plus3_X2
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2]
  ): ApplicationX3[
    F,
    T,
    Tuple2[Plus1_X1, Plus1_X2],
    Tuple2[Plus2_X1, Plus2_X2],
    Tuple2[Plus3_X1, Plus3_X2]
  ] = new ApplicationX3[
    F,
    T,
    Tuple2[Plus1_X1, Plus1_X2],
    Tuple2[Plus2_X1, Plus2_X2],
    Tuple2[Plus3_X1, Plus3_X2]
  ] {
    override def application(context: T) =
      context.append(t1, t2)(PlusToTuple3.plus3WithTypeParameter2)
  }
}
object ScalaTupleImplicits_2_3 extends ScalaTupleImplicits_2_3
