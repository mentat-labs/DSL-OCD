package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableUrlValue4

class TestNullableUrlValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableUrlValue4].member("nullableUrl": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url?]
      , typeOf[NullableUrlValue4].member("nullableUrl": TermName).asMethod.returnType
      )
}
