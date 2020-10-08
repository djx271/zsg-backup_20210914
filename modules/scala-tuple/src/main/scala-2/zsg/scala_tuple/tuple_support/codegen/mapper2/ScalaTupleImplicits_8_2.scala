package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_8_2 {
  implicit def tupleTagApplicationImplicit_tagNum8_typeParamNum2[
    F[_, _],
    T <: Context2[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7,
    Plus2_X8
  ](implicit
    t1: F[Plus1_X1, Plus2_X1],
    t2: F[Plus1_X2, Plus2_X2],
    t3: F[Plus1_X3, Plus2_X3],
    t4: F[Plus1_X4, Plus2_X4],
    t5: F[Plus1_X5, Plus2_X5],
    t6: F[Plus1_X6, Plus2_X6],
    t7: F[Plus1_X7, Plus2_X7],
    t8: F[Plus1_X8, Plus2_X8]
  ): ApplicationX2[
    F,
    T,
    Tuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
    Tuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8]
  ] = new ApplicationX2[
    F,
    T,
    Tuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
    Tuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app2[
            F,
            T,
            zsg.ZTuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
            zsg.ZTuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8]
          ]
          .application(context),
        context.start
      )(PlusToTuple2.plus2WithTypeParameter8)
    }
  }
}
object ScalaTupleImplicits_8_2 extends ScalaTupleImplicits_8_2