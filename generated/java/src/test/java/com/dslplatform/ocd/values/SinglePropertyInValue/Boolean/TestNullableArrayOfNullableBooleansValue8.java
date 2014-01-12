package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBooleansValue8;

public class TestNullableArrayOfNullableBooleansValue8 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableBooleansValue8.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                NullableArrayOfNullableBooleansValue8.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getType());
    }
}
