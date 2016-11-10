/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumeMarkActive;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResumeMarkActiveRecord extends UpdatableRecordImpl<ResumeMarkActiveRecord> implements Record9<Integer, LocalDateTime, Integer, LocalDateTime, String, LocalDateTime, Integer, String, Integer> {

    private static final long serialVersionUID = 973001573;

    /**
     * Setter for <code>public.resume_mark_active.resume_mark_active_id</code>.
     */
    public void setResumeMarkActiveId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.resume_mark_active_id</code>.
     */
    public Integer getResumeMarkActiveId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_mark_active.activation_date</code>.
     */
    public void setActivationDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.activation_date</code>.
     */
    public LocalDateTime getActivationDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.resume_mark_active.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.resume_mark_active.expire_date</code>.
     */
    public void setExpireDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.expire_date</code>.
     */
    public LocalDateTime getExpireDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.resume_mark_active.activation_uid</code>.
     */
    public void setActivationUid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.activation_uid</code>.
     */
    public String getActivationUid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.resume_mark_active.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.resume_mark_active.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.resume_mark_active.lang</code>.
     */
    public void setLang(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.lang</code>.
     */
    public String getLang() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.resume_mark_active.source</code>.
     */
    public void setSource(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.resume_mark_active.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, LocalDateTime, Integer, LocalDateTime, String, LocalDateTime, Integer, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, LocalDateTime, Integer, LocalDateTime, String, LocalDateTime, Integer, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.RESUME_MARK_ACTIVE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.ACTIVATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.EXPIRE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.ACTIVATION_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ResumeMarkActive.RESUME_MARK_ACTIVE.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeMarkActiveId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getActivationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getExpireDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getActivationUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value1(Integer value) {
        setResumeMarkActiveId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value2(LocalDateTime value) {
        setActivationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value3(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value4(LocalDateTime value) {
        setExpireDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value5(String value) {
        setActivationUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value6(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value7(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value8(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord value9(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeMarkActiveRecord values(Integer value1, LocalDateTime value2, Integer value3, LocalDateTime value4, String value5, LocalDateTime value6, Integer value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumeMarkActiveRecord
     */
    public ResumeMarkActiveRecord() {
        super(ResumeMarkActive.RESUME_MARK_ACTIVE);
    }

    /**
     * Create a detached, initialised ResumeMarkActiveRecord
     */
    public ResumeMarkActiveRecord(Integer resumeMarkActiveId, LocalDateTime activationDate, Integer resumeId, LocalDateTime expireDate, String activationUid, LocalDateTime creationDate, Integer siteId, String lang, Integer source) {
        super(ResumeMarkActive.RESUME_MARK_ACTIVE);

        set(0, resumeMarkActiveId);
        set(1, activationDate);
        set(2, resumeId);
        set(3, expireDate);
        set(4, activationUid);
        set(5, creationDate);
        set(6, siteId);
        set(7, lang);
        set(8, source);
    }
}