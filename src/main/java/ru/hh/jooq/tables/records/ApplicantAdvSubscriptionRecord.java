/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ApplicantAdvSubscription;


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
public class ApplicantAdvSubscriptionRecord extends UpdatableRecordImpl<ApplicantAdvSubscriptionRecord> implements Record7<Integer, LocalDateTime, Integer, String, Integer, Integer, LocalDateTime> {

    private static final long serialVersionUID = 428544143;

    /**
     * Setter for <code>public.applicant_adv_subscription.applicant_adv_subscription_id</code>.
     */
    public void setApplicantAdvSubscriptionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.applicant_adv_subscription_id</code>.
     */
    public Integer getApplicantAdvSubscriptionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.criteria</code>.
     */
    public void setCriteria(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.criteria</code>.
     */
    public Integer getCriteria() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.guid</code>.
     */
    public void setGuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.guid</code>.
     */
    public String getGuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.retries_left</code>.
     */
    public void setRetriesLeft(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.retries_left</code>.
     */
    public Integer getRetriesLeft() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.applicant_adv_subscription.last_processed_date</code>.
     */
    public void setLastProcessedDate(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.applicant_adv_subscription.last_processed_date</code>.
     */
    public LocalDateTime getLastProcessedDate() {
        return (LocalDateTime) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, LocalDateTime, Integer, String, Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, LocalDateTime, Integer, String, Integer, Integer, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.APPLICANT_ADV_SUBSCRIPTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.CRITERIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.RETRIES_LEFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION.LAST_PROCESSED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getApplicantAdvSubscriptionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCriteria();
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
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRetriesLeft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getLastProcessedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value1(Integer value) {
        setApplicantAdvSubscriptionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value2(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value3(Integer value) {
        setCriteria(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value4(String value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value6(Integer value) {
        setRetriesLeft(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord value7(LocalDateTime value) {
        setLastProcessedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicantAdvSubscriptionRecord values(Integer value1, LocalDateTime value2, Integer value3, String value4, Integer value5, Integer value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicantAdvSubscriptionRecord
     */
    public ApplicantAdvSubscriptionRecord() {
        super(ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised ApplicantAdvSubscriptionRecord
     */
    public ApplicantAdvSubscriptionRecord(Integer applicantAdvSubscriptionId, LocalDateTime creationDate, Integer criteria, String guid, Integer userId, Integer retriesLeft, LocalDateTime lastProcessedDate) {
        super(ApplicantAdvSubscription.APPLICANT_ADV_SUBSCRIPTION);

        set(0, applicantAdvSubscriptionId);
        set(1, creationDate);
        set(2, criteria);
        set(3, guid);
        set(4, userId);
        set(5, retriesLeft);
        set(6, lastProcessedDate);
    }
}
