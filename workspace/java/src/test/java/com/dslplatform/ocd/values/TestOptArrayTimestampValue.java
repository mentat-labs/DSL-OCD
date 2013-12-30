package com.dslplatform.ocd.values;

import com.dslplatform.client.Bootstrap;
import com.dslplatform.ocd.values.OptArrayTimestampInValue.OptArrayTimestampValue;
import com.dslplatform.patterns.ServiceLocator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestOptArrayTimestampValue {
    private static ServiceLocator locator;

    @BeforeClass
    public static void setUpClass() throws Exception {
//        locator = Bootstrap.init(TestOptArrayTimestampValue.class.getResourceAsStream("dsl-project.ini"));
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        locator.resolve(java.util.concurrent.ExecutorService.class).shutdown();
//        locator = null;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFieldType() throws NoSuchFieldException {
        assertEquals(
                org.joda.time.DateTime[].class,
                OptArrayTimestampValue.class.getDeclaredField("optArrayTimestamp").getGenericType());
    }

    @Test
    public void testGetterType() throws NoSuchMethodException {
        assertEquals(
                org.joda.time.DateTime[].class,
                OptArrayTimestampValue.class.getMethod("getOptArrayTimestamp").getGenericReturnType());
    }

    @Test
    public void testSetterType() throws NoSuchMethodException {
        assertEquals(
                OptArrayTimestampValue.class,
                OptArrayTimestampValue.class.getMethod("setOptArrayTimestamp", org.joda.time.DateTime[].class).getReturnType());
    }

    @Test
    public void testDefaultPropertyValue() {
        assertNull(new OptArrayTimestampValue().getOptArrayTimestamp());
    }
}
