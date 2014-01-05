package com.dslplatform.ocd
package types

trait `type.Long`
    extends OcdType {

  def typeName = "Long"

  def typeAliases = Set(
    "BIGINT"
  , "BigInt"
  , "Bigint"
  , "LONG"
  , "bigint"
  , "long"
  )
}

case object `type.Long` extends `type.Long`
