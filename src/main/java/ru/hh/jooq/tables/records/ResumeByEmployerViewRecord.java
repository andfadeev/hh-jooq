/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.ResumeByEmployerView;


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
public class ResumeByEmployerViewRecord extends TableRecordImpl<ResumeByEmployerViewRecord> implements Record3<Integer, Integer, LocalDate> {

    private static final long serialVersionUID = 848104120;

    /**
     * Setter for <code>public.resume_by_employer_view.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_by_employer_view.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_by_employer_view.count_</code>.
     */
    public void setCount_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_by_employer_view.count_</code>.
     */
    public Integer getCount_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_by_employer_view.view_date</code>.
     */
    public void setViewDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_by_employer_view.view_date</code>.
     */
    public LocalDate getViewDate() {
        return (LocalDate) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, LocalDate> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, LocalDate> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeByEmployerView.RESUME_BY_EMPLOYER_VIEW.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeByEmployerView.RESUME_BY_EMPLOYER_VIEW.COUNT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field3() {
        return ResumeByEmployerView.RESUME_BY_EMPLOYER_VIEW.VIEW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCount_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value3() {
        return getViewDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeByEmployerViewRecord value1(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeByEmployerViewRecord value2(Integer value) {
        setCount_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeByEmployerViewRecord value3(LocalDate value) {
        setViewDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeByEmployerViewRecord values(Integer value1, Integer value2, LocalDate value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumeByEmployerViewRecord
     */
    public ResumeByEmployerViewRecord() {
        super(ResumeByEmployerView.RESUME_BY_EMPLOYER_VIEW);
    }

    /**
     * Create a detached, initialised ResumeByEmployerViewRecord
     */
    public ResumeByEmployerViewRecord(Integer employerId, Integer count_, LocalDate viewDate) {
        super(ResumeByEmployerView.RESUME_BY_EMPLOYER_VIEW);

        set(0, employerId);
        set(1, count_);
        set(2, viewDate);
    }
}
