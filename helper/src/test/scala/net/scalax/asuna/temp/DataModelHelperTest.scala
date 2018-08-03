package net.scalax.asuna.temp

object Test01 extends App with Test01Helper {

  case class Wrap(key: String, value: String, h: Abc)

  case class Abc(name: String, def1: Def)

  case class Def(age: Int)

  val value = Wrap("sgfsafger", "sdfsdfseaetgerg", Abc("sdfsdfarfe", Def(16)))

  implicitly[CirceEncoderConfirmOrder[Def]]

  val str = stringUtil.effect(stringUtil.caseOnly[EmptyTable, Wrap].input(EmptyTable.value)).write(value)

  println(str)

}