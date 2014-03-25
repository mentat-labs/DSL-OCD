package com.dslplatform.ocd.generators
package javas

import Types._
import Boxes._

object JavaInteger
    extends JavaStub {

  override val classPrimitive = Some("int")
  val classReference = "Integer"

  val defaultSingle: TestValue = "0"

  val nonDefaultValues: Seq[TestValue] = Seq(
    "Integer.MIN_VALUE"
  , "Integer.MAX_VALUE"
  , "-1000000000"
  , "1000000000"
  )
}
