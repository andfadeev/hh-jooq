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

import ru.hh.jooq.tables.ResumeTargetAgencies;


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
public class ResumeTargetAgenciesRecord extends UpdatableRecordImpl<ResumeTargetAgenciesRecord> implements Record10<Integer, LocalDateTime, Integer, Integer, Integer, Integer, String, Integer, String, Integer> {

    private static final long serialVersionUID = 2142858824;

    /**
     * Setter for <code>public.resume_target_agencies.resume_target_agencies_id</code>.
     */
    public void setResumeTargetAgenciesId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.resume_target_agencies_id</code>.
     */
    public Integer getResumeTargetAgenciesId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_target_agencies.activation_time</code>.
     */
    public void setActivationTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.activation_time</code>.
     */
    public LocalDateTime getActivationTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.resume_target_agencies.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.resume_target_agencies.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.resume_target_agencies.professional_area_id</code>.
     */
    public void setProfessionalAreaId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.professional_area_id</code>.
     */
    public Integer getProfessionalAreaId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.resume_target_agencies.top_type</code>.
     */
    public void setTopType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.top_type</code>.
     */
    public Integer getTopType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.resume_target_agencies.activation_uid</code>.
     */
    public void setActivationUid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.activation_uid</code>.
     */
    public String getActivationUid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.resume_target_agencies.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.resume_target_agencies.lang</code>.
     */
    public void setLang(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.lang</code>.
     */
    public String getLang() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.resume_target_agencies.source</code>.
     */
    public void setSource(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.resume_target_agencies.source</code>.
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
    public Row10<Integer, LocalDateTime, Integer, Integer, Integer, Integer, String, Integer, String, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, LocalDateTime, Integer, Integer, Integer, Integer, String, Integer, String, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.RESUME_TARGET_AGENCIES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.ACTIVATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.PROFESSIONAL_AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.TOP_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.ACTIVATION_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ResumeTargetAgencies.RESUME_TARGET_AGENCIES.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeTargetAgenciesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getActivationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getProfessionalAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTopType();
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
    public ResumeTargetAgenciesRecord value1(Integer value) {
        setResumeTargetAgenciesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value2(LocalDateTime value) {
        setActivationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value3(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value4(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value5(Integer value) {
        setProfessionalAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value6(Integer value) {
        setTopType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value7(String value) {
        setActivationUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value8(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value9(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord value10(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeTargetAgenciesRecord values(Integer value1, LocalDateTime value2, Integer value3, Integer value4, Integer value5, Integer value6, String value7, Integer value8, String value9, Integer value10) {
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
     * Create a detached ResumeTargetAgenciesRecord
     */
    public ResumeTargetAgenciesRecord() {
        super(ResumeTargetAgencies.RESUME_TARGET_AGENCIES);
    }

    /**
     * Create a detached, initialised ResumeTargetAgenciesRecord
     */
    public ResumeTargetAgenciesRecord(Integer resumeTargetAgenciesId, LocalDateTime activationTime, Integer areaId, Integer resumeId, Integer professionalAreaId, Integer topType, String activationUid, Integer siteId, String lang, Integer source) {
        super(ResumeTargetAgencies.RESUME_TARGET_AGENCIES);

        set(0, resumeTargetAgenciesId);
        set(1, activationTime);
        set(2, areaId);
        set(3, resumeId);
        set(4, professionalAreaId);
        set(5, topType);
        set(6, activationUid);
        set(7, siteId);
        set(8, lang);
        set(9, source);
    }
}
