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

import ru.hh.jooq.tables.TariffGroup;


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
public class TariffGroupRecord extends UpdatableRecordImpl<TariffGroupRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 663874483;

    /**
     * Setter for <code>public.tariff_group.priority</code>.
     */
    public void setPriority(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tariff_group.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.tariff_group.tariff_group_id</code>.
     */
    public void setTariffGroupId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tariff_group.tariff_group_id</code>.
     */
    public String getTariffGroupId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tariff_group.seller_account_id</code>.
     */
    public void setSellerAccountId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tariff_group.seller_account_id</code>.
     */
    public Integer getSellerAccountId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TariffGroup.TARIFF_GROUP.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TariffGroup.TARIFF_GROUP.TARIFF_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TariffGroup.TARIFF_GROUP.SELLER_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTariffGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSellerAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TariffGroupRecord value1(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TariffGroupRecord value2(String value) {
        setTariffGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TariffGroupRecord value3(Integer value) {
        setSellerAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TariffGroupRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TariffGroupRecord
     */
    public TariffGroupRecord() {
        super(TariffGroup.TARIFF_GROUP);
    }

    /**
     * Create a detached, initialised TariffGroupRecord
     */
    public TariffGroupRecord(Integer priority, String tariffGroupId, Integer sellerAccountId) {
        super(TariffGroup.TARIFF_GROUP);

        set(0, priority);
        set(1, tariffGroupId);
        set(2, sellerAccountId);
    }
}
