package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_7_3 {
  implicit def tupleTagApplicationImplicit_tagNum7_typeParamNum3[
    F[_, _, _],
    T <: Context3[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus3_X7
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3],
    t4: F[Plus1_X4, Plus2_X4, Plus3_X4],
    t5: F[Plus1_X5, Plus2_X5, Plus3_X5],
    t6: F[Plus1_X6, Plus2_X6, Plus3_X6],
    t7: F[Plus1_X7, Plus2_X7, Plus3_X7]
  ): ApplicationX3[
    F,
    T,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7]
  ] = new ApplicationX3[
    F,
    T,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app3[
            F,
            T,
            zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
            zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
            zsg.ZTuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7]
          ]
          .application(context),
        context.start
      )(PlusToTuple3.plus3WithTypeParameter7)
    }
  }
}
object ScalaTupleImplicits_7_3 extends ScalaTupleImplicits_7_3