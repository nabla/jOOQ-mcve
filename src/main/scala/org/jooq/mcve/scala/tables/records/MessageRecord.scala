/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.scala.tables.records


import java.lang.Boolean
import java.lang.Integer
import java.lang.String
import java.time.OffsetDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record13
import org.jooq.Row13
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.mcve.scala.tables.Message


/**
 * This class is generated by jOOQ.
 */
class MessageRecord extends UpdatableRecordImpl[MessageRecord](Message.MESSAGE) with Record13[Integer, OffsetDateTime, OffsetDateTime, Integer, String, String, Integer, Integer, Integer, Boolean, String, Boolean, Boolean] {

  /**
   * Setter for <code>mcve.message.id</code>.
   */
  def setId(value: Integer): Unit = {
    set(0, value)
  }

  /**
   * Getter for <code>mcve.message.id</code>.
   */
  def getId: Integer = get(0).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.message.created_at</code>.
   */
  def setCreatedAt(value: OffsetDateTime): Unit = {
    set(1, value)
  }

  /**
   * Getter for <code>mcve.message.created_at</code>.
   */
  def getCreatedAt: OffsetDateTime = get(1).asInstanceOf[OffsetDateTime]

  /**
   * Setter for <code>mcve.message.event_time</code>.
   */
  def setEventTime(value: OffsetDateTime): Unit = {
    set(2, value)
  }

  /**
   * Getter for <code>mcve.message.event_time</code>.
   */
  def getEventTime: OffsetDateTime = get(2).asInstanceOf[OffsetDateTime]

  /**
   * Setter for <code>mcve.message.experience_id</code>.
   */
  def setExperienceId(value: Integer): Unit = {
    set(3, value)
  }

  /**
   * Getter for <code>mcve.message.experience_id</code>.
   */
  def getExperienceId: Integer = get(3).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.message.text_content</code>.
   */
  def setTextContent(value: String): Unit = {
    set(4, value)
  }

  /**
   * Getter for <code>mcve.message.text_content</code>.
   */
  def getTextContent: String = get(4).asInstanceOf[String]

  /**
   * Setter for <code>mcve.message.type</code>.
   */
  def setType(value: String): Unit = {
    set(5, value)
  }

  /**
   * Getter for <code>mcve.message.type</code>.
   */
  def getType: String = get(5).asInstanceOf[String]

  /**
   * Setter for <code>mcve.message.doctor_id</code>.
   */
  def setDoctorId(value: Integer): Unit = {
    set(6, value)
  }

  /**
   * Getter for <code>mcve.message.doctor_id</code>.
   */
  def getDoctorId: Integer = get(6).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.message.file_upload_id</code>.
   */
  def setFileUploadId(value: Integer): Unit = {
    set(7, value)
  }

  /**
   * Getter for <code>mcve.message.file_upload_id</code>.
   */
  def getFileUploadId: Integer = get(7).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.message.reply_message_id</code>.
   */
  def setReplyMessageId(value: Integer): Unit = {
    set(8, value)
  }

  /**
   * Getter for <code>mcve.message.reply_message_id</code>.
   */
  def getReplyMessageId: Integer = get(8).asInstanceOf[Integer]

  /**
   * Setter for <code>mcve.message.is_reply</code>.
   */
  def setIsReply(value: Boolean): Unit = {
    set(9, value)
  }

  /**
   * Getter for <code>mcve.message.is_reply</code>.
   */
  def getIsReply: Boolean = get(9).asInstanceOf[Boolean]

  /**
   * Setter for <code>mcve.message.sender_type</code>.
   */
  def setSenderType(value: String): Unit = {
    set(10, value)
  }

  /**
   * Getter for <code>mcve.message.sender_type</code>.
   */
  def getSenderType: String = get(10).asInstanceOf[String]

  /**
   * Setter for <code>mcve.message.is_automatic</code>.
   */
  def setIsAutomatic(value: Boolean): Unit = {
    set(11, value)
  }

  /**
   * Getter for <code>mcve.message.is_automatic</code>.
   */
  def getIsAutomatic: Boolean = get(11).asInstanceOf[Boolean]

  /**
   * Setter for <code>mcve.message.has_deleted_content</code>.
   */
  def setHasDeletedContent(value: Boolean): Unit = {
    set(12, value)
  }

  /**
   * Getter for <code>mcve.message.has_deleted_content</code>.
   */
  def getHasDeletedContent: Boolean = get(12).asInstanceOf[Boolean]

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  override def key: Record1[Integer] = super.key.asInstanceOf[ Record1[Integer] ]

  // -------------------------------------------------------------------------
  // Record13 type implementation
  // -------------------------------------------------------------------------

  override def fieldsRow: Row13[Integer, OffsetDateTime, OffsetDateTime, Integer, String, String, Integer, Integer, Integer, Boolean, String, Boolean, Boolean] = super.fieldsRow.asInstanceOf[ Row13[Integer, OffsetDateTime, OffsetDateTime, Integer, String, String, Integer, Integer, Integer, Boolean, String, Boolean, Boolean] ]

