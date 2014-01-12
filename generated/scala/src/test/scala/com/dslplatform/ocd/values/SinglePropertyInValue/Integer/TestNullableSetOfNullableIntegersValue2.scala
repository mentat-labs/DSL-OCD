package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIntegersValue2

class TestNullableSetOfNullableIntegersValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableIntegersValue2].member("nullableSetOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer?>?]
      , typeOf[NullableSetOfNullableIntegersValue2].member("nullableSetOfNullableIntegers": TermName).asMethod.returnType
      )
}
