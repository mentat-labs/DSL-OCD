package com.dslplatform.ocd.values.SinglePropertyInValue.Guid;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableGuidsValue6;
import org.scalatest._;

public class TestNullableSetOfNullableGuidsValue6 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfNullableGuidsValue6.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfNullableGuidsValue6.class.getDeclaredField(
                        "nullableSetOfNullableGuids").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.util.UUID> nullableSetOfNullableGuids = null;
                }.getClass().getDeclaredField("nullableSetOfNullableGuids").getGenericType(),
                NullableSetOfNullableGuidsValue6.class.getDeclaredField("nullableSetOfNullableGuids").getGenericType());
    }
}
