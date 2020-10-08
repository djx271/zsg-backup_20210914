package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_4_2 {
  implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum2[
    F[_, _],
    T <: Context2[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4
  ](implicit
    t1: F[Plus1_X1, Plus2_X1],
    t2: F[Plus1_X2, Plus2_X2],
    t3: F[Plus1_X3, Plus2_X3],
    t4: F[Plus1_X4, Plus2_X4]
  ): ApplicationX2[
    F,
    T,
    Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
    Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4]
  ] = new ApplicationX2[
    F,
    T,
    Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
    Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent.app2[F, T, zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4], zsg.ZTuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4]].application(context),
        context.start
      )(PlusToTuple2.plus2WithTypeParameter4)
    }
  }
}
object ScalaTupleImplicits_4_2 extends ScalaTupleImplicits_4_2