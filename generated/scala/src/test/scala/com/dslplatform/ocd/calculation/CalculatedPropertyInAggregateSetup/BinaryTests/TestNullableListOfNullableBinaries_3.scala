package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup
package BinaryTests

import org.scalatest._
import com.dslplatform.ocd.test._

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import scala.reflect.runtime.universe._

@RunWith(classOf[JUnitRunner])
class TestNullableListOfNullableBinaries_3
    extends OcdSpec {

    /* Testing the property field public visibility via reflection (no instantiation) */
    def `Test property field visibility`() =
      lock(
        typeOf[NullableListOfNullableBinaries_3]
          .member("nullableListOfNullableBinaries": TermName)
          .asMethod.isPublic
      ) === true

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[Option[IndexedSeq[Option[Array[Byte]]]]]
      , typeOf[NullableListOfNullableBinaries_3]
          .member("nullableListOfNullableBinaries": TermName)
          .asMethod.returnType
      )
}
