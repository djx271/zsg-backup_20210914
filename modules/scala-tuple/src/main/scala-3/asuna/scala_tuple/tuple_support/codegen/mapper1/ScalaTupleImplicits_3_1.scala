package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_3_1 {
         given  tupleTagApplicationImplicit_tagNum3_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3,
            Plus1_X1 , Plus1_X2 , Plus1_X3
        ]( using 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3])  as  Application1[
            F,
            Tuple3[Tag1 , Tag2 , Tag3],
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] = new Application1[
            F,
            Tuple3[Tag1 , Tag2 , Tag3],
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] {
            override def application(context: Context1[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3]))))
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_1 extends ScalaTupleImplicits_3_1