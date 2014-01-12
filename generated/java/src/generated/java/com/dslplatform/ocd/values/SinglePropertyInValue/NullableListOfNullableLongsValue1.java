package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableLongsValue1 implements
        java.io.Serializable {
    public NullableListOfNullableLongsValue1(
            final java.util.List<Long> nullableListOfNullableLongs) {
        setNullableListOfNullableLongs(nullableListOfNullableLongs);
    }

    public NullableListOfNullableLongsValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2032501746;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableLongsValue1)) return false;
        final NullableListOfNullableLongsValue1 other = (NullableListOfNullableLongsValue1) obj;

        if (!(this.nullableListOfNullableLongs == other.nullableListOfNullableLongs || this.nullableListOfNullableLongs != null
                && this.nullableListOfNullableLongs
                        .equals(other.nullableListOfNullableLongs)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableLongsValue1("
                + nullableListOfNullableLongs + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Long> nullableListOfNullableLongs;

    @JsonProperty("nullableListOfNullableLongs")
    public java.util.List<Long> getNullableListOfNullableLongs() {
        return nullableListOfNullableLongs;
    }

    public NullableListOfNullableLongsValue1 setNullableListOfNullableLongs(
            final java.util.List<Long> value) {
        this.nullableListOfNullableLongs = value;

        return this;
    }
}
