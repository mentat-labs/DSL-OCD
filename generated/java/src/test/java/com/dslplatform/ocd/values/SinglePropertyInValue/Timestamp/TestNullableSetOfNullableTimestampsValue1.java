package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableTimestampsValue1;

public class TestNullableSetOfNullableTimestampsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableTimestampsValue1.class.getDeclaredField(
                        "nullableSetOfNullableTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableTimestampsValue1.class.getDeclaredField(
                        "nullableSetOfNullableTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<org.joda.time.DateTime> nullableSetOfNullableTimestamps = null;
                }.getClass().getDeclaredField("nullableSetOfNullableTimestamps").getGenericType(),
                NullableSetOfNullableTimestampsValue1.class.getDeclaredField("nullableSetOfNullableTimestamps").getGenericType());
    }
}
