package com.dslplatform.ocd.values

import SetLongInValue.SetLongValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetLongValue extends SpecExtensions {
  def `Check single property type via reflection: Set[Long]`() =
    checkType(
      typeOf[Set[Long]]
    , typeOf[SetLongValue].member("setLong": TermName).asMethod.returnType
    )
}
