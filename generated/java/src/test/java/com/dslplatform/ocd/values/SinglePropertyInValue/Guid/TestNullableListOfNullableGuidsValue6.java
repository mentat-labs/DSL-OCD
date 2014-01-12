package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableGuidsValue6;
import org.scalatest._;

public class TestNullableListOfNullableGuidsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableListOfNullableGuidsValue6.class.getDeclaredField(
                        "nullableListOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.List.class,
                NullableListOfNullableGuidsValue6.class.getDeclaredField(
                        "nullableListOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.List<java.util.UUID> nullableListOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableListOfNullableGuids").getGenericType(),
                NullableListOfNullableGuidsValue6.class.getDeclaredField("nullableListOfNullableGuids").getGenericType());
    }
}
