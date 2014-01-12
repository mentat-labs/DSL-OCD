package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneBinaryValue1 implements java.io.Serializable {
    public OneBinaryValue1(
            final byte[] oneBinary) {
        setOneBinary(oneBinary);
    }

    public OneBinaryValue1() {
        this.oneBinary = new byte[0];
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1213679853;
        result = prime * result + (java.util.Arrays.hashCode(this.oneBinary));
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneBinaryValue1)) return false;
        final OneBinaryValue1 other = (OneBinaryValue1) obj;

        if (!(java.util.Arrays.equals(this.oneBinary, other.oneBinary)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneBinaryValue1(" + oneBinary + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private byte[] oneBinary;

    @JsonProperty("oneBinary")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public byte[] getOneBinary() {
        return oneBinary;
    }

    public OneBinaryValue1 setOneBinary(final byte[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneBinary\" cannot be null!");
        this.oneBinary = value;

        return this;
    }
}
