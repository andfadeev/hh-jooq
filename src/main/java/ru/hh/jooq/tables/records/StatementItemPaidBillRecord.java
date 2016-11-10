/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.StatementItemPaidBill;


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
public class StatementItemPaidBillRecord extends UpdatableRecordImpl<StatementItemPaidBillRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -603164345;

    /**
     * Setter for <code>public.statement_item_paid_bill.statement_item_id</code>.
     */
    public void setStatementItemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.statement_item_paid_bill.statement_item_id</code>.
     */
    public Integer getStatementItemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.statement_item_paid_bill.bill_id</code>.
     */
    public void setBillId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.statement_item_paid_bill.bill_id</code>.
     */
    public Integer getBillId() {
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
        return StatementItemPaidBill.STATEMENT_ITEM_PAID_BILL.STATEMENT_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StatementItemPaidBill.STATEMENT_ITEM_PAID_BILL.BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStatementItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementItemPaidBillRecord value1(Integer value) {
        setStatementItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementItemPaidBillRecord value2(Integer value) {
        setBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementItemPaidBillRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatementItemPaidBillRecord
     */
    public StatementItemPaidBillRecord() {
        super(StatementItemPaidBill.STATEMENT_ITEM_PAID_BILL);
    }

    /**
     * Create a detached, initialised StatementItemPaidBillRecord
     */
    public StatementItemPaidBillRecord(Integer statementItemId, Integer billId) {
        super(StatementItemPaidBill.STATEMENT_ITEM_PAID_BILL);

        set(0, statementItemId);
        set(1, billId);
    }
}