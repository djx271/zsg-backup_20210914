package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_12 {
         inline given   [F[  _ ], T <: zsg.Context1[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
        ]
        ) :  zsg.ApplicationX1[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
]  = new  zsg.ApplicationX1[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum1), t11)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum1)
            }
        }
         inline given   [F[  _   ,  _ ], T <: zsg.Context2[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
        ]
        ) :  zsg.ApplicationX2[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
]  = new  zsg.ApplicationX2[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum2), t11)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum2)
            }
        }
         inline given   [F[  _   ,  _   ,  _ ], T <: zsg.Context3[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
        ]
        ) :  zsg.ApplicationX3[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
]  = new  zsg.ApplicationX3[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum3), t11)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum3)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: zsg.Context4[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
        ]
        ) :  zsg.ApplicationX4[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
]  = new  zsg.ApplicationX4[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum4), t11)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum4)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context5[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
        ]
        ) :  zsg.ApplicationX5[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
]  = new  zsg.ApplicationX5[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum5), t11)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum5)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context6[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
        ]
        ) :  zsg.ApplicationX6[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
]  = new  zsg.ApplicationX6[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum6), t11)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum6)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context7[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
        ]
        ) :  zsg.ApplicationX7[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
]  = new  zsg.ApplicationX7[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum7), t11)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum7)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context8[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
        ]
        ) :  zsg.ApplicationX8[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
]  = new  zsg.ApplicationX8[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum8), t11)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum8)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context9[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
        ]
        ) :  zsg.ApplicationX9[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
]  = new  zsg.ApplicationX9[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum9), t11)(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum9)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context10[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
        ]
        ) :  zsg.ApplicationX10[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
]  = new  zsg.ApplicationX10[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum10), t11)(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum10)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context11[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
        ]
        ) :  zsg.ApplicationX11[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
]  = new  zsg.ApplicationX11[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum11), t11)(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum11)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context12[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
        ]
        ) :  zsg.ApplicationX12[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
]  = new  zsg.ApplicationX12[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum12), t11)(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum12)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context13[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
        ]
        ) :  zsg.ApplicationX13[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
]  = new  zsg.ApplicationX13[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum13), t11)(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum13)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context14[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
        ]
        ) :  zsg.ApplicationX14[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
]  = new  zsg.ApplicationX14[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum14), t11)(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum14)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context15[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
        ]
        ) :  zsg.ApplicationX15[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
]  = new  zsg.ApplicationX15[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum15), t11)(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum15)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context16[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
        ]
        ) :  zsg.ApplicationX16[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
]  = new  zsg.ApplicationX16[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum16), t11)(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum16)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context17[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
        ]
        ) :  zsg.ApplicationX17[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
]  = new  zsg.ApplicationX17[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum17), t11)(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum17)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context18[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18  , Tuple8_Context18  , Tuple9_Context18  , Tuple10_Context18  , Tuple11_Context18  , Tuple12_Context18 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
                 ,  Tuple8_Context18
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
                 ,  Tuple9_Context18
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
                 ,  Tuple10_Context18
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
                 ,  Tuple11_Context18
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
                 ,  Tuple12_Context18
        ]
        ) :  zsg.ApplicationX18[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
]  = new  zsg.ApplicationX18[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
         ,  Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum18), t11)(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum18)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context19[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18  , Tuple8_Context18  , Tuple9_Context18  , Tuple10_Context18  , Tuple11_Context18  , Tuple12_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19  , Tuple8_Context19  , Tuple9_Context19  , Tuple10_Context19  , Tuple11_Context19  , Tuple12_Context19 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
                 ,  Tuple8_Context18
                 ,  Tuple8_Context19
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
                 ,  Tuple9_Context18
                 ,  Tuple9_Context19
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
                 ,  Tuple10_Context18
                 ,  Tuple10_Context19
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
                 ,  Tuple11_Context18
                 ,  Tuple11_Context19
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
                 ,  Tuple12_Context18
                 ,  Tuple12_Context19
        ]
        ) :  zsg.ApplicationX19[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
]  = new  zsg.ApplicationX19[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
         ,  Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
         ,  Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum19), t11)(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum19)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context20[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18  , Tuple8_Context18  , Tuple9_Context18  , Tuple10_Context18  , Tuple11_Context18  , Tuple12_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19  , Tuple8_Context19  , Tuple9_Context19  , Tuple10_Context19  , Tuple11_Context19  , Tuple12_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20  , Tuple8_Context20  , Tuple9_Context20  , Tuple10_Context20  , Tuple11_Context20  , Tuple12_Context20 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
                 ,  Tuple8_Context18
                 ,  Tuple8_Context19
                 ,  Tuple8_Context20
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
                 ,  Tuple9_Context18
                 ,  Tuple9_Context19
                 ,  Tuple9_Context20
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
                 ,  Tuple10_Context18
                 ,  Tuple10_Context19
                 ,  Tuple10_Context20
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
                 ,  Tuple11_Context18
                 ,  Tuple11_Context19
                 ,  Tuple11_Context20
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
                 ,  Tuple12_Context18
                 ,  Tuple12_Context19
                 ,  Tuple12_Context20
        ]
        ) :  zsg.ApplicationX20[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
]  = new  zsg.ApplicationX20[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
         ,  Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
         ,  Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
         ,  Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum20), t11)(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum20)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context21[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18  , Tuple8_Context18  , Tuple9_Context18  , Tuple10_Context18  , Tuple11_Context18  , Tuple12_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19  , Tuple8_Context19  , Tuple9_Context19  , Tuple10_Context19  , Tuple11_Context19  , Tuple12_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20  , Tuple8_Context20  , Tuple9_Context20  , Tuple10_Context20  , Tuple11_Context20  , Tuple12_Context20 
         , Tuple1_Context21  , Tuple2_Context21  , Tuple3_Context21  , Tuple4_Context21  , Tuple5_Context21  , Tuple6_Context21  , Tuple7_Context21  , Tuple8_Context21  , Tuple9_Context21  , Tuple10_Context21  , Tuple11_Context21  , Tuple12_Context21 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
                 ,  Tuple1_Context21
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
                 ,  Tuple2_Context21
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
                 ,  Tuple3_Context21
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
                 ,  Tuple4_Context21
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
                 ,  Tuple5_Context21
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
                 ,  Tuple6_Context21
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
                 ,  Tuple7_Context21
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
                 ,  Tuple8_Context18
                 ,  Tuple8_Context19
                 ,  Tuple8_Context20
                 ,  Tuple8_Context21
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
                 ,  Tuple9_Context18
                 ,  Tuple9_Context19
                 ,  Tuple9_Context20
                 ,  Tuple9_Context21
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
                 ,  Tuple10_Context18
                 ,  Tuple10_Context19
                 ,  Tuple10_Context20
                 ,  Tuple10_Context21
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
                 ,  Tuple11_Context18
                 ,  Tuple11_Context19
                 ,  Tuple11_Context20
                 ,  Tuple11_Context21
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
                 ,  Tuple12_Context18
                 ,  Tuple12_Context19
                 ,  Tuple12_Context20
                 ,  Tuple12_Context21
        ]
        ) :  zsg.ApplicationX21[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
        , Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
]  = new  zsg.ApplicationX21[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
        , Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
         ,  Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
         ,  Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
         ,  Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
         ,  Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum21), t11)(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum21)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context22[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9  , Tuple8_Context9  , Tuple9_Context9  , Tuple10_Context9  , Tuple11_Context9  , Tuple12_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10  , Tuple8_Context10  , Tuple9_Context10  , Tuple10_Context10  , Tuple11_Context10  , Tuple12_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11  , Tuple8_Context11  , Tuple9_Context11  , Tuple10_Context11  , Tuple11_Context11  , Tuple12_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12  , Tuple8_Context12  , Tuple9_Context12  , Tuple10_Context12  , Tuple11_Context12  , Tuple12_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13  , Tuple8_Context13  , Tuple9_Context13  , Tuple10_Context13  , Tuple11_Context13  , Tuple12_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14  , Tuple8_Context14  , Tuple9_Context14  , Tuple10_Context14  , Tuple11_Context14  , Tuple12_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15  , Tuple8_Context15  , Tuple9_Context15  , Tuple10_Context15  , Tuple11_Context15  , Tuple12_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16  , Tuple8_Context16  , Tuple9_Context16  , Tuple10_Context16  , Tuple11_Context16  , Tuple12_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17  , Tuple8_Context17  , Tuple9_Context17  , Tuple10_Context17  , Tuple11_Context17  , Tuple12_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18  , Tuple8_Context18  , Tuple9_Context18  , Tuple10_Context18  , Tuple11_Context18  , Tuple12_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19  , Tuple8_Context19  , Tuple9_Context19  , Tuple10_Context19  , Tuple11_Context19  , Tuple12_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20  , Tuple8_Context20  , Tuple9_Context20  , Tuple10_Context20  , Tuple11_Context20  , Tuple12_Context20 
         , Tuple1_Context21  , Tuple2_Context21  , Tuple3_Context21  , Tuple4_Context21  , Tuple5_Context21  , Tuple6_Context21  , Tuple7_Context21  , Tuple8_Context21  , Tuple9_Context21  , Tuple10_Context21  , Tuple11_Context21  , Tuple12_Context21 
         , Tuple1_Context22  , Tuple2_Context22  , Tuple3_Context22  , Tuple4_Context22  , Tuple5_Context22  , Tuple6_Context22  , Tuple7_Context22  , Tuple8_Context22  , Tuple9_Context22  , Tuple10_Context22  , Tuple11_Context22  , Tuple12_Context22 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
                 ,  Tuple1_Context21
                 ,  Tuple1_Context22
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
                 ,  Tuple2_Context21
                 ,  Tuple2_Context22
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
                 ,  Tuple3_Context21
                 ,  Tuple3_Context22
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
                 ,  Tuple4_Context21
                 ,  Tuple4_Context22
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
                 ,  Tuple5_Context21
                 ,  Tuple5_Context22
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
                 ,  Tuple6_Context21
                 ,  Tuple6_Context22
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
                 ,  Tuple7_Context21
                 ,  Tuple7_Context22
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
                 ,  Tuple8_Context9
                 ,  Tuple8_Context10
                 ,  Tuple8_Context11
                 ,  Tuple8_Context12
                 ,  Tuple8_Context13
                 ,  Tuple8_Context14
                 ,  Tuple8_Context15
                 ,  Tuple8_Context16
                 ,  Tuple8_Context17
                 ,  Tuple8_Context18
                 ,  Tuple8_Context19
                 ,  Tuple8_Context20
                 ,  Tuple8_Context21
                 ,  Tuple8_Context22
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
                 ,  Tuple9_Context9
                 ,  Tuple9_Context10
                 ,  Tuple9_Context11
                 ,  Tuple9_Context12
                 ,  Tuple9_Context13
                 ,  Tuple9_Context14
                 ,  Tuple9_Context15
                 ,  Tuple9_Context16
                 ,  Tuple9_Context17
                 ,  Tuple9_Context18
                 ,  Tuple9_Context19
                 ,  Tuple9_Context20
                 ,  Tuple9_Context21
                 ,  Tuple9_Context22
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
                 ,  Tuple10_Context9
                 ,  Tuple10_Context10
                 ,  Tuple10_Context11
                 ,  Tuple10_Context12
                 ,  Tuple10_Context13
                 ,  Tuple10_Context14
                 ,  Tuple10_Context15
                 ,  Tuple10_Context16
                 ,  Tuple10_Context17
                 ,  Tuple10_Context18
                 ,  Tuple10_Context19
                 ,  Tuple10_Context20
                 ,  Tuple10_Context21
                 ,  Tuple10_Context22
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
                 ,  Tuple11_Context9
                 ,  Tuple11_Context10
                 ,  Tuple11_Context11
                 ,  Tuple11_Context12
                 ,  Tuple11_Context13
                 ,  Tuple11_Context14
                 ,  Tuple11_Context15
                 ,  Tuple11_Context16
                 ,  Tuple11_Context17
                 ,  Tuple11_Context18
                 ,  Tuple11_Context19
                 ,  Tuple11_Context20
                 ,  Tuple11_Context21
                 ,  Tuple11_Context22
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
                 ,  Tuple12_Context9
                 ,  Tuple12_Context10
                 ,  Tuple12_Context11
                 ,  Tuple12_Context12
                 ,  Tuple12_Context13
                 ,  Tuple12_Context14
                 ,  Tuple12_Context15
                 ,  Tuple12_Context16
                 ,  Tuple12_Context17
                 ,  Tuple12_Context18
                 ,  Tuple12_Context19
                 ,  Tuple12_Context20
                 ,  Tuple12_Context21
                 ,  Tuple12_Context22
        ]
        ) :  zsg.ApplicationX22[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
        , Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
        , Tuple12[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22   ,  Tuple8_Context22   ,  Tuple9_Context22   ,  Tuple10_Context22   ,  Tuple11_Context22   ,  Tuple12_Context22 ]
]  = new  zsg.ApplicationX22[F, T
        , Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
        , Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
        , Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
        , Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
        , Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
        , Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
        , Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
        , Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
        , Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
        , Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
        , Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
        , Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
        , Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
        , Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
        , Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
        , Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
        , Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
        , Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
        , Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
        , Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
        , Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
        , Tuple12[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22   ,  Tuple8_Context22   ,  Tuple9_Context22   ,  Tuple10_Context22   ,  Tuple11_Context22   ,  Tuple12_Context22 ]
]   {
            override def application(context: T):  F[
         Tuple12[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1 ]
         ,  Tuple12[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2 ]
         ,  Tuple12[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3 ]
         ,  Tuple12[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4 ]
         ,  Tuple12[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5 ]
         ,  Tuple12[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6 ]
         ,  Tuple12[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7 ]
         ,  Tuple12[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8 ]
         ,  Tuple12[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9   ,  Tuple8_Context9   ,  Tuple9_Context9   ,  Tuple10_Context9   ,  Tuple11_Context9   ,  Tuple12_Context9 ]
         ,  Tuple12[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10   ,  Tuple8_Context10   ,  Tuple9_Context10   ,  Tuple10_Context10   ,  Tuple11_Context10   ,  Tuple12_Context10 ]
         ,  Tuple12[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11   ,  Tuple8_Context11   ,  Tuple9_Context11   ,  Tuple10_Context11   ,  Tuple11_Context11   ,  Tuple12_Context11 ]
         ,  Tuple12[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12   ,  Tuple8_Context12   ,  Tuple9_Context12   ,  Tuple10_Context12   ,  Tuple11_Context12   ,  Tuple12_Context12 ]
         ,  Tuple12[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13   ,  Tuple8_Context13   ,  Tuple9_Context13   ,  Tuple10_Context13   ,  Tuple11_Context13   ,  Tuple12_Context13 ]
         ,  Tuple12[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14   ,  Tuple8_Context14   ,  Tuple9_Context14   ,  Tuple10_Context14   ,  Tuple11_Context14   ,  Tuple12_Context14 ]
         ,  Tuple12[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15   ,  Tuple8_Context15   ,  Tuple9_Context15   ,  Tuple10_Context15   ,  Tuple11_Context15   ,  Tuple12_Context15 ]
         ,  Tuple12[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16   ,  Tuple8_Context16   ,  Tuple9_Context16   ,  Tuple10_Context16   ,  Tuple11_Context16   ,  Tuple12_Context16 ]
         ,  Tuple12[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17   ,  Tuple8_Context17   ,  Tuple9_Context17   ,  Tuple10_Context17   ,  Tuple11_Context17   ,  Tuple12_Context17 ]
         ,  Tuple12[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18   ,  Tuple8_Context18   ,  Tuple9_Context18   ,  Tuple10_Context18   ,  Tuple11_Context18   ,  Tuple12_Context18 ]
         ,  Tuple12[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19   ,  Tuple8_Context19   ,  Tuple9_Context19   ,  Tuple10_Context19   ,  Tuple11_Context19   ,  Tuple12_Context19 ]
         ,  Tuple12[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20   ,  Tuple8_Context20   ,  Tuple9_Context20   ,  Tuple10_Context20   ,  Tuple11_Context20   ,  Tuple12_Context20 ]
         ,  Tuple12[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21   ,  Tuple8_Context21   ,  Tuple9_Context21   ,  Tuple10_Context21   ,  Tuple11_Context21   ,  Tuple12_Context21 ]
         ,  Tuple12[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22   ,  Tuple8_Context22   ,  Tuple9_Context22   ,  Tuple10_Context22   ,  Tuple11_Context22   ,  Tuple12_Context22 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum22), t11)(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22), t12)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_12.contextNum22)
            }
        }
}
