/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumeViewStatistic;


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
public class ResumeViewStatisticRecord extends UpdatableRecordImpl<ResumeViewStatisticRecord> implements Record3<LocalDate, Integer, Integer> {

    private static final long serialVersionUID = -677854215;

    /**
     * Setter for <code>public.resume_view_statistic.date</code>.
     */
    public void setDate(LocalDate value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_view_statistic.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(0);
    }

    /**
     * Setter for <code>public.resume_view_statistic.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_view_statistic.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_view_statistic.view_count</code>.
     */
    public void setViewCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_view_statistic.view_count</code>.
     */
    public Integer getViewCount() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, LocalDate> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<LocalDate, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<LocalDate, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field1() {
        return ResumeViewStatistic.RESUME_VIEW_STATISTIC.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeViewStatistic.RESUME_VIEW_STATISTIC.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumeViewStatistic.RESUME_VIEW_STATISTIC.VIEW_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value1() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getViewCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewStatisticRecord value1(LocalDate value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewStatisticRecord value2(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewStatisticRecord value3(Integer value) {
        setViewCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewStatisticRecord values(LocalDate value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumeViewStatisticRecord
     */
    public ResumeViewStatisticRecord() {
        super(ResumeViewStatistic.RESUME_VIEW_STATISTIC);
    }

    /**
     * Create a detached, initialised ResumeViewStatisticRecord
     */
    public ResumeViewStatisticRecord(LocalDate date, Integer employerManagerId, Integer viewCount) {
        super(ResumeViewStatistic.RESUME_VIEW_STATISTIC);

        set(0, date);
        set(1, employerManagerId);
        set(2, viewCount);
    }
}
