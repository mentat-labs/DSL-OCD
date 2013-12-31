package com.dslplatform.ocd.aggregates.SetDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class SetDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _setDecimal: Set[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[SetDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: SetDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "SetDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.SetDecimalInAggregate.SetDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._setDecimal = result._setDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.SetDecimalInAggregate.SetDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonGetter("setDecimal")
  def setDecimal = {
    _setDecimal
  }

  def setDecimal_= (value: Set[BigDecimal]) {
    _setDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("setDecimal") setDecimal: Set[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _setDecimal = if (setDecimal == null) Set.empty else setDecimal)

}

object SetDecimalAggregate extends AggregateRootCompanion[SetDecimalAggregate]{

  def apply(
    setDecimal: Set[BigDecimal] = Set.empty
  ) = {
    new SetDecimalAggregate(
      _locator = None
    , _URI = null
    , _setDecimal = setDecimal)
  }

}
