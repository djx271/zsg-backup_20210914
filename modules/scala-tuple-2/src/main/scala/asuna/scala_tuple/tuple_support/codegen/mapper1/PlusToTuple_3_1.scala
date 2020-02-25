package asuna.scala_tuple.tuple_support
import asuna.Plus1
trait PlusToTuple_3_1 {
  final def plusWithTypeParameter3[X1_C1, X1_C2, X1_C3, Y1]: Plus1[
    (X1_C1, X1_C2, X1_C3),
    Y1,
    (Y1, X1_C1, X1_C2, X1_C3)
  ] =
    new Plus1[
      (X1_C1, X1_C2, X1_C3),
      Y1,
      (Y1, X1_C1, X1_C2, X1_C3)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3)): (X1_C1, X1_C2, X1_C3) =
        (z._2, z._3, z._4)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3)): Y1 = z._1
      final override def plus1(x: (X1_C1, X1_C2, X1_C3), y: Y1): (Y1, X1_C1, X1_C2, X1_C3) =
        (y, x._1, x._2, x._3)
    }
}