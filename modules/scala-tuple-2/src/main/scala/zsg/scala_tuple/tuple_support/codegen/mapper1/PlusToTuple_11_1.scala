package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_11_1 {
        final def plus1WithTypeParameter11[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11
        ]: Plus1[
            zsg.ZTuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            ZsgTuple0,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]
        ] = new Plus1[
            zsg.ZTuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            ZsgTuple0,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]
        ] {
                final override def takeHead1(z: Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]): zsg.ZTuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11] =
                    new zsg.ZTuple11(i1 = z._1 , i2 = z._2 , i3 = z._3 , i4 = z._4 , i5 = z._5 , i6 = z._6 , i7 = z._7 , i8 = z._8 , i9 = z._9 , i10 = z._10 , i11 = z._11)
                final override def takeTail1(z: Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: zsg.ZTuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11], y: ZsgTuple0): Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11] =
                    Tuple11(_1 = x.i1 , _2 = x.i2 , _3 = x.i3 , _4 = x.i4 , _5 = x.i5 , _6 = x.i6 , _7 = x.i7 , _8 = x.i8 , _9 = x.i9 , _10 = x.i10 , _11 = x.i11)
        }
}
