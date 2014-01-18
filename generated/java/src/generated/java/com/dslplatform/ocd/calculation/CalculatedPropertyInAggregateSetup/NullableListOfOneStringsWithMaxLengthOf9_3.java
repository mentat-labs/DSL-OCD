package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class NullableListOfOneStringsWithMaxLengthOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public NullableListOfOneStringsWithMaxLengthOf9_3() {
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
        final NullableListOfOneStringsWithMaxLengthOf9_3 other = (NullableListOfOneStringsWithMaxLengthOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "NullableListOfOneStringsWithMaxLengthOf9_3("
                + URI + ')' : "new NullableListOfOneStringsWithMaxLengthOf9_3("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public NullableListOfOneStringsWithMaxLengthOf9_3(
            final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setNullableListOfOneStringsWithMaxLengthOf9(nullableListOfOneStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private NullableListOfOneStringsWithMaxLengthOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("nullableListOfOneStringsWithMaxLengthOf9") final java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9,
            @JsonProperty("calculatedNullableListOfOneStringsWithMaxLengthOf9") final java.util.List<String> calculatedNullableListOfOneStringsWithMaxLengthOf9,
            @JsonProperty("persistedNullableListOfOneStringsWithMaxLengthOf9") final java.util.List<String> persistedNullableListOfOneStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.nullableListOfOneStringsWithMaxLengthOf9 = nullableListOfOneStringsWithMaxLengthOf9;
        this.calculatedNullableListOfOneStringsWithMaxLengthOf9 = calculatedNullableListOfOneStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : calculatedNullableListOfOneStringsWithMaxLengthOf9;
        this.persistedNullableListOfOneStringsWithMaxLengthOf9 = persistedNullableListOfOneStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : persistedNullableListOfOneStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private NullableListOfOneStringsWithMaxLengthOf9_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static NullableListOfOneStringsWithMaxLengthOf9_3 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static NullableListOfOneStringsWithMaxLengthOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(NullableListOfOneStringsWithMaxLengthOf9_3.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(NullableListOfOneStringsWithMaxLengthOf9_3.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(NullableListOfOneStringsWithMaxLengthOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<NullableListOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification,
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
                    .count(NullableListOfOneStringsWithMaxLengthOf9_3.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<NullableListOfOneStringsWithMaxLengthOf9_3> specification,
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
            final com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableListOfOneStringsWithMaxLengthOf9_3 result) {
        this.URI = result.URI;

        this.nullableListOfOneStringsWithMaxLengthOf9 = result.nullableListOfOneStringsWithMaxLengthOf9;
        this.calculatedNullableListOfOneStringsWithMaxLengthOf9 = result.calculatedNullableListOfOneStringsWithMaxLengthOf9;
        this.persistedNullableListOfOneStringsWithMaxLengthOf9 = result.persistedNullableListOfOneStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public NullableListOfOneStringsWithMaxLengthOf9_3 persist()
            throws java.io.IOException {
        final NullableListOfOneStringsWithMaxLengthOf9_3 result;
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

    public NullableListOfOneStringsWithMaxLengthOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    NullableListOfOneStringsWithMaxLengthOf9_3.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<String> nullableListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("nullableListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getNullableListOfOneStringsWithMaxLengthOf9() {
        return nullableListOfOneStringsWithMaxLengthOf9;
    }

    public NullableListOfOneStringsWithMaxLengthOf9_3 setNullableListOfOneStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        if (value != null)
            com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.nullableListOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }

    private java.util.List<String> calculatedNullableListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("calculatedNullableListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getCalculatedNullableListOfOneStringsWithMaxLengthOf9() {
        return this.calculatedNullableListOfOneStringsWithMaxLengthOf9;
    }

    private java.util.List<String> persistedNullableListOfOneStringsWithMaxLengthOf9;

    @JsonProperty("persistedNullableListOfOneStringsWithMaxLengthOf9")
    public java.util.List<String> getPersistedNullableListOfOneStringsWithMaxLengthOf9() {
        return this.persistedNullableListOfOneStringsWithMaxLengthOf9;
    }
}
