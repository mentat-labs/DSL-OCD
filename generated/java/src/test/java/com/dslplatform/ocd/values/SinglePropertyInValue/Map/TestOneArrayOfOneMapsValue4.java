package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMapsValue4;
import org.scalatest._;

public class TestOneArrayOfOneMapsValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneArrayOfOneMapsValue4.class.getDeclaredField(
                        "oneArrayOfOneMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                OneArrayOfOneMapsValue4.class.getDeclaredField(
                        "oneArrayOfOneMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] oneArrayOfOneMaps = null;
                }.getClass().getDeclaredField("oneArrayOfOneMaps").getGenericType(),
                OneArrayOfOneMapsValue4.class.getDeclaredField("oneArrayOfOneMaps").getGenericType());
    }
}
