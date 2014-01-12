package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableBooleansValue12 implements
        java.io.Serializable {
    public NullableArrayOfNullableBooleansValue12(
            final Boolean[] nullableArrayOfNullableBooleans) {
        setNullableArrayOfNullableBooleans(nullableArrayOfNullableBooleans);
    }

    public NullableArrayOfNullableBooleansValue12() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1627546683;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableBooleansValue12))
            return false;
        final NullableArrayOfNullableBooleansValue12 other = (NullableArrayOfNullableBooleansValue12) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableBooleans,
                other.nullableArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableBooleansValue12("
                + nullableArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] nullableArrayOfNullableBooleans;

    @JsonProperty("nullableArrayOfNullableBooleans")
    public Boolean[] getNullableArrayOfNullableBooleans() {
        return nullableArrayOfNullableBooleans;
    }

    public NullableArrayOfNullableBooleansValue12 setNullableArrayOfNullableBooleans(
            final Boolean[] value) {
        this.nullableArrayOfNullableBooleans = value;

        return this;
    }
}
