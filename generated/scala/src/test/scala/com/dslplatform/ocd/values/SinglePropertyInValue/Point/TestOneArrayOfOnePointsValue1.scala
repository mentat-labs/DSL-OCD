package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOnePointsValue1

class TestOneArrayOfOnePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOnePointsValue1].member("oneArrayOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point[]]
      , typeOf[OneArrayOfOnePointsValue1].member("oneArrayOfOnePoints": TermName).asMethod.returnType
      )
}
