/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.TaskHistory;


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
public class TaskHistoryRecord extends UpdatableRecordImpl<TaskHistoryRecord> implements Record6<Integer, LocalDateTime, Integer, String, Integer, String> {

    private static final long serialVersionUID = 620378642;

    /**
     * Setter for <code>public.task_history.task_history_id</code>.
     */
    public void setTaskHistoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.task_history.task_history_id</code>.
     */
    public Integer getTaskHistoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.task_history.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.task_history.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.task_history.action</code>.
     */
    public void setAction(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.task_history.action</code>.
     */
    public Integer getAction() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.task_history.information</code>.
     */
    public void setInformation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.task_history.information</code>.
     */
    public String getInformation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.task_history.task_info_id</code>.
     */
    public void setTaskInfoId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.task_history.task_info_id</code>.
     */
    public Integer getTaskInfoId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.task_history.host</code>.
     */
    public void setHost(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.task_history.host</code>.
     */
    public String getHost() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, LocalDateTime, Integer, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, LocalDateTime, Integer, String, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TaskHistory.TASK_HISTORY.TASK_HISTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return TaskHistory.TASK_HISTORY.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TaskHistory.TASK_HISTORY.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TaskHistory.TASK_HISTORY.INFORMATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TaskHistory.TASK_HISTORY.TASK_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TaskHistory.TASK_HISTORY.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTaskHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInformation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTaskInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value1(Integer value) {
        setTaskHistoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value2(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value3(Integer value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value4(String value) {
        setInformation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value5(Integer value) {
        setTaskInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord value6(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskHistoryRecord values(Integer value1, LocalDateTime value2, Integer value3, String value4, Integer value5, String value6) {
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
     * Create a detached TaskHistoryRecord
     */
    public TaskHistoryRecord() {
        super(TaskHistory.TASK_HISTORY);
    }

    /**
     * Create a detached, initialised TaskHistoryRecord
     */
    public TaskHistoryRecord(Integer taskHistoryId, LocalDateTime creationTime, Integer action, String information, Integer taskInfoId, String host) {
        super(TaskHistory.TASK_HISTORY);

        set(0, taskHistoryId);
        set(1, creationTime);
        set(2, action);
        set(3, information);
        set(4, taskInfoId);
        set(5, host);
    }
}