  override def valuesRow: Row13[Integer, OffsetDateTime, OffsetDateTime, Integer, String, String, Integer, Integer, Integer, Boolean, String, Boolean, Boolean] = super.valuesRow.asInstanceOf[ Row13[Integer, OffsetDateTime, OffsetDateTime, Integer, String, String, Integer, Integer, Integer, Boolean, String, Boolean, Boolean] ]
  override def field1: Field[Integer] = Message.MESSAGE.ID
  override def field2: Field[OffsetDateTime] = Message.MESSAGE.CREATED_AT
  override def field3: Field[OffsetDateTime] = Message.MESSAGE.EVENT_TIME
  override def field4: Field[Integer] = Message.MESSAGE.EXPERIENCE_ID
  override def field5: Field[String] = Message.MESSAGE.TEXT_CONTENT
  override def field6: Field[String] = Message.MESSAGE.TYPE
  override def field7: Field[Integer] = Message.MESSAGE.DOCTOR_ID
  override def field8: Field[Integer] = Message.MESSAGE.FILE_UPLOAD_ID
  override def field9: Field[Integer] = Message.MESSAGE.REPLY_MESSAGE_ID
  override def field10: Field[Boolean] = Message.MESSAGE.IS_REPLY
  override def field11: Field[String] = Message.MESSAGE.SENDER_TYPE
  override def field12: Field[Boolean] = Message.MESSAGE.IS_AUTOMATIC
  override def field13: Field[Boolean] = Message.MESSAGE.HAS_DELETED_CONTENT
  override def component1: Integer = getId
  override def component2: OffsetDateTime = getCreatedAt
  override def component3: OffsetDateTime = getEventTime
  override def component4: Integer = getExperienceId
  override def component5: String = getTextContent
  override def component6: String = getType
  override def component7: Integer = getDoctorId
  override def component8: Integer = getFileUploadId
  override def component9: Integer = getReplyMessageId
  override def component10: Boolean = getIsReply
  override def component11: String = getSenderType
  override def component12: Boolean = getIsAutomatic
  override def component13: Boolean = getHasDeletedContent
  override def value1: Integer = getId
  override def value2: OffsetDateTime = getCreatedAt
  override def value3: OffsetDateTime = getEventTime
  override def value4: Integer = getExperienceId
  override def value5: String = getTextContent
  override def value6: String = getType
  override def value7: Integer = getDoctorId
  override def value8: Integer = getFileUploadId
  override def value9: Integer = getReplyMessageId
  override def value10: Boolean = getIsReply
  override def value11: String = getSenderType
  override def value12: Boolean = getIsAutomatic
  override def value13: Boolean = getHasDeletedContent

  override def value1(value: Integer): MessageRecord = {
    setId(value)
    this
  }

  override def value2(value: OffsetDateTime): MessageRecord = {
    setCreatedAt(value)
    this
  }

  override def value3(value: OffsetDateTime): MessageRecord = {
    setEventTime(value)
    this
  }

  override def value4(value: Integer): MessageRecord = {
    setExperienceId(value)
    this
  }

  override def value5(value: String): MessageRecord = {
    setTextContent(value)
    this
  }

  override def value6(value: String): MessageRecord = {
    setType(value)
    this
  }

  override def value7(value: Integer): MessageRecord = {
    setDoctorId(value)
    this
  }

  override def value8(value: Integer): MessageRecord = {
    setFileUploadId(value)
    this
  }

  override def value9(value: Integer): MessageRecord = {
    setReplyMessageId(value)
    this
  }

  override def value10(value: Boolean): MessageRecord = {
    setIsReply(value)
    this
  }

  override def value11(value: String): MessageRecord = {
    setSenderType(value)
    this
  }

  override def value12(value: Boolean): MessageRecord = {
    setIsAutomatic(value)
    this
  }

  override def value13(value: Boolean): MessageRecord = {
    setHasDeletedContent(value)
    this
  }

  override def values(value1 : Integer, value2 : OffsetDateTime, value3 : OffsetDateTime, value4 : Integer, value5 : String, value6 : String, value7 : Integer, value8 : Integer, value9 : Integer, value10 : Boolean, value11 : String, value12 : Boolean, value13 : Boolean): MessageRecord = {
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
    this
  }

  /**
   * Create a detached, initialised MessageRecord
   */
  def this(id : Integer, createdAt : OffsetDateTime, eventTime : OffsetDateTime, experienceId : Integer, textContent : String, `type` : String, doctorId : Integer, fileUploadId : Integer, replyMessageId : Integer, isReply : Boolean, senderType : String, isAutomatic : Boolean, hasDeletedContent : Boolean) = {
    this()

    this.setId(id)
    this.setCreatedAt(createdAt)
    this.setEventTime(eventTime)
    this.setExperienceId(experienceId)
    this.setTextContent(textContent)
    this.setType(`type`)
    this.setDoctorId(doctorId)
    this.setFileUploadId(fileUploadId)
    this.setReplyMessageId(replyMessageId)
    this.setIsReply(isReply)
    this.setSenderType(senderType)
    this.setIsAutomatic(isAutomatic)
    this.setHasDeletedContent(hasDeletedContent)
  }
}
