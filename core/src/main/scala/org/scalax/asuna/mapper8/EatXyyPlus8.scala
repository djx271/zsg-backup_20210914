package org.scalax.asuna.mapper.item
object ArticleXyyPlus8 {
  def plus8[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]       = p.eat(item)
      override def takeHead(t: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T8#H                                                          = t.rightHead
      override def takeTail(t: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]               = t.rightTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] = plus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def put8[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Item8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]       = p.pudao(item)
      override def takeHead(t: Item8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T8#H                                                          = t.leftHead
      override def takeTail(t: Item8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]               = t.leftTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, EatXyyType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] = put8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
}
class TypeParam8[T1, T2, T3, T4, T5, T6, T7, T8] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam7[T2, T3, T4, T5, T6, T7, T8]
}