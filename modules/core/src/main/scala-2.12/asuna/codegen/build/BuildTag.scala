package asuna
final object BuildTag {
final def lift[T](tag : => AppendTag[T]): AppendTag[T] = AppendTag[T]
final def tag[T1 ](t1 : AppendTag[T1] ):
AppendTag[TupleTag1[T1 ]] =
AppendTag[TupleTag1[T1 ]]
final def nodeTag[T1 <: TupleTag ](t1: AppendTag[T1] ):
AppendTag[NodeTag1[T1 ]] =
AppendTag[NodeTag1[T1 ]]
final def tag[T1  , T2 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2] ):
AppendTag[TupleTag2[T1  , T2 ]] =
AppendTag[TupleTag2[T1  , T2 ]]
final def nodeTag[T1 <: TupleTag  , T2 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2] ):
AppendTag[NodeTag2[T1  , T2]] =
AppendTag[NodeTag2[T1  , T2 ]]
final def mergeTag[T1 <: TupleTag  , T2 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2] )
(implicit i: Merge2[T1  , T2 , Target]): AppendTag[Target] = AppendTag[Target]
}