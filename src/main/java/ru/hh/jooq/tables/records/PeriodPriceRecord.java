/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.PeriodPrice;


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
public class PeriodPriceRecord extends UpdatableRecordImpl<PeriodPriceRecord> implements Record8<Integer, Integer, Integer, BigDecimal, String, String, Integer, LocalDateTime> {

    private static final long serialVersionUID = -2018666551;

    /**
     * Setter for <code>public.period_price.period</code>.
     */
    public void setPeriod(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.period_price.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.period_price.profarea_id</code>.
     */
    public void setProfareaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.period_price.profarea_id</code>.
     */
    public Integer getProfareaId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.period_price.region_id</code>.
     */
    public void setRegionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.period_price.region_id</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.period_price.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.period_price.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.period_price.currency</code>.
     */
    public void setCurrency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.period_price.currency</code>.
     */
    public String getCurrency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.period_price.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.period_price.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.period_price.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.period_price.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.period_price.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.period_price.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record5<String, Integer, Integer, Integer, String> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, String, String, Integer, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, BigDecimal, String, String, Integer, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PeriodPrice.PERIOD_PRICE.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PeriodPrice.PERIOD_PRICE.PROFAREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PeriodPrice.PERIOD_PRICE.REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return PeriodPrice.PERIOD_PRICE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PeriodPrice.PERIOD_PRICE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PeriodPrice.PERIOD_PRICE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return PeriodPrice.PERIOD_PRICE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return PeriodPrice.PERIOD_PRICE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProfareaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value1(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value2(Integer value) {
        setProfareaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value3(Integer value) {
        setRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value4(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value5(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodPriceRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, String value5, String value6, Integer value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PeriodPriceRecord
     */
    public PeriodPriceRecord() {
        super(PeriodPrice.PERIOD_PRICE);
    }

    /**
     * Create a detached, initialised PeriodPriceRecord
     */
    public PeriodPriceRecord(Integer period, Integer profareaId, Integer regionId, BigDecimal price, String currency, String type, Integer userId, LocalDateTime updateTime) {
        super(PeriodPrice.PERIOD_PRICE);

        set(0, period);
        set(1, profareaId);
        set(2, regionId);
        set(3, price);
        set(4, currency);
        set(5, type);
        set(6, userId);
        set(7, updateTime);
    }
}
