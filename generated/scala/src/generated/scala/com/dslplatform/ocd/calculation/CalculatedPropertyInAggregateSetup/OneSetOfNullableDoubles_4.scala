package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableDoubles_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableDoubles: Set[Option[Double]],
    private var _calculatedOneSetOfNullableDoubles: Set[Option[Double]],
    private var _persistedOneSetOfNullableDoubles: Set[Option[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableDoubles_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableDoubles_4("+ URI +")"

   def copy(oneSetOfNullableDoubles: Set[Option[Double]] = this._oneSetOfNullableDoubles): OneSetOfNullableDoubles_4 = {

  require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)
    new OneSetOfNullableDoubles_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableDoubles = oneSetOfNullableDoubles, _calculatedOneSetOfNullableDoubles = _calculatedOneSetOfNullableDoubles, _persistedOneSetOfNullableDoubles = _persistedOneSetOfNullableDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDoubles_4): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableDoubles = result._oneSetOfNullableDoubles
    this._calculatedOneSetOfNullableDoubles = result._calculatedOneSetOfNullableDoubles
    this._persistedOneSetOfNullableDoubles = result._persistedOneSetOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfNullableDoubles_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableDoubles = {
    _oneSetOfNullableDoubles
  }

  def oneSetOfNullableDoubles_= (value: Set[Option[Double]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneSetOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDoubles")
  def calculatedOneSetOfNullableDoubles = {
    _calculatedOneSetOfNullableDoubles
  }

  def calculatedOneSetOfNullableDoubles_= (value: Set[Option[Double]]) {
    _calculatedOneSetOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDoubles")
  def persistedOneSetOfNullableDoubles = {
    _persistedOneSetOfNullableDoubles
  }

  def persistedOneSetOfNullableDoubles_= (value: Set[Option[Double]]) {
    _persistedOneSetOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableDoubles") oneSetOfNullableDoubles: Set[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneSetOfNullableDoubles") calculatedOneSetOfNullableDoubles: Set[Option[Double]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneSetOfNullableDoubles") persistedOneSetOfNullableDoubles: Set[Option[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableDoubles = if (oneSetOfNullableDoubles == null) Set.empty else oneSetOfNullableDoubles, _calculatedOneSetOfNullableDoubles = calculatedOneSetOfNullableDoubles, _persistedOneSetOfNullableDoubles = persistedOneSetOfNullableDoubles)

}

object OneSetOfNullableDoubles_4 extends AggregateRootCompanion[OneSetOfNullableDoubles_4]{

  def apply(
    oneSetOfNullableDoubles: Set[Option[Double]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneSetOfNullableDoubles)
    require(oneSetOfNullableDoubles ne null, "Null value was provided for property \"oneSetOfNullableDoubles\"")
    new OneSetOfNullableDoubles_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableDoubles = oneSetOfNullableDoubles
    , _calculatedOneSetOfNullableDoubles = Set.empty
    , _persistedOneSetOfNullableDoubles = Set.empty)
  }

}
