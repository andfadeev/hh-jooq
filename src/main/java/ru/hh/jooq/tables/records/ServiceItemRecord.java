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

import ru.hh.jooq.tables.ServiceItem;


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
public class ServiceItemRecord extends UpdatableRecordImpl<ServiceItemRecord> implements Record8<Integer, String, Integer, Boolean, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 316564844;

    /**
     * Setter for <code>public.service_item.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.service_item.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.service_item.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.service_item.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.service_item.new_account_id</code>.
     */
    public void setNewAccountId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.service_item.new_account_id</code>.
     */
    public Integer getNewAccountId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.service_item.ticket_limited</code>.
     */
    public void setTicketLimited(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.service_item.ticket_limited</code>.
     */
    public Boolean getTicketLimited() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.service_item.order_</code>.
     */
    public void setOrder_(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.service_item.order_</code>.
     */
    public Integer getOrder_() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.service_item.max_ticket_uid</code>.
     */
    public void setMaxTicketUid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.service_item.max_ticket_uid</code>.
     */
    public Integer getMaxTicketUid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.service_item.region</code>.
     */
    public void setRegion(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.service_item.region</code>.
     */
    public Integer getRegion() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.service_item.price_region_ids</code>.
     */
    public void setPriceRegionIds(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.service_item.price_region_ids</code>.
     */
    public String getPriceRegionIds() {
        return (String) get(7);
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
    public Row8<Integer, String, Integer, Boolean, Integer, Integer, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Boolean, Integer, Integer, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ServiceItem.SERVICE_ITEM.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ServiceItem.SERVICE_ITEM.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ServiceItem.SERVICE_ITEM.NEW_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return ServiceItem.SERVICE_ITEM.TICKET_LIMITED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ServiceItem.SERVICE_ITEM.ORDER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ServiceItem.SERVICE_ITEM.MAX_TICKET_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ServiceItem.SERVICE_ITEM.REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ServiceItem.SERVICE_ITEM.PRICE_REGION_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getNewAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getTicketLimited();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrder_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMaxTicketUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPriceRegionIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value1(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value3(Integer value) {
        setNewAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value4(Boolean value) {
        setTicketLimited(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value5(Integer value) {
        setOrder_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value6(Integer value) {
        setMaxTicketUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value7(Integer value) {
        setRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord value8(String value) {
        setPriceRegionIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemRecord values(Integer value1, String value2, Integer value3, Boolean value4, Integer value5, Integer value6, Integer value7, String value8) {
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
     * Create a detached ServiceItemRecord
     */
    public ServiceItemRecord() {
        super(ServiceItem.SERVICE_ITEM);
    }

    /**
     * Create a detached, initialised ServiceItemRecord
     */
    public ServiceItemRecord(Integer serviceId, String code, Integer newAccountId, Boolean ticketLimited, Integer order_, Integer maxTicketUid, Integer region, String priceRegionIds) {
        super(ServiceItem.SERVICE_ITEM);

        set(0, serviceId);
        set(1, code);
        set(2, newAccountId);
        set(3, ticketLimited);
        set(4, order_);
        set(5, maxTicketUid);
        set(6, region);
        set(7, priceRegionIds);
    }
}
