/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin.sequences


import org.jooq.Sequence
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.mcve.kotlin.Mcve



/**
 * The sequence <code>mcve.experience_id_seq</code>
 */
val EXPERIENCE_ID_SEQ: Sequence<Int> = Internal.createSequence("experience_id_seq", Mcve.MCVE, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null)

/**
 * The sequence <code>mcve.message_id_seq</code>
 */
val MESSAGE_ID_SEQ: Sequence<Int> = Internal.createSequence("message_id_seq", Mcve.MCVE, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null)

/**
 * The sequence <code>mcve.test_id_seq</code>
 */
val TEST_ID_SEQ: Sequence<Int> = Internal.createSequence("test_id_seq", Mcve.MCVE, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null)
