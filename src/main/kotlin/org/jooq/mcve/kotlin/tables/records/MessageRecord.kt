/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin.tables.records


import java.time.OffsetDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record13
import org.jooq.Row13
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.mcve.kotlin.tables.Message


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class MessageRecord() : UpdatableRecordImpl<MessageRecord>(Message.MESSAGE), Record13<Int?, OffsetDateTime?, OffsetDateTime?, Int?, String?, String?, Int?, Int?, Int?, Boolean?, String?, Boolean?, Boolean?> {

    var id: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var createdAt: OffsetDateTime?
        set(value) = set(1, value)
        get() = get(1) as OffsetDateTime?

    var eventTime: OffsetDateTime?
        set(value) = set(2, value)
        get() = get(2) as OffsetDateTime?

    var experienceId: Int?
        set(value) = set(3, value)
        get() = get(3) as Int?

    var textContent: String?
        set(value) = set(4, value)
        get() = get(4) as String?

    var type: String?
        set(value) = set(5, value)
        get() = get(5) as String?

    var doctorId: Int?
        set(value) = set(6, value)
        get() = get(6) as Int?

    var fileUploadId: Int?
        set(value) = set(7, value)
        get() = get(7) as Int?

    var replyMessageId: Int?
        set(value) = set(8, value)
        get() = get(8) as Int?

    var isReply: Boolean?
        set(value) = set(9, value)
        get() = get(9) as Boolean?

    var senderType: String?
        set(value) = set(10, value)
        get() = get(10) as String?

    var isAutomatic: Boolean?
        set(value) = set(11, value)
        get() = get(11) as Boolean?

    var hasDeletedContent: Boolean?
        set(value) = set(12, value)
        get() = get(12) as Boolean?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row13<Int?, OffsetDateTime?, OffsetDateTime?, Int?, String?, String?, Int?, Int?, Int?, Boolean?, String?, Boolean?, Boolean?> = super.fieldsRow() as Row13<Int?, OffsetDateTime?, OffsetDateTime?, Int?, String?, String?, Int?, Int?, Int?, Boolean?, String?, Boolean?, Boolean?>
    override fun valuesRow(): Row13<Int?, OffsetDateTime?, OffsetDateTime?, Int?, String?, String?, Int?, Int?, Int?, Boolean?, String?, Boolean?, Boolean?> = super.valuesRow() as Row13<Int?, OffsetDateTime?, OffsetDateTime?, Int?, String?, String?, Int?, Int?, Int?, Boolean?, String?, Boolean?, Boolean?>
    override fun field1(): Field<Int?> = Message.MESSAGE.ID
    override fun field2(): Field<OffsetDateTime?> = Message.MESSAGE.CREATED_AT
    override fun field3(): Field<OffsetDateTime?> = Message.MESSAGE.EVENT_TIME
    override fun field4(): Field<Int?> = Message.MESSAGE.EXPERIENCE_ID
    override fun field5(): Field<String?> = Message.MESSAGE.TEXT_CONTENT
    override fun field6(): Field<String?> = Message.MESSAGE.TYPE
    override fun field7(): Field<Int?> = Message.MESSAGE.DOCTOR_ID
    override fun field8(): Field<Int?> = Message.MESSAGE.FILE_UPLOAD_ID
    override fun field9(): Field<Int?> = Message.MESSAGE.REPLY_MESSAGE_ID
    override fun field10(): Field<Boolean?> = Message.MESSAGE.IS_REPLY
    override fun field11(): Field<String?> = Message.MESSAGE.SENDER_TYPE
    override fun field12(): Field<Boolean?> = Message.MESSAGE.IS_AUTOMATIC
    override fun field13(): Field<Boolean?> = Message.MESSAGE.HAS_DELETED_CONTENT
    override fun component1(): Int? = id
    override fun component2(): OffsetDateTime? = createdAt
    override fun component3(): OffsetDateTime? = eventTime
    override fun component4(): Int? = experienceId
    override fun component5(): String? = textContent
    override fun component6(): String? = type
    override fun component7(): Int? = doctorId
    override fun component8(): Int? = fileUploadId
    override fun component9(): Int? = replyMessageId
    override fun component10(): Boolean? = isReply
    override fun component11(): String? = senderType
    override fun component12(): Boolean? = isAutomatic
    override fun component13(): Boolean? = hasDeletedContent
    override fun value1(): Int? = id
    override fun value2(): OffsetDateTime? = createdAt
    override fun value3(): OffsetDateTime? = eventTime
    override fun value4(): Int? = experienceId
    override fun value5(): String? = textContent
    override fun value6(): String? = type
    override fun value7(): Int? = doctorId
    override fun value8(): Int? = fileUploadId
    override fun value9(): Int? = replyMessageId
    override fun value10(): Boolean? = isReply
    override fun value11(): String? = senderType
    override fun value12(): Boolean? = isAutomatic
    override fun value13(): Boolean? = hasDeletedContent

    override fun value1(value: Int?): MessageRecord {
        this.id = value
        return this
    }

    override fun value2(value: OffsetDateTime?): MessageRecord {
        this.createdAt = value
        return this
    }

    override fun value3(value: OffsetDateTime?): MessageRecord {
        this.eventTime = value
        return this
    }

    override fun value4(value: Int?): MessageRecord {
        this.experienceId = value
        return this
    }

    override fun value5(value: String?): MessageRecord {
        this.textContent = value
        return this
    }

    override fun value6(value: String?): MessageRecord {
        this.type = value
        return this
    }

    override fun value7(value: Int?): MessageRecord {
        this.doctorId = value
        return this
    }

    override fun value8(value: Int?): MessageRecord {
        this.fileUploadId = value
        return this
    }

    override fun value9(value: Int?): MessageRecord {
        this.replyMessageId = value
        return this
    }

    override fun value10(value: Boolean?): MessageRecord {
        this.isReply = value
        return this
    }

    override fun value11(value: String?): MessageRecord {
        this.senderType = value
        return this
    }

    override fun value12(value: Boolean?): MessageRecord {
        this.isAutomatic = value
        return this
    }

    override fun value13(value: Boolean?): MessageRecord {
        this.hasDeletedContent = value
        return this
    }

    override fun values(value1: Int?, value2: OffsetDateTime?, value3: OffsetDateTime?, value4: Int?, value5: String?, value6: String?, value7: Int?, value8: Int?, value9: Int?, value10: Boolean?, value11: String?, value12: Boolean?, value13: Boolean?): MessageRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        this.value8(value8)
        this.value9(value9)
        this.value10(value10)
        this.value11(value11)
        this.value12(value12)
        this.value13(value13)
        return this
    }

    /**
     * Create a detached, initialised MessageRecord
     */
    constructor(id: Int? = null, createdAt: OffsetDateTime? = null, eventTime: OffsetDateTime? = null, experienceId: Int? = null, textContent: String? = null, type: String? = null, doctorId: Int? = null, fileUploadId: Int? = null, replyMessageId: Int? = null, isReply: Boolean? = null, senderType: String? = null, isAutomatic: Boolean? = null, hasDeletedContent: Boolean? = null): this() {
        this.id = id
        this.createdAt = createdAt
        this.eventTime = eventTime
        this.experienceId = experienceId
        this.textContent = textContent
        this.type = type
        this.doctorId = doctorId
        this.fileUploadId = fileUploadId
        this.replyMessageId = replyMessageId
        this.isReply = isReply
        this.senderType = senderType
        this.isAutomatic = isAutomatic
        this.hasDeletedContent = hasDeletedContent
    }
}
