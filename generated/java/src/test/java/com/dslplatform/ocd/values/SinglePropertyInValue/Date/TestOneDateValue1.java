package com.dslplatform.ocd.values.SinglePropertyInValue.Date;

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDateValue1;
import org.scalatest._;

public class TestOneDateValue1 {

    /* Testing the property field private accesss via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldAccess() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                java.lang.reflect.Modifier.PRIVATE,
                OneDateValue1.class.getDeclaredField(
                        "oneDate").getModifiers());
    }

    /* Testing the property field class via reflection (no instantiation) */
    @org.junit.Test
    public void testPropertyFieldClass() throws NoSuchFieldException {
        org.junit.Assert.assertEquals(
                org.joda.time.LocalDate.class,
                OneDateValue1.class.getDeclaredField(
                        "oneDate").getType());
    }
}
