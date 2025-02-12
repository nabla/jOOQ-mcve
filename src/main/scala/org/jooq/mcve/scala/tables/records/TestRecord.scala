/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala.tables.records


import java.lang.Integer

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.mcve.scala.tables.Test


/**
 * This class is generated by jOOQ.
 */
class TestRecord extends UpdatableRecordImpl[TestRecord](Test.TEST) with Record2[Integer, Integer] {

  /**
   * Setter for <code>mcve.test.id</code>.
   */
  def setId(value: Integer): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>mcve.test.id</code>.
   */
  def getId: Integer = get(0).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.test.value</code>.
   */
  def setValue(value: Integer): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>mcve.test.value</code>.
   */
  def getValue: Integer = get(1).asInstanceOf[Integer]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Integer] = super.key.asInstanceOf[ Record1[Integer] ]

  // -------------------------------------------------------------------------
  // Record2 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row2[Integer, Integer] = super.fieldsRow.asInstanceOf[ Row2[Integer, Integer] ]

  override def valuesRow: Row2[Integer, Integer] = super.valuesRow.asInstanceOf[ Row2[Integer, Integer] ]
  override def field1: Field[Integer] = Test.TEST.ID
  override def field2: Field[Integer] = Test.TEST.VALUE
  override def component1: Integer = getId
  override def component2: Integer = getValue
  override def value1: Integer = getId
  override def value2: Integer = getValue

  override def value1(value: Integer): TestRecord = {
    setId(value)
    this
  }

  override def value2(value: Integer): TestRecord = {
    setValue(value)
    this
  }

  override def values(value1 : Integer, value2 : Integer): TestRecord = {
    this.value1(value1)
    this.value2(value2)
    this
  }

  /**
   * Create a detached, initialised TestRecord
   */
  def this(id : Integer, value : Integer) = {
    this()

    this.setId(id)
    this.setValue(value)
  }
}
