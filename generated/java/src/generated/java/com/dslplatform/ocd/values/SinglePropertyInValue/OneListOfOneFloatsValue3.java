package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneFloatsValue3 implements java.io.Serializable {
    public OneListOfOneFloatsValue3(
            final java.util.List<Float> oneListOfOneFloats) {
        setOneListOfOneFloats(oneListOfOneFloats);
    }

    public OneListOfOneFloatsValue3() {
        this.oneListOfOneFloats = new java.util.ArrayList<Float>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1927608512;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneFloatsValue3)) return false;
        final OneListOfOneFloatsValue3 other = (OneListOfOneFloatsValue3) obj;

        if (!(this.oneListOfOneFloats.equals(other.oneListOfOneFloats)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneFloatsValue3(" + oneListOfOneFloats + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Float> oneListOfOneFloats;

    @JsonProperty("oneListOfOneFloats")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Float> getOneListOfOneFloats() {
        return oneListOfOneFloats;
    }

    public OneListOfOneFloatsValue3 setOneListOfOneFloats(
            final java.util.List<Float> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneFloats\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneFloats = value;

        return this;
    }
}
