/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumeView;


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
public class ResumeViewRecord extends UpdatableRecordImpl<ResumeViewRecord> implements Record4<Integer, Integer, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1030640210;

    /**
     * Setter for <code>public.resume_view.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_view.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_view.count_</code>.
     */
    public void setCount_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_view.count_</code>.
     */
    public Integer getCount_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_view.new_count</code>.
     */
    public void setNewCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_view.new_count</code>.
     */
    public Integer getNewCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.resume_view.last_history_visit</code>.
     */
    public void setLastHistoryVisit(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_view.last_history_visit</code>.
     */
    public LocalDateTime getLastHistoryVisit() {
        return (LocalDateTime) get(3);
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
    public Row4<Integer, Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeView.RESUME_VIEW.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeView.RESUME_VIEW.COUNT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumeView.RESUME_VIEW.NEW_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return ResumeView.RESUME_VIEW.LAST_HISTORY_VISIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeId();
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
    public Integer value3() {
        return getNewCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getLastHistoryVisit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewRecord value1(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewRecord value2(Integer value) {
        setCount_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewRecord value3(Integer value) {
        setNewCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewRecord value4(LocalDateTime value) {
        setLastHistoryVisit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewRecord values(Integer value1, Integer value2, Integer value3, LocalDateTime value4) {
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
     * Create a detached ResumeViewRecord
     */
    public ResumeViewRecord() {
        super(ResumeView.RESUME_VIEW);
    }

    /**
     * Create a detached, initialised ResumeViewRecord
     */
    public ResumeViewRecord(Integer resumeId, Integer count_, Integer newCount, LocalDateTime lastHistoryVisit) {
        super(ResumeView.RESUME_VIEW);

        set(0, resumeId);
        set(1, count_);
        set(2, newCount);
        set(3, lastHistoryVisit);
    }
}
