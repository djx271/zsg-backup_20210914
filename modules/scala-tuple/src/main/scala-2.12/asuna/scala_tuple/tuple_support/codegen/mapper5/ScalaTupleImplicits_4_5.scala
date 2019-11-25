package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_4_5 {
implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
](implicit t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ] )
: Application5[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5 ) ] =
{ (context: Context5[F]) =>
context.append(
context.append(
context.append(t4.application(context), t3.application(context))(HListPlus5.plusWithTypeParameter1)
, t2.application(context))(HListPlus5.plusWithTypeParameter2)
, t1.application(context))(PlusToTuple5.plusWithTypeParameter3)
}
}
