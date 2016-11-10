/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumeTargetEmployer;


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
public class ResumeTargetEmployerRecord extends UpdatableRecordImpl<ResumeTargetEmployerRecord> implements Record10<Integer, Integer, Integer, LocalDateTime, Integer, Integer, String, Integer, String, Integer> {

    private static final long serialVersionUID = -1325334870;

    /**
     * Setter for <code>public.resume_target_employer.resume_target_employer_id</code>.
     */
    public void setResumeTargetEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.resume_target_employer_id</code>.
     */
    public Integer getResumeTargetEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_target_employer.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_target_employer.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.resume_target_employer.activation_time</code>.
     */
    public void setActivationTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.activation_time</code>.
     */
    public LocalDateTime getActivationTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.resume_target_employer.sms_count</code>.
     */
    public void setSmsCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.sms_count</code>.
     */
    public Integer getSmsCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.resume_target_employer.type</code>.
     */
    public void setType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.type</code>.
     */
    public Integer getType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.resume_target_employer.activation_uid</code>.
     */
    public void setActivationUid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.activation_uid</code>.
     */
    public String getActivationUid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.resume_target_employer.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.resume_target_employer.lang</code>.
     */
    public void setLang(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.lang</code>.
     */
    public String getLang() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.resume_target_employer.source</code>.
     */
    public void setSource(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.resume_target_employer.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, LocalDateTime, Integer, Integer, String, Integer, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, LocalDateTime, Integer, Integer, String, Integer, String, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.RESUME_TARGET_EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.ACTIVATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.SMS_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.ACTIVATION_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ResumeTargetEmployer.RESUME_TARGET_EMPLOYER.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeTargetEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerId();
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
        return getActivationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSmsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getActivationUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value1(Integer value) {
        setResumeTargetEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value2(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value3(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value4(LocalDateTime value) {
        setActivationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value5(Integer value) {
        setSmsCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value6(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value7(String value) {
        setActivationUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value8(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value9(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord value10(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetEmployerRecord values(Integer value1, Integer value2, Integer value3, LocalDateTime value4, Integer value5, Integer value6, String value7, Integer value8, String value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumeTargetEmployerRecord
     */
    public ResumeTargetEmployerRecord() {
        super(ResumeTargetEmployer.RESUME_TARGET_EMPLOYER);
    }

    /**
     * Create a detached, initialised ResumeTargetEmployerRecord
     */
    public ResumeTargetEmployerRecord(Integer resumeTargetEmployerId, Integer employerId, Integer resumeId, LocalDateTime activationTime, Integer smsCount, Integer type, String activationUid, Integer siteId, String lang, Integer source) {
        super(ResumeTargetEmployer.RESUME_TARGET_EMPLOYER);

        set(0, resumeTargetEmployerId);
        set(1, employerId);
        set(2, resumeId);
        set(3, activationTime);
        set(4, smsCount);
        set(5, type);
        set(6, activationUid);
        set(7, siteId);
        set(8, lang);
        set(9, source);
    }
}
