/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.MinPaymentAmount;


/**
 * Таблица содержит все правила определения минимального платежа для счетов 
 * в разрезе регионов, типов компаний и типов оплаты
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MinPaymentAmountRecord extends UpdatableRecordImpl<MinPaymentAmountRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -19915288;

    /**
     * Setter for <code>public.min_payment_amount.min_payment_amount_id</code>.
     */
    public void setMinPaymentAmountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.min_payment_amount_id</code>.
     */
    public Integer getMinPaymentAmountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.min_payment_amount.employer_category</code>.
     */
    public void setEmployerCategory(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.employer_category</code>.
     */
    public Integer getEmployerCategory() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.min_payment_amount.payment_type</code>.
     */
    public void setPaymentType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.payment_type</code>.
     */
    public Integer getPaymentType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.min_payment_amount.state</code>.
     */
    public void setState(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.state</code>.
     */
    public Integer getState() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.min_payment_amount.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.min_payment_amount.value_as_cents</code>.
     */
    public void setValueAsCents(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.value_as_cents</code>.
     */
    public Integer getValueAsCents() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.min_payment_amount.priority</code>.
     */
    public void setPriority(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.min_payment_amount.value_as_cents_rollback</code>.
     */
    public void setValueAsCentsRollback(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.min_payment_amount.value_as_cents_rollback</code>.
     */
    public Integer getValueAsCentsRollback() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.MIN_PAYMENT_AMOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.EMPLOYER_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.PAYMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.VALUE_AS_CENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MinPaymentAmount.MIN_PAYMENT_AMOUNT.VALUE_AS_CENTS_ROLLBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMinPaymentAmountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPaymentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getValueAsCents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getValueAsCentsRollback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value1(Integer value) {
        setMinPaymentAmountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value2(Integer value) {
        setEmployerCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value3(Integer value) {
        setPaymentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value4(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value5(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value6(Integer value) {
        setValueAsCents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value7(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord value8(Integer value) {
        setValueAsCentsRollback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MinPaymentAmountRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
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
     * Create a detached MinPaymentAmountRecord
     */
    public MinPaymentAmountRecord() {
        super(MinPaymentAmount.MIN_PAYMENT_AMOUNT);
    }

    /**
     * Create a detached, initialised MinPaymentAmountRecord
     */
    public MinPaymentAmountRecord(Integer minPaymentAmountId, Integer employerCategory, Integer paymentType, Integer state, Integer areaId, Integer valueAsCents, Integer priority, Integer valueAsCentsRollback) {
        super(MinPaymentAmount.MIN_PAYMENT_AMOUNT);

        set(0, minPaymentAmountId);
        set(1, employerCategory);
        set(2, paymentType);
        set(3, state);
        set(4, areaId);
        set(5, valueAsCents);
        set(6, priority);
        set(7, valueAsCentsRollback);
    }
}