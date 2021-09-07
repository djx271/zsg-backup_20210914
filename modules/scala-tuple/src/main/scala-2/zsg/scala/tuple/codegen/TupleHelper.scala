package zsg.scala.tuple
import zsg.TypeFunction
import zsg.TypeHList
import zsg.Application
import zsg.Context
trait TupleHelper {
  implicit def applicationScalaTupleImplicit1[F <: TypeFunction, T <: Context[F], Boot1, Target1 <: TypeHList](implicit
    v1: Application[F, T, Boot1, Target1]
  ): Application[F, T, Tuple1[Boot1], Tuple1TypeHList[Target1]] =
    new Application[F, T, Tuple1[Boot1], Tuple1TypeHList[Target1]] {
      override def application(context: T): F#H[Tuple1TypeHList[Target1]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit2[F <: TypeFunction, T <: Context[F], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2]
  ): Application[F, T, Tuple2[Boot1, Boot2], Tuple2TypeHList[Target1, Target2]] =
    new Application[F, T, Tuple2[Boot1, Boot2], Tuple2TypeHList[Target1, Target2]] {
      override def application(context: T): F#H[Tuple2TypeHList[Target1, Target2]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit3[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList](implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3]
  ): Application[F, T, Tuple3[Boot1, Boot2, Boot3], Tuple3TypeHList[Target1, Target2, Target3]] =
    new Application[F, T, Tuple3[Boot1, Boot2, Boot3], Tuple3TypeHList[Target1, Target2, Target3]] {
      override def application(context: T): F#H[Tuple3TypeHList[Target1, Target2, Target3]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit4[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList](implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4]
  ): Application[F, T, Tuple4[Boot1, Boot2, Boot3, Boot4], Tuple4TypeHList[Target1, Target2, Target3, Target4]] =
    new Application[F, T, Tuple4[Boot1, Boot2, Boot3, Boot4], Tuple4TypeHList[Target1, Target2, Target3, Target4]] {
      override def application(context: T): F#H[Tuple4TypeHList[Target1, Target2, Target3, Target4]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit5[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5]
  ): Application[F, T, Tuple5[Boot1, Boot2, Boot3, Boot4, Boot5], Tuple5TypeHList[Target1, Target2, Target3, Target4, Target5]] =
    new Application[F, T, Tuple5[Boot1, Boot2, Boot3, Boot4, Boot5], Tuple5TypeHList[Target1, Target2, Target3, Target4, Target5]] {
      override def application(context: T): F#H[Tuple5TypeHList[Target1, Target2, Target3, Target4, Target5]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit6[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6]
  ): Application[F, T, Tuple6[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6], Tuple6TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6
  ]] =
    new Application[
      F,
      T,
      Tuple6[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6],
      Tuple6TypeHList[Target1, Target2, Target3, Target4, Target5, Target6]
    ] {
      override def application(context: T): F#H[Tuple6TypeHList[Target1, Target2, Target3, Target4, Target5, Target6]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit7[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7]
  ): Application[F, T, Tuple7[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7], Tuple7TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7
  ]] =
    new Application[
      F,
      T,
      Tuple7[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7],
      Tuple7TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7]
    ] {
      override def application(context: T): F#H[Tuple7TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7]] =
        throw new Exception
    }
  implicit def applicationScalaTupleImplicit8[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8]
  ): Application[F, T, Tuple8[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8], Tuple8TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8
  ]] =
    new Application[
      F,
      T,
      Tuple8[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8],
      Tuple8TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8]
    ] {
      override def application(context: T): F#H[Tuple8TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8]] =
        throw new Exception
    }
  implicit def applicationScalaTupleImplicit9[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9]
  ): Application[F, T, Tuple9[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9], Tuple9TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9
  ]] =
    new Application[
      F,
      T,
      Tuple9[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9],
      Tuple9TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9]
    ] {
      override def application(
        context: T
      ): F#H[Tuple9TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit10[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10]
  ): Application[F, T, Tuple10[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10], Tuple10TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10
  ]] =
    new Application[
      F,
      T,
      Tuple10[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10],
      Tuple10TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10]
    ] {
      override def application(
        context: T
      ): F#H[Tuple10TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10]] =
        throw new Exception
    }
  implicit def applicationScalaTupleImplicit11[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11]
  ): Application[F, T, Tuple11[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11], Tuple11TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11
  ]] =
    new Application[
      F,
      T,
      Tuple11[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11],
      Tuple11TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10, Target11]
    ] {
      override def application(
        context: T
      ): F#H[Tuple11TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10, Target11]] =
        throw new Exception
    }
  implicit def applicationScalaTupleImplicit12[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12]
  ): Application[F, T, Tuple12[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12], Tuple12TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12
  ]] =
    new Application[
      F,
      T,
      Tuple12[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12],
      Tuple12TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10, Target11, Target12]
    ] {
      override def application(context: T): F#H[
        Tuple12TypeHList[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8, Target9, Target10, Target11, Target12]
      ] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit13[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13]
  ): Application[F, T, Tuple13[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13
  ], Tuple13TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13
  ]] =
    new Application[
      F,
      T,
      Tuple13[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12, Boot13],
      Tuple13TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13
      ]
    ] {
      override def application(context: T): F#H[Tuple13TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit14[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14]
  ): Application[F, T, Tuple14[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14
  ], Tuple14TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14
  ]] =
    new Application[
      F,
      T,
      Tuple14[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12, Boot13, Boot14],
      Tuple14TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14
      ]
    ] {
      override def application(context: T): F#H[Tuple14TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit15[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15]
  ): Application[F, T, Tuple15[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15
  ], Tuple15TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15
  ]] =
    new Application[
      F,
      T,
      Tuple15[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12, Boot13, Boot14, Boot15],
      Tuple15TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15
      ]
    ] {
      override def application(context: T): F#H[Tuple15TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit16[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16]
  ): Application[F, T, Tuple16[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16
  ], Tuple16TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16
  ]] =
    new Application[
      F,
      T,
      Tuple16[Boot1, Boot2, Boot3, Boot4, Boot5, Boot6, Boot7, Boot8, Boot9, Boot10, Boot11, Boot12, Boot13, Boot14, Boot15, Boot16],
      Tuple16TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16
      ]
    ] {
      override def application(context: T): F#H[Tuple16TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit17[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17]
  ): Application[F, T, Tuple17[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17
  ], Tuple17TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17
  ]] =
    new Application[F, T, Tuple17[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17
    ], Tuple17TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17
    ]] {
      override def application(context: T): F#H[Tuple17TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit18[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList, Boot18, Target18 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17],
    v18: Application[F, T, Boot18, Target18]
  ): Application[F, T, Tuple18[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18
  ], Tuple18TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18
  ]] =
    new Application[F, T, Tuple18[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17,
      Boot18
    ], Tuple18TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17,
      Target18
    ]] {
      override def application(context: T): F#H[Tuple18TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17,
        Target18
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit19[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList, Boot18, Target18 <: TypeHList, Boot19, Target19 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17],
    v18: Application[F, T, Boot18, Target18],
    v19: Application[F, T, Boot19, Target19]
  ): Application[F, T, Tuple19[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19
  ], Tuple19TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19
  ]] =
    new Application[F, T, Tuple19[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17,
      Boot18,
      Boot19
    ], Tuple19TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17,
      Target18,
      Target19
    ]] {
      override def application(context: T): F#H[Tuple19TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17,
        Target18,
        Target19
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit20[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList, Boot18, Target18 <: TypeHList, Boot19, Target19 <: TypeHList, Boot20, Target20 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17],
    v18: Application[F, T, Boot18, Target18],
    v19: Application[F, T, Boot19, Target19],
    v20: Application[F, T, Boot20, Target20]
  ): Application[F, T, Tuple20[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20
  ], Tuple20TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20
  ]] =
    new Application[F, T, Tuple20[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17,
      Boot18,
      Boot19,
      Boot20
    ], Tuple20TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17,
      Target18,
      Target19,
      Target20
    ]] {
      override def application(context: T): F#H[Tuple20TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17,
        Target18,
        Target19,
        Target20
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit21[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList, Boot18, Target18 <: TypeHList, Boot19, Target19 <: TypeHList, Boot20, Target20 <: TypeHList, Boot21, Target21 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17],
    v18: Application[F, T, Boot18, Target18],
    v19: Application[F, T, Boot19, Target19],
    v20: Application[F, T, Boot20, Target20],
    v21: Application[F, T, Boot21, Target21]
  ): Application[F, T, Tuple21[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20,
    Boot21
  ], Tuple21TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20,
    Target21
  ]] =
    new Application[F, T, Tuple21[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17,
      Boot18,
      Boot19,
      Boot20,
      Boot21
    ], Tuple21TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17,
      Target18,
      Target19,
      Target20,
      Target21
    ]] {
      override def application(context: T): F#H[Tuple21TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17,
        Target18,
        Target19,
        Target20,
        Target21
      ]] = throw new Exception
    }
  implicit def applicationScalaTupleImplicit22[F <: TypeFunction, T <: Context[
    F
  ], Boot1, Target1 <: TypeHList, Boot2, Target2 <: TypeHList, Boot3, Target3 <: TypeHList, Boot4, Target4 <: TypeHList, Boot5, Target5 <: TypeHList, Boot6, Target6 <: TypeHList, Boot7, Target7 <: TypeHList, Boot8, Target8 <: TypeHList, Boot9, Target9 <: TypeHList, Boot10, Target10 <: TypeHList, Boot11, Target11 <: TypeHList, Boot12, Target12 <: TypeHList, Boot13, Target13 <: TypeHList, Boot14, Target14 <: TypeHList, Boot15, Target15 <: TypeHList, Boot16, Target16 <: TypeHList, Boot17, Target17 <: TypeHList, Boot18, Target18 <: TypeHList, Boot19, Target19 <: TypeHList, Boot20, Target20 <: TypeHList, Boot21, Target21 <: TypeHList, Boot22, Target22 <: TypeHList](
    implicit
    v1: Application[F, T, Boot1, Target1],
    v2: Application[F, T, Boot2, Target2],
    v3: Application[F, T, Boot3, Target3],
    v4: Application[F, T, Boot4, Target4],
    v5: Application[F, T, Boot5, Target5],
    v6: Application[F, T, Boot6, Target6],
    v7: Application[F, T, Boot7, Target7],
    v8: Application[F, T, Boot8, Target8],
    v9: Application[F, T, Boot9, Target9],
    v10: Application[F, T, Boot10, Target10],
    v11: Application[F, T, Boot11, Target11],
    v12: Application[F, T, Boot12, Target12],
    v13: Application[F, T, Boot13, Target13],
    v14: Application[F, T, Boot14, Target14],
    v15: Application[F, T, Boot15, Target15],
    v16: Application[F, T, Boot16, Target16],
    v17: Application[F, T, Boot17, Target17],
    v18: Application[F, T, Boot18, Target18],
    v19: Application[F, T, Boot19, Target19],
    v20: Application[F, T, Boot20, Target20],
    v21: Application[F, T, Boot21, Target21],
    v22: Application[F, T, Boot22, Target22]
  ): Application[F, T, Tuple22[
    Boot1,
    Boot2,
    Boot3,
    Boot4,
    Boot5,
    Boot6,
    Boot7,
    Boot8,
    Boot9,
    Boot10,
    Boot11,
    Boot12,
    Boot13,
    Boot14,
    Boot15,
    Boot16,
    Boot17,
    Boot18,
    Boot19,
    Boot20,
    Boot21,
    Boot22
  ], Tuple22TypeHList[
    Target1,
    Target2,
    Target3,
    Target4,
    Target5,
    Target6,
    Target7,
    Target8,
    Target9,
    Target10,
    Target11,
    Target12,
    Target13,
    Target14,
    Target15,
    Target16,
    Target17,
    Target18,
    Target19,
    Target20,
    Target21,
    Target22
  ]] =
    new Application[F, T, Tuple22[
      Boot1,
      Boot2,
      Boot3,
      Boot4,
      Boot5,
      Boot6,
      Boot7,
      Boot8,
      Boot9,
      Boot10,
      Boot11,
      Boot12,
      Boot13,
      Boot14,
      Boot15,
      Boot16,
      Boot17,
      Boot18,
      Boot19,
      Boot20,
      Boot21,
      Boot22
    ], Tuple22TypeHList[
      Target1,
      Target2,
      Target3,
      Target4,
      Target5,
      Target6,
      Target7,
      Target8,
      Target9,
      Target10,
      Target11,
      Target12,
      Target13,
      Target14,
      Target15,
      Target16,
      Target17,
      Target18,
      Target19,
      Target20,
      Target21,
      Target22
    ]] {
      override def application(context: T): F#H[Tuple22TypeHList[
        Target1,
        Target2,
        Target3,
        Target4,
        Target5,
        Target6,
        Target7,
        Target8,
        Target9,
        Target10,
        Target11,
        Target12,
        Target13,
        Target14,
        Target15,
        Target16,
        Target17,
        Target18,
        Target19,
        Target20,
        Target21,
        Target22
      ]] = throw new Exception
    }
}
object TupleHelper extends TupleHelper