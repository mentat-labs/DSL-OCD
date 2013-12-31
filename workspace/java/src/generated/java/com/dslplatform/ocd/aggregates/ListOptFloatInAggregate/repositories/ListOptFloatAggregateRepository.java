package com.dslplatform.ocd.aggregates.ListOptFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptFloatInAggregate.ListOptFloatAggregate> {
    public ListOptFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptFloatInAggregate.ListOptFloatAggregate.class,
                locator);
    }
}
