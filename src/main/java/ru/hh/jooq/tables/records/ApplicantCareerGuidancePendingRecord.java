/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ApplicantCareerGuidancePending;


/**
 * Записи ожидания оплаты сервиса профориентация
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApplicantCareerGuidancePendingRecord extends UpdatableRecordImpl<ApplicantCareerGuidancePendingRecord> implements Record7<Integer, LocalDateTime, Integer, String, Integer, String, String> {

    private static final long serialVersionUID = -817202452;

    /**
     * Setter for <code>public.applicant_career_guidance_pending.pending_id</code>.
     */
    public void setPendingId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.pending_id</code>.
     */
    public Integer getPendingId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.application_date</code>.
     */
    public void setApplicationDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.application_date</code>.
     */
    public LocalDateTime getApplicationDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.test_uid</code>.
     */
    public void setTestUid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.test_uid</code>.
     */
    public String getTestUid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.lang</code>.
     */
    public void setLang(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.lang</code>.
     */
    public String getLang() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.applicant_career_guidance_pending.source</code>.
     */
    public void setSource(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.applicant_career_guidance_pending.source</code>.
     */
    public String getSource() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, LocalDateTime, Integer, String, Integer, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, LocalDateTime, Integer, String, Integer, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.PENDING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.APPLICATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.TEST_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPendingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getApplicationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTestUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value1(Integer value) {
        setPendingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value2(LocalDateTime value) {
        setApplicationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value4(String value) {
        setTestUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value5(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value6(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord value7(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantCareerGuidancePendingRecord values(Integer value1, LocalDateTime value2, Integer value3, String value4, Integer value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicantCareerGuidancePendingRecord
     */
    public ApplicantCareerGuidancePendingRecord() {
        super(ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING);
    }

    /**
     * Create a detached, initialised ApplicantCareerGuidancePendingRecord
     */
    public ApplicantCareerGuidancePendingRecord(Integer pendingId, LocalDateTime applicationDate, Integer userId, String testUid, Integer siteId, String lang, String source) {
        super(ApplicantCareerGuidancePending.APPLICANT_CAREER_GUIDANCE_PENDING);

        set(0, pendingId);
        set(1, applicationDate);
        set(2, userId);
        set(3, testUid);
        set(4, siteId);
        set(5, lang);
        set(6, source);
    }
}