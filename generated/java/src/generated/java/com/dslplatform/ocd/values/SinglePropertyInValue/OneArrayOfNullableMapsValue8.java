package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableMapsValue8 implements java.io.Serializable {
    public OneArrayOfNullableMapsValue8(
            final java.util.Map<String, String>[] oneArrayOfNullableMaps) {
        setOneArrayOfNullableMaps(oneArrayOfNullableMaps);
    }

    @SuppressWarnings("unchecked")
    public OneArrayOfNullableMapsValue8() {
        this.oneArrayOfNullableMaps = new java.util.Map[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2082702143;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableMapsValue8)) return false;
        final OneArrayOfNullableMapsValue8 other = (OneArrayOfNullableMapsValue8) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableMaps,
                other.oneArrayOfNullableMaps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableMapsValue8(" + oneArrayOfNullableMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Map<String, String>[] oneArrayOfNullableMaps;

    @JsonProperty("oneArrayOfNullableMaps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Map<String, String>[] getOneArrayOfNullableMaps() {
        return oneArrayOfNullableMaps;
    }

    public OneArrayOfNullableMapsValue8 setOneArrayOfNullableMaps(
            final java.util.Map<String, String>[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableMaps\" cannot be null!");
        this.oneArrayOfNullableMaps = value;

        return this;
    }
}
