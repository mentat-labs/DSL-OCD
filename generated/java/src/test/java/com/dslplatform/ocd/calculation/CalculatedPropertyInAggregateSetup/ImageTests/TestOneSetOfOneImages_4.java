package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.ImageTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneImages_4;

public class TestOneSetOfOneImages_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneImages_4.class.getDeclaredField(
                        "oneSetOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneImages_4.class.getDeclaredField(
                        "oneSetOfOneImages").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.awt.image.BufferedImage> oneSetOfOneImages = null;
                }.getClass().getDeclaredField("oneSetOfOneImages").getGenericType(),
                OneSetOfOneImages_4.class.getDeclaredField("oneSetOfOneImages").getGenericType());
    }
}
