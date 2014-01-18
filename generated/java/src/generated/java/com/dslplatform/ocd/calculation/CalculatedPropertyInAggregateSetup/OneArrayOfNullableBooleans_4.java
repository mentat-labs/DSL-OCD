package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfNullableBooleans_4 implements java.io.Serializable,
        AggregateRoot {
    public OneArrayOfNullableBooleans_4() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfNullableBooleans = new Boolean[] {};
        this.calculatedOneArrayOfNullableBooleans = new Boolean[] {};
        this.persistedOneArrayOfNullableBooleans = new Boolean[] {};
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
        final OneArrayOfNullableBooleans_4 other = (OneArrayOfNullableBooleans_4) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "OneArrayOfNullableBooleans_4(" + URI + ')'
                : "new OneArrayOfNullableBooleans_4(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfNullableBooleans_4(
            final Boolean[] oneArrayOfNullableBooleans) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfNullableBooleans(oneArrayOfNullableBooleans);
    }

    @JsonCreator
    private OneArrayOfNullableBooleans_4(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfNullableBooleans") final Boolean[] oneArrayOfNullableBooleans,
            @JsonProperty("calculatedOneArrayOfNullableBooleans") final Boolean[] calculatedOneArrayOfNullableBooleans,
            @JsonProperty("persistedOneArrayOfNullableBooleans") final Boolean[] persistedOneArrayOfNullableBooleans) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfNullableBooleans = oneArrayOfNullableBooleans == null
                ? new Boolean[] {}
                : oneArrayOfNullableBooleans;
        this.calculatedOneArrayOfNullableBooleans = calculatedOneArrayOfNullableBooleans;
        this.persistedOneArrayOfNullableBooleans = persistedOneArrayOfNullableBooleans;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfNullableBooleans_4 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfNullableBooleans_4 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfNullableBooleans_4 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfNullableBooleans_4.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfNullableBooleans_4.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfNullableBooleans_4.class, limit, offset,
                            null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> search(
            final Specification<OneArrayOfNullableBooleans_4> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> search(
            final Specification<OneArrayOfNullableBooleans_4> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> search(
            final Specification<OneArrayOfNullableBooleans_4> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfNullableBooleans_4> search(
            final Specification<OneArrayOfNullableBooleans_4> specification,
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
                    .count(OneArrayOfNullableBooleans_4.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfNullableBooleans_4> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfNullableBooleans_4> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneArrayOfNullableBooleans_4 result) {
        this.URI = result.URI;

        this.oneArrayOfNullableBooleans = result.oneArrayOfNullableBooleans;
        this.calculatedOneArrayOfNullableBooleans = result.calculatedOneArrayOfNullableBooleans;
        this.persistedOneArrayOfNullableBooleans = result.persistedOneArrayOfNullableBooleans;
        this.ID = result.ID;
    }

    public OneArrayOfNullableBooleans_4 persist() throws java.io.IOException {
        final OneArrayOfNullableBooleans_4 result;
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

    public OneArrayOfNullableBooleans_4 delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(OneArrayOfNullableBooleans_4.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private Boolean[] oneArrayOfNullableBooleans;

    @JsonProperty("oneArrayOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getOneArrayOfNullableBooleans() {
        return oneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleans_4 setOneArrayOfNullableBooleans(
            final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBooleans\" cannot be null!");
        this.oneArrayOfNullableBooleans = value;

        return this;
    }

    private Boolean[] calculatedOneArrayOfNullableBooleans;

    @JsonProperty("calculatedOneArrayOfNullableBooleans")
    public Boolean[] getCalculatedOneArrayOfNullableBooleans() {
        return this.calculatedOneArrayOfNullableBooleans;
    }

    private Boolean[] persistedOneArrayOfNullableBooleans;

    @JsonProperty("persistedOneArrayOfNullableBooleans")
    public Boolean[] getPersistedOneArrayOfNullableBooleans() {
        return this.persistedOneArrayOfNullableBooleans;
    }
}
