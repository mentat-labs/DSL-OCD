package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneTimestampsValue4 implements java.io.Serializable {
    public OneSetOfOneTimestampsValue4(
            final java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps) {
        setOneSetOfOneTimestamps(oneSetOfOneTimestamps);
    }

    public OneSetOfOneTimestampsValue4() {
        this.oneSetOfOneTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1629542839;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneTimestampsValue4)) return false;
        final OneSetOfOneTimestampsValue4 other = (OneSetOfOneTimestampsValue4) obj;

        if (!(this.oneSetOfOneTimestamps.equals(other.oneSetOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneTimestampsValue4(" + oneSetOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps;

    @JsonProperty("oneSetOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfOneTimestamps() {
        return oneSetOfOneTimestamps;
    }

    public OneSetOfOneTimestampsValue4 setOneSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneTimestamps = value;

        return this;
    }
}
