/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.CompanySynonym;


/**
 * HH-37617 Create company synonym relation
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanySynonymRecord extends UpdatableRecordImpl<CompanySynonymRecord> implements Record4<String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1467817853;

    /**
     * Setter for <code>public.company_synonym.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.company_synonym.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.company_synonym.company_synonym_id</code>.
     */
    public void setCompanySynonymId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.company_synonym.company_synonym_id</code>.
     */
    public Integer getCompanySynonymId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.company_synonym.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.company_synonym.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.company_synonym.rate</code>.
     */
    public void setRate(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.company_synonym.rate</code>.
     */
    public Integer getRate() {
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
    public Row4<String, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CompanySynonym.COMPANY_SYNONYM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CompanySynonym.COMPANY_SYNONYM.COMPANY_SYNONYM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CompanySynonym.COMPANY_SYNONYM.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CompanySynonym.COMPANY_SYNONYM.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCompanySynonymId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonymRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonymRecord value2(Integer value) {
        setCompanySynonymId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonymRecord value3(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonymRecord value4(Integer value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonymRecord values(String value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached CompanySynonymRecord
     */
    public CompanySynonymRecord() {
        super(CompanySynonym.COMPANY_SYNONYM);
    }

    /**
     * Create a detached, initialised CompanySynonymRecord
     */
    public CompanySynonymRecord(String name, Integer companySynonymId, Integer companyId, Integer rate) {
        super(CompanySynonym.COMPANY_SYNONYM);

        set(0, name);
        set(1, companySynonymId);
        set(2, companyId);
        set(3, rate);
    }
}