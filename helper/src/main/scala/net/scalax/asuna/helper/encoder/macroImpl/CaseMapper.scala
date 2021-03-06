package net.scalax.asuna.helper.encoder.macroImpl

import net.scalax.asuna.helper._

import scala.reflect.macros.blackbox.Context

object CaseModelContentHelper {

  class CaseModelContentHelperImpl(val c: Context) {
    self =>

    import c.universe._

    case class FieldWrap(law: String, index: Int, propertyTag: Type)

    def impl[Case: c.WeakTypeTag]: c.Expr[CaseModelContent[Case]] = {
      val caseClass = weakTypeOf[Case]
      val modelContent = weakTypeOf[CaseModelContent[Case]]
      val symbolClass = weakTypeOf[scala.Symbol]
      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.toList.zipWithIndex.map {
        case (s, index) =>
          FieldWrap(law = TermName.unapply(s.name.asInstanceOf[TermName]).get.trim, index = index, propertyTag = s.typeSignatureIn(caseClass.resultType))
      }

      val q = c.Expr[CaseModelContent[Case]] {
        q"""
        new $modelContent {

          override def set(arr: Array[Any], propertyName: $symbolClass, value: Any): Unit = {
            ${
          modelFieldNames.foldLeft(q"(): Unit": Tree) { (tree, field) =>
            q"""if (propertyName eq ${symbolClass.typeSymbol.companion}(${Literal(Constant(field.law))})) {
                  arr(${Literal(Constant(field.index))}) = value
                } else { $tree }"""
          }
        }
          }

          override def toModel(arr: Array[Any]): $caseClass = {
            ${caseClass.typeSymbol.companion}.apply(..${
          modelFieldNames.map(s => q"""${TermName(s.law)} = arr(${Literal(Constant(s.index))}).asInstanceOf[${s.propertyTag}]""")
        })
          }

          override def get(caseModel: $caseClass, propertyName: $symbolClass): Any = {
            ${
          modelFieldNames.foldLeft(q"(): Unit": Tree) { (tree, field) =>
            q"""if (propertyName eq ${symbolClass.typeSymbol.companion}(${Literal(Constant(field.law))})) {
                  caseModel.${TermName(field.law)}
                } else { $tree }"""
          }
        }
          }

          override def getFromArr(arr: Array[Any], propertyName: $symbolClass): Any = {
            ${
          modelFieldNames.foldLeft(q"(): Unit": Tree) { (tree, field) =>
            q"""if (propertyName eq ${symbolClass.typeSymbol.companion}(${Literal(Constant(field.law))})) {
                  arr(${Literal(Constant(field.index))})
                } else { $tree }"""
          }
        }
          }

        }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

    def impl1111[Case: c.WeakTypeTag]: c.Expr[CaseModelContent1111[Case]] = {
      val caseClass = weakTypeOf[Case]
      val modelContent = weakTypeOf[CaseModelContent1111[Case]]
      val symbolClass = weakTypeOf[scala.Symbol]
      val abcdef = weakTypeOf[Abcdef]
      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.toList.zipWithIndex.map {
        case (s, index) =>
          FieldWrap(law = TermName.unapply(s.name.asInstanceOf[TermName]).get.trim, index = index, propertyTag = s.typeSignatureIn(caseClass.resultType))
      }

      val q = c.Expr[CaseModelContent1111[Case]] {
        q"""
        new $modelContent {

          override def toModel(arr: $abcdef): $caseClass = {
            ${caseClass.typeSymbol.companion}.apply(..${
          modelFieldNames.map(s => q"""${TermName(s.law)} = arr.fetchValue(${symbolClass.typeSymbol.companion}.apply(${Literal(Constant(s.law))})).asInstanceOf[${s.propertyTag}]""")
        })
          }

          override def get(caseModel: $caseClass, propertyName: $symbolClass): Any = {
            ${
          modelFieldNames.foldLeft(q"(): Unit": Tree) { (tree, field) =>
            q"""if (propertyName eq ${symbolClass.typeSymbol.companion}(${Literal(Constant(field.law))})) {
                  caseModel.${TermName(field.law)}
                } else { $tree }"""
          }
        }
          }

        }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

    def impl2222[Case: c.WeakTypeTag]: c.Expr[CaseModelContent2222[Case]] = {
      val caseClass = weakTypeOf[Case]
      val modelContent = weakTypeOf[CaseModelContent2222[Case]]
      val symbolClass = weakTypeOf[scala.Symbol]
      val abcdef = weakTypeOf[SetterContent]
      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.toList.zipWithIndex.map {
        case (s, index) =>
          FieldWrap(law = TermName.unapply(s.name.asInstanceOf[TermName]).get.trim, index = index, propertyTag = s.typeSignatureIn(caseClass.resultType))
      }

      val q = c.Expr[CaseModelContent2222[Case]] {
        q"""
        new $modelContent {

        override def toModel(tail0: $abcdef): $caseClass = {
          ..${
          (1 to modelFieldNames.size).flatMap { i =>
            List(
              q"""val ${TermName("symbol" + i)} = ${TermName("tail" + (i - 1))}.key""",
              q"""val ${TermName("data" + i)} = ${TermName("tail" + (i - 1))}.value""",
              q"""val ${TermName("tail" + i)} = ${TermName("tail" + (i - 1))}.tail.asInstanceOf[$abcdef]""")
          }
        }

        def fetchProperty(name: Symbol): Any = {
          ${
          (1 to modelFieldNames.size).foldLeft(q"""(throw new _root_.scala.Exception(s"?????????????????? $${name} ??????")): Any""": Tree) { (tree, index) =>
            q"""if (name eq ${TermName("symbol" + index)}) {
              ${TermName("data" + index)}
            } else {
              $tree
            }"""
          }
        }
        }

        ${caseClass.typeSymbol.companion}.apply(..${
          modelFieldNames.map(s =>
            q"""${TermName(s.law)} = fetchProperty(_root_.scala.Symbol(${Literal(Constant(s.law))})).asInstanceOf[${s.propertyTag}]""")
        })

        }

        override def get(caseModel: $caseClass, propertyName: $symbolClass): Any = {
        ${
          modelFieldNames.foldLeft(q"(): Unit": Tree) { (tree, field) =>
            q"""if (propertyName eq ${symbolClass.typeSymbol.companion}(${Literal(Constant(field.law))})) {
              caseModel.${TermName(field.law)}
            } else {
                $tree
            }"""
          }
        }
        }

        }
        """
      }
      /*
      q"""${TermName(s.law)} =
            {
              ${
              (1 to modelFieldNames.size).foldLeft(q"""(throw new _root_.scala.Exception(${Literal(Constant(s"?????????????????? ${s.law} ??????"))})): Any""": Tree) { (tree, index) =>
                q"""if (${symbolClass.typeSymbol.companion}.apply(${Literal(Constant(s.law))}) eq ${TermName("symbol" + index)}) {
                    ${TermName("data" + index)}
                  } else {
                    $tree
                  }"""
              }
            }
            }.asInstanceOf[${s.propertyTag}]"""
       */
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}