package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOnePointsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogatePoint.Aggregate1L1Po> aggregate1L1PoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOnePointsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1PoRepository = locator.resolve(ocd.AggregateSurrogatePoint.repositories.Aggregate1L1PoRepository.class);
    }

    /* Testing the "p1L1Po" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1PoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po();
        final java.util.List<java.awt.Point> testValue = aggregate.getP1L1Po();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L1Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Po());
    }

    /* Testing the "p1L1Po" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1PoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po();
        final java.util.List<java.awt.Point> testValue = aggregate.getP1L1Po();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po().getP1L1Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Po" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1PoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L1Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Po());
    }

    /* Testing the "p1L1Po" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1PoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po().getP1L1Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Po" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1PoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L1Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Po());
    }

    /* Testing the "p1L1Po" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1PoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po().getP1L1Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1Po" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1PoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogatePoint.Aggregate1L1Po.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1Po());
    }

    /* Testing the "p1L1Po" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1PoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.awt.Point> testValue = new java.util.ArrayList<java.awt.Point>() {{ add(new java.awt.Point()); add(new java.awt.Point(Integer.MIN_VALUE, Integer.MIN_VALUE)); add(new java.awt.Point(Integer.MAX_VALUE, Integer.MAX_VALUE)); add(new java.awt.Point(0, -1000000000)); add(new java.awt.Point(0, 1000000000)); }};
        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregate =
                new ocd.AggregateSurrogatePoint.Aggregate1L1Po()
                .setP1L1Po(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1Po().getP1L1Po());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        final ocd.AggregateSurrogatePoint.Aggregate1L1Po aggregateFound =
                ocd.AggregateSurrogatePoint.Aggregate1L1Po.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.PointAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1Po());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
