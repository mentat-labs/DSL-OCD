package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneTexts_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneTexts: Option[IndexedSeq[String]],
    private var _calculatedNullableListOfOneTexts: Option[IndexedSeq[String]],
    private var _persistedNullableListOfOneTexts: Option[IndexedSeq[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneTexts_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneTexts_3("+ URI +")"

   def copy(nullableListOfOneTexts: Option[IndexedSeq[String]] = this._nullableListOfOneTexts): NullableListOfOneTexts_3 = {

  require(nullableListOfOneTexts ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
  if(nullableListOfOneTexts.isDefined) require(nullableListOfOneTexts.get ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTexts)
    new NullableListOfOneTexts_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneTexts = nullableListOfOneTexts, _calculatedNullableListOfOneTexts = _calculatedNullableListOfOneTexts, _persistedNullableListOfOneTexts = _persistedNullableListOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneTexts_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneTexts = result._nullableListOfOneTexts
    this._calculatedNullableListOfOneTexts = result._calculatedNullableListOfOneTexts
    this._persistedNullableListOfOneTexts = result._persistedNullableListOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneTexts_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTexts")
  def nullableListOfOneTexts = {
    _nullableListOfOneTexts
  }

  def nullableListOfOneTexts_= (value: Option[IndexedSeq[String]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTexts")
  def calculatedNullableListOfOneTexts = {
    _calculatedNullableListOfOneTexts
  }

  def calculatedNullableListOfOneTexts_= (value: Option[IndexedSeq[String]]) {
    _calculatedNullableListOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTexts")
  def persistedNullableListOfOneTexts = {
    _persistedNullableListOfOneTexts
  }

  def persistedNullableListOfOneTexts_= (value: Option[IndexedSeq[String]]) {
    _persistedNullableListOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneTexts") nullableListOfOneTexts: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneTexts") calculatedNullableListOfOneTexts: Option[IndexedSeq[String]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneTexts") persistedNullableListOfOneTexts: Option[IndexedSeq[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneTexts = nullableListOfOneTexts, _calculatedNullableListOfOneTexts = calculatedNullableListOfOneTexts, _persistedNullableListOfOneTexts = persistedNullableListOfOneTexts)

}

object NullableListOfOneTexts_3 extends AggregateRootCompanion[NullableListOfOneTexts_3]{

  def apply(
    nullableListOfOneTexts: Option[IndexedSeq[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneTexts)
    require(nullableListOfOneTexts ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    if (nullableListOfOneTexts.isDefined) require(nullableListOfOneTexts.get ne null, "Null value was provided for property \"nullableListOfOneTexts\"")
    new NullableListOfOneTexts_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneTexts = nullableListOfOneTexts
    , _calculatedNullableListOfOneTexts = None
    , _persistedNullableListOfOneTexts = None)
  }

}
