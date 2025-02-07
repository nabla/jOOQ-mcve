/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin.tables


import java.time.OffsetDateTime

import kotlin.collections.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.mcve.kotlin.Mcve
import org.jooq.mcve.kotlin.keys.EXPERIENCE_PKEY
import org.jooq.mcve.kotlin.tables.records.ExperienceRecord


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Experience(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, ExperienceRecord>?,
    aliased: Table<ExperienceRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<ExperienceRecord>(
    alias,
    Mcve.MCVE,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mcve.experience</code>
         */
        val EXPERIENCE = Experience()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ExperienceRecord> = ExperienceRecord::class.java

    /**
     * The column <code>mcve.experience.id</code>.
     */
    val ID: TableField<ExperienceRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>mcve.experience.last_modified</code>.
     */
    val LAST_MODIFIED: TableField<ExperienceRecord, OffsetDateTime?> = createField(DSL.name("last_modified"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "")

    /**
     * The column <code>mcve.experience.patient_typing_at</code>.
     */
    val PATIENT_TYPING_AT: TableField<ExperienceRecord, OffsetDateTime?> = createField(DSL.name("patient_typing_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>mcve.experience.patient_seen_until</code>.
     */
    val PATIENT_SEEN_UNTIL: TableField<ExperienceRecord, OffsetDateTime?> = createField(DSL.name("patient_seen_until"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "")

    /**
     * The column <code>mcve.experience.created_at</code>.
     */
    val CREATED_AT: TableField<ExperienceRecord, OffsetDateTime?> = createField(DSL.name("created_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "")

    /**
     * The column <code>mcve.experience.closed_at</code>.
     */
    val CLOSED_AT: TableField<ExperienceRecord, OffsetDateTime?> = createField(DSL.name("closed_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "")

    /**
     * The column <code>mcve.experience.title</code>.
     */
    val TITLE: TableField<ExperienceRecord, String?> = createField(DSL.name("title"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>mcve.experience.description</code>.
     */
    val DESCRIPTION: TableField<ExperienceRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<ExperienceRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<ExperienceRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mcve.experience</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mcve.experience</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mcve.experience</code> table reference
     */
    constructor(): this(DSL.name("experience"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, ExperienceRecord>): this(Internal.createPathAlias(child, key), child, key, EXPERIENCE, null)
    override fun getSchema(): Schema = Mcve.MCVE
    override fun getIdentity(): Identity<ExperienceRecord, Int?> = super.getIdentity() as Identity<ExperienceRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<ExperienceRecord> = EXPERIENCE_PKEY
    override fun getKeys(): List<UniqueKey<ExperienceRecord>> = listOf(EXPERIENCE_PKEY)
    override fun `as`(alias: String): Experience = Experience(DSL.name(alias), this)
    override fun `as`(alias: Name): Experience = Experience(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Experience = Experience(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Experience = Experience(name, null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<Int?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?> = super.fieldsRow() as Row8<Int?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, OffsetDateTime?, String?, String?>
}
