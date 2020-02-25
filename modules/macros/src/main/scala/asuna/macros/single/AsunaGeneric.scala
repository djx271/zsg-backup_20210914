package asuna.macros.single

import asuna._
import asuna.macros.AsunaParameters

import scala.language.experimental.macros

trait AsunaGeneric[H] {
  type WT <: TupleTag
  def tag: WT
}

object AsunaGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M]
  class GenericApply[M] {
    def generic[WW <: TupleTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: TupleTag](i: AppendTag[K]): AsunaGeneric.Aux[M, K] = {
      new AsunaGeneric[M] {
        override type WT = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: TupleTag] = AsunaGeneric[H] { type WT = II }

  implicit def macroImpl[H, II <: TupleTag]: AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: TupleTag: c.WeakTypeTag]: c.Expr[AsunaGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val proTypeTag = props.map(s => q"""asuna.macros.single.PropertyApply[${hType}].to(_.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(AsunaParameters.maxPropertyNum).toList.map(i => q"""asuna.BuildTag.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildTag.lift(..${tree})"""
          } else if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""asuna.BuildTag.lift(asuna.BuildTag.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildTag.nodeTag(..${s})"""))
          }

        c.Expr[AsunaGeneric.Aux[H, M]] {
          q"""asuna.macros.single.AsunaGeneric.init[${hType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}