package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableLocationsValue1

class TestNullableSetOfNullableLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableLocationsValue1].member("nullableSetOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location?>?]
      , typeOf[NullableSetOfNullableLocationsValue1].member("nullableSetOfNullableLocations": TermName).asMethod.returnType
      )
}
