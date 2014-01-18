package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableMaps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneArrayOfNullableMaps: Array[Option[Map[String, String]]],
    private var _calculatedOneArrayOfNullableMaps: Array[Option[Map[String, String]]],
    private var _persistedOneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableMaps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableMaps_4("+ URI +")"

   def copy(oneArrayOfNullableMaps: Array[Option[Map[String, String]]] = this._oneArrayOfNullableMaps): OneArrayOfNullableMaps_4 = {

  require(oneArrayOfNullableMaps ne null, "Null value was provided for property \"oneArrayOfNullableMaps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMaps)
    new OneArrayOfNullableMaps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneArrayOfNullableMaps = oneArrayOfNullableMaps, _calculatedOneArrayOfNullableMaps = _calculatedOneArrayOfNullableMaps, _persistedOneArrayOfNullableMaps = _persistedOneArrayOfNullableMaps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableMaps_4): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableMaps = result._oneArrayOfNullableMaps
    this._calculatedOneArrayOfNullableMaps = result._calculatedOneArrayOfNullableMaps
    this._persistedOneArrayOfNullableMaps = result._persistedOneArrayOfNullableMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableMaps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMaps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableMaps = {
    _oneArrayOfNullableMaps
  }

  def oneArrayOfNullableMaps_= (value: Array[Option[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableMaps")
  def calculatedOneArrayOfNullableMaps = {
    _calculatedOneArrayOfNullableMaps
  }

  def calculatedOneArrayOfNullableMaps_= (value: Array[Option[Map[String, String]]]) {
    _calculatedOneArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableMaps")
  def persistedOneArrayOfNullableMaps = {
    _persistedOneArrayOfNullableMaps
  }

  def persistedOneArrayOfNullableMaps_= (value: Array[Option[Map[String, String]]]) {
    _persistedOneArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMaps") oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneArrayOfNullableMaps") calculatedOneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneArrayOfNullableMaps") persistedOneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneArrayOfNullableMaps = if (oneArrayOfNullableMaps == null) Array.empty else oneArrayOfNullableMaps, _calculatedOneArrayOfNullableMaps = calculatedOneArrayOfNullableMaps, _persistedOneArrayOfNullableMaps = persistedOneArrayOfNullableMaps)

}

object OneArrayOfNullableMaps_4 extends AggregateRootCompanion[OneArrayOfNullableMaps_4]{

  def apply(
    oneArrayOfNullableMaps: Array[Option[Map[String, String]]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMaps)
    require(oneArrayOfNullableMaps ne null, "Null value was provided for property \"oneArrayOfNullableMaps\"")
    new OneArrayOfNullableMaps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneArrayOfNullableMaps = oneArrayOfNullableMaps
    , _calculatedOneArrayOfNullableMaps = Array.empty
    , _persistedOneArrayOfNullableMaps = Array.empty)
  }

}
