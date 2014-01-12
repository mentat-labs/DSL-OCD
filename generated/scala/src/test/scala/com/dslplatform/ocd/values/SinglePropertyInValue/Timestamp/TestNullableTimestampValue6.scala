package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableTimestampValue6

class TestNullableTimestampValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableTimestampValue6].member("nullableTimestamp": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?]
      , typeOf[NullableTimestampValue6].member("nullableTimestamp": TermName).asMethod.returnType
      )
}
