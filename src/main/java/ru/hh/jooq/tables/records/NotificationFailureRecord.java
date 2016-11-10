/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.NotificationFailure;


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
public class NotificationFailureRecord extends UpdatableRecordImpl<NotificationFailureRecord> implements Record4<Long, Integer, LocalDateTime, String> {

    private static final long serialVersionUID = 1644089417;

    /**
     * Setter for <code>public.notification_failure.notification_failure_id</code>.
     */
    public void setNotificationFailureId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.notification_failure.notification_failure_id</code>.
     */
    public Long getNotificationFailureId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.notification_failure.device_id</code>.
     */
    public void setDeviceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.notification_failure.device_id</code>.
     */
    public Integer getDeviceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.notification_failure.failure_datetime</code>.
     */
    public void setFailureDatetime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.notification_failure.failure_datetime</code>.
     */
    public LocalDateTime getFailureDatetime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.notification_failure.failure_cause</code>.
     */
    public void setFailureCause(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.notification_failure.failure_cause</code>.
     */
    public String getFailureCause() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Integer, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Integer, LocalDateTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return NotificationFailure.NOTIFICATION_FAILURE.NOTIFICATION_FAILURE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return NotificationFailure.NOTIFICATION_FAILURE.DEVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return NotificationFailure.NOTIFICATION_FAILURE.FAILURE_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return NotificationFailure.NOTIFICATION_FAILURE.FAILURE_CAUSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNotificationFailureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDeviceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getFailureDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFailureCause();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailureRecord value1(Long value) {
        setNotificationFailureId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailureRecord value2(Integer value) {
        setDeviceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailureRecord value3(LocalDateTime value) {
        setFailureDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailureRecord value4(String value) {
        setFailureCause(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailureRecord values(Long value1, Integer value2, LocalDateTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotificationFailureRecord
     */
    public NotificationFailureRecord() {
        super(NotificationFailure.NOTIFICATION_FAILURE);
    }

    /**
     * Create a detached, initialised NotificationFailureRecord
     */
    public NotificationFailureRecord(Long notificationFailureId, Integer deviceId, LocalDateTime failureDatetime, String failureCause) {
        super(NotificationFailure.NOTIFICATION_FAILURE);

        set(0, notificationFailureId);
        set(1, deviceId);
        set(2, failureDatetime);
        set(3, failureCause);
    }
}
