/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.SuitableResumesMailingCount;


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
public class SuitableResumesMailingCountRecord extends UpdatableRecordImpl<SuitableResumesMailingCountRecord> implements Record4<Integer, LocalDate, Integer, Integer> {

    private static final long serialVersionUID = -845038723;

    /**
     * Setter for <code>public.suitable_resumes_mailing_count.count_id</code>.
     */
    public void setCountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_mailing_count.count_id</code>.
     */
    public Integer getCountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.suitable_resumes_mailing_count.added</code>.
     */
    public void setAdded(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_mailing_count.added</code>.
     */
    public LocalDate getAdded() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>public.suitable_resumes_mailing_count.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_mailing_count.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.suitable_resumes_mailing_count.mails_sent</code>.
     */
    public void setMailsSent(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_mailing_count.mails_sent</code>.
     */
    public Integer getMailsSent() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, LocalDate, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, LocalDate, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT.COUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field2() {
        return SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT.ADDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT.MAILS_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value2() {
        return getAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMailsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesMailingCountRecord value1(Integer value) {
        setCountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesMailingCountRecord value2(LocalDate value) {
        setAdded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesMailingCountRecord value3(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesMailingCountRecord value4(Integer value) {
        setMailsSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesMailingCountRecord values(Integer value1, LocalDate value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SuitableResumesMailingCountRecord
     */
    public SuitableResumesMailingCountRecord() {
        super(SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT);
    }

    /**
     * Create a detached, initialised SuitableResumesMailingCountRecord
     */
    public SuitableResumesMailingCountRecord(Integer countId, LocalDate added, Integer employerManagerId, Integer mailsSent) {
        super(SuitableResumesMailingCount.SUITABLE_RESUMES_MAILING_COUNT);

        set(0, countId);
        set(1, added);
        set(2, employerManagerId);
        set(3, mailsSent);
    }
}
