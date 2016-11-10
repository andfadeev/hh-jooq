/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.SpecidToDrop;


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
public class SpecidToDropRecord extends TableRecordImpl<SpecidToDropRecord> implements Record1<Long> {

    private static final long serialVersionUID = -887285594;

    /**
     * Setter for <code>public.specid_to_drop.nextval</code>.
     */
    public void setNextval(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.specid_to_drop.nextval</code>.
     */
    public Long getNextval() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return SpecidToDrop.SPECID_TO_DROP.NEXTVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNextval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecidToDropRecord value1(Long value) {
        setNextval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecidToDropRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpecidToDropRecord
     */
    public SpecidToDropRecord() {
        super(SpecidToDrop.SPECID_TO_DROP);
    }

    /**
     * Create a detached, initialised SpecidToDropRecord
     */
    public SpecidToDropRecord(Long nextval) {
        super(SpecidToDrop.SPECID_TO_DROP);

        set(0, nextval);
    }
}