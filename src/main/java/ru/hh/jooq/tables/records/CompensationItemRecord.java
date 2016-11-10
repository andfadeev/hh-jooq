/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.CompensationItem;


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
public class CompensationItemRecord extends UpdatableRecordImpl<CompensationItemRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1996529407;

    /**
     * Setter for <code>public.compensation_item.compensation_item_id</code>.
     */
    public void setCompensationItemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.compensation_item.compensation_item_id</code>.
     */
    public Integer getCompensationItemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.compensation_item.compensation_id</code>.
     */
    public void setCompensationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.compensation_item.compensation_id</code>.
     */
    public Integer getCompensationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.compensation_item.employer_service_id</code>.
     */
    public void setEmployerServiceId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.compensation_item.employer_service_id</code>.
     */
    public Integer getEmployerServiceId() {
        return (Integer) get(2);
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
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CompensationItem.COMPENSATION_ITEM.COMPENSATION_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CompensationItem.COMPENSATION_ITEM.COMPENSATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CompensationItem.COMPENSATION_ITEM.EMPLOYER_SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCompensationItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCompensationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEmployerServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompensationItemRecord value1(Integer value) {
        setCompensationItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompensationItemRecord value2(Integer value) {
        setCompensationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompensationItemRecord value3(Integer value) {
        setEmployerServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompensationItemRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompensationItemRecord
     */
    public CompensationItemRecord() {
        super(CompensationItem.COMPENSATION_ITEM);
    }

    /**
     * Create a detached, initialised CompensationItemRecord
     */
    public CompensationItemRecord(Integer compensationItemId, Integer compensationId, Integer employerServiceId) {
        super(CompensationItem.COMPENSATION_ITEM);

        set(0, compensationItemId);
        set(1, compensationId);
        set(2, employerServiceId);
    }
}