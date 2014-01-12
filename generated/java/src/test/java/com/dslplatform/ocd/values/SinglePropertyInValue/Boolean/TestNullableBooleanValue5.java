package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableBooleanValue5;
import org.scalatest._;

public class TestNullableBooleanValue5 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableBooleanValue5.class.getDeclaredField(
                        "nullableBoolean").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                Boolean.class,
                NullableBooleanValue5.class.getDeclaredField(
                        "nullableBoolean").getType());
    }
}
