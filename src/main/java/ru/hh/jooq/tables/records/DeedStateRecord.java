/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.DeedState;


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
public class DeedStateRecord extends UpdatableRecordImpl<DeedStateRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1554362024;

    /**
     * Setter for <code>public.deed_state.deed_state_id</code>.
     */
    public void setDeedStateId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.deed_state.deed_state_id</code>.
     */
    public Integer getDeedStateId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.deed_state.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.deed_state.name</code>.
     */
    public String getName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DeedState.DEED_STATE.DEED_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DeedState.DEED_STATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDeedStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeedStateRecord value1(Integer value) {
        setDeedStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeedStateRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeedStateRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeedStateRecord
     */
    public DeedStateRecord() {
        super(DeedState.DEED_STATE);
    }

    /**
     * Create a detached, initialised DeedStateRecord
     */
    public DeedStateRecord(Integer deedStateId, String name) {
        super(DeedState.DEED_STATE);

        set(0, deedStateId);
        set(1, name);
    }
}
