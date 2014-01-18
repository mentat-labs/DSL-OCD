package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableIps_4 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]],
    private var _calculatedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]],
    private var _persistedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableIps_4 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableIps_4("+ URI +")"

   def copy(oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]] = this._oneListOfNullableIps): OneListOfNullableIps_4 = {

  require(oneListOfNullableIps ne null, "Null value was provided for property \"oneListOfNullableIps\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableIps)
    new OneListOfNullableIps_4(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfNullableIps = oneListOfNullableIps, _calculatedOneListOfNullableIps = _calculatedOneListOfNullableIps, _persistedOneListOfNullableIps = _persistedOneListOfNullableIps)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableIps_4): this.type = {
    this._URI = result._URI
    this._oneListOfNullableIps = result._oneListOfNullableIps
    this._calculatedOneListOfNullableIps = result._calculatedOneListOfNullableIps
    this._persistedOneListOfNullableIps = result._persistedOneListOfNullableIps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableIps_4](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableIps = {
    _oneListOfNullableIps
  }

  def oneListOfNullableIps_= (value: IndexedSeq[Option[java.net.InetAddress]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableIps")
  def calculatedOneListOfNullableIps = {
    _calculatedOneListOfNullableIps
  }

  def calculatedOneListOfNullableIps_= (value: IndexedSeq[Option[java.net.InetAddress]]) {
    _calculatedOneListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableIps")
  def persistedOneListOfNullableIps = {
    _persistedOneListOfNullableIps
  }

  def persistedOneListOfNullableIps_= (value: IndexedSeq[Option[java.net.InetAddress]]) {
    _persistedOneListOfNullableIps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableIps") oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedOneListOfNullableIps") calculatedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedOneListOfNullableIps") persistedOneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfNullableIps = if (oneListOfNullableIps == null) IndexedSeq.empty else oneListOfNullableIps, _calculatedOneListOfNullableIps = calculatedOneListOfNullableIps, _persistedOneListOfNullableIps = persistedOneListOfNullableIps)

}

object OneListOfNullableIps_4 extends AggregateRootCompanion[OneListOfNullableIps_4]{

  def apply(
    oneListOfNullableIps: IndexedSeq[Option[java.net.InetAddress]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableIps)
    require(oneListOfNullableIps ne null, "Null value was provided for property \"oneListOfNullableIps\"")
    new OneListOfNullableIps_4(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfNullableIps = oneListOfNullableIps
    , _calculatedOneListOfNullableIps = IndexedSeq.empty
    , _persistedOneListOfNullableIps = IndexedSeq.empty)
  }

}
