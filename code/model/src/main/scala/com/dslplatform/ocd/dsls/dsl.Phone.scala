package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslPhone`
    extends OcdDsl
    with `type.Phone` {

  def dslName = toString.substring(4)
}

case object `dsl.Phone` extends `DslPhone` with `box.One`
case object `dsl.Array<Phone>` extends `DslPhone` with `box.OneArrayOfOne`
case object `dsl.Phone[]` extends `DslPhone` with `box.OneBracketsOfOne`
case object `dsl.Array<Phone?>` extends `DslPhone` with `box.OneArrayOfNullable`
case object `dsl.Phone?[]` extends `DslPhone` with `box.OneBracketsOfNullable`
case object `dsl.List<Phone>` extends `DslPhone` with `box.OneListOfOne`
case object `dsl.List<Phone?>` extends `DslPhone` with `box.OneListOfNullable`
case object `dsl.Set<Phone>` extends `DslPhone` with `box.OneSetOfOne`
case object `dsl.Set<Phone?>` extends `DslPhone` with `box.OneSetOfNullable`
case object `dsl.Phone?` extends `DslPhone` with `box.Nullable`
case object `dsl.Array<Phone>?` extends `DslPhone` with `box.NullableArrayOfOne`
case object `dsl.Phone[]?` extends `DslPhone` with `box.NullableBracketsOfOne`
case object `dsl.Array<Phone?>?` extends `DslPhone` with `box.NullableArrayOfNullable`
case object `dsl.Phone?[]?` extends `DslPhone` with `box.NullableBracketsOfNullable`
case object `dsl.List<Phone>?` extends `DslPhone` with `box.NullableListOfOne`
case object `dsl.List<Phone?>?` extends `DslPhone` with `box.NullableListOfNullable`
case object `dsl.Set<Phone>?` extends `DslPhone` with `box.NullableSetOfOne`
case object `dsl.Set<Phone?>?` extends `DslPhone` with `box.NullableSetOfNullable`

case object `dsl.PHONE` extends `DslPhone` with `box.One`
case object `dsl.ARRAY<PHONE>` extends `DslPhone` with `box.OneArrayOfOne`
case object `dsl.PHONE[]` extends `DslPhone` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<PHONE?>` extends `DslPhone` with `box.OneArrayOfNullable`
case object `dsl.PHONE?[]` extends `DslPhone` with `box.OneBracketsOfNullable`
case object `dsl.LIST<PHONE>` extends `DslPhone` with `box.OneListOfOne`
case object `dsl.LIST<PHONE?>` extends `DslPhone` with `box.OneListOfNullable`
case object `dsl.SET<PHONE>` extends `DslPhone` with `box.OneSetOfOne`
case object `dsl.SET<PHONE?>` extends `DslPhone` with `box.OneSetOfNullable`
case object `dsl.PHONE?` extends `DslPhone` with `box.Nullable`
case object `dsl.ARRAY<PHONE>?` extends `DslPhone` with `box.NullableArrayOfOne`
case object `dsl.PHONE[]?` extends `DslPhone` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<PHONE?>?` extends `DslPhone` with `box.NullableArrayOfNullable`
case object `dsl.PHONE?[]?` extends `DslPhone` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<PHONE>?` extends `DslPhone` with `box.NullableListOfOne`
case object `dsl.LIST<PHONE?>?` extends `DslPhone` with `box.NullableListOfNullable`
case object `dsl.SET<PHONE>?` extends `DslPhone` with `box.NullableSetOfOne`
case object `dsl.SET<PHONE?>?` extends `DslPhone` with `box.NullableSetOfNullable`

case object `dsl.phone` extends `DslPhone` with `box.One`
case object `dsl.array<phone>` extends `DslPhone` with `box.OneArrayOfOne`
case object `dsl.phone[]` extends `DslPhone` with `box.OneBracketsOfOne`
case object `dsl.array<phone?>` extends `DslPhone` with `box.OneArrayOfNullable`
case object `dsl.phone?[]` extends `DslPhone` with `box.OneBracketsOfNullable`
case object `dsl.list<phone>` extends `DslPhone` with `box.OneListOfOne`
case object `dsl.list<phone?>` extends `DslPhone` with `box.OneListOfNullable`
case object `dsl.set<phone>` extends `DslPhone` with `box.OneSetOfOne`
case object `dsl.set<phone?>` extends `DslPhone` with `box.OneSetOfNullable`
case object `dsl.phone?` extends `DslPhone` with `box.Nullable`
case object `dsl.array<phone>?` extends `DslPhone` with `box.NullableArrayOfOne`
case object `dsl.phone[]?` extends `DslPhone` with `box.NullableBracketsOfOne`
case object `dsl.array<phone?>?` extends `DslPhone` with `box.NullableArrayOfNullable`
case object `dsl.phone?[]?` extends `DslPhone` with `box.NullableBracketsOfNullable`
case object `dsl.list<phone>?` extends `DslPhone` with `box.NullableListOfOne`
case object `dsl.list<phone?>?` extends `DslPhone` with `box.NullableListOfNullable`
case object `dsl.set<phone>?` extends `DslPhone` with `box.NullableSetOfOne`
case object `dsl.set<phone?>?` extends `DslPhone` with `box.NullableSetOfNullable`
