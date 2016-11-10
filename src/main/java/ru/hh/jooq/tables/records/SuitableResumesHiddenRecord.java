/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.SuitableResumesHidden;


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
public class SuitableResumesHiddenRecord extends UpdatableRecordImpl<SuitableResumesHiddenRecord> implements Record3<Integer, Integer, LocalDateTime> {

    private static final long serialVersionUID = 1310734219;

    /**
     * Setter for <code>public.suitable_resumes_hidden.suitable_resumes_hidden_id</code>.
     */
    public void setSuitableResumesHiddenId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_hidden.suitable_resumes_hidden_id</code>.
     */
    public Integer getSuitableResumesHiddenId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.suitable_resumes_hidden.vacancy_id</code>.
     */
    public void setVacancyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_hidden.vacancy_id</code>.
     */
    public Integer getVacancyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.suitable_resumes_hidden.happened_at</code>.
     */
    public void setHappenedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.suitable_resumes_hidden.happened_at</code>.
     */
    public LocalDateTime getHappenedAt() {
        return (LocalDateTime) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SuitableResumesHidden.SUITABLE_RESUMES_HIDDEN.SUITABLE_RESUMES_HIDDEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SuitableResumesHidden.SUITABLE_RESUMES_HIDDEN.VACANCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return SuitableResumesHidden.SUITABLE_RESUMES_HIDDEN.HAPPENED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSuitableResumesHiddenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getVacancyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getHappenedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesHiddenRecord value1(Integer value) {
        setSuitableResumesHiddenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesHiddenRecord value2(Integer value) {
        setVacancyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesHiddenRecord value3(LocalDateTime value) {
        setHappenedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SuitableResumesHiddenRecord values(Integer value1, Integer value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SuitableResumesHiddenRecord
     */
    public SuitableResumesHiddenRecord() {
        super(SuitableResumesHidden.SUITABLE_RESUMES_HIDDEN);
    }

    /**
     * Create a detached, initialised SuitableResumesHiddenRecord
     */
    public SuitableResumesHiddenRecord(Integer suitableResumesHiddenId, Integer vacancyId, LocalDateTime happenedAt) {
        super(SuitableResumesHidden.SUITABLE_RESUMES_HIDDEN);

        set(0, suitableResumesHiddenId);
        set(1, vacancyId);
        set(2, happenedAt);
    }
}
