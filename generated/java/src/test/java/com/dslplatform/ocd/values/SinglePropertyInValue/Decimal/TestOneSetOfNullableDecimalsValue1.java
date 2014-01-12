package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDecimalsValue1;

public class TestOneSetOfNullableDecimalsValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneSetOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneSetOfNullableDecimals").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Set.class,
                OneSetOfNullableDecimalsValue1.class.getDeclaredField(
                        "oneSetOfNullableDecimals").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Set<java.math.BigDecimal> oneSetOfNullableDecimals = null;
                }.getClass().getDeclaredField("oneSetOfNullableDecimals").getGenericType(),
                OneSetOfNullableDecimalsValue1.class.getDeclaredField("oneSetOfNullableDecimals").getGenericType());
    }
}
