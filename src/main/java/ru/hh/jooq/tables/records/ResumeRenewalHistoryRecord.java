/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumeRenewalHistory;


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
public class ResumeRenewalHistoryRecord extends UpdatableRecordImpl<ResumeRenewalHistoryRecord> implements Record8<Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer, String, Integer> {

    private static final long serialVersionUID = 435444695;

    /**
     * Setter for <code>public.resume_renewal_history.resume_renewal_history_id</code>.
     */
    public void setResumeRenewalHistoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.resume_renewal_history_id</code>.
     */
    public Integer getResumeRenewalHistoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_renewal_history.activation_code</code>.
     */
    public void setActivationCode(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.activation_code</code>.
     */
    public Integer getActivationCode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_renewal_history.activation_date</code>.
     */
    public void setActivationDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.activation_date</code>.
     */
    public LocalDateTime getActivationDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.resume_renewal_history.application_date</code>.
     */
    public void setApplicationDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.application_date</code>.
     */
    public LocalDateTime getApplicationDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.resume_renewal_history.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.resume_renewal_history.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.resume_renewal_history.lang</code>.
     */
    public void setLang(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.lang</code>.
     */
    public String getLang() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.resume_renewal_history.source</code>.
     */
    public void setSource(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.resume_renewal_history.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.RESUME_RENEWAL_HISTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.ACTIVATION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.ACTIVATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.APPLICATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ResumeRenewalHistory.RESUME_RENEWAL_HISTORY.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeRenewalHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getActivationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getActivationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getApplicationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value1(Integer value) {
        setResumeRenewalHistoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value2(Integer value) {
        setActivationCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value3(LocalDateTime value) {
        setActivationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value4(LocalDateTime value) {
        setApplicationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value5(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value6(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value7(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord value8(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRenewalHistoryRecord values(Integer value1, Integer value2, LocalDateTime value3, LocalDateTime value4, Integer value5, Integer value6, String value7, Integer value8) {
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
     * Create a detached ResumeRenewalHistoryRecord
     */
    public ResumeRenewalHistoryRecord() {
        super(ResumeRenewalHistory.RESUME_RENEWAL_HISTORY);
    }

    /**
     * Create a detached, initialised ResumeRenewalHistoryRecord
     */
    public ResumeRenewalHistoryRecord(Integer resumeRenewalHistoryId, Integer activationCode, LocalDateTime activationDate, LocalDateTime applicationDate, Integer resumeId, Integer siteId, String lang, Integer source) {
        super(ResumeRenewalHistory.RESUME_RENEWAL_HISTORY);

        set(0, resumeRenewalHistoryId);
        set(1, activationCode);
        set(2, activationDate);
        set(3, applicationDate);
        set(4, resumeId);
        set(5, siteId);
        set(6, lang);
        set(7, source);
    }
}
