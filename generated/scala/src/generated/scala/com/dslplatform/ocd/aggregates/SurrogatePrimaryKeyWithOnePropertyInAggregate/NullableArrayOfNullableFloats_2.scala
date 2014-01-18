package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfNullableFloats_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfNullableFloats: Option[Array[Option[Float]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfNullableFloats_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfNullableFloats_2("+ URI +")"

   def copy(nullableArrayOfNullableFloats: Option[Array[Option[Float]]] = this._nullableArrayOfNullableFloats): NullableArrayOfNullableFloats_2 = {

  require(nullableArrayOfNullableFloats ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
  if(nullableArrayOfNullableFloats.isDefined) require(nullableArrayOfNullableFloats.get ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
  com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableFloats)
    new NullableArrayOfNullableFloats_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfNullableFloats = nullableArrayOfNullableFloats)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableFloats_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfNullableFloats = result._nullableArrayOfNullableFloats
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfNullableFloats_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableFloats")
  def nullableArrayOfNullableFloats = {
    _nullableArrayOfNullableFloats
  }

  def nullableArrayOfNullableFloats_= (value: Option[Array[Option[Float]]]) {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(value)
    _nullableArrayOfNullableFloats = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfNullableFloats") nullableArrayOfNullableFloats: Option[Array[Option[Float]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfNullableFloats = nullableArrayOfNullableFloats)

}

object NullableArrayOfNullableFloats_2 extends AggregateRootCompanion[NullableArrayOfNullableFloats_2]{

  def apply(
    nullableArrayOfNullableFloats: Option[Array[Option[Float]]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionValNulls(nullableArrayOfNullableFloats)
    require(nullableArrayOfNullableFloats ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
    if (nullableArrayOfNullableFloats.isDefined) require(nullableArrayOfNullableFloats.get ne null, "Null value was provided for property \"nullableArrayOfNullableFloats\"")
    new NullableArrayOfNullableFloats_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfNullableFloats = nullableArrayOfNullableFloats)
  }

}
