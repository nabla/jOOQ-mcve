/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin


import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl
import org.jooq.mcve.kotlin.sequences.EXPERIENCE_ID_SEQ
import org.jooq.mcve.kotlin.sequences.MESSAGE_ID_SEQ
import org.jooq.mcve.kotlin.sequences.TEST_ID_SEQ
import org.jooq.mcve.kotlin.tables.Experience
import org.jooq.mcve.kotlin.tables.Message
import org.jooq.mcve.kotlin.tables.Test


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Mcve : SchemaImpl("mcve", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>mcve</code>
         */
        val MCVE = Mcve()
    }

    /**
     * The table <code>mcve.experience</code>.
     */
    val EXPERIENCE get() = Experience.EXPERIENCE

    /**
     * The table <code>mcve.message</code>.
     */
    val MESSAGE get() = Message.MESSAGE

    /**
     * The table <code>mcve.test</code>.
     */
    val TEST get() = Test.TEST

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getSequences(): List<Sequence<*>> = listOf(
        EXPERIENCE_ID_SEQ,
        MESSAGE_ID_SEQ,
        TEST_ID_SEQ
    )

    override fun getTables(): List<Table<*>> = listOf(
        Experience.EXPERIENCE,
        Message.MESSAGE,
        Test.TEST
    )
}
