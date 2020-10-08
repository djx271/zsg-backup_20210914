package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_21_3 {
         inline given  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5 ]   ,   inline  t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6 ]   ,   inline  t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7 ]   ,   inline  t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8 ]   ,   inline  t9: F[  Plus1_X9   ,  Plus2_X9   ,  Plus3_X9 ]   ,   inline  t10: F[  Plus1_X10   ,  Plus2_X10   ,  Plus3_X10 ]   ,   inline  t11: F[  Plus1_X11   ,  Plus2_X11   ,  Plus3_X11 ]   ,   inline  t12: F[  Plus1_X12   ,  Plus2_X12   ,  Plus3_X12 ]   ,   inline  t13: F[  Plus1_X13   ,  Plus2_X13   ,  Plus3_X13 ]   ,   inline  t14: F[  Plus1_X14   ,  Plus2_X14   ,  Plus3_X14 ]   ,   inline  t15: F[  Plus1_X15   ,  Plus2_X15   ,  Plus3_X15 ]   ,   inline  t16: F[  Plus1_X16   ,  Plus2_X16   ,  Plus3_X16 ]   ,   inline  t17: F[  Plus1_X17   ,  Plus2_X17   ,  Plus3_X17 ]   ,   inline  t18: F[  Plus1_X18   ,  Plus2_X18   ,  Plus3_X18 ]   ,   inline  t19: F[  Plus1_X19   ,  Plus2_X19   ,  Plus3_X19 ]   ,   inline  t20: F[  Plus1_X20   ,  Plus2_X20   ,  Plus3_X20 ]   ,   inline  t21: F[  Plus1_X21   ,  Plus2_X21   ,  Plus3_X21 ] 
        )  as  ApplicationX3[
            F,
            T,
            Tuple21[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21],
            Tuple21[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21],
            Tuple21[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21]
        ] = new ApplicationX3[
            F,
            T,
            Tuple21[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21],
            Tuple21[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21],
            Tuple21[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app3[F, T, zsg.ZTuple21[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21] , zsg.ZTuple21[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21] , zsg.ZTuple21[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21]].application(context), context.start)(PlusToTuple3.plus3WithTypeParameter21)
            }
        }
}
object ScalaTupleImplicits_21_3 extends ScalaTupleImplicits_21_3