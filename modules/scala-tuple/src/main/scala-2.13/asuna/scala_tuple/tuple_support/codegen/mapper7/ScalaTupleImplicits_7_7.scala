package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_7_7 {
  def hlistTagApplicationImplicit_tagNum7_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X7_C7
  ](
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7],
    t7: Application7[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7]
  ): Application7[
    F,
    H1 :: H2 :: H3 :: H4 :: H5 :: H6 :: H7 :: HNil,
    X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: X5_C1 :: X6_C1 :: X7_C1 :: HNil,
    X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: X5_C2 :: X6_C2 :: X7_C2 :: HNil,
    X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: X5_C3 :: X6_C3 :: X7_C3 :: HNil,
    X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: X5_C4 :: X6_C4 :: X7_C4 :: HNil,
    X1_C5 :: X2_C5 :: X3_C5 :: X4_C5 :: X5_C5 :: X6_C5 :: X7_C5 :: HNil,
    X1_C6 :: X2_C6 :: X3_C6 :: X4_C6 :: X5_C6 :: X6_C6 :: X7_C6 :: HNil,
    X1_C7 :: X2_C7 :: X3_C7 :: X4_C7 :: X5_C7 :: X6_C7 :: X7_C7 :: HNil
  ] =
    new Application7[
      F,
      H1 :: H2 :: H3 :: H4 :: H5 :: H6 :: H7 :: HNil,
      X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: X5_C1 :: X6_C1 :: X7_C1 :: HNil,
      X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: X5_C2 :: X6_C2 :: X7_C2 :: HNil,
      X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: X5_C3 :: X6_C3 :: X7_C3 :: HNil,
      X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: X5_C4 :: X6_C4 :: X7_C4 :: HNil,
      X1_C5 :: X2_C5 :: X3_C5 :: X4_C5 :: X5_C5 :: X6_C5 :: X7_C5 :: HNil,
      X1_C6 :: X2_C6 :: X3_C6 :: X4_C6 :: X5_C6 :: X6_C6 :: X7_C6 :: HNil,
      X1_C7 :: X2_C7 :: X3_C7 :: X4_C7 :: X5_C7 :: X6_C7 :: X7_C7 :: HNil
    ] {
      override def application(context: Context7[F]) = {
        context.append(
          ScalaTupleImplicits_6_7.hlistTagApplicationImplicit_tagNum6_typeParamNum7(t2, t3, t4, t5, t6, t7).application(context),
          t1.application(context)
        )(HListPlus7.plusWithTypeParameter6)
      }
    }
  implicit def tupleTagApplicationImplicit_tagNum7_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X7_C7
  ](
    implicit t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7],
    t7: Application7[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7]
  ): Application7[
    F,
    (H1, H2, H3, H4, H5, H6, H7),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5, X7_C5),
    (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6),
    (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7, X7_C7)
  ] =
    new Application7[
      F,
      (H1, H2, H3, H4, H5, H6, H7),
      (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1),
      (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2),
      (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3),
      (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4),
      (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5, X7_C5),
      (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6),
      (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7, X7_C7)
    ] {
      override def application(context: Context7[F]) = {
        context.append(
          ScalaTupleImplicits_6_7.hlistTagApplicationImplicit_tagNum6_typeParamNum7(t2, t3, t4, t5, t6, t7).application(context),
          t1.application(context)
        )(PlusToTuple7.plusWithTypeParameter6)
      }
    }
}
object ScalaTupleImplicits_7_7 extends ScalaTupleImplicits_7_7
