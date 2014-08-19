package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneDecimalsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal.Aggregate0S1De> aggregate0S1DeRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneDecimalsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1DeRepository = locator.resolve(ocd.AggregateSurrogateDecimal.repositories.Aggregate0S1DeRepository.class);
    }

    /* Testing the "p0S1De" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DeDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP0S1De();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1De());
    }

    /* Testing the "p0S1De" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1DeDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De();
        final java.util.Set<java.math.BigDecimal> testValue = aggregate.getP0S1De();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De().getP0S1De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1De" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DeNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1De());
    }

    /* Testing the "p0S1De" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1DeNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De().getP0S1De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1De" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DeNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1De());
    }

    /* Testing the "p0S1De" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1DeNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De().getP0S1De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1De" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1DeNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0S1De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1De());
    }

    /* Testing the "p0S1De" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0S1DeNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<java.math.BigDecimal> testValue = new java.util.HashSet<java.math.BigDecimal>() {{ add(java.math.BigDecimal.ZERO); add(java.math.BigDecimal.ONE); add(new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)); add(new java.math.BigDecimal("-1E-28")); add(new java.math.BigDecimal("1E28")); }};
        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0S1De()
                .setP0S1De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1De().getP0S1De());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0S1De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0S1De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
