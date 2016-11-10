/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EmployerManagerOperationStatus;


/**
 * status of operation on employer manager
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployerManagerOperationStatusRecord extends UpdatableRecordImpl<EmployerManagerOperationStatusRecord> implements Record8<Integer, String, Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = 1973523720;

    /**
     * Setter for <code>public.employer_manager_operation_status.employer_manager_operation_status_id</code>.
     */
    public void setEmployerManagerOperationStatusId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.employer_manager_operation_status_id</code>.
     */
    public Integer getEmployerManagerOperationStatusId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.performing_user_id</code>.
     */
    public void setPerformingUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.performing_user_id</code>.
     */
    public Integer getPerformingUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.change_time</code>.
     */
    public void setChangeTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.change_time</code>.
     */
    public LocalDateTime getChangeTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.errors_count</code>.
     */
    public void setErrorsCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.errors_count</code>.
     */
    public Integer getErrorsCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.employer_manager_operation_status.target_entity_id</code>.
     */
    public void setTargetEntityId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.employer_manager_operation_status.target_entity_id</code>.
     */
    public Integer getTargetEntityId() {
        return (Integer) get(7);
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
    public Row8<Integer, String, Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, LocalDateTime, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.EMPLOYER_MANAGER_OPERATION_STATUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.PERFORMING_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.CHANGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.ERRORS_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS.TARGET_ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerManagerOperationStatusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPerformingUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEmployerManagerId();
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
    public LocalDateTime value6() {
        return getChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getErrorsCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTargetEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value1(Integer value) {
        setEmployerManagerOperationStatusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value2(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value3(Integer value) {
        setPerformingUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value4(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value5(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value6(LocalDateTime value) {
        setChangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value7(Integer value) {
        setErrorsCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord value8(Integer value) {
        setTargetEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerOperationStatusRecord values(Integer value1, String value2, Integer value3, Integer value4, LocalDateTime value5, LocalDateTime value6, Integer value7, Integer value8) {
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
     * Create a detached EmployerManagerOperationStatusRecord
     */
    public EmployerManagerOperationStatusRecord() {
        super(EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS);
    }

    /**
     * Create a detached, initialised EmployerManagerOperationStatusRecord
     */
    public EmployerManagerOperationStatusRecord(Integer employerManagerOperationStatusId, String type, Integer performingUserId, Integer employerManagerId, LocalDateTime creationTime, LocalDateTime changeTime, Integer errorsCount, Integer targetEntityId) {
        super(EmployerManagerOperationStatus.EMPLOYER_MANAGER_OPERATION_STATUS);

        set(0, employerManagerOperationStatusId);
        set(1, type);
        set(2, performingUserId);
        set(3, employerManagerId);
        set(4, creationTime);
        set(5, changeTime);
        set(6, errorsCount);
        set(7, targetEntityId);
    }
}
