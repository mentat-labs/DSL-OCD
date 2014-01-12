package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableLongsValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableLongsValue3(
            final java.util.Set<Long> nullableSetOfNullableLongs) {
        setNullableSetOfNullableLongs(nullableSetOfNullableLongs);
    }

    public NullableSetOfNullableLongsValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1293603766;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableLongsValue3)) return false;
        final NullableSetOfNullableLongsValue3 other = (NullableSetOfNullableLongsValue3) obj;

        if (!(this.nullableSetOfNullableLongs == other.nullableSetOfNullableLongs || this.nullableSetOfNullableLongs != null
                && this.nullableSetOfNullableLongs
                        .equals(other.nullableSetOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableLongsValue3(" + nullableSetOfNullableLongs
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Long> nullableSetOfNullableLongs;

    @JsonProperty("nullableSetOfNullableLongs")
    public java.util.Set<Long> getNullableSetOfNullableLongs() {
        return nullableSetOfNullableLongs;
    }

    public NullableSetOfNullableLongsValue3 setNullableSetOfNullableLongs(
            final java.util.Set<Long> value) {
        this.nullableSetOfNullableLongs = value;

        return this;
    }
}
