package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.TextTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.OneSetOfOneTexts_4;

public class TestOneSetOfOneTexts_4 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfOneTexts_4.class.getDeclaredField(
                        "oneSetOfOneTexts").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfOneTexts_4.class.getDeclaredField(
                        "oneSetOfOneTexts").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<String> oneSetOfOneTexts = null;
                }.getClass().getDeclaredField("oneSetOfOneTexts").getGenericType(),
                OneSetOfOneTexts_4.class.getDeclaredField("oneSetOfOneTexts").getGenericType());
    }
}
