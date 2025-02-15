/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.java.tables.records;


import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.mcve.java.tables.Experience;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperienceRecord extends UpdatableRecordImpl<ExperienceRecord> implements Record8<Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mcve.experience.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mcve.experience.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mcve.experience.last_modified</code>.
     */
    public void setLastModified(OffsetDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>mcve.experience.last_modified</code>.
     */
    public OffsetDateTime getLastModified() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>mcve.experience.patient_typing_at</code>.
     */
    public void setPatientTypingAt(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>mcve.experience.patient_typing_at</code>.
     */
    public OffsetDateTime getPatientTypingAt() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>mcve.experience.patient_seen_until</code>.
     */
    public void setPatientSeenUntil(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>mcve.experience.patient_seen_until</code>.
     */
    public OffsetDateTime getPatientSeenUntil() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>mcve.experience.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>mcve.experience.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>mcve.experience.closed_at</code>.
     */
    public void setClosedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>mcve.experience.closed_at</code>.
     */
    public OffsetDateTime getClosedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>mcve.experience.title</code>.
     */
    public void setTitle(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mcve.experience.title</code>.
     */
    public String getTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mcve.experience.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mcve.experience.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Experience.EXPERIENCE.ID;
    }

    @Override
    public Field<OffsetDateTime> field2() {
        return Experience.EXPERIENCE.LAST_MODIFIED;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return Experience.EXPERIENCE.PATIENT_TYPING_AT;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return Experience.EXPERIENCE.PATIENT_SEEN_UNTIL;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return Experience.EXPERIENCE.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Experience.EXPERIENCE.CLOSED_AT;
    }

    @Override
    public Field<String> field7() {
        return Experience.EXPERIENCE.TITLE;
    }

    @Override
    public Field<String> field8() {
        return Experience.EXPERIENCE.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public OffsetDateTime component2() {
        return getLastModified();
    }

    @Override
    public OffsetDateTime component3() {
        return getPatientTypingAt();
    }

    @Override
    public OffsetDateTime component4() {
        return getPatientSeenUntil();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component6() {
        return getClosedAt();
    }

    @Override
    public String component7() {
        return getTitle();
    }

    @Override
    public String component8() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public OffsetDateTime value2() {
        return getLastModified();
    }

    @Override
    public OffsetDateTime value3() {
        return getPatientTypingAt();
    }

    @Override
    public OffsetDateTime value4() {
        return getPatientSeenUntil();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value6() {
        return getClosedAt();
    }

    @Override
    public String value7() {
        return getTitle();
    }

    @Override
    public String value8() {
        return getDescription();
    }

    @Override
    public ExperienceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ExperienceRecord value2(OffsetDateTime value) {
        setLastModified(value);
        return this;
    }

    @Override
    public ExperienceRecord value3(OffsetDateTime value) {
        setPatientTypingAt(value);
        return this;
    }

    @Override
    public ExperienceRecord value4(OffsetDateTime value) {
        setPatientSeenUntil(value);
        return this;
    }

    @Override
    public ExperienceRecord value5(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ExperienceRecord value6(OffsetDateTime value) {
        setClosedAt(value);
        return this;
    }

    @Override
    public ExperienceRecord value7(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public ExperienceRecord value8(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ExperienceRecord values(Integer value1, OffsetDateTime value2, OffsetDateTime value3, OffsetDateTime value4, OffsetDateTime value5, OffsetDateTime value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExperienceRecord
     */
    public ExperienceRecord() {
        super(Experience.EXPERIENCE);
    }

    /**
     * Create a detached, initialised ExperienceRecord
     */
    public ExperienceRecord(Integer id, OffsetDateTime lastModified, OffsetDateTime patientTypingAt, OffsetDateTime patientSeenUntil, OffsetDateTime createdAt, OffsetDateTime closedAt, String title, String description) {
        super(Experience.EXPERIENCE);

        setId(id);
        setLastModified(lastModified);
        setPatientTypingAt(patientTypingAt);
        setPatientSeenUntil(patientSeenUntil);
        setCreatedAt(createdAt);
        setClosedAt(closedAt);
        setTitle(title);
        setDescription(description);
    }
}
