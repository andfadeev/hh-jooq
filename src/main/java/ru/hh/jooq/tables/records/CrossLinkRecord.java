/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.CrossLink;


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
public class CrossLinkRecord extends UpdatableRecordImpl<CrossLinkRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1451305792;

    /**
     * Setter for <code>public.cross_link.area_from</code>.
     */
    public void setAreaFrom(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cross_link.area_from</code>.
     */
    public Integer getAreaFrom() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.cross_link.area_to</code>.
     */
    public void setAreaTo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cross_link.area_to</code>.
     */
    public Integer getAreaTo() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
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
        return CrossLink.CROSS_LINK.AREA_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CrossLink.CROSS_LINK.AREA_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAreaFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAreaTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossLinkRecord value1(Integer value) {
        setAreaFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossLinkRecord value2(Integer value) {
        setAreaTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossLinkRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CrossLinkRecord
     */
    public CrossLinkRecord() {
        super(CrossLink.CROSS_LINK);
    }

    /**
     * Create a detached, initialised CrossLinkRecord
     */
    public CrossLinkRecord(Integer areaFrom, Integer areaTo) {
        super(CrossLink.CROSS_LINK);

        set(0, areaFrom);
        set(1, areaTo);
    }
}