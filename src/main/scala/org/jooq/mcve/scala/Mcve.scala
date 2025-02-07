/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala


import java.util.Arrays
import java.util.List

import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl
import org.jooq.mcve.scala.tables.Experience
import org.jooq.mcve.scala.tables.Message
import org.jooq.mcve.scala.tables.Test


object Mcve {

  /**
   * The reference instance of <code>mcve</code>
   */
  val MCVE = new Mcve
}

/**
 * This class is generated by jOOQ.
 */
class Mcve extends SchemaImpl("mcve", DefaultCatalog.DEFAULT_CATALOG) {

  /**
   * The table <code>mcve.experience</code>.
   */
  def EXPERIENCE = Experience.EXPERIENCE

  /**
   * The table <code>mcve.message</code>.
   */
  def MESSAGE = Message.MESSAGE

  /**
   * The table <code>mcve.test</code>.
   */
  def TEST = Test.TEST

  override def getCatalog: Catalog = DefaultCatalog.DEFAULT_CATALOG

  override def getSequences: List[Sequence[_]] = {
    return Arrays.asList[Sequence[_]](
      Sequences.EXPERIENCE_ID_SEQ,
      Sequences.MESSAGE_ID_SEQ,
      Sequences.TEST_ID_SEQ)
  }

  override def getTables: List[Table[_]] = {
    return Arrays.asList[Table[_]](
      Experience.EXPERIENCE,
      Message.MESSAGE,
      Test.TEST)
  }
}
