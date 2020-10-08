package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_5_3 {
         inline given  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5 ] 
        )  as  ApplicationX3[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5]
        ] = new ApplicationX3[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app3[F, T, zsg.ZTuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5] , zsg.ZTuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5] , zsg.ZTuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5]].application(context), context.start)(PlusToTuple3.plus3WithTypeParameter5)
            }
        }
}
object ScalaTupleImplicits_5_3 extends ScalaTupleImplicits_5_3