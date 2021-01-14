package org.jooq.mcve.test.kotlin

import org.jooq.mcve.java.Tables.TEST
import org.jooq.mcve.java.Tables.EXPERIENCE
import org.jooq.mcve.java.Tables.MESSAGE
import org.jooq.mcve.test.java.AbstractTest
import org.jooq.Field
import org.jooq.impl.DSL.lateral
import org.jooq.impl.DSL.row
import org.jooq.impl.DSL.select
import org.jooq.impl.DSL.values
import org.junit.Assert.assertEquals
import org.junit.Test

class KotlinTest : AbstractTest() {

    @Test
    fun mcveTest() {
        val result = ctx
                .insertInto(TEST)
                .columns(TEST.VALUE)
                .values(42)
                .returning(TEST.ID)
                .fetchOne()

        result?.refresh()
        assertEquals(42, result?.value)
    }

    @Test
    fun `Record_into is slow`() {

        // ----- Setup

        val experiences: List<org.jooq.mcve.java.tables.records.ExperienceRecord> = (0 until 10).map {

            val experience = ctx
                .insertInto(EXPERIENCE)
                .columns(EXPERIENCE.DESCRIPTION)
                .values("desc")
                .returning(EXPERIENCE.ID)
                .fetchOne()
                ?: throw Exception("Error inserting experience")

            repeat(20) {
                ctx
                    .insertInto(MESSAGE)
                    .columns(MESSAGE.EXPERIENCE_ID)
                    .values(experience.id)
                    .returning(MESSAGE.ID)
                    .fetchOne()
            }

            experience
        }

        // ----- Test

        repeat(5) {

            val targetIds = experiences.map { it.id }.toSet()
            // Create a "fake" table of values containing the target IDs.
            val targetRows = targetIds.map { row(it) }
            val tmpTable = values(*targetRows.toTypedArray()).`as`("tmp_table", "target_id")

            @Suppress("UNCHECKED_CAST")
            val targetTmpField = tmpTable.field("target_id") as Field<Int>

            val result = ctx
                .select()
                .from(
                    tmpTable,
                    lateral(
                        select(*MESSAGE.fields()) // This selects all the fields of Message
                            .distinctOn(MESSAGE.ID) // This should have no impact here
                            .from(MESSAGE)
                            .where(MESSAGE.EXPERIENCE_ID.eq(targetTmpField)) // Joining against the tmp_table
                    ).`as`(MESSAGE) // This will be the message table here.
                )
                .fetch()

            val start = java.lang.System.currentTimeMillis()
            val records: List<org.jooq.mcve.java.tables.records.MessageRecord> = result.into(MESSAGE)
            println("Result set contains ${records.size} records")
            val end = java.lang.System.currentTimeMillis()
            println("Result.into() took ${end - start}ms")

        }
    }
}
