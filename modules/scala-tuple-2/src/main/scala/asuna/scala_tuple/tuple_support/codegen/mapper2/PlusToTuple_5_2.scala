package asuna.scala_tuple.tuple_support
import asuna.Plus2
trait PlusToTuple_5_2 {
  final def plusWithTypeParameter5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, Y1, Y2]: Plus2[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
    (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5),
    Y1,
    Y2,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)
  ] =
    new Plus2[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
      (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5),
      Y1,
      Y2,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5) =
        (z._2, z._3, z._4, z._5, z._6)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): Y1 = z._1
      final override def plus1(x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5), y: Y1): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5) =
        (y, x._1, x._2, x._3, x._4, x._5)
      final override def takeHead2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)): (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5) =
        (z._2, z._3, z._4, z._5, z._6)
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)): Y2 = z._1
      final override def plus2(x: (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5), y: Y2): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5) =
        (y, x._1, x._2, x._3, x._4, x._5)
    }
}