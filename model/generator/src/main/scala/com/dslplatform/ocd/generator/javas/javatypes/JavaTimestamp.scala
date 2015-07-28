package com.dslplatform.ocd
package generator
package javas
package javatypes

import types._
import boxes._

object JavaTimestamp
    extends JavaStub {

  val classReference = "org.joda.time.DateTime"

  val defaultSingle: TestValue = "org.joda.time.DateTime.now()" ~ Unstable

  val nonDefaultValues: Seq[TestValue] = Seq(
    "new org.joda.time.DateTime(0)"                                             // Epoch 1970
  , "new org.joda.time.DateTime(1, 1, 1, 0, 0, org.joda.time.DateTimeZone.UTC)" // 0001-01-01T00:00:00Z default value for DateTime deserialization on .NET
  , "new org.joda.time.DateTime(Integer.MAX_VALUE * 1001L)"                     // beyond UNIX epoch (>2038)
  )
}
