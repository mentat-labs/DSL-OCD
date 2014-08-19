package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableSetOfOneXmlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateXml.Aggregate0S1Xm> aggregate0S1XmRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableSetOfOneXmlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0S1XmRepository = locator.resolve(ocd.AggregateSurrogateXml.repositories.Aggregate0S1XmRepository.class);
    }

    /* Testing the "p0S1Xm" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1XmDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm();
        final java.util.Set<org.w3c.dom.Element> testValue = aggregate.getP0S1Xm();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0S1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Xm());
    }

    /* Testing the "p0S1Xm" Default property value after active record persist */
    @org.junit.Test
    public void testP0S1XmDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm();
        final java.util.Set<org.w3c.dom.Element> testValue = aggregate.getP0S1Xm();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm().getP0S1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Xm" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1XmNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.w3c.dom.Element> testValue = new java.util.HashSet<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm()
                .setP0S1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0S1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Xm());
    }

    /* Testing the "p0S1Xm" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0S1XmNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.w3c.dom.Element> testValue = new java.util.HashSet<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm()
                .setP0S1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm().getP0S1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0S1Xm" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0S1XmNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.util.Set<org.w3c.dom.Element> testValue = new java.util.HashSet<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm()
                .setP0S1Xm(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateXml.Aggregate0S1Xm.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateDeserialized.getP0S1Xm());
    }

    /* Testing the "p0S1Xm" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0S1XmNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.util.Set<org.w3c.dom.Element> testValue = new java.util.HashSet<org.w3c.dom.Element>() {{ add(com.dslplatform.ocd.test.Utils.stringToElement("<document/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<TextElement>some text &amp; &lt;stuff&gt;</TextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ElementWithCData>&lt;?xml?&gt;&lt;xml&gt;&lt;!xml!&gt;</ElementWithCData>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<AtributedElement foo=\"bar\" qwe=\"poi\"/>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<NestedTextElement><FirstNest><SecondNest>bird</SecondNest></FirstNest></NestedTextElement>")); add(com.dslplatform.ocd.test.Utils.stringToElement("<ns3000:NamespacedElement/>")); }};
        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregate =
                new ocd.AggregateSurrogateXml.Aggregate0S1Xm()
                .setP0S1Xm(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregate.getP0S1Xm().getP0S1Xm());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        final ocd.AggregateSurrogateXml.Aggregate0S1Xm aggregateFound =
                ocd.AggregateSurrogateXml.Aggregate0S1Xm.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.XmlAsserts.assertNullableSetOfOneEquals(
                testValue,
                aggregateFound.getP0S1Xm());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
