package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_14_2 {
  final def plus2WithTypeParameter14[
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus1_X9,
    Plus1_X10,
    Plus1_X11,
    Plus1_X12,
    Plus1_X13,
    Plus1_X14,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7,
    Plus2_X8,
    Plus2_X9,
    Plus2_X10,
    Plus2_X11,
    Plus2_X12,
    Plus2_X13,
    Plus2_X14
  ]: Plus2[
    zsg.ZTuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14],
    zsg.ZTuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14],
    ZsgTuple0,
    ZsgTuple0,
    Tuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14],
    Tuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14]
  ] = new Plus2[
    zsg.ZTuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14],
    zsg.ZTuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14],
    ZsgTuple0,
    ZsgTuple0,
    Tuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14],
    Tuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14]
  ] {
    final override def takeHead1(
      z: Tuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14]
    ): zsg.ZTuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14] =
      new zsg.ZTuple14(
        i1 = z._1,
        i2 = z._2,
        i3 = z._3,
        i4 = z._4,
        i5 = z._5,
        i6 = z._6,
        i7 = z._7,
        i8 = z._8,
        i9 = z._9,
        i10 = z._10,
        i11 = z._11,
        i12 = z._12,
        i13 = z._13,
        i14 = z._14
      )
    final override def takeTail1(
      z: Tuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14]
    ): ZsgTuple0 = ZsgTuple0.value
    final override def plus1(
      x: zsg.ZTuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14],
      y: ZsgTuple0
    ): Tuple14[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12, Plus1_X13, Plus1_X14] =
      Tuple14(
        _1 = x.i1,
        _2 = x.i2,
        _3 = x.i3,
        _4 = x.i4,
        _5 = x.i5,
        _6 = x.i6,
        _7 = x.i7,
        _8 = x.i8,
        _9 = x.i9,
        _10 = x.i10,
        _11 = x.i11,
        _12 = x.i12,
        _13 = x.i13,
        _14 = x.i14
      )
    final override def takeHead2(
      z: Tuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14]
    ): zsg.ZTuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14] =
      new zsg.ZTuple14(
        i1 = z._1,
        i2 = z._2,
        i3 = z._3,
        i4 = z._4,
        i5 = z._5,
        i6 = z._6,
        i7 = z._7,
        i8 = z._8,
        i9 = z._9,
        i10 = z._10,
        i11 = z._11,
        i12 = z._12,
        i13 = z._13,
        i14 = z._14
      )
    final override def takeTail2(
      z: Tuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14]
    ): ZsgTuple0 = ZsgTuple0.value
    final override def plus2(
      x: zsg.ZTuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14],
      y: ZsgTuple0
    ): Tuple14[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8, Plus2_X9, Plus2_X10, Plus2_X11, Plus2_X12, Plus2_X13, Plus2_X14] =
      Tuple14(
        _1 = x.i1,
        _2 = x.i2,
        _3 = x.i3,
        _4 = x.i4,
        _5 = x.i5,
        _6 = x.i6,
        _7 = x.i7,
        _8 = x.i8,
        _9 = x.i9,
        _10 = x.i10,
        _11 = x.i11,
        _12 = x.i12,
        _13 = x.i13,
        _14 = x.i14
      )
  }
}