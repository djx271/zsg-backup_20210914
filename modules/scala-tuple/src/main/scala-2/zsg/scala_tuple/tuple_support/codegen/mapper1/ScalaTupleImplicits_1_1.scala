package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_1_1 {
         implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1
        ]( implicit 
              t1: F[  Plus1_X1 ], 
             context: T
        )  :  Application1[
            F,
            T,
            Tuple1[Plus1_X1]
        ] = new Application1[
            F,
            T,
            Tuple1[Plus1_X1]
        ](context.append(context.start, t1)(PlusToTuple1.plus1WithTypeParameter1))
}
object ScalaTupleImplicits_1_1 extends ScalaTupleImplicits_1_1
