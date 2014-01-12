package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneFloatValue2 implements java.io.Serializable {
    public OneFloatValue2(
            final float oneFloat) {
        setOneFloat(oneFloat);
    }

    public OneFloatValue2() {
        this.oneFloat = 0.0f;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 276122387;
        result = prime * result + (Float.valueOf(this.oneFloat).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneFloatValue2)) return false;
        final OneFloatValue2 other = (OneFloatValue2) obj;

        if (!(Float.floatToIntBits(this.oneFloat) == Float
                .floatToIntBits(other.oneFloat))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneFloatValue2(" + oneFloat + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private float oneFloat;

    @JsonProperty("oneFloat")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public float getOneFloat() {
        return oneFloat;
    }

    public OneFloatValue2 setOneFloat(final float value) {
        this.oneFloat = value;

        return this;
    }
}
