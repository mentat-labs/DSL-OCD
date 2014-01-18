package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableBinaries_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableBinaries_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableBinaries_2("+ URI +")"

   def copy(oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = this._oneArrayOfNullableBinaries): OneArrayOfNullableBinaries_2 = {

  require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)
    new OneArrayOfNullableBinaries_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableBinaries = oneArrayOfNullableBinaries)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableBinaries_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableBinaries = result._oneArrayOfNullableBinaries
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableBinaries_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableBinaries = {
    _oneArrayOfNullableBinaries
  }

  def oneArrayOfNullableBinaries_= (value: Array[Option[Array[Byte]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableBinaries") oneArrayOfNullableBinaries: Array[Option[Array[Byte]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableBinaries = if (oneArrayOfNullableBinaries == null) Array.empty else oneArrayOfNullableBinaries)

}

object OneArrayOfNullableBinaries_2 extends AggregateRootCompanion[OneArrayOfNullableBinaries_2]{

  def apply(
    oneArrayOfNullableBinaries: Array[Option[Array[Byte]]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableBinaries)
    require(oneArrayOfNullableBinaries ne null, "Null value was provided for property \"oneArrayOfNullableBinaries\"")
    new OneArrayOfNullableBinaries_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableBinaries = oneArrayOfNullableBinaries)
  }

}
