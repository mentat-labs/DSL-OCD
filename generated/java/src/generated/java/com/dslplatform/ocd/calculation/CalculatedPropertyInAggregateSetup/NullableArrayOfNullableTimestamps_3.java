package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableArrayOfNullableTimestamps_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableArrayOfNullableTimestamps_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
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
        final NullableArrayOfNullableTimestamps_3 other = (NullableArrayOfNullableTimestamps_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "NullableArrayOfNullableTimestamps_3(" + URI + ')'
                : "new NullableArrayOfNullableTimestamps_3(" + super.hashCode()
                        + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableArrayOfNullableTimestamps_3(
            final org.joda.time.DateTime[] nullableArrayOfNullableTimestamps) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableArrayOfNullableTimestamps(nullableArrayOfNullableTimestamps);
    }

    @JsonCreator
    private NullableArrayOfNullableTimestamps_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableArrayOfNullableTimestamps") final org.joda.time.DateTime[] nullableArrayOfNullableTimestamps,
            @JsonProperty("calculatedNullableArrayOfNullableTimestamps") final org.joda.time.DateTime[] calculatedNullableArrayOfNullableTimestamps,
            @JsonProperty("persistedNullableArrayOfNullableTimestamps") final org.joda.time.DateTime[] persistedNullableArrayOfNullableTimestamps) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableArrayOfNullableTimestamps = nullableArrayOfNullableTimestamps;
        this.calculatedNullableArrayOfNullableTimestamps = calculatedNullableArrayOfNullableTimestamps == null
                ? new org.joda.time.DateTime[] {}
                : calculatedNullableArrayOfNullableTimestamps;
        this.persistedNullableArrayOfNullableTimestamps = persistedNullableArrayOfNullableTimestamps == null
                ? new org.joda.time.DateTime[] {}
                : persistedNullableArrayOfNullableTimestamps;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableArrayOfNullableTimestamps_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableArrayOfNullableTimestamps_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableArrayOfNullableTimestamps_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableArrayOfNullableTimestamps_3.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableArrayOfNullableTimestamps_3.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableArrayOfNullableTimestamps_3.class, limit,
                            offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> search(
            final Specification<NullableArrayOfNullableTimestamps_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> search(
            final Specification<NullableArrayOfNullableTimestamps_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> search(
            final Specification<NullableArrayOfNullableTimestamps_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableArrayOfNullableTimestamps_3> search(
            final Specification<NullableArrayOfNullableTimestamps_3> specification,
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
                    .count(NullableArrayOfNullableTimestamps_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableArrayOfNullableTimestamps_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableArrayOfNullableTimestamps_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableTimestamps_3 result) {
        this.URI = result.URI;

        this.nullableArrayOfNullableTimestamps = result.nullableArrayOfNullableTimestamps;
        this.calculatedNullableArrayOfNullableTimestamps = result.calculatedNullableArrayOfNullableTimestamps;
        this.persistedNullableArrayOfNullableTimestamps = result.persistedNullableArrayOfNullableTimestamps;
        this.ID = result.ID;
    }

    public NullableArrayOfNullableTimestamps_3 persist()
            throws java.io.IOException {
        final NullableArrayOfNullableTimestamps_3 result;
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

    public NullableArrayOfNullableTimestamps_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(NullableArrayOfNullableTimestamps_3.class,
                    URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private org.joda.time.DateTime[] nullableArrayOfNullableTimestamps;

    @JsonProperty("nullableArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getNullableArrayOfNullableTimestamps() {
        return nullableArrayOfNullableTimestamps;
    }

    public NullableArrayOfNullableTimestamps_3 setNullableArrayOfNullableTimestamps(
            final org.joda.time.DateTime[] value) {
        this.nullableArrayOfNullableTimestamps = value;

        return this;
    }

    private org.joda.time.DateTime[] calculatedNullableArrayOfNullableTimestamps;

    @JsonProperty("calculatedNullableArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getCalculatedNullableArrayOfNullableTimestamps() {
        return this.calculatedNullableArrayOfNullableTimestamps;
    }

    private org.joda.time.DateTime[] persistedNullableArrayOfNullableTimestamps;

    @JsonProperty("persistedNullableArrayOfNullableTimestamps")
    public org.joda.time.DateTime[] getPersistedNullableArrayOfNullableTimestamps() {
        return this.persistedNullableArrayOfNullableTimestamps;
    }
}
