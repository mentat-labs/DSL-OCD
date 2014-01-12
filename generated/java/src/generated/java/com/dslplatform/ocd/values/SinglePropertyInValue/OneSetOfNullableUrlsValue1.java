package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableUrlsValue1 implements java.io.Serializable {
    public OneSetOfNullableUrlsValue1(
            final java.util.Set<java.net.URL> oneSetOfNullableUrls) {
        setOneSetOfNullableUrls(oneSetOfNullableUrls);
    }

    public OneSetOfNullableUrlsValue1() {
        this.oneSetOfNullableUrls = new java.util.HashSet<java.net.URL>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1218464156;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableUrlsValue1)) return false;
        final OneSetOfNullableUrlsValue1 other = (OneSetOfNullableUrlsValue1) obj;

        if (!(this.oneSetOfNullableUrls.equals(other.oneSetOfNullableUrls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableUrlsValue1(" + oneSetOfNullableUrls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.net.URL> oneSetOfNullableUrls;

    @JsonProperty("oneSetOfNullableUrls")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<java.net.URL> getOneSetOfNullableUrls() {
        return oneSetOfNullableUrls;
    }

    public OneSetOfNullableUrlsValue1 setOneSetOfNullableUrls(
            final java.util.Set<java.net.URL> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableUrls\" cannot be null!");
        this.oneSetOfNullableUrls = value;

        return this;
    }
}
