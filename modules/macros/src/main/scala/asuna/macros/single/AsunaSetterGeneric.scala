package asuna.macros.single

import asuna.macros.single.utils.TypeHelper
import asuna.macros.{AllScalaMacroMethods, AsunaParameters}
import asuna.macros.utils.MacroMethods

import scala.language.experimental.macros

trait AsunaSetterGeneric[H, GenericType] {
  def setter(gen: GenericType): H
}

object AsunaSetterGeneric {

  def value[Model, GenericType](i: GenericType => Model): AsunaSetterGeneric[Model, GenericType] = new AsunaSetterGeneric[Model, GenericType] {
    override def setter(gen: GenericType): Model = i(gen)
  }

  implicit def macroImpl[H, M]: AsunaSetterGeneric[H, M] = macro AsunaSetterGenericMacroApply.MacroImpl.generic[H, M]

}

object AsunaSetterGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends MacroMethods with AllScalaMacroMethods with TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType
        val s     = symbolOf[H]
        val b     = companionOfSymbol(s)

        val props = caseClassMembersByType(hType)

        def toItemImpl(max: Int, initList: List[(ModelField, Tree => Tree)]): List[(ModelField, Tree => Tree)] =
          if (initList.size > max) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree => t(q"""${t1}.${TermName("i" + ((index / max % AsunaParameters.maxPropertyNum) + 1).toString)}""") })
            }
            toItemImpl(max * AsunaParameters.maxPropertyNum, i)
          } else initList

        val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree => q"""${t1}.${TermName("i" + (index % AsunaParameters.maxPropertyNum + 1).toString)}""" })
        }

        val casei = toItemImpl(AsunaParameters.maxPropertyNum, preList)

        val inputFunc = q"""_root_.asuna.macros.single.AsunaSetterGeneric.value(item => ${b.companionTree}.apply(..${casei.map {
          case (item, m) => namedParam(item.fieldTermName, m(Ident(TermName("item"))))
        }}))"""

        c.Expr[AsunaSetterGeneric[H, M]] {
          inputFunc
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
