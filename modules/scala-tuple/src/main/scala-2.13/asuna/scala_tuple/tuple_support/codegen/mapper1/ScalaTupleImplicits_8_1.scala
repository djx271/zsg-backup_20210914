package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_8_1 {
implicit def tupleTagApplicationImplicit_tagNum8_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
, X8_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ]  , t7: Application1[F, H7  , X7_C1 ]  , t8: Application1[F, H8  , X8_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ) ] =
{ (context: Context1[F]) =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t8.application(context), t7.application(context))(HListPlus1.plusWithTypeParameter1)
, t6.application(context))(HListPlus1.plusWithTypeParameter2)
, t5.application(context))(HListPlus1.plusWithTypeParameter3)
, t4.application(context))(HListPlus1.plusWithTypeParameter4)
, t3.application(context))(HListPlus1.plusWithTypeParameter5)
, t2.application(context))(HListPlus1.plusWithTypeParameter6)
, t1.application(context))(PlusToTuple1.plusWithTypeParameter7)
}
}
