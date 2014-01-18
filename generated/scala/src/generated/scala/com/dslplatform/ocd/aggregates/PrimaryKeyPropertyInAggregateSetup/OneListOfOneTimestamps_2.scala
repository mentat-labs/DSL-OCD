package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneTimestamps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneTimestamps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneTimestamps_2("+ URI +")"

   def copy(oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime] = this._oneListOfOneTimestamps): OneListOfOneTimestamps_2 = {

  require(oneListOfOneTimestamps ne null, "Null value was provided for property \"oneListOfOneTimestamps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTimestamps)
    new OneListOfOneTimestamps_2(_URI = this.URI, __locator = this.__locator, _oneListOfOneTimestamps = oneListOfOneTimestamps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTimestamps_2): this.type = {
    this._URI = result._URI
    this._oneListOfOneTimestamps = result._oneListOfOneTimestamps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfOneTimestamps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTimestamps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneTimestamps = {
    _oneListOfOneTimestamps
  }

  def oneListOfOneTimestamps_= (value: IndexedSeq[org.joda.time.DateTime]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneTimestamps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTimestamps") oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfOneTimestamps = if (oneListOfOneTimestamps == null) IndexedSeq.empty else oneListOfOneTimestamps)

}

object OneListOfOneTimestamps_2 extends AggregateRootCompanion[OneListOfOneTimestamps_2]{

  def apply(
    oneListOfOneTimestamps: IndexedSeq[org.joda.time.DateTime] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTimestamps)
    require(oneListOfOneTimestamps ne null, "Null value was provided for property \"oneListOfOneTimestamps\"")
    new OneListOfOneTimestamps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfOneTimestamps = oneListOfOneTimestamps)
  }

}
