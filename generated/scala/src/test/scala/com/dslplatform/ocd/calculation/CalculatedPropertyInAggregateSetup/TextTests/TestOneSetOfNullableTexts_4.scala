package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package TextTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestOneSetOfNullableTexts_4
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[OneSetOfNullableTexts_4]
          .member("oneSetOfNullableTexts": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Set[Option[String]]]
      , typeOf[OneSetOfNullableTexts_4]
          .member("oneSetOfNullableTexts": TermName)
          .asMethod.returnType
      )
}
