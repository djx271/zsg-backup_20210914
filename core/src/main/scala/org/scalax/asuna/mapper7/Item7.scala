package org.scalax.asuna.mapper.item
trait Item7[E1, E2, E3, E4, E5, E6, E7] extends Any {
  self =>
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def leftHead: E1                                             = throw new Exception("Can not use this method.")
  def leftTail: Item6[E2, E3, E4, E5, E6, E7]                  = throw new Exception("Can not use this method.")
  def rightHead: E7                                            = throw new Exception("Can not use this method.")
  def rightTail: Item6[E1, E2, E3, E4, E5, E6]                 = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): Item8[E1, E2, E3, E4, E5, E6, E7, T]     = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): Item8[T, E1, E2, E3, E4, E5, E6, E7]   = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): (E1, E2, E3, E4, E5, E6, E7, T)   = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7, xyy)
  def pudaoToTuple[T](xyy: T): (T, E1, E2, E3, E4, E5, E6, E7) = (xyy, self.i1, self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def leftTuple: (E2, E3, E4, E5, E6, E7)                      = (self.i2, self.i3, self.i4, self.i5, self.i6, self.i7)
  def rightTuple: (E1, E2, E3, E4, E5, E6)                     = (self.i1, self.i2, self.i3, self.i4, self.i5, self.i6)
}