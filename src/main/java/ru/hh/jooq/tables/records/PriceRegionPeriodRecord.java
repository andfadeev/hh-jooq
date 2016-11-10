/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.PriceRegionPeriod;


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
public class PriceRegionPeriodRecord extends UpdatableRecordImpl<PriceRegionPeriodRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = -1856980362;

    /**
     * Setter for <code>public.price_region_period.price_region_id</code>.
     */
    public void setPriceRegionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.price_region_period.price_region_id</code>.
     */
    public Integer getPriceRegionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.price_region_period.period</code>.
     */
    public void setPeriod(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.price_region_period.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.price_region_period.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.price_region_period.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PriceRegionPeriod.PRICE_REGION_PERIOD.PRICE_REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PriceRegionPeriod.PRICE_REGION_PERIOD.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PriceRegionPeriod.PRICE_REGION_PERIOD.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPriceRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceRegionPeriodRecord value1(Integer value) {
        setPriceRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceRegionPeriodRecord value2(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceRegionPeriodRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceRegionPeriodRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PriceRegionPeriodRecord
     */
    public PriceRegionPeriodRecord() {
        super(PriceRegionPeriod.PRICE_REGION_PERIOD);
    }

    /**
     * Create a detached, initialised PriceRegionPeriodRecord
     */
    public PriceRegionPeriodRecord(Integer priceRegionId, Integer period, String type) {
        super(PriceRegionPeriod.PRICE_REGION_PERIOD);

        set(0, priceRegionId);
        set(1, period);
        set(2, type);
    }
}