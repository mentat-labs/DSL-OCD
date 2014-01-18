package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableXmls_3 implements java.io.Serializable,
        AggregateRoot {
    public OneListOfNullableXmls_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.calculatedOneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
        this.persistedOneListOfNullableXmls = new java.util.ArrayList<org.w3c.dom.Element>();
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final OneListOfNullableXmls_3 other = (OneListOfNullableXmls_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneListOfNullableXmls_3(" + URI + ')'
                : "new OneListOfNullableXmls_3(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableXmls_3(
            final java.util.List<org.w3c.dom.Element> oneListOfNullableXmls) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableXmls(oneListOfNullableXmls);
    }

    @JsonCreator
    private OneListOfNullableXmls_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneListOfNullableXmls") final java.util.List<org.w3c.dom.Element> oneListOfNullableXmls,
            @JsonProperty("calculatedOneListOfNullableXmls") final java.util.List<org.w3c.dom.Element> calculatedOneListOfNullableXmls,
            @JsonProperty("persistedOneListOfNullableXmls") final java.util.List<org.w3c.dom.Element> persistedOneListOfNullableXmls) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneListOfNullableXmls = oneListOfNullableXmls == null
                ? new java.util.ArrayList<org.w3c.dom.Element>()
                : oneListOfNullableXmls;
        this.calculatedOneListOfNullableXmls = calculatedOneListOfNullableXmls;
        this.persistedOneListOfNullableXmls = persistedOneListOfNullableXmls;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneListOfNullableXmls_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneListOfNullableXmls_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableXmls_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableXmls_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableXmls_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableXmls_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableXmls_3.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableXmls_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableXmls_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableXmls_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableXmls_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableXmls_3.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableXmls_3> search(
            final Specification<OneListOfNullableXmls_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableXmls_3> search(
            final Specification<OneListOfNullableXmls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableXmls_3> search(
            final Specification<OneListOfNullableXmls_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableXmls_3> search(
            final Specification<OneListOfNullableXmls_3> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .count(OneListOfNullableXmls_3.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableXmls_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableXmls_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private void updateWithAnother(
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneListOfNullableXmls_3 result) {
        this.URI = result.URI;

        this.oneListOfNullableXmls = result.oneListOfNullableXmls;
        this.calculatedOneListOfNullableXmls = result.calculatedOneListOfNullableXmls;
        this.persistedOneListOfNullableXmls = result.persistedOneListOfNullableXmls;
        this.ID = result.ID;
    }

    public OneListOfNullableXmls_3 persist() throws java.io.IOException {
        final OneListOfNullableXmls_3 result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public OneListOfNullableXmls_3 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneListOfNullableXmls_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<org.w3c.dom.Element> oneListOfNullableXmls;

    @JsonProperty("oneListOfNullableXmls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.w3c.dom.Element> getOneListOfNullableXmls() {
        return oneListOfNullableXmls;
    }

    public OneListOfNullableXmls_3 setOneListOfNullableXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableXmls\" cannot be null!");
        this.oneListOfNullableXmls = value;

        return this;
    }

    private java.util.List<org.w3c.dom.Element> calculatedOneListOfNullableXmls;

    @JsonProperty("calculatedOneListOfNullableXmls")
    public java.util.List<org.w3c.dom.Element> getCalculatedOneListOfNullableXmls() {
        return this.calculatedOneListOfNullableXmls;
    }

    private java.util.List<org.w3c.dom.Element> persistedOneListOfNullableXmls;

    @JsonProperty("persistedOneListOfNullableXmls")
    public java.util.List<org.w3c.dom.Element> getPersistedOneListOfNullableXmls() {
        return this.persistedOneListOfNullableXmls;
    }
}
