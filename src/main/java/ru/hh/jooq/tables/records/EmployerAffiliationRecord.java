/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.EmployerAffiliation;


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
public class EmployerAffiliationRecord extends TableRecordImpl<EmployerAffiliationRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -165079063;

    /**
     * Setter for <code>public.employer_affiliation.first_employer_id</code>.
     */
    public void setFirstEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_affiliation.first_employer_id</code>.
     */
    public Integer getFirstEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_affiliation.second_employer_id</code>.
     */
    public void setSecondEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_affiliation.second_employer_id</code>.
     */
    public Integer getSecondEmployerId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerAffiliation.EMPLOYER_AFFILIATION.FIRST_EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerAffiliation.EMPLOYER_AFFILIATION.SECOND_EMPLOYER_ID;
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
    public EmployerAffiliationRecord value1(Integer value) {
        setFirstEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationRecord value2(Integer value) {
        setSecondEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerAffiliationRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployerAffiliationRecord
     */
    public EmployerAffiliationRecord() {
        super(EmployerAffiliation.EMPLOYER_AFFILIATION);
    }

    /**
     * Create a detached, initialised EmployerAffiliationRecord
     */
    public EmployerAffiliationRecord(Integer firstEmployerId, Integer secondEmployerId) {
        super(EmployerAffiliation.EMPLOYER_AFFILIATION);

        set(0, firstEmployerId);
        set(1, secondEmployerId);
    }
}