package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableTimestamps_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]],
    private var _calculatedNullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]],
    private var _persistedNullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableTimestamps_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableTimestamps_3("+ URI +")"

   def copy(nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]] = this._nullableSetOfNullableTimestamps): NullableSetOfNullableTimestamps_3 = {

  require(nullableSetOfNullableTimestamps ne null, "Null value was provided for property \"nullableSetOfNullableTimestamps\"")
  if(nullableSetOfNullableTimestamps.isDefined) require(nullableSetOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableSetOfNullableTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableTimestamps)
    new NullableSetOfNullableTimestamps_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableTimestamps = nullableSetOfNullableTimestamps, _calculatedNullableSetOfNullableTimestamps = _calculatedNullableSetOfNullableTimestamps, _persistedNullableSetOfNullableTimestamps = _persistedNullableSetOfNullableTimestamps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableTimestamps_3): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableTimestamps = result._nullableSetOfNullableTimestamps
    this._calculatedNullableSetOfNullableTimestamps = result._calculatedNullableSetOfNullableTimestamps
    this._persistedNullableSetOfNullableTimestamps = result._persistedNullableSetOfNullableTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableSetOfNullableTimestamps_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableTimestamps")
  def nullableSetOfNullableTimestamps = {
    _nullableSetOfNullableTimestamps
  }

  def nullableSetOfNullableTimestamps_= (value: Option[Set[Option[org.joda.time.DateTime]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableTimestamps")
  def calculatedNullableSetOfNullableTimestamps = {
    _calculatedNullableSetOfNullableTimestamps
  }

  def calculatedNullableSetOfNullableTimestamps_= (value: Option[Set[Option[org.joda.time.DateTime]]]) {
    _calculatedNullableSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableTimestamps")
  def persistedNullableSetOfNullableTimestamps = {
    _persistedNullableSetOfNullableTimestamps
  }

  def persistedNullableSetOfNullableTimestamps_= (value: Option[Set[Option[org.joda.time.DateTime]]]) {
    _persistedNullableSetOfNullableTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableTimestamps") nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableSetOfNullableTimestamps") calculatedNullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableSetOfNullableTimestamps") persistedNullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableTimestamps = nullableSetOfNullableTimestamps, _calculatedNullableSetOfNullableTimestamps = calculatedNullableSetOfNullableTimestamps, _persistedNullableSetOfNullableTimestamps = persistedNullableSetOfNullableTimestamps)

}

object NullableSetOfNullableTimestamps_3 extends AggregateRootCompanion[NullableSetOfNullableTimestamps_3]{

  def apply(
    nullableSetOfNullableTimestamps: Option[Set[Option[org.joda.time.DateTime]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableTimestamps)
    require(nullableSetOfNullableTimestamps ne null, "Null value was provided for property \"nullableSetOfNullableTimestamps\"")
    if (nullableSetOfNullableTimestamps.isDefined) require(nullableSetOfNullableTimestamps.get ne null, "Null value was provided for property \"nullableSetOfNullableTimestamps\"")
    new NullableSetOfNullableTimestamps_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableTimestamps = nullableSetOfNullableTimestamps
    , _calculatedNullableSetOfNullableTimestamps = None
    , _persistedNullableSetOfNullableTimestamps = None)
  }

}
