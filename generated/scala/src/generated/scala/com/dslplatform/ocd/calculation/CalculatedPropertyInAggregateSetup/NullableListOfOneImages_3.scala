package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneImages_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]],
    private var _calculatedNullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]],
    private var _persistedNullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneImages_3 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneImages_3("+ URI +")"

   def copy(nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]] = this._nullableListOfOneImages): NullableListOfOneImages_3 = {

  require(nullableListOfOneImages ne null, "Null value was provided for property \"nullableListOfOneImages\"")
  if(nullableListOfOneImages.isDefined) require(nullableListOfOneImages.get ne null, "Null value was provided for property \"nullableListOfOneImages\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneImages)
    new NullableListOfOneImages_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneImages = nullableListOfOneImages, _calculatedNullableListOfOneImages = _calculatedNullableListOfOneImages, _persistedNullableListOfOneImages = _persistedNullableListOfOneImages)
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

  private def updateWithAnother(result: com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneImages_3): this.type = {
    this._URI = result._URI
    this._nullableListOfOneImages = result._nullableListOfOneImages
    this._calculatedNullableListOfOneImages = result._calculatedNullableListOfOneImages
    this._persistedNullableListOfOneImages = result._persistedNullableListOfOneImages
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneImages_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneImages")
  def nullableListOfOneImages = {
    _nullableListOfOneImages
  }

  def nullableListOfOneImages_= (value: Option[IndexedSeq[java.awt.image.BufferedImage]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneImages")
  def calculatedNullableListOfOneImages = {
    _calculatedNullableListOfOneImages
  }

  def calculatedNullableListOfOneImages_= (value: Option[IndexedSeq[java.awt.image.BufferedImage]]) {
    _calculatedNullableListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneImages")
  def persistedNullableListOfOneImages = {
    _persistedNullableListOfOneImages
  }

  def persistedNullableListOfOneImages_= (value: Option[IndexedSeq[java.awt.image.BufferedImage]]) {
    _persistedNullableListOfOneImages = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneImages") nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("calculatedNullableListOfOneImages") calculatedNullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]]
  , @com.fasterxml.jackson.annotation.JsonProperty("persistedNullableListOfOneImages") persistedNullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneImages = nullableListOfOneImages, _calculatedNullableListOfOneImages = calculatedNullableListOfOneImages, _persistedNullableListOfOneImages = persistedNullableListOfOneImages)

}

object NullableListOfOneImages_3 extends AggregateRootCompanion[NullableListOfOneImages_3]{

  def apply(
    nullableListOfOneImages: Option[IndexedSeq[java.awt.image.BufferedImage]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneImages)
    require(nullableListOfOneImages ne null, "Null value was provided for property \"nullableListOfOneImages\"")
    if (nullableListOfOneImages.isDefined) require(nullableListOfOneImages.get ne null, "Null value was provided for property \"nullableListOfOneImages\"")
    new NullableListOfOneImages_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneImages = nullableListOfOneImages
    , _calculatedNullableListOfOneImages = None
    , _persistedNullableListOfOneImages = None)
  }

}
