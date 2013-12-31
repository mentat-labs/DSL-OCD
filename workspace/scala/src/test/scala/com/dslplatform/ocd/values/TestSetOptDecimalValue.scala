package com.dslplatform.ocd.values

import SetOptDecimalInValue.SetOptDecimalValue
import com.dslplatform.api.patterns.ServiceLocator
import org.scalatest._
import scala.reflect.runtime.universe._

class TestSetOptDecimalValue extends SpecExtensions {
  def `Test property field type: Set[Option[BigDecimal]]`() =
    checkType(
      typeOf[Set[Option[BigDecimal]]]
    , typeOf[SetOptDecimalValue].member("setOptDecimal": TermName).asMethod.returnType
    )

  def `Test property default value: Set.empty[Option[BigDecimal]]`() {
    assert(SetOptDecimalValue().setOptDecimal === Set.empty[Option[BigDecimal]])
  }
}
