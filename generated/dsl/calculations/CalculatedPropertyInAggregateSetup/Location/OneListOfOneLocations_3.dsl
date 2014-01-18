module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneLocations_3 {
    List<Location> oneListOfOneLocations;

    calculated List<Location> calculatedOneListOfOneLocations from 'it => it.oneListOfOneLocations';

    calculated List<Location> persistedOneListOfOneLocations from 'it => it.oneListOfOneLocations' { persisted; }
  }
}
