package com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.BinaryTests;

import com.dslplatform.ocd.calculation.CalculatedPropertyInAggregateSetup.NullableArrayOfNullableBinaries_3;

public class TestNullableArrayOfNullableBinaries_3 {

    /* Testing the property field private visibility via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldVisibility() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableBinaries_3.class.getDeclaredField(
                        "nullableArrayOfNullableBinaries").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                byte[][].class,
                NullableArrayOfNullableBinaries_3.class.getDeclaredField(
                        "nullableArrayOfNullableBinaries").getType());
    }
}
