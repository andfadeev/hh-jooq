/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ServicePeriod;


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
public class ServicePeriodRecord extends UpdatableRecordImpl<ServicePeriodRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1554916137;

    /**
     * Setter for <code>public.service_period.seller_account_id</code>.
     */
    public void setSellerAccountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.service_period.seller_account_id</code>.
     */
    public Integer getSellerAccountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.service_period.period</code>.
     */
    public void setPeriod(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.service_period.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.service_period.days</code>.
     */
    public void setDays(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.service_period.days</code>.
     */
    public Integer getDays() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.service_period.service_period_id</code>.
     */
    public void setServicePeriodId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.service_period.service_period_id</code>.
     */
    public Integer getServicePeriodId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.service_period.agency_days</code>.
     */
    public void setAgencyDays(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.service_period.agency_days</code>.
     */
    public Integer getAgencyDays() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.service_period.publications</code>.
     */
    public void setPublications(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.service_period.publications</code>.
     */
    public Integer getPublications() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ServicePeriod.SERVICE_PERIOD.SELLER_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ServicePeriod.SERVICE_PERIOD.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ServicePeriod.SERVICE_PERIOD.DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ServicePeriod.SERVICE_PERIOD.SERVICE_PERIOD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ServicePeriod.SERVICE_PERIOD.AGENCY_DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ServicePeriod.SERVICE_PERIOD.PUBLICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSellerAccountId();
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
    public Integer value3() {
        return getDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getServicePeriodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAgencyDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPublications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value1(Integer value) {
        setSellerAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value2(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value3(Integer value) {
        setDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value4(Integer value) {
        setServicePeriodId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value5(Integer value) {
        setAgencyDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord value6(Integer value) {
        setPublications(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriodRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServicePeriodRecord
     */
    public ServicePeriodRecord() {
        super(ServicePeriod.SERVICE_PERIOD);
    }

    /**
     * Create a detached, initialised ServicePeriodRecord
     */
    public ServicePeriodRecord(Integer sellerAccountId, Integer period, Integer days, Integer servicePeriodId, Integer agencyDays, Integer publications) {
        super(ServicePeriod.SERVICE_PERIOD);

        set(0, sellerAccountId);
        set(1, period);
        set(2, days);
        set(3, servicePeriodId);
        set(4, agencyDays);
        set(5, publications);
    }
}
