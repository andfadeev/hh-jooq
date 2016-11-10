/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Cart;


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
public class CartRecord extends UpdatableRecordImpl<CartRecord> implements Record8<Integer, Integer, Boolean, Boolean, LocalDateTime, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1902752650;

    /**
     * Setter for <code>public.cart.cart_id</code>.
     */
    public void setCartId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.cart.cart_id</code>.
     */
    public Integer getCartId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.cart.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.cart.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.cart.visible</code>.
     */
    public void setVisible(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.cart.visible</code>.
     */
    public Boolean getVisible() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.cart.auto</code>.
     */
    public void setAuto(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.cart.auto</code>.
     */
    public Boolean getAuto() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.cart.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.cart.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.cart.status</code>.
     */
    public void setStatus(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.cart.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.cart.bill_id</code>.
     */
    public void setBillId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.cart.bill_id</code>.
     */
    public Integer getBillId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.cart.bill_type</code>.
     */
    public void setBillType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.cart.bill_type</code>.
     */
    public Integer getBillType() {
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
    public Row8<Integer, Integer, Boolean, Boolean, LocalDateTime, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Boolean, Boolean, LocalDateTime, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Cart.CART.CART_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Cart.CART.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Cart.CART.VISIBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Cart.CART.AUTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return Cart.CART.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Cart.CART.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Cart.CART.BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Cart.CART.BILL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCartId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getVisible();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getAuto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getBillType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value1(Integer value) {
        setCartId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value3(Boolean value) {
        setVisible(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value4(Boolean value) {
        setAuto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value5(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value6(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value7(Integer value) {
        setBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord value8(Integer value) {
        setBillType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CartRecord values(Integer value1, Integer value2, Boolean value3, Boolean value4, LocalDateTime value5, Integer value6, Integer value7, Integer value8) {
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
     * Create a detached CartRecord
     */
    public CartRecord() {
        super(Cart.CART);
    }

    /**
     * Create a detached, initialised CartRecord
     */
    public CartRecord(Integer cartId, Integer accountId, Boolean visible, Boolean auto, LocalDateTime creationTime, Integer status, Integer billId, Integer billType) {
        super(Cart.CART);

        set(0, cartId);
        set(1, accountId);
        set(2, visible);
        set(3, auto);
        set(4, creationTime);
        set(5, status);
        set(6, billId);
        set(7, billType);
    }
}
