package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBooleansValue4;

public class TestOneListOfNullableBooleansValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneListOfNullableBooleansValue4.class.getDeclaredField(
                        "oneListOfNullableBooleans").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                OneListOfNullableBooleansValue4.class.getDeclaredField(
                        "oneListOfNullableBooleans").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<Boolean> oneListOfNullableBooleans = null;
                }.getClass().getDeclaredField("oneListOfNullableBooleans").getGenericType(),
                OneListOfNullableBooleansValue4.class.getDeclaredField("oneListOfNullableBooleans").getGenericType());
    }
}
