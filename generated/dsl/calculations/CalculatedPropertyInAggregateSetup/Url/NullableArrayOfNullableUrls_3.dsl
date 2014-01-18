module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableUrls_3 {
    Array<Url?>? nullableArrayOfNullableUrls;

    calculated Array<Url?>? calculatedNullableArrayOfNullableUrls from 'it => it.nullableArrayOfNullableUrls';

    calculated Array<Url?>? persistedNullableArrayOfNullableUrls from 'it => it.nullableArrayOfNullableUrls' { persisted; }
  }
}
