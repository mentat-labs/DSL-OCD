package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDoublesValue5

class TestNullableArrayOfOneDoublesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneDoublesValue5].member("nullableArrayOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double[]?]
      , typeOf[NullableArrayOfOneDoublesValue5].member("nullableArrayOfOneDoubles": TermName).asMethod.returnType
      )
}
