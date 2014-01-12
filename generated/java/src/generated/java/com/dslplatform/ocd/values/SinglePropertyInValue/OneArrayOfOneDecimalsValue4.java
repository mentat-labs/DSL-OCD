package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDecimalsValue4 implements java.io.Serializable {
    public OneArrayOfOneDecimalsValue4(
            final java.math.BigDecimal[] oneArrayOfOneDecimals) {
        setOneArrayOfOneDecimals(oneArrayOfOneDecimals);
    }

    public OneArrayOfOneDecimalsValue4() {
        this.oneArrayOfOneDecimals = new java.math.BigDecimal[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1131161015;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDecimalsValue4)) return false;
        final OneArrayOfOneDecimalsValue4 other = (OneArrayOfOneDecimalsValue4) obj;

        if (!(com.dslplatform.ocd.values.Guards.compareBigDecimal(
                this.oneArrayOfOneDecimals, other.oneArrayOfOneDecimals)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDecimalsValue4(" + oneArrayOfOneDecimals + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.math.BigDecimal[] oneArrayOfOneDecimals;

    @JsonProperty("oneArrayOfOneDecimals")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.math.BigDecimal[] getOneArrayOfOneDecimals() {
        return oneArrayOfOneDecimals;
    }

    public OneArrayOfOneDecimalsValue4 setOneArrayOfOneDecimals(
            final java.math.BigDecimal[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDecimals\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneDecimals = value;

        return this;
    }
}
