package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableS3sValue2 implements
        java.io.Serializable {
    public NullableSetOfNullableS3sValue2(
            final java.util.Set<com.dslplatform.storage.S3> nullableSetOfNullableS3s) {
        setNullableSetOfNullableS3s(nullableSetOfNullableS3s);
    }

    public NullableSetOfNullableS3sValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1131808687;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableS3sValue2)) return false;
        final NullableSetOfNullableS3sValue2 other = (NullableSetOfNullableS3sValue2) obj;

        if (!(this.nullableSetOfNullableS3s == other.nullableSetOfNullableS3s || this.nullableSetOfNullableS3s != null
                && this.nullableSetOfNullableS3s
                        .equals(other.nullableSetOfNullableS3s))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableS3sValue2(" + nullableSetOfNullableS3s
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<com.dslplatform.storage.S3> nullableSetOfNullableS3s;

    @JsonProperty("nullableSetOfNullableS3s")
    public java.util.Set<com.dslplatform.storage.S3> getNullableSetOfNullableS3s() {
        return nullableSetOfNullableS3s;
    }

    public NullableSetOfNullableS3sValue2 setNullableSetOfNullableS3s(
            final java.util.Set<com.dslplatform.storage.S3> value) {
        this.nullableSetOfNullableS3s = value;

        return this;
    }
}
