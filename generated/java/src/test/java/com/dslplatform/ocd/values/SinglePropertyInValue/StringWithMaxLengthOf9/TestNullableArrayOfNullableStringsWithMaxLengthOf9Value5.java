package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableStringsWithMaxLengthOf9Value5;
import org.scalatest._;

public class TestNullableArrayOfNullableStringsWithMaxLengthOf9Value5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableStringsWithMaxLengthOf9Value5.class.getDeclaredField(
                        "nullableArrayOfNullableStringsWithMaxLengthOf9").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                String[].class,
                NullableArrayOfNullableStringsWithMaxLengthOf9Value5.class.getDeclaredField(
                        "nullableArrayOfNullableStringsWithMaxLengthOf9").getType());
    }
}
