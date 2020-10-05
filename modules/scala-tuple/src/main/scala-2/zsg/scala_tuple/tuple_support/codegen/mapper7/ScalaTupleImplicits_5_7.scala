package zsg.scala_tuple.tuple_support
import zsg.ApplicationX7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_5_7 {
  implicit def tupleTagApplicationImplicit_tagNum5_typeParamNum7[
    F[_, _, _, _, _, _, _],
    T <: Context7[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus5_X5,
    Plus6_X1,
    Plus6_X2,
    Plus6_X3,
    Plus6_X4,
    Plus6_X5,
    Plus7_X1,
    Plus7_X2,
    Plus7_X3,
    Plus7_X4,
    Plus7_X5
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1, Plus5_X1, Plus6_X1, Plus7_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2, Plus5_X2, Plus6_X2, Plus7_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3, Plus4_X3, Plus5_X3, Plus6_X3, Plus7_X3],
    t4: F[Plus1_X4, Plus2_X4, Plus3_X4, Plus4_X4, Plus5_X4, Plus6_X4, Plus7_X4],
    t5: F[Plus1_X5, Plus2_X5, Plus3_X5, Plus4_X5, Plus5_X5, Plus6_X5, Plus7_X5]
  ): ApplicationX7[
    F,
    T,
    Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
    Tuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5],
    Tuple5[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5],
    Tuple5[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5],
    Tuple5[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5],
    Tuple5[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5],
    Tuple5[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5]
  ] = new ApplicationX7[
    F,
    T,
    Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
    Tuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5],
    Tuple5[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5],
    Tuple5[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5],
    Tuple5[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5],
    Tuple5[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5],
    Tuple5[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app7[
            F,
            T,
            zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
            zsg.ZTuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5],
            zsg.ZTuple5[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5],
            zsg.ZTuple5[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5],
            zsg.ZTuple5[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5],
            zsg.ZTuple5[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5],
            zsg.ZTuple5[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5]
          ]
          .application(context),
        context.start
      )(PlusToTuple7.plus7WithTypeParameter5)
    }
  }
}
object ScalaTupleImplicits_5_7 extends ScalaTupleImplicits_5_7
