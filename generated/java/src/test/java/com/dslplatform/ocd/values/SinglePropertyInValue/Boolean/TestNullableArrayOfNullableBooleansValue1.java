package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBooleansValue1;

public class TestNullableArrayOfNullableBooleansValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableBooleansValue1.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean[].class,
                NullableArrayOfNullableBooleansValue1.class.getDeclaredField(
                        "nullableArrayOfNullableBooleans").getType());
    }
}
