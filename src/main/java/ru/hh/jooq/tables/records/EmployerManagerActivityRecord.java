/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EmployerManagerActivity;


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
public class EmployerManagerActivityRecord extends UpdatableRecordImpl<EmployerManagerActivityRecord> implements Record5<Integer, Long, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = -1535843106;

    /**
     * Setter for <code>public.employer_manager_activity.employer_manager_activity_id</code>.
     */
    public void setEmployerManagerActivityId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager_activity.employer_manager_activity_id</code>.
     */
    public Integer getEmployerManagerActivityId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_manager_activity.hhid</code>.
     */
    public void setHhid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_manager_activity.hhid</code>.
     */
    public Long getHhid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.employer_manager_activity.last_active_time</code>.
     */
    public void setLastActiveTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_manager_activity.last_active_time</code>.
     */
    public LocalDateTime getLastActiveTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.employer_manager_activity.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_manager_activity.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.employer_manager_activity.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employer_manager_activity.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(4);
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
    public Row5<Integer, Long, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY.EMPLOYER_MANAGER_ACTIVITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY.HHID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY.LAST_ACTIVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerManagerActivityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getHhid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getLastActiveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord value1(Integer value) {
        setEmployerManagerActivityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord value2(Long value) {
        setHhid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord value3(LocalDateTime value) {
        setLastActiveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord value4(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord value5(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerActivityRecord values(Integer value1, Long value2, LocalDateTime value3, Integer value4, Integer value5) {
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
     * Create a detached EmployerManagerActivityRecord
     */
    public EmployerManagerActivityRecord() {
        super(EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY);
    }

    /**
     * Create a detached, initialised EmployerManagerActivityRecord
     */
    public EmployerManagerActivityRecord(Integer employerManagerActivityId, Long hhid, LocalDateTime lastActiveTime, Integer employerId, Integer employerManagerId) {
        super(EmployerManagerActivity.EMPLOYER_MANAGER_ACTIVITY);

        set(0, employerManagerActivityId);
        set(1, hhid);
        set(2, lastActiveTime);
        set(3, employerId);
        set(4, employerManagerId);
    }
}