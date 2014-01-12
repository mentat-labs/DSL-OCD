package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneIpsValue1 implements java.io.Serializable {
    public OneArrayOfOneIpsValue1(
            final java.net.InetAddress[] oneArrayOfOneIps) {
        setOneArrayOfOneIps(oneArrayOfOneIps);
    }

    public OneArrayOfOneIpsValue1() {
        this.oneArrayOfOneIps = new java.net.InetAddress[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 876832612;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneIpsValue1)) return false;
        final OneArrayOfOneIpsValue1 other = (OneArrayOfOneIpsValue1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneIps,
                other.oneArrayOfOneIps))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneIpsValue1(" + oneArrayOfOneIps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.net.InetAddress[] oneArrayOfOneIps;

    @JsonProperty("oneArrayOfOneIps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.net.InetAddress[] getOneArrayOfOneIps() {
        return oneArrayOfOneIps;
    }

    public OneArrayOfOneIpsValue1 setOneArrayOfOneIps(
            final java.net.InetAddress[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneIps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneIps = value;

        return this;
    }
}
