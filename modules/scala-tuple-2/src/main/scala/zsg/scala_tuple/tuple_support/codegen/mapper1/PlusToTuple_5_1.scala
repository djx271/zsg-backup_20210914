package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_5_1 {
  final def plus1WithTypeParameter5[
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5
  ]: Plus1[
    zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
    ZsgTuple0,
    Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5]
  ] = new Plus1[
    zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
    ZsgTuple0,
    Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5]
  ] {
    final override def takeHead1(z: Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5]): zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5] =
      new zsg.ZTuple5(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5)
    final override def takeTail1(z: Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5]): ZsgTuple0 = ZsgTuple0.value
    final override def plus1(x: zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5], y: ZsgTuple0): Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5] =
      Tuple5(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5)
  }
}