package org.scalax.asuna.mapper.item
object ArticleXyyTuplePlus22 {
  def hlistPlus10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]],
        item: T10#H
      ): Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, item)
      override def takeHead(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T10#H = t._10
      override def takeTail(
        t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9): Item1[T9#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]]#T, T10#T, XyyTupleType10[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = hlistPlus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPut10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
    T10,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
      T10,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]],
        item: T10#H
      ): Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1)
      override def takeHead(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T10#H = t._1
      override def takeTail(
        t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._10): Item1[T9#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]]#T, T10#T, XyyTupleType10[
        T10,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9
      ]#T] = hlistPut10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def item2Plus10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]],
        item: T10#H
      ): Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, item)
      override def takeHead(t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T10#H = t._10
      override def takeTail(
        t: Tuple10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9): Item1[T9#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]]#T, T10#T, XyyTupleType10[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = item2Plus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def item2Put10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
    T10,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]], T10, XyyTupleType10[
      T10,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]],
        item: T10#H
      ): Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1)
      override def takeHead(t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T10#H = t._1
      override def takeTail(
        t: Tuple10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item1[T9#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._10): Item1[T9#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9]]#T, T10#T, XyyTupleType10[
        T10,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9
      ]#T] = item2Put10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPlus11[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]],
        item: T11#H
      ): Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, item)
      override def takeHead(t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t._11
      override def takeTail(
        t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10): Item2[T9#H, T10#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]]#T, T11#T, XyyTupleType11[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = hlistPlus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPut11[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
    T11,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
      T11,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]],
        item: T11#H
      ): Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2)
      override def takeHead(t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t._1
      override def takeTail(
        t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._11).pudao(t._10): Item2[T9#H, T10#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]]#T, T11#T, XyyTupleType11[
        T11,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = hlistPut11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def item2Plus11[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]],
        item: T11#H
      ): Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, item)
      override def takeHead(t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t._11
      override def takeTail(
        t: Tuple11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10): Item2[T9#H, T10#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]]#T, T11#T, XyyTupleType11[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = item2Plus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def item2Put11[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
    T11,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]], T11, XyyTupleType11[
      T11,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]],
        item: T11#H
      ): Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2)
      override def takeHead(t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t._1
      override def takeTail(
        t: Tuple11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item2[T9#H, T10#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._11).pudao(t._10): Item2[T9#H, T10#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10]]#T, T11#T, XyyTupleType11[
        T11,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10
      ]#T] = item2Put11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPlus12[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, item)
      override def takeHead(t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T12#H = t._12
      override def takeTail(
        t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10).eat(t._11): Item3[T9#H, T10#H, T11#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]]#T, T12#T, XyyTupleType12[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = hlistPlus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPut12[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
    T12,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
      T12,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3)
      override def takeHead(t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T12#H = t._1
      override def takeTail(
        t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._12).pudao(t._11).pudao(t._10): Item3[T9#H, T10#H, T11#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]]#T, T12#T, XyyTupleType12[
        T12,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = hlistPut12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def item2Plus12[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, item)
      override def takeHead(t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T12#H = t._12
      override def takeTail(
        t: Tuple12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10).eat(t._11): Item3[T9#H, T10#H, T11#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]]#T, T12#T, XyyTupleType12[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = item2Plus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def item2Put12[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
    T12,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]], T12, XyyTupleType12[
      T12,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3)
      override def takeHead(t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T12#H = t._1
      override def takeTail(
        t: Tuple12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item3[T9#H, T10#H, T11#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._12).pudao(t._11).pudao(t._10): Item3[T9#H, T10#H, T11#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11]]#T, T12#T, XyyTupleType12[
        T12,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = item2Put12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPlus13[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, item)
      override def takeHead(t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T13#H = t._13
      override def takeTail(
        t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12): Item4[T9#H, T10#H, T11#H, T12#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]]#T, T13#T, XyyTupleType13[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = hlistPlus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPut13[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
    T13,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
      T13,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4)
      override def takeHead(t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T13#H = t._1
      override def takeTail(
        t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item4[T9#H, T10#H, T11#H, T12#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]]#T, T13#T, XyyTupleType13[
        T13,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = hlistPut13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def item2Plus13[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, item)
      override def takeHead(t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T13#H = t._13
      override def takeTail(
        t: Tuple13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12): Item4[T9#H, T10#H, T11#H, T12#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]]#T, T13#T, XyyTupleType13[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12,
        T13
      ]#T] = item2Plus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def item2Put13[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
    T13,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]], T13, XyyTupleType13[
      T13,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4)
      override def takeHead(t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T13#H = t._1
      override def takeTail(
        t: Tuple13[T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item4[T9#H, T10#H, T11#H, T12#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item4[T9#H, T10#H, T11#H, T12#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12]]#T, T13#T, XyyTupleType13[
        T13,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = item2Put13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPlus14[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, item)
      override def takeHead(t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T14#H = t._14
      override def takeTail(
        t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13): Item5[T9#H, T10#H, T11#H, T12#H, T13#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]]#T, T14#T, XyyTupleType14[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14
        ]#T] = hlistPlus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPut14[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
    T14,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
      T14,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5)
      override def takeHead(t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T14#H = t._1
      override def takeTail(
        t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._14).pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item5[T9#H, T10#H, T11#H, T12#H, T13#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]]#T, T14#T, XyyTupleType14[
          T14,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13
        ]#T] = hlistPut14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def item2Plus14[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, item)
      override def takeHead(t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T14#H = t._14
      override def takeTail(
        t: Tuple14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13): Item5[T9#H, T10#H, T11#H, T12#H, T13#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]]#T, T14#T, XyyTupleType14[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14
        ]#T] = item2Plus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def item2Put14[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
    T14,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]], T14, XyyTupleType14[
      T14,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5)
      override def takeHead(t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]): T14#H = t._1
      override def takeTail(
        t: Tuple14[T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._14).pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item5[T9#H, T10#H, T11#H, T12#H, T13#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13]]#T, T14#T, XyyTupleType14[
          T14,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13
        ]#T] = item2Put14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPlus15[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, item)
      override def takeHead(t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T15#H = t._15
      override def takeTail(
        t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14): Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]]#T, T15#T, XyyTupleType15[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15
        ]#T] = hlistPlus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPut15[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
    T15,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
      T15,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6)
      override def takeHead(t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T15#H = t._1
      override def takeTail(
        t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._15).pudao(t._14).pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]]#T, T15#T, XyyTupleType15[
          T15,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14
        ]#T] = hlistPut15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def item2Plus15[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, item)
      override def takeHead(t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T15#H = t._15
      override def takeTail(
        t: Tuple15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14): Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]]#T, T15#T, XyyTupleType15[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15
        ]#T] = item2Plus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def item2Put15[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
    T15,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]], T15, XyyTupleType15[
      T15,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6)
      override def takeHead(t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]): T15#H = t._1
      override def takeTail(
        t: Tuple15[T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        ReverseTreeItem0
          .pudao(ReverseTreeItem0.pudao(t._15).pudao(t._14).pudao(t._13).pudao(t._12).pudao(t._11).pudao(t._10): Item6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14]]#T, T15#T, XyyTupleType15[
          T15,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14
        ]#T] = item2Put15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPlus16[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, item)
      override def takeHead(t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T16#H = t._16
      override def takeTail(
        t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(HListItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15): Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]]#T, T16#T, XyyTupleType16[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16
        ]#T] = hlistPlus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPut16[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
    T16,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
      T16,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7)
      override def takeHead(t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T16#H = t._1
      override def takeTail(
        t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        ReverseHListItem0
          .pudao(
            ReverseHListItem0
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]]#T, T16#T, XyyTupleType16[
          T16,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15
        ]#T] = hlistPut16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def item2Plus16[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, item)
      override def takeHead(t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T16#H = t._16
      override def takeTail(
        t: Tuple16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15): Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H])
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]]#T, T16#T, XyyTupleType16[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16
        ]#T] = item2Plus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def item2Put16[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
    T16,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]], T16, XyyTupleType16[
      T16,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7)
      override def takeHead(t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T16#H = t._1
      override def takeTail(
        t: Tuple16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        ReverseTreeItem0
          .pudao(
            ReverseTreeItem0
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15]]#T, T16#T, XyyTupleType16[
          T16,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15
        ]#T] = item2Put16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPlus17[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H = t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            HListItem0
              .eat(t._9)
              .eat(t._10)
              .eat(t._11)
              .eat(t._12)
              .eat(t._13)
              .eat(t._14)
              .eat(t._15)
              .eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]]#T, T17#T, XyyTupleType17[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17
        ]#T] = hlistPlus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def hlistPut17[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T17,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T17,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        ReverseHListItem0
          .pudao(
            ReverseHListItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]]#T, T17#T, XyyTupleType17[
          T17,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16
        ]#T] = hlistPut17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Plus17[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H = t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]]#T, T17#T, XyyTupleType17[
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16,
          T17
        ]#T] = item2Plus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Put17[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T17,
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T17,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        ReverseTreeItem0
          .pudao(
            ReverseTreeItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub
        : org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]]#T, T17#T, XyyTupleType17[
          T17,
          T1,
          T2,
          T3,
          T4,
          T5,
          T6,
          T7,
          T8,
          T9,
          T10,
          T11,
          T12,
          T13,
          T14,
          T15,
          T16
        ]#T] = item2Put17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
}
