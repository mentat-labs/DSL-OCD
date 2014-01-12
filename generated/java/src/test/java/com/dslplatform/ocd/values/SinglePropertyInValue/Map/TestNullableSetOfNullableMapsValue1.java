package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMapsValue1;

public class TestNullableSetOfNullableMapsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableMapsValue1.class.getDeclaredField(
                        "nullableSetOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableMapsValue1.class.getDeclaredField(
                        "nullableSetOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.Map<String, String>> nullableSetOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableSetOfNullableMaps").getGenericType(),
                NullableSetOfNullableMapsValue1.class.getDeclaredField("nullableSetOfNullableMaps").getGenericType());
    }
}
