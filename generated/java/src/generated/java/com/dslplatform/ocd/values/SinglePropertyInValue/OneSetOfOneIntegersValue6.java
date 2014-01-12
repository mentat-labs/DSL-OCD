package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneIntegersValue6 implements java.io.Serializable {
    public OneSetOfOneIntegersValue6(
            final java.util.Set<Integer> oneSetOfOneIntegers) {
        setOneSetOfOneIntegers(oneSetOfOneIntegers);
    }

    public OneSetOfOneIntegersValue6() {
        this.oneSetOfOneIntegers = new java.util.HashSet<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1053006641;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneIntegersValue6)) return false;
        final OneSetOfOneIntegersValue6 other = (OneSetOfOneIntegersValue6) obj;

        if (!(this.oneSetOfOneIntegers.equals(other.oneSetOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneIntegersValue6(" + oneSetOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> oneSetOfOneIntegers;

    @JsonProperty("oneSetOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Integer> getOneSetOfOneIntegers() {
        return oneSetOfOneIntegers;
    }

    public OneSetOfOneIntegersValue6 setOneSetOfOneIntegers(
            final java.util.Set<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneIntegers\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneIntegers = value;

        return this;
    }
}
