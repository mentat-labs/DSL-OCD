package com.dslplatform.ocd.aggregates.ListOptMapInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptMapAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptMap: IndexedSeq[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptMapInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptMapAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptMapAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptMapInAggregate.ListOptMapAggregate): this.type = {
    this.URI = result.URI;
    this._listOptMap = result._listOptMap;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptMapInAggregate.ListOptMapAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptMap")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptMap = {
    _listOptMap
  }

  def listOptMap_= (value: IndexedSeq[Option[Map[String, String]]]) {
    _listOptMap = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptMap") listOptMap: IndexedSeq[Option[Map[String, String]]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptMap = if (listOptMap == null) IndexedSeq.empty else listOptMap)

}

object ListOptMapAggregate extends AggregateRootCompanion[ListOptMapAggregate]{

  def apply(
    listOptMap: IndexedSeq[Option[Map[String, String]]] = IndexedSeq[Option[Map[String, String]]]()
  ) = {
    new ListOptMapAggregate(
      _locator = None
    , _URI = null
    , _listOptMap = listOptMap)
  }

}
