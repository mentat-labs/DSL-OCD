package com.dslplatform.ocd.values.SinglePropertyInValue.Image;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneImagesValue3;
import org.scalatest._;

public class TestNullableArrayOfOneImagesValue3 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfOneImagesValue3.class.getDeclaredField(
                        "nullableArrayOfOneImages").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.awt.image.BufferedImage[].class,
                NullableArrayOfOneImagesValue3.class.getDeclaredField(
                        "nullableArrayOfOneImages").getType());
    }
}
