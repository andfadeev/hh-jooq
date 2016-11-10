/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.AccumulativeBonus;


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
public class AccumulativeBonusRecord extends UpdatableRecordImpl<AccumulativeBonusRecord> implements Record3<Integer, BigDecimal, Integer> {

    private static final long serialVersionUID = 351211986;

    /**
     * Setter for <code>public.accumulative_bonus.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.accumulative_bonus.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.accumulative_bonus.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.accumulative_bonus.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.accumulative_bonus.year</code>.
     */
    public void setYear(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.accumulative_bonus.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, BigDecimal, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, BigDecimal, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AccumulativeBonus.ACCUMULATIVE_BONUS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return AccumulativeBonus.ACCUMULATIVE_BONUS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return AccumulativeBonus.ACCUMULATIVE_BONUS.YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccumulativeBonusRecord value1(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccumulativeBonusRecord value2(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccumulativeBonusRecord value3(Integer value) {
        setYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccumulativeBonusRecord values(Integer value1, BigDecimal value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccumulativeBonusRecord
     */
    public AccumulativeBonusRecord() {
        super(AccumulativeBonus.ACCUMULATIVE_BONUS);
    }

    /**
     * Create a detached, initialised AccumulativeBonusRecord
     */
    public AccumulativeBonusRecord(Integer accountId, BigDecimal amount, Integer year) {
        super(AccumulativeBonus.ACCUMULATIVE_BONUS);

        set(0, accountId);
        set(1, amount);
        set(2, year);
    }
}