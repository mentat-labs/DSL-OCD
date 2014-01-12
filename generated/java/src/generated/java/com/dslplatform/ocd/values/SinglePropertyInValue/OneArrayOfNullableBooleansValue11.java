package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBooleansValue11 implements
        java.io.Serializable {
    public OneArrayOfNullableBooleansValue11(
            final Boolean[] oneArrayOfNullableBooleans) {
        setOneArrayOfNullableBooleans(oneArrayOfNullableBooleans);
    }

    public OneArrayOfNullableBooleansValue11() {
        this.oneArrayOfNullableBooleans = new Boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 68313525;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBooleansValue11)) return false;
        final OneArrayOfNullableBooleansValue11 other = (OneArrayOfNullableBooleansValue11) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableBooleans,
                other.oneArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBooleansValue11("
                + oneArrayOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] oneArrayOfNullableBooleans;

    @JsonProperty("oneArrayOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getOneArrayOfNullableBooleans() {
        return oneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleansValue11 setOneArrayOfNullableBooleans(
            final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBooleans\" cannot be null!");
        this.oneArrayOfNullableBooleans = value;

        return this;
    }
}
