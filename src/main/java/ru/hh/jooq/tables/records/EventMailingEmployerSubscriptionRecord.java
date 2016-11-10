/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EventMailingEmployerSubscription;


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
public class EventMailingEmployerSubscriptionRecord extends UpdatableRecordImpl<EventMailingEmployerSubscriptionRecord> implements Record5<Integer, Integer, LocalDate, String, Boolean> {

    private static final long serialVersionUID = -650341567;

    /**
     * Setter for <code>public.event_mailing_employer_subscription.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.event_mailing_employer_subscription.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.event_mailing_employer_subscription.block_mask</code>.
     */
    public void setBlockMask(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.event_mailing_employer_subscription.block_mask</code>.
     */
    public Integer getBlockMask() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.event_mailing_employer_subscription.last_processed_date</code>.
     */
    public void setLastProcessedDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.event_mailing_employer_subscription.last_processed_date</code>.
     */
    public LocalDate getLastProcessedDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>public.event_mailing_employer_subscription.guid</code>.
     */
    public void setGuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.event_mailing_employer_subscription.guid</code>.
     */
    public String getGuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.event_mailing_employer_subscription.active</code>.
     */
    public void setActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.event_mailing_employer_subscription.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, LocalDate, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, LocalDate, String, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION.BLOCK_MASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field3() {
        return EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION.LAST_PROCESSED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBlockMask();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value3() {
        return getLastProcessedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord value2(Integer value) {
        setBlockMask(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord value3(LocalDate value) {
        setLastProcessedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord value4(String value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord value5(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerSubscriptionRecord values(Integer value1, Integer value2, LocalDate value3, String value4, Boolean value5) {
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
     * Create a detached EventMailingEmployerSubscriptionRecord
     */
    public EventMailingEmployerSubscriptionRecord() {
        super(EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised EventMailingEmployerSubscriptionRecord
     */
    public EventMailingEmployerSubscriptionRecord(Integer userId, Integer blockMask, LocalDate lastProcessedDate, String guid, Boolean active) {
        super(EventMailingEmployerSubscription.EVENT_MAILING_EMPLOYER_SUBSCRIPTION);

        set(0, userId);
        set(1, blockMask);
        set(2, lastProcessedDate);
        set(3, guid);
        set(4, active);
    }
}
