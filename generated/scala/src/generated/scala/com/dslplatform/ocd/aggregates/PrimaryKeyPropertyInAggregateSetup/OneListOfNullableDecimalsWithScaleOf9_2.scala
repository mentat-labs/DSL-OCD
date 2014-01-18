package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableDecimalsWithScaleOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableDecimalsWithScaleOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableDecimalsWithScaleOf9_2("+ URI +")"

   def copy(oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = this._oneListOfNullableDecimalsWithScaleOf9): OneListOfNullableDecimalsWithScaleOf9_2 = {

  require(oneListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneListOfNullableDecimalsWithScaleOf9\"")
  com.dslplatform.api.Guards.checkCollectionOptionScale(oneListOfNullableDecimalsWithScaleOf9, 9)
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimalsWithScaleOf9)
    new OneListOfNullableDecimalsWithScaleOf9_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableDecimalsWithScaleOf9 = oneListOfNullableDecimalsWithScaleOf9)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableDecimalsWithScaleOf9 = result._oneListOfNullableDecimalsWithScaleOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableDecimalsWithScaleOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimalsWithScaleOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableDecimalsWithScaleOf9 = {
    _oneListOfNullableDecimalsWithScaleOf9
  }

  def oneListOfNullableDecimalsWithScaleOf9_= (value: IndexedSeq[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionScale(value, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneListOfNullableDecimalsWithScaleOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableDecimalsWithScaleOf9") oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableDecimalsWithScaleOf9 = if (oneListOfNullableDecimalsWithScaleOf9 == null) IndexedSeq.empty else oneListOfNullableDecimalsWithScaleOf9)

}

object OneListOfNullableDecimalsWithScaleOf9_2 extends AggregateRootCompanion[OneListOfNullableDecimalsWithScaleOf9_2]{

  def apply(
    oneListOfNullableDecimalsWithScaleOf9: IndexedSeq[Option[BigDecimal]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionScale(oneListOfNullableDecimalsWithScaleOf9, 9)
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneListOfNullableDecimalsWithScaleOf9)
    require(oneListOfNullableDecimalsWithScaleOf9 ne null, "Null value was provided for property \"oneListOfNullableDecimalsWithScaleOf9\"")
    new OneListOfNullableDecimalsWithScaleOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableDecimalsWithScaleOf9 = oneListOfNullableDecimalsWithScaleOf9)
  }

}
