package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTimestampsValue4;
import org.scalatest._;

public class TestNullableListOfOneTimestampsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfOneTimestampsValue4.class.getDeclaredField(
                        "nullableListOfOneTimestamps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfOneTimestampsValue4.class.getDeclaredField(
                        "nullableListOfOneTimestamps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<org.joda.time.DateTime> nullableListOfOneTimestamps = null;
                }.getClass().getDeclaredField("nullableListOfOneTimestamps").getGenericType(),
                NullableListOfOneTimestampsValue4.class.getDeclaredField("nullableListOfOneTimestamps").getGenericType());
    }
}
