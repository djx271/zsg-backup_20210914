package asuna
abstract class Plus3[X1  , X2  , X3   , Y1  , Y2  , Y3   , Z1  , Z2  , Z3 ] {
def takeHead1(z: Z1): X1
def takeTail1(z: Z1): Y1
def plus1(x: X1, y: Y1): Z1
def takeHead2(z: Z2): X2
def takeTail2(z: Z2): Y2
def plus2(x: X2, y: Y2): Z2
def takeHead3(z: Z3): X3
def takeTail3(z: Z3): Y3
def plus3(x: X3, y: Y3): Z3
}
object Plus3 {
final def cachePlusWithTypeParameter0[X1_C1  , X2_C1  , X3_C1
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, Y1  , Y2  , Y3
, AsunaTuple1[Y1]  , AsunaTuple1[Y2]  , AsunaTuple1[Y3]
] = new Plus3[
AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, Y1  , Y2  , Y3
, AsunaTuple1[Y1]  , AsunaTuple1[Y2]  , AsunaTuple1[Y3]
] {
final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
}
final def cachePlusWithTypeParameter1[X1_C1
, X2_C1    , X3_C1
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple1[X1_C1  ]
, AsunaTuple1[X2_C1  ]  , AsunaTuple1[X3_C1  ]
, Y1  , Y2  , Y3
, AsunaTuple2[Y1  , X1_C1  ]  , AsunaTuple2[Y2  , X2_C1  ]  , AsunaTuple2[Y3  , X3_C1  ]
] = new Plus3[
AsunaTuple1[X1_C1  ]
, AsunaTuple1[X2_C1  ]  , AsunaTuple1[X3_C1  ]
, Y1  , Y2  , Y3
, AsunaTuple2[Y1  , X1_C1  ]  , AsunaTuple2[Y2  , X2_C1  ]  , AsunaTuple2[Y3  , X3_C1  ]
] {
final override def takeHead1(z: AsunaTuple2[Y1  , X1_C1  ]): AsunaTuple1[X1_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail1(z: AsunaTuple2[Y1  , X1_C1  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple1[X1_C1  ], y: Y1): AsunaTuple2[Y1  , X1_C1  ] = new AsunaTuple2(y  , x.i1 )
final override def takeHead2(z: AsunaTuple2[Y2  , X2_C1  ]): AsunaTuple1[X2_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail2(z: AsunaTuple2[Y2  , X2_C1  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple1[X2_C1  ], y: Y2): AsunaTuple2[Y2  , X2_C1  ] = new AsunaTuple2(y  , x.i1 )
final override def takeHead3(z: AsunaTuple2[Y3  , X3_C1  ]): AsunaTuple1[X3_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail3(z: AsunaTuple2[Y3  , X3_C1  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple1[X3_C1  ], y: Y3): AsunaTuple2[Y3  , X3_C1  ] = new AsunaTuple2(y  , x.i1 )
}
final def cachePlusWithTypeParameter2[X1_C1  , X1_C2
, X2_C1  , X2_C2    , X3_C1  , X3_C2
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple2[X1_C1  , X1_C2  ]
, AsunaTuple2[X2_C1  , X2_C2  ]  , AsunaTuple2[X3_C1  , X3_C2  ]
, Y1  , Y2  , Y3
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]  , AsunaTuple3[Y2  , X2_C1  , X2_C2  ]  , AsunaTuple3[Y3  , X3_C1  , X3_C2  ]
] = new Plus3[
AsunaTuple2[X1_C1  , X1_C2  ]
, AsunaTuple2[X2_C1  , X2_C2  ]  , AsunaTuple2[X3_C1  , X3_C2  ]
, Y1  , Y2  , Y3
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]  , AsunaTuple3[Y2  , X2_C1  , X2_C2  ]  , AsunaTuple3[Y3  , X3_C1  , X3_C2  ]
] {
final override def takeHead1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): AsunaTuple2[X1_C1  , X1_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple2[X1_C1  , X1_C2  ], y: Y1): AsunaTuple3[Y1  , X1_C1  , X1_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
final override def takeHead2(z: AsunaTuple3[Y2  , X2_C1  , X2_C2  ]): AsunaTuple2[X2_C1  , X2_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail2(z: AsunaTuple3[Y2  , X2_C1  , X2_C2  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple2[X2_C1  , X2_C2  ], y: Y2): AsunaTuple3[Y2  , X2_C1  , X2_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
final override def takeHead3(z: AsunaTuple3[Y3  , X3_C1  , X3_C2  ]): AsunaTuple2[X3_C1  , X3_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail3(z: AsunaTuple3[Y3  , X3_C1  , X3_C2  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple2[X3_C1  , X3_C2  ], y: Y3): AsunaTuple3[Y3  , X3_C1  , X3_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
}
}
