package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneStringsWithMaxLengthOf9PropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateString9.Aggregate0A1S9> aggregate0A1S9Repository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneStringsWithMaxLengthOf9PropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1S9Repository = locator.resolve(ocd.AggregateSurrogateString9.repositories.Aggregate0A1S9Repository.class);
    }

    /* Testing the "p0A1S9" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1S9DefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9();
        final String[] testValue = aggregate.getP0A1S9();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateString9.Aggregate0A1S9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1S9());
    }

    /* Testing the "p0A1S9" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1S9DefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9();
        final String[] testValue = aggregate.getP0A1S9();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9().getP0A1S9());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1S9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1S9" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1S9NonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final String[] testValue = new String[] { "" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateString9.Aggregate0A1S9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1S9());
    }

    /* Testing the "p0A1S9" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1S9NonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final String[] testValue = new String[] { "" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9().getP0A1S9());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1S9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1S9" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1S9NonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final String[] testValue = new String[] { "xxxxxxxxx" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateString9.Aggregate0A1S9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1S9());
    }

    /* Testing the "p0A1S9" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1S9NonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final String[] testValue = new String[] { "xxxxxxxxx" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9().getP0A1S9());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1S9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1S9" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1S9NonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final String[] testValue = new String[] { "", "\"", "'/\\[](){}", "\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t", "xxxxxxxxx" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateString9.Aggregate0A1S9.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1S9());
    }

    /* Testing the "p0A1S9" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1S9NonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final String[] testValue = new String[] { "", "\"", "'/\\[](){}", "\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t", "xxxxxxxxx" };
        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregate =
                new ocd.AggregateSurrogateString9.Aggregate0A1S9()
                .setP0A1S9(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1S9().getP0A1S9());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        final ocd.AggregateSurrogateString9.Aggregate0A1S9 aggregateFound =
                ocd.AggregateSurrogateString9.Aggregate0A1S9.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.StringWithMaxLengthOf9Asserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1S9());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
