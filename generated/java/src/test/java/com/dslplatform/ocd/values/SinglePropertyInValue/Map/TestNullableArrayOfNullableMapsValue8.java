package com.dslplatform.ocd.values.SinglePropertyInValue.Map;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMapsValue8;
import org.scalatest._;

public class TestNullableArrayOfNullableMapsValue8 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableMapsValue8.class.getDeclaredField(
                        "nullableArrayOfNullableMaps").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.util.Map[].class,
                NullableArrayOfNullableMapsValue8.class.getDeclaredField(
                        "nullableArrayOfNullableMaps").getType());
    }

    /* Testing the property field generic type via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldGenericType() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                new Object() {
                    @SuppressWarnings("unused")
                    private final java.util.Map<String, String>[] nullableArrayOfNullableMaps = null;
                }.getClass().getDeclaredField("nullableArrayOfNullableMaps").getGenericType(),
                NullableArrayOfNullableMapsValue8.class.getDeclaredField("nullableArrayOfNullableMaps").getGenericType());
    }
}
