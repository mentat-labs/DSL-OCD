package com.dslplatform.ocd.values.SinglePropertyInValue.Point;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOnePointsValue1;

public class TestNullableSetOfOnePointsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableSetOfOnePointsValue1.class.getDeclaredField(
                        "nullableSetOfOnePoints").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                NullableSetOfOnePointsValue1.class.getDeclaredField(
                        "nullableSetOfOnePoints").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.geom.Point2D> nullableSetOfOnePoints = null;
                }.getClass().getDeclaredField("nullableSetOfOnePoints").getGenericType(),
                NullableSetOfOnePointsValue1.class.getDeclaredField("nullableSetOfOnePoints").getGenericType());
    }
}
