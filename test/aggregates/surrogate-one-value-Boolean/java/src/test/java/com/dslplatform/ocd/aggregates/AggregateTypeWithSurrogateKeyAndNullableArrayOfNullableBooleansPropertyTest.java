package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableBooleansPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBoolean.Aggregate0A0Bo> aggregate0A0BoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableBooleansPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0BoRepository = locator.resolve(ocd.AggregateSurrogateBoolean.repositories.Aggregate0A0BoRepository.class);
    }

    /* Testing the "p0A0Bo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo();
        final Boolean[] testValue = aggregate.getP0A0Bo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0BoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo();
        final Boolean[] testValue = aggregate.getP0A0Bo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Bo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { null };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0BoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { null };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Bo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { false };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0BoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { false };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Bo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0BoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Bo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0BoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Bo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0BoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { null, false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Bo());
    }

    /* Testing the "p0A0Bo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0A0BoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Boolean[] testValue = new Boolean[] { null, false, true };
        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregate =
                new ocd.AggregateSurrogateBoolean.Aggregate0A0Bo()
                .setP0A0Bo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Bo().getP0A0Bo());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        final ocd.AggregateSurrogateBoolean.Aggregate0A0Bo aggregateFound =
                ocd.AggregateSurrogateBoolean.Aggregate0A0Bo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BooleanAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Bo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
