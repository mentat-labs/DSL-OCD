package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneStringsValue1 implements java.io.Serializable {
    public OneSetOfOneStringsValue1(
            final java.util.Set<String> oneSetOfOneStrings) {
        setOneSetOfOneStrings(oneSetOfOneStrings);
    }

    public OneSetOfOneStringsValue1() {
        this.oneSetOfOneStrings = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1253954437;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneStringsValue1)) return false;
        final OneSetOfOneStringsValue1 other = (OneSetOfOneStringsValue1) obj;

        if (!(this.oneSetOfOneStrings.equals(other.oneSetOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneStringsValue1(" + oneSetOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> oneSetOfOneStrings;

    @JsonProperty("oneSetOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getOneSetOfOneStrings() {
        return oneSetOfOneStrings;
    }

    public OneSetOfOneStringsValue1 setOneSetOfOneStrings(
            final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneStrings = value;

        return this;
    }
}
