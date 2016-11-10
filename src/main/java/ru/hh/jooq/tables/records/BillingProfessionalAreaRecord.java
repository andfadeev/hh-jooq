/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.BillingProfessionalArea;


/**
 * Professional Areas supported by billing modules. Has to be synchronized 
 * with HH-side professional_area table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BillingProfessionalAreaRecord extends UpdatableRecordImpl<BillingProfessionalAreaRecord> implements Record3<Integer, String, BigDecimal> {

    private static final long serialVersionUID = -7006342;

    /**
     * Setter for <code>public.billing_professional_area.billing_professional_area_id</code>.
     */
    public void setBillingProfessionalAreaId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.billing_professional_area.billing_professional_area_id</code>.
     */
    public Integer getBillingProfessionalAreaId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.billing_professional_area.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.billing_professional_area.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.billing_professional_area.price_rate</code>.
     */
    public void setPriceRate(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.billing_professional_area.price_rate</code>.
     */
    public BigDecimal getPriceRate() {
        return (BigDecimal) get(2);
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
    public Row3<Integer, String, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BillingProfessionalArea.BILLING_PROFESSIONAL_AREA.BILLING_PROFESSIONAL_AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BillingProfessionalArea.BILLING_PROFESSIONAL_AREA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return BillingProfessionalArea.BILLING_PROFESSIONAL_AREA.PRICE_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getBillingProfessionalAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getPriceRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfessionalAreaRecord value1(Integer value) {
        setBillingProfessionalAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfessionalAreaRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfessionalAreaRecord value3(BigDecimal value) {
        setPriceRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingProfessionalAreaRecord values(Integer value1, String value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BillingProfessionalAreaRecord
     */
    public BillingProfessionalAreaRecord() {
        super(BillingProfessionalArea.BILLING_PROFESSIONAL_AREA);
    }

    /**
     * Create a detached, initialised BillingProfessionalAreaRecord
     */
    public BillingProfessionalAreaRecord(Integer billingProfessionalAreaId, String name, BigDecimal priceRate) {
        super(BillingProfessionalArea.BILLING_PROFESSIONAL_AREA);

        set(0, billingProfessionalAreaId);
        set(1, name);
        set(2, priceRate);
    }
}