package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneSetOfNullableLongsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateLong.Aggregate1S0Lo> aggregate1S0LoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneSetOfNullableLongsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1S0LoRepository = locator.resolve(ocd.AggregateSurrogateLong.repositories.Aggregate1S0LoRepository.class);
    }

    /* Testing the "p1S0Lo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo();
        final java.util.Set<Long> testValue = aggregate.getP1S0Lo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" Default property value after active record persist */
    @org.junit.Test
    public void testP1S0LoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo();
        final java.util.Set<Long> testValue = aggregate.getP1S0Lo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(null); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1S0LoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(null); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1S0LoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1S0LoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1S0LoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1S0Lo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1S0LoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(null); add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateLong.Aggregate1S0Lo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1S0Lo());
    }

    /* Testing the "p1S0Lo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1S0LoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<Long> testValue = new java.util.HashSet<Long>() {{ add(null); add(0L); add(1L); add(1000000000000000000L); add(-1000000000000000000L); add(Long.MIN_VALUE); add(Long.MAX_VALUE); }};
        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregate =
                new ocd.AggregateSurrogateLong.Aggregate1S0Lo()
                .setP1S0Lo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregate.getP1S0Lo().getP1S0Lo());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        final ocd.AggregateSurrogateLong.Aggregate1S0Lo aggregateFound =
                ocd.AggregateSurrogateLong.Aggregate1S0Lo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.LongAsserts.assertOneSetOfNullableEquals(
                testValue,
                aggregateFound.getP1S0Lo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
