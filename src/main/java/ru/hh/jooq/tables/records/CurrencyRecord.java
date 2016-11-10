/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Currency;


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
public class CurrencyRecord extends UpdatableRecordImpl<CurrencyRecord> implements Record5<String, BigDecimal, Boolean, Integer, LocalDateTime> {

    private static final long serialVersionUID = -1681780567;

    /**
     * Setter for <code>public.currency.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.currency.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.currency.rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.currency.rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.currency.masculine</code>.
     */
    public void setMasculine(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.currency.masculine</code>.
     */
    public Boolean getMasculine() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.currency.scale</code>.
     */
    public void setScale(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.currency.scale</code>.
     */
    public Integer getScale() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.currency.last_rate_change_time</code>.
     */
    public void setLastRateChangeTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.currency.last_rate_change_time</code>.
     */
    public LocalDateTime getLastRateChangeTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, BigDecimal, Boolean, Integer, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, BigDecimal, Boolean, Integer, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Currency.CURRENCY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return Currency.CURRENCY.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Currency.CURRENCY.MASCULINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Currency.CURRENCY.SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return Currency.CURRENCY.LAST_RATE_CHANGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getMasculine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getLastRateChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value1(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value2(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value3(Boolean value) {
        setMasculine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value4(Integer value) {
        setScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value5(LocalDateTime value) {
        setLastRateChangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord values(String value1, BigDecimal value2, Boolean value3, Integer value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CurrencyRecord
     */
    public CurrencyRecord() {
        super(Currency.CURRENCY);
    }

    /**
     * Create a detached, initialised CurrencyRecord
     */
    public CurrencyRecord(String code, BigDecimal rate, Boolean masculine, Integer scale, LocalDateTime lastRateChangeTime) {
        super(Currency.CURRENCY);

        set(0, code);
        set(1, rate);
        set(2, masculine);
        set(3, scale);
        set(4, lastRateChangeTime);
    }
}