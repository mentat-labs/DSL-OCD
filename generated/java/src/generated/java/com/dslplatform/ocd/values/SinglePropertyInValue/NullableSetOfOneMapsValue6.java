package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneMapsValue6 implements java.io.Serializable {
    public NullableSetOfOneMapsValue6(
            final java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps) {
        setNullableSetOfOneMaps(nullableSetOfOneMaps);
    }

    public NullableSetOfOneMapsValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 898900734;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneMapsValue6)) return false;
        final NullableSetOfOneMapsValue6 other = (NullableSetOfOneMapsValue6) obj;

        if (!(this.nullableSetOfOneMaps == other.nullableSetOfOneMaps || this.nullableSetOfOneMaps != null
                && this.nullableSetOfOneMaps.equals(other.nullableSetOfOneMaps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneMapsValue6(" + nullableSetOfOneMaps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<java.util.Map<String, String>> nullableSetOfOneMaps;

    @JsonProperty("nullableSetOfOneMaps")
    public java.util.Set<java.util.Map<String, String>> getNullableSetOfOneMaps() {
        return nullableSetOfOneMaps;
    }

    public NullableSetOfOneMapsValue6 setNullableSetOfOneMaps(
            final java.util.Set<java.util.Map<String, String>> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneMaps = value;

        return this;
    }
}
