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

import ru.hh.jooq.tables.AttestationEducation;


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
public class AttestationEducationRecord extends UpdatableRecordImpl<AttestationEducationRecord> implements Record7<Integer, String, String, String, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = -104247515;

    /**
     * Setter for <code>public.attestation_education.attestation_education_id</code>.
     */
    public void setAttestationEducationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.attestation_education.attestation_education_id</code>.
     */
    public Integer getAttestationEducationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.attestation_education.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.attestation_education.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.attestation_education.organization</code>.
     */
    public void setOrganization(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.attestation_education.organization</code>.
     */
    public String getOrganization() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.attestation_education.result</code>.
     */
    public void setResult(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.attestation_education.result</code>.
     */
    public String getResult() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.attestation_education.end_date</code>.
     */
    public void setEndDate(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.attestation_education.end_date</code>.
     */
    public LocalDateTime getEndDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.attestation_education.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.attestation_education.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.attestation_education.sort_order</code>.
     */
    public void setSortOrder(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.attestation_education.sort_order</code>.
     */
    public Integer getSortOrder() {
        return (Integer) get(6);
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
    public Row7<Integer, String, String, String, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AttestationEducation.ATTESTATION_EDUCATION.ATTESTATION_EDUCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AttestationEducation.ATTESTATION_EDUCATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AttestationEducation.ATTESTATION_EDUCATION.ORGANIZATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AttestationEducation.ATTESTATION_EDUCATION.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return AttestationEducation.ATTESTATION_EDUCATION.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AttestationEducation.ATTESTATION_EDUCATION.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return AttestationEducation.ATTESTATION_EDUCATION.SORT_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAttestationEducationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrganization();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSortOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value1(Integer value) {
        setAttestationEducationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value3(String value) {
        setOrganization(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value4(String value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value5(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value6(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord value7(Integer value) {
        setSortOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttestationEducationRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, Integer value6, Integer value7) {
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
     * Create a detached AttestationEducationRecord
     */
    public AttestationEducationRecord() {
        super(AttestationEducation.ATTESTATION_EDUCATION);
    }

    /**
     * Create a detached, initialised AttestationEducationRecord
     */
    public AttestationEducationRecord(Integer attestationEducationId, String name, String organization, String result, LocalDateTime endDate, Integer resumeId, Integer sortOrder) {
        super(AttestationEducation.ATTESTATION_EDUCATION);

        set(0, attestationEducationId);
        set(1, name);
        set(2, organization);
        set(3, result);
        set(4, endDate);
        set(5, resumeId);
        set(6, sortOrder);
    }
}