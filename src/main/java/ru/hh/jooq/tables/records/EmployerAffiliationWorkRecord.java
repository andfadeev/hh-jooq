/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.EmployerAffiliationWork;


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
public class EmployerAffiliationWorkRecord extends TableRecordImpl<EmployerAffiliationWorkRecord> implements Record4<Integer, Integer, String, LocalDateTime> {

    private static final long serialVersionUID = -1940094952;

    /**
     * Setter for <code>public.employer_affiliation_work.first_employer_id</code>.
     */
    public void setFirstEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_affiliation_work.first_employer_id</code>.
     */
    public Integer getFirstEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_affiliation_work.second_employer_id</code>.
     */
    public void setSecondEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_affiliation_work.second_employer_id</code>.
     */
    public Integer getSecondEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_affiliation_work.unit_of_work</code>.
     */
    public void setUnitOfWork(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_affiliation_work.unit_of_work</code>.
     */
    public String getUnitOfWork() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employer_affiliation_work.creation_timestamp</code>.
     */
    public void setCreationTimestamp(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_affiliation_work.creation_timestamp</code>.
     */
    public LocalDateTime getCreationTimestamp() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK.FIRST_EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK.SECOND_EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK.UNIT_OF_WORK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK.CREATION_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFirstEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSecondEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUnitOfWork();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreationTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationWorkRecord value1(Integer value) {
        setFirstEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationWorkRecord value2(Integer value) {
        setSecondEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationWorkRecord value3(String value) {
        setUnitOfWork(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationWorkRecord value4(LocalDateTime value) {
        setCreationTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationWorkRecord values(Integer value1, Integer value2, String value3, LocalDateTime value4) {
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
     * Create a detached EmployerAffiliationWorkRecord
     */
    public EmployerAffiliationWorkRecord() {
        super(EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK);
    }

    /**
     * Create a detached, initialised EmployerAffiliationWorkRecord
     */
    public EmployerAffiliationWorkRecord(Integer firstEmployerId, Integer secondEmployerId, String unitOfWork, LocalDateTime creationTimestamp) {
        super(EmployerAffiliationWork.EMPLOYER_AFFILIATION_WORK);

        set(0, firstEmployerId);
        set(1, secondEmployerId);
        set(2, unitOfWork);
        set(3, creationTimestamp);
    }
}