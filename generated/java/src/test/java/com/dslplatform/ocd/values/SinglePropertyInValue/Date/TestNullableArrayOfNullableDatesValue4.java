package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDatesValue4;
import org.scalatest._;

public class TestNullableArrayOfNullableDatesValue4 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                NullableArrayOfNullableDatesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate[].class,
                NullableArrayOfNullableDatesValue4.class.getDeclaredField(
                        "nullableArrayOfNullableDates").getType());
    }
}
