package com.dslplatform.ocd.values.SinglePropertyInValue

case class NullableSetOfNullableDoublesValue1 @com.fasterxml.jackson.annotation.JsonIgnore() (
     nullableSetOfNullableDoubles: Option[Set[Option[Double]]] = None
  ) {

    require(nullableSetOfNullableDoubles ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    if (nullableSetOfNullableDoubles.isDefined) require(nullableSetOfNullableDoubles.get ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableDoubles)

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: com.dslplatform.api.patterns.ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDoubles") nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) =
    this( nullableSetOfNullableDoubles = nullableSetOfNullableDoubles)

}
