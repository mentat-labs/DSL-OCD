package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDatesValue3 implements java.io.Serializable {
    public OneSetOfNullableDatesValue3(
            final java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates) {
        setOneSetOfNullableDates(oneSetOfNullableDates);
    }

    public OneSetOfNullableDatesValue3() {
        this.oneSetOfNullableDates = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1393764999;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDatesValue3)) return false;
        final OneSetOfNullableDatesValue3 other = (OneSetOfNullableDatesValue3) obj;

        if (!(this.oneSetOfNullableDates.equals(other.oneSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDatesValue3(" + oneSetOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates;

    @JsonProperty("oneSetOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getOneSetOfNullableDates() {
        return oneSetOfNullableDates;
    }

    public OneSetOfNullableDatesValue3 setOneSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDates\" cannot be null!");
        this.oneSetOfNullableDates = value;

        return this;
    }
}
