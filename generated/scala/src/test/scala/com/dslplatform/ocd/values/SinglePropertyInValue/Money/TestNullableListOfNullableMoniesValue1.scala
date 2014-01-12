package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableMoniesValue1

class TestNullableListOfNullableMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableMoniesValue1].member("nullableListOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Money?>?]
      , typeOf[NullableListOfNullableMoniesValue1].member("nullableListOfNullableMonies": TermName).asMethod.returnType
      )
}
