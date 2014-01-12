package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneS3sValue1 implements java.io.Serializable {
    public NullableSetOfOneS3sValue1(
            final java.util.Set<com.dslplatform.storage.S3> nullableSetOfOneS3s) {
        setNullableSetOfOneS3s(nullableSetOfOneS3s);
    }

    public NullableSetOfOneS3sValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 467456851;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneS3sValue1)) return false;
        final NullableSetOfOneS3sValue1 other = (NullableSetOfOneS3sValue1) obj;

        if (!(this.nullableSetOfOneS3s == other.nullableSetOfOneS3s || this.nullableSetOfOneS3s != null
                && this.nullableSetOfOneS3s.equals(other.nullableSetOfOneS3s)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneS3sValue1(" + nullableSetOfOneS3s + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<com.dslplatform.storage.S3> nullableSetOfOneS3s;

    @JsonProperty("nullableSetOfOneS3s")
    public java.util.Set<com.dslplatform.storage.S3> getNullableSetOfOneS3s() {
        return nullableSetOfOneS3s;
    }

    public NullableSetOfOneS3sValue1 setNullableSetOfOneS3s(
            final java.util.Set<com.dslplatform.storage.S3> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneS3s = value;

        return this;
    }
}
