package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate1L1Do> aggregate1L1DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate1L1DoRepository.class);
    }

    /* Testing the "p1L1Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do();
        final java.util.List<Double> testValue = aggregate.getP1L1Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Do());
    }

    /* Testing the "p1L1Do" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do();
        final java.util.List<Double> testValue = aggregate.getP1L1Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do().getP1L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Do());
    }

    /* Testing the "p1L1Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do().getP1L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Do());
    }

    /* Testing the "p1L1Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do().getP1L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate1L1Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Do());
    }

    /* Testing the "p1L1Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<Double> testValue = new java.util.ArrayList<Double>() {{ add(0.0); add(1E-307); add(9E307); add(-1.23456789012345E-10); add(1.23456789012345E20); add(Double.NEGATIVE_INFINITY); add(Double.POSITIVE_INFINITY); add(Double.NaN); }};
        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate1L1Do()
                .setP1L1Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Do().getP1L1Do());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate1L1Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate1L1Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
