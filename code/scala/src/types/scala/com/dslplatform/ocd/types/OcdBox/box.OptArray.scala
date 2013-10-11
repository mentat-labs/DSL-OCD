package com.dslplatform.ocd
package types

import box._

trait `box.OptArray`
    extends BoxNullableType
    with BoxArrayType
    with BoxElementsNonNullableType {

  def boxDesc = "Array"
}
