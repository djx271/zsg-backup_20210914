package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_14_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5 ]   ,   inline  t6: F[  Plus1_X6   ,  Plus2_X6 ]   ,   inline  t7: F[  Plus1_X7   ,  Plus2_X7 ]   ,   inline  t8: F[  Plus1_X8   ,  Plus2_X8 ]   ,   inline  t9: F[  Plus1_X9   ,  Plus2_X9 ]   ,   inline  t10: F[  Plus1_X10   ,  Plus2_X10 ]   ,   inline  t11: F[  Plus1_X11   ,  Plus2_X11 ]   ,   inline  t12: F[  Plus1_X12   ,  Plus2_X12 ]   ,   inline  t13: F[  Plus1_X13   ,  Plus2_X13 ]   ,   inline  t14: F[  Plus1_X14   ,  Plus2_X14 ] 
        )  as  ApplicationX2[
            F,
            T,
            Tuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14],
            Tuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]
        ] = new ApplicationX2[
            F,
            T,
            Tuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14],
            Tuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app2[F, T, zsg.ZTuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14] , zsg.ZTuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]].application(context), context.start)(PlusToTuple2.plus2WithTypeParameter14)
            }
        }
}
object ScalaTupleImplicits_14_2 extends ScalaTupleImplicits_14_2