/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EmployerManagerRssTemp;


/**
 * Temporary table for employer managers that had use_resume_search_suggestion 
 * = false
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployerManagerRssTempRecord extends UpdatableRecordImpl<EmployerManagerRssTempRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 175013803;

    /**
     * Setter for <code>public.employer_manager_rss_temp.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager_rss_temp.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(0);
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
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerManagerRssTemp.EMPLOYER_MANAGER_RSS_TEMP.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerRssTempRecord value1(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerRssTempRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployerManagerRssTempRecord
     */
    public EmployerManagerRssTempRecord() {
        super(EmployerManagerRssTemp.EMPLOYER_MANAGER_RSS_TEMP);
    }

    /**
     * Create a detached, initialised EmployerManagerRssTempRecord
     */
    public EmployerManagerRssTempRecord(Integer employerManagerId) {
        super(EmployerManagerRssTemp.EMPLOYER_MANAGER_RSS_TEMP);

        set(0, employerManagerId);
    }
}
