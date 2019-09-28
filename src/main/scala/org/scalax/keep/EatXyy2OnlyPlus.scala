package org.scalax.asuna.mapper.item

object EatXyy2OnlyPlus {
  def hlistPlus2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T1, T2]] {
      override def plus(p: T1#H, item: T2#H): Item2[T1#H, T2#H]                         = HListItem0.eat(p).eat(item)
      override def takeHead(t: Item2[T1#H, T2#H]): T2#H                                 = t.i2
      override def takeTail(t: Item2[T1#H, T2#H]): T1#H                                 = t.i1
      override def sub: org.scalax.asuna.mapper.Plus[T1#T, T2#T, EatXyyType2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T2, T1]] =
    new org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T2, T1]] {
      override def plus(p: T1#H, item: T2#H): Item2[T2#H, T1#H]                         = ReverseHListItem0.pudao(p).pudao(item)
      override def takeHead(t: Item2[T2#H, T1#H]): T2#H                                 = t.i1
      override def takeTail(t: Item2[T2#H, T1#H]): T1#H                                 = t.i2
      override def sub: org.scalax.asuna.mapper.Plus[T1#T, T2#T, EatXyyType2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def item2Plus2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T1, T2]] {
      override def plus(p: T1#H, item: T2#H): Item2[T1#H, T2#H]                         = TreeItem0.eat(p).eat(item)
      override def takeHead(t: Item2[T1#H, T2#H]): T2#H                                 = t.i2
      override def takeTail(t: Item2[T1#H, T2#H]): T1#H                                 = t.i1
      override def sub: org.scalax.asuna.mapper.Plus[T1#T, T2#T, EatXyyType2[T1, T2]#T] = item2Plus2[T1#T, T2#T]
    }
  def item2Put2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T2, T1]] =
    new org.scalax.asuna.mapper.Plus[T1, T2, EatXyyType2[T2, T1]] {
      override def plus(p: T1#H, item: T2#H): Item2[T2#H, T1#H]                         = ReverseTreeItem0.pudao(p).pudao(item)
      override def takeHead(t: Item2[T2#H, T1#H]): T2#H                                 = t.i1
      override def takeTail(t: Item2[T2#H, T1#H]): T1#H                                 = t.i2
      override def sub: org.scalax.asuna.mapper.Plus[T1#T, T2#T, EatXyyType2[T2, T1]#T] = item2Put2[T1#T, T2#T]
    }
}
