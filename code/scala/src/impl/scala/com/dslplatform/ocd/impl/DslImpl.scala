package com.dslplatform.ocd
package impl

import types._
import dsl._

trait DslImpl
    extends OcdImpl
    with box.BoxOnenessType
    with box.BoxNullnessType
    with tipe.TipeConstrainnessType
    with `lang.DSL`
    with dsl.printer.DslImplPrinter
    with Dynamic {

  def dslDesc: String

  def apply(name: String) =
    DslProperty(this, name)

  def selectDynamic(name: String) =
    DslProperty(this, name)

  def applyDynamic(name: String)(components: DslPropertyComponent*) =
    DslProperty(this, name)(components: _*)

  def ->(name: String) =
    DslProperty(this, name)
}
