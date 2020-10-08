package zsg.scala_tuple.tuple_support
import zsg.ApplicationX5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_4_5 {
         inline given  [
            F[_ , _ , _ , _ , _],
            T <: Context5[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4 ] 
        )  as  ApplicationX5[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]
        ] = new ApplicationX5[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app5[F, T, zsg.ZTuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] , zsg.ZTuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] , zsg.ZTuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4] , zsg.ZTuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4] , zsg.ZTuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]].application(context), context.start)(PlusToTuple5.plus5WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_5 extends ScalaTupleImplicits_4_5