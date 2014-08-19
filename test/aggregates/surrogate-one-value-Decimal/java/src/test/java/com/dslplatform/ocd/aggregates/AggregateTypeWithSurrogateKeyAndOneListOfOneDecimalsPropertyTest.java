package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneListOfOneDecimalsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal.Aggregate1L1De> aggregate1L1DeRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneListOfOneDecimalsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1L1DeRepository = locator.resolve(ocd.AggregateSurrogateDecimal.repositories.Aggregate1L1DeRepository.class);
    }

    /* Testing the "p1L1De" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DeDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP1L1De();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate1L1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1De());
    }

    /* Testing the "p1L1De" Default property value after active record persist */
    @org.junit.Test
    public void testP1L1DeDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De();
        final java.util.List<java.math.BigDecimal> testValue = aggregate.getP1L1De();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De().getP1L1De());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1De" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DeNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate1L1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1De());
    }

    /* Testing the "p1L1De" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1L1DeNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De().getP1L1De());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1De" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DeNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate1L1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1De());
    }

    /* Testing the "p1L1De" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1L1DeNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De().getP1L1De());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1L1De" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1L1DeNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate1L1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateDeserialized.getP1L1De());
    }

    /* Testing the "p1L1De" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1L1DeNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.List<java.math.BigDecimal> testValue = new java.util.ArrayList<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate1L1De()
                .setP1L1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregate.getP1L1De().getP1L1De());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate1L1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate1L1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertOneListOfOneEquals(
                testValue,
                aggregateFound.getP1L1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
