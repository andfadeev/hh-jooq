/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Event;


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
public class EventRecord extends UpdatableRecordImpl<EventRecord> implements Record15<Integer, Integer, Integer, Integer, LocalDateTime, String, LocalDateTime, LocalDateTime, String, Boolean, Boolean, Boolean, Boolean, Boolean, Integer> {

    private static final long serialVersionUID = 2121438315;

    /**
     * Setter for <code>public.event.event_id</code>.
     */
    public void setEventId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.event.event_id</code>.
     */
    public Integer getEventId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.event.event_type_id</code>.
     */
    public void setEventTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.event.event_type_id</code>.
     */
    public Integer getEventTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.event.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.event.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.event.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.event.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.event.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.event.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.event.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.event.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.event.end_time</code>.
     */
    public void setEndTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.event.end_time</code>.
     */
    public LocalDateTime getEndTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.event.notification_time</code>.
     */
    public void setNotificationTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.event.notification_time</code>.
     */
    public LocalDateTime getNotificationTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.event.title</code>.
     */
    public void setTitle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.event.title</code>.
     */
    public String getTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.event.disabled</code>.
     */
    public void setDisabled(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.event.disabled</code>.
     */
    public Boolean getDisabled() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.event.notified</code>.
     */
    public void setNotified(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.event.notified</code>.
     */
    public Boolean getNotified() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.event.done</code>.
     */
    public void setDone(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.event.done</code>.
     */
    public Boolean getDone() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.event.whole_day</code>.
     */
    public void setWholeDay(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.event.whole_day</code>.
     */
    public Boolean getWholeDay() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.event.task</code>.
     */
    public void setTask(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.event.task</code>.
     */
    public Boolean getTask() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.event.billing_event_id</code>.
     */
    public void setBillingEventId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.event.billing_event_id</code>.
     */
    public Integer getBillingEventId() {
        return (Integer) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Integer, LocalDateTime, String, LocalDateTime, LocalDateTime, String, Boolean, Boolean, Boolean, Boolean, Boolean, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Integer, LocalDateTime, String, LocalDateTime, LocalDateTime, String, Boolean, Boolean, Boolean, Boolean, Boolean, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Event.EVENT.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Event.EVENT.EVENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Event.EVENT.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Event.EVENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return Event.EVENT.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Event.EVENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return Event.EVENT.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return Event.EVENT.NOTIFICATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Event.EVENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Event.EVENT.DISABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Event.EVENT.NOTIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Event.EVENT.DONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Event.EVENT.WHOLE_DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Event.EVENT.TASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Event.EVENT.BILLING_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEventTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
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
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getNotificationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getNotified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getDone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getWholeDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getTask();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getBillingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value1(Integer value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value2(Integer value) {
        setEventTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value3(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value5(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value7(LocalDateTime value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value8(LocalDateTime value) {
        setNotificationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value9(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value10(Boolean value) {
        setDisabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value11(Boolean value) {
        setNotified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value12(Boolean value) {
        setDone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value13(Boolean value) {
        setWholeDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value14(Boolean value) {
        setTask(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord value15(Integer value) {
        setBillingEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventRecord values(Integer value1, Integer value2, Integer value3, Integer value4, LocalDateTime value5, String value6, LocalDateTime value7, LocalDateTime value8, String value9, Boolean value10, Boolean value11, Boolean value12, Boolean value13, Boolean value14, Integer value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventRecord
     */
    public EventRecord() {
        super(Event.EVENT);
    }

    /**
     * Create a detached, initialised EventRecord
     */
    public EventRecord(Integer eventId, Integer eventTypeId, Integer employerId, Integer userId, LocalDateTime creationTime, String description, LocalDateTime endTime, LocalDateTime notificationTime, String title, Boolean disabled, Boolean notified, Boolean done, Boolean wholeDay, Boolean task, Integer billingEventId) {
        super(Event.EVENT);

        set(0, eventId);
        set(1, eventTypeId);
        set(2, employerId);
        set(3, userId);
        set(4, creationTime);
        set(5, description);
        set(6, endTime);
        set(7, notificationTime);
        set(8, title);
        set(9, disabled);
        set(10, notified);
        set(11, done);
        set(12, wholeDay);
        set(13, task);
        set(14, billingEventId);
    }
}