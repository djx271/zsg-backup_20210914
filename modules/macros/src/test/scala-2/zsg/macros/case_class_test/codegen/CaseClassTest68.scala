package zsg.macros.case_class_test
import zsg.macros.single.PropertyApply
import scala.collection.compat._
import zio._
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object CaseClassTest68 extends DefaultRunnableSpec {
    case class Foo68(   i1:   Long         ,   i2:    Int        ,   i3:     Int       ,   i4:      Long      ,   i5:       Long = Long.MaxValue     ,   i6:  String          ,   i7:   Long         ,   i8:    Int        ,   i9:     Int       ,   i10:      Long      ,   i11:       Long = Long.MaxValue     ,   i12:  String          ,   i13:   Long         ,   i14:    Int        ,   i15:     Int       ,   i16:      Long      ,   i17:       Long = Long.MaxValue     ,   i18:  String          ,   i19:   Long         ,   i20:    Int        ,   i21:     Int       ,   i22:      Long      ,   i23:       Long = Long.MaxValue     ,   i24:  String          ,   i25:   Long         ,   i26:    Int        ,   i27:     Int       ,   i28:      Long      ,   i29:       Long = Long.MaxValue     ,   i30:  String          ,   i31:   Long         ,   i32:    Int        ,   i33:     Int       ,   i34:      Long      ,   i35:       Long = Long.MaxValue     ,   i36:  String          ,   i37:   Long         ,   i38:    Int        ,   i39:     Int       ,   i40:      Long      ,   i41:       Long = Long.MaxValue     ,   i42:  String          ,   i43:   Long         ,   i44:    Int        ,   i45:     Int       ,   i46:      Long      ,   i47:       Long = Long.MaxValue     ,   i48:  String          ,   i49:   Long         ,   i50:    Int        ,   i51:     Int       ,   i52:      Long      ,   i53:       Long = Long.MaxValue     ,   i54:  String          ,   i55:   Long         ,   i56:    Int        ,   i57:     Int       ,   i58:      Long      ,   i59:       Long = Long.MaxValue     ,   i60:  String          ,   i61:   Long         ,   i62:    Int        ,   i63:     Int       ,   i64:      Long      ,   i65:       Long = Long.MaxValue     ,   i66:  String          ,   i67:   Long         ,   i68:    Int      ) {
        self =>
        def fieldNames: List[String] = List(  "i1"   ,  "i2"   ,  "i3"   ,  "i4"   ,  "i5"   ,  "i6"   ,  "i7"   ,  "i8"   ,  "i9"   ,  "i10"   ,  "i11"   ,  "i12"   ,  "i13"   ,  "i14"   ,  "i15"   ,  "i16"   ,  "i17"   ,  "i18"   ,  "i19"   ,  "i20"   ,  "i21"   ,  "i22"   ,  "i23"   ,  "i24"   ,  "i25"   ,  "i26"   ,  "i27"   ,  "i28"   ,  "i29"   ,  "i30"   ,  "i31"   ,  "i32"   ,  "i33"   ,  "i34"   ,  "i35"   ,  "i36"   ,  "i37"   ,  "i38"   ,  "i39"   ,  "i40"   ,  "i41"   ,  "i42"   ,  "i43"   ,  "i44"   ,  "i45"   ,  "i46"   ,  "i47"   ,  "i48"   ,  "i49"   ,  "i50"   ,  "i51"   ,  "i52"   ,  "i53"   ,  "i54"   ,  "i55"   ,  "i56"   ,  "i57"   ,  "i58"   ,  "i59"   ,  "i60"   ,  "i61"   ,  "i62"   ,  "i63"   ,  "i64"   ,  "i65"   ,  "i66"   ,  "i67"   ,  "i68" )
        def defaultValues: List[DefaultValue] = List(    DefaultValue(value = Option.empty, fieldIndex = 1)     ,    DefaultValue(value = Option.empty, fieldIndex = 2)     ,    DefaultValue(value = Option.empty, fieldIndex = 3)     ,    DefaultValue(value = Option.empty, fieldIndex = 4)     ,    DefaultValue(value = Option(LongProperty(self.i5)), fieldIndex = 5)     ,    DefaultValue(value = Option.empty, fieldIndex = 6)     ,    DefaultValue(value = Option.empty, fieldIndex = 7)     ,    DefaultValue(value = Option.empty, fieldIndex = 8)     ,    DefaultValue(value = Option.empty, fieldIndex = 9)     ,    DefaultValue(value = Option.empty, fieldIndex = 10)     ,    DefaultValue(value = Option(LongProperty(self.i11)), fieldIndex = 11)     ,    DefaultValue(value = Option.empty, fieldIndex = 12)     ,    DefaultValue(value = Option.empty, fieldIndex = 13)     ,    DefaultValue(value = Option.empty, fieldIndex = 14)     ,    DefaultValue(value = Option.empty, fieldIndex = 15)     ,    DefaultValue(value = Option.empty, fieldIndex = 16)     ,    DefaultValue(value = Option(LongProperty(self.i17)), fieldIndex = 17)     ,    DefaultValue(value = Option.empty, fieldIndex = 18)     ,    DefaultValue(value = Option.empty, fieldIndex = 19)     ,    DefaultValue(value = Option.empty, fieldIndex = 20)     ,    DefaultValue(value = Option.empty, fieldIndex = 21)     ,    DefaultValue(value = Option.empty, fieldIndex = 22)     ,    DefaultValue(value = Option(LongProperty(self.i23)), fieldIndex = 23)     ,    DefaultValue(value = Option.empty, fieldIndex = 24)     ,    DefaultValue(value = Option.empty, fieldIndex = 25)     ,    DefaultValue(value = Option.empty, fieldIndex = 26)     ,    DefaultValue(value = Option.empty, fieldIndex = 27)     ,    DefaultValue(value = Option.empty, fieldIndex = 28)     ,    DefaultValue(value = Option(LongProperty(self.i29)), fieldIndex = 29)     ,    DefaultValue(value = Option.empty, fieldIndex = 30)     ,    DefaultValue(value = Option.empty, fieldIndex = 31)     ,    DefaultValue(value = Option.empty, fieldIndex = 32)     ,    DefaultValue(value = Option.empty, fieldIndex = 33)     ,    DefaultValue(value = Option.empty, fieldIndex = 34)     ,    DefaultValue(value = Option(LongProperty(self.i35)), fieldIndex = 35)     ,    DefaultValue(value = Option.empty, fieldIndex = 36)     ,    DefaultValue(value = Option.empty, fieldIndex = 37)     ,    DefaultValue(value = Option.empty, fieldIndex = 38)     ,    DefaultValue(value = Option.empty, fieldIndex = 39)     ,    DefaultValue(value = Option.empty, fieldIndex = 40)     ,    DefaultValue(value = Option(LongProperty(self.i41)), fieldIndex = 41)     ,    DefaultValue(value = Option.empty, fieldIndex = 42)     ,    DefaultValue(value = Option.empty, fieldIndex = 43)     ,    DefaultValue(value = Option.empty, fieldIndex = 44)     ,    DefaultValue(value = Option.empty, fieldIndex = 45)     ,    DefaultValue(value = Option.empty, fieldIndex = 46)     ,    DefaultValue(value = Option(LongProperty(self.i47)), fieldIndex = 47)     ,    DefaultValue(value = Option.empty, fieldIndex = 48)     ,    DefaultValue(value = Option.empty, fieldIndex = 49)     ,    DefaultValue(value = Option.empty, fieldIndex = 50)     ,    DefaultValue(value = Option.empty, fieldIndex = 51)     ,    DefaultValue(value = Option.empty, fieldIndex = 52)     ,    DefaultValue(value = Option(LongProperty(self.i53)), fieldIndex = 53)     ,    DefaultValue(value = Option.empty, fieldIndex = 54)     ,    DefaultValue(value = Option.empty, fieldIndex = 55)     ,    DefaultValue(value = Option.empty, fieldIndex = 56)     ,    DefaultValue(value = Option.empty, fieldIndex = 57)     ,    DefaultValue(value = Option.empty, fieldIndex = 58)     ,    DefaultValue(value = Option(LongProperty(self.i59)), fieldIndex = 59)     ,    DefaultValue(value = Option.empty, fieldIndex = 60)     ,    DefaultValue(value = Option.empty, fieldIndex = 61)     ,    DefaultValue(value = Option.empty, fieldIndex = 62)     ,    DefaultValue(value = Option.empty, fieldIndex = 63)     ,    DefaultValue(value = Option.empty, fieldIndex = 64)     ,    DefaultValue(value = Option(LongProperty(self.i65)), fieldIndex = 65)     ,    DefaultValue(value = Option.empty, fieldIndex = 66)     ,    DefaultValue(value = Option.empty, fieldIndex = 67)     ,    DefaultValue(value = Option.empty, fieldIndex = 68)   )
        def fieldInfo: List[FieldModel] =
            List(   FieldModel(value =   LongProperty(self.i1)     , fieldIndex = 1, fieldName = "i1", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i2)    , fieldIndex = 2, fieldName = "i2", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i3)   , fieldIndex = 3, fieldName = "i3", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i4)  , fieldIndex = 4, fieldName = "i4", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i5) , fieldIndex = 5, fieldName = "i5", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i6)      , fieldIndex = 6, fieldName = "i6", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i7)     , fieldIndex = 7, fieldName = "i7", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i8)    , fieldIndex = 8, fieldName = "i8", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i9)   , fieldIndex = 9, fieldName = "i9", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i10)  , fieldIndex = 10, fieldName = "i10", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i11) , fieldIndex = 11, fieldName = "i11", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i12)      , fieldIndex = 12, fieldName = "i12", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i13)     , fieldIndex = 13, fieldName = "i13", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i14)    , fieldIndex = 14, fieldName = "i14", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i15)   , fieldIndex = 15, fieldName = "i15", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i16)  , fieldIndex = 16, fieldName = "i16", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i17) , fieldIndex = 17, fieldName = "i17", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i18)      , fieldIndex = 18, fieldName = "i18", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i19)     , fieldIndex = 19, fieldName = "i19", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i20)    , fieldIndex = 20, fieldName = "i20", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i21)   , fieldIndex = 21, fieldName = "i21", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i22)  , fieldIndex = 22, fieldName = "i22", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i23) , fieldIndex = 23, fieldName = "i23", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i24)      , fieldIndex = 24, fieldName = "i24", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i25)     , fieldIndex = 25, fieldName = "i25", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i26)    , fieldIndex = 26, fieldName = "i26", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i27)   , fieldIndex = 27, fieldName = "i27", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i28)  , fieldIndex = 28, fieldName = "i28", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i29) , fieldIndex = 29, fieldName = "i29", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i30)      , fieldIndex = 30, fieldName = "i30", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i31)     , fieldIndex = 31, fieldName = "i31", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i32)    , fieldIndex = 32, fieldName = "i32", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i33)   , fieldIndex = 33, fieldName = "i33", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i34)  , fieldIndex = 34, fieldName = "i34", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i35) , fieldIndex = 35, fieldName = "i35", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i36)      , fieldIndex = 36, fieldName = "i36", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i37)     , fieldIndex = 37, fieldName = "i37", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i38)    , fieldIndex = 38, fieldName = "i38", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i39)   , fieldIndex = 39, fieldName = "i39", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i40)  , fieldIndex = 40, fieldName = "i40", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i41) , fieldIndex = 41, fieldName = "i41", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i42)      , fieldIndex = 42, fieldName = "i42", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i43)     , fieldIndex = 43, fieldName = "i43", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i44)    , fieldIndex = 44, fieldName = "i44", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i45)   , fieldIndex = 45, fieldName = "i45", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i46)  , fieldIndex = 46, fieldName = "i46", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i47) , fieldIndex = 47, fieldName = "i47", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i48)      , fieldIndex = 48, fieldName = "i48", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i49)     , fieldIndex = 49, fieldName = "i49", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i50)    , fieldIndex = 50, fieldName = "i50", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i51)   , fieldIndex = 51, fieldName = "i51", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i52)  , fieldIndex = 52, fieldName = "i52", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i53) , fieldIndex = 53, fieldName = "i53", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i54)      , fieldIndex = 54, fieldName = "i54", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i55)     , fieldIndex = 55, fieldName = "i55", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i56)    , fieldIndex = 56, fieldName = "i56", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i57)   , fieldIndex = 57, fieldName = "i57", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i58)  , fieldIndex = 58, fieldName = "i58", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i59) , fieldIndex = 59, fieldName = "i59", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i60)      , fieldIndex = 60, fieldName = "i60", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i61)     , fieldIndex = 61, fieldName = "i61", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i62)    , fieldIndex = 62, fieldName = "i62", typeName =    "Int"    )    ,   FieldModel(value =     IntProperty(self.i63)   , fieldIndex = 63, fieldName = "i63", typeName =     "Int"   )    ,   FieldModel(value =      LongProperty(self.i64)  , fieldIndex = 64, fieldName = "i64", typeName =      "Long"  )    ,   FieldModel(value =       LongProperty(self.i65) , fieldIndex = 65, fieldName = "i65", typeName =       "Long" )    ,   FieldModel(value =  StringProperty(self.i66)      , fieldIndex = 66, fieldName = "i66", typeName =  "String"      )    ,   FieldModel(value =   LongProperty(self.i67)     , fieldIndex = 67, fieldName = "i67", typeName =   "Long"     )    ,   FieldModel(value =    IntProperty(self.i68)    , fieldIndex = 68, fieldName = "i68", typeName =    "Int"    )  )
        def reverseFieldInfo: List[FieldModel] =
            List(  FieldModel(value =    IntProperty(self.i68)    , fieldIndex = 68, fieldName = "i68", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i67)     , fieldIndex = 67, fieldName = "i67", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i66)      , fieldIndex = 66, fieldName = "i66", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i65) , fieldIndex = 65, fieldName = "i65", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i64)  , fieldIndex = 64, fieldName = "i64", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i63)   , fieldIndex = 63, fieldName = "i63", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i62)    , fieldIndex = 62, fieldName = "i62", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i61)     , fieldIndex = 61, fieldName = "i61", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i60)      , fieldIndex = 60, fieldName = "i60", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i59) , fieldIndex = 59, fieldName = "i59", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i58)  , fieldIndex = 58, fieldName = "i58", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i57)   , fieldIndex = 57, fieldName = "i57", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i56)    , fieldIndex = 56, fieldName = "i56", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i55)     , fieldIndex = 55, fieldName = "i55", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i54)      , fieldIndex = 54, fieldName = "i54", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i53) , fieldIndex = 53, fieldName = "i53", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i52)  , fieldIndex = 52, fieldName = "i52", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i51)   , fieldIndex = 51, fieldName = "i51", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i50)    , fieldIndex = 50, fieldName = "i50", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i49)     , fieldIndex = 49, fieldName = "i49", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i48)      , fieldIndex = 48, fieldName = "i48", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i47) , fieldIndex = 47, fieldName = "i47", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i46)  , fieldIndex = 46, fieldName = "i46", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i45)   , fieldIndex = 45, fieldName = "i45", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i44)    , fieldIndex = 44, fieldName = "i44", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i43)     , fieldIndex = 43, fieldName = "i43", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i42)      , fieldIndex = 42, fieldName = "i42", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i41) , fieldIndex = 41, fieldName = "i41", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i40)  , fieldIndex = 40, fieldName = "i40", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i39)   , fieldIndex = 39, fieldName = "i39", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i38)    , fieldIndex = 38, fieldName = "i38", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i37)     , fieldIndex = 37, fieldName = "i37", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i36)      , fieldIndex = 36, fieldName = "i36", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i35) , fieldIndex = 35, fieldName = "i35", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i34)  , fieldIndex = 34, fieldName = "i34", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i33)   , fieldIndex = 33, fieldName = "i33", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i32)    , fieldIndex = 32, fieldName = "i32", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i31)     , fieldIndex = 31, fieldName = "i31", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i30)      , fieldIndex = 30, fieldName = "i30", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i29) , fieldIndex = 29, fieldName = "i29", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i28)  , fieldIndex = 28, fieldName = "i28", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i27)   , fieldIndex = 27, fieldName = "i27", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i26)    , fieldIndex = 26, fieldName = "i26", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i25)     , fieldIndex = 25, fieldName = "i25", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i24)      , fieldIndex = 24, fieldName = "i24", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i23) , fieldIndex = 23, fieldName = "i23", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i22)  , fieldIndex = 22, fieldName = "i22", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i21)   , fieldIndex = 21, fieldName = "i21", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i20)    , fieldIndex = 20, fieldName = "i20", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i19)     , fieldIndex = 19, fieldName = "i19", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i18)      , fieldIndex = 18, fieldName = "i18", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i17) , fieldIndex = 17, fieldName = "i17", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i16)  , fieldIndex = 16, fieldName = "i16", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i15)   , fieldIndex = 15, fieldName = "i15", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i14)    , fieldIndex = 14, fieldName = "i14", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i13)     , fieldIndex = 13, fieldName = "i13", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i12)      , fieldIndex = 12, fieldName = "i12", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i11) , fieldIndex = 11, fieldName = "i11", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i10)  , fieldIndex = 10, fieldName = "i10", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i9)   , fieldIndex = 9, fieldName = "i9", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i8)    , fieldIndex = 8, fieldName = "i8", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i7)     , fieldIndex = 7, fieldName = "i7", typeName =   "Long"     )   ,    FieldModel(value =  StringProperty(self.i6)      , fieldIndex = 6, fieldName = "i6", typeName =  "String"      )   ,    FieldModel(value =       LongProperty(self.i5) , fieldIndex = 5, fieldName = "i5", typeName =       "Long" )   ,    FieldModel(value =      LongProperty(self.i4)  , fieldIndex = 4, fieldName = "i4", typeName =      "Long"  )   ,    FieldModel(value =     IntProperty(self.i3)   , fieldIndex = 3, fieldName = "i3", typeName =     "Int"   )   ,    FieldModel(value =    IntProperty(self.i2)    , fieldIndex = 2, fieldName = "i2", typeName =    "Int"    )   ,    FieldModel(value =   LongProperty(self.i1)     , fieldIndex = 1, fieldName = "i1", typeName =   "Long"     )   )
    }
    val fooValue68 = Foo68(      i1 = 225523422542L             ,  i2 = 88             ,  i3 = 82             ,  i4 = 24564564L                 ,  i6 = "i1"             ,  i7 = 225523422542L             ,  i8 = 88             ,  i9 = 82             ,  i10 = 24564564L                 ,  i12 = "i1"             ,  i13 = 225523422542L             ,  i14 = 88             ,  i15 = 82             ,  i16 = 24564564L                 ,  i18 = "i1"             ,  i19 = 225523422542L             ,  i20 = 88             ,  i21 = 82             ,  i22 = 24564564L                 ,  i24 = "i1"             ,  i25 = 225523422542L             ,  i26 = 88             ,  i27 = 82             ,  i28 = 24564564L                 ,  i30 = "i1"             ,  i31 = 225523422542L             ,  i32 = 88             ,  i33 = 82             ,  i34 = 24564564L                 ,  i36 = "i1"             ,  i37 = 225523422542L             ,  i38 = 88             ,  i39 = 82             ,  i40 = 24564564L                 ,  i42 = "i1"             ,  i43 = 225523422542L             ,  i44 = 88             ,  i45 = 82             ,  i46 = 24564564L                 ,  i48 = "i1"             ,  i49 = 225523422542L             ,  i50 = 88             ,  i51 = 82             ,  i52 = 24564564L                 ,  i54 = "i1"             ,  i55 = 225523422542L             ,  i56 = 88             ,  i57 = 82             ,  i58 = 24564564L                 ,  i60 = "i1"             ,  i61 = 225523422542L             ,  i62 = 88             ,  i63 = 82             ,  i64 = 24564564L                 ,  i66 = "i1"             ,  i67 = 225523422542L             ,  i68 = 88     )
    val fooEncoder68: ModelToString[Foo68] = ModelToString.encoder
    val reverseFooEncoder68: ModelToString[Foo68] = ModelToString.reverseEncoder
    val fooDecoder68: ModelFromString[Foo68] = ModelFromString.decoder
    val reverseFooDecoder68: ModelFromString[Foo68] = ModelFromString.reverseDecoder
    override def spec = suite("A case class by 68 length")(
        zio.test.test("should generic to a encoder") {
            val str1 = fooEncoder68.mToString(fooValue68)
            assert(str1)(equalTo(fooValue68.fieldInfo))
        },
        zio.test.test("should generic to a reverse encoder") {
            val str2 = reverseFooEncoder68.mToString(fooValue68)
            assert(str2)(equalTo(fooValue68.reverseFieldInfo))
        },
        zio.test.test("should generic to it's default value") {
            val str2 = fooEncoder68.defaultValues
            assert(str2)(equalTo(fooValue68.defaultValues))
        },
        zio.test.test("should generic to it's name list") {
            val name1 = fooEncoder68.labelledNames
            assert(name1)(equalTo(fooValue68.fieldNames))
        },
        zio.test.test("should generic to it's reverse name list") {
            val name1 = reverseFooEncoder68.labelledNames
            assert(name1)(equalTo(fooValue68.fieldNames.reverse))
        },
        zio.test.test("should generic to a decoder") {
            val (_, model1) = fooDecoder68.getData(fooValue68.fieldInfo)
            assert(model1)(equalTo(fooValue68))
        },
        zio.test.test("should generic to a reverse decoder") {
            val (_, model2) = reverseFooDecoder68.getData(fooValue68.reverseFieldInfo)
            assert(model2)(equalTo(fooValue68))
        }
    )
}
