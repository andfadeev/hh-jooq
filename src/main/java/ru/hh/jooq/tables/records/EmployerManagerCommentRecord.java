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

import ru.hh.jooq.tables.EmployerManagerComment;


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
public class EmployerManagerCommentRecord extends UpdatableRecordImpl<EmployerManagerCommentRecord> implements Record5<Integer, Integer, LocalDateTime, Integer, String> {

    private static final long serialVersionUID = 337001935;

    /**
     * Setter for <code>public.employer_manager_comment.employer_comment_id</code>.
     */
    public void setEmployerCommentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager_comment.employer_comment_id</code>.
     */
    public Integer getEmployerCommentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_manager_comment.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_manager_comment.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_manager_comment.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_manager_comment.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.employer_manager_comment.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_manager_comment.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.employer_manager_comment.comment</code>.
     */
    public void setComment(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employer_manager_comment.comment</code>.
     */
    public String getComment() {
        return (String) get(4);
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
    public Row5<Integer, Integer, LocalDateTime, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, LocalDateTime, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerManagerComment.EMPLOYER_MANAGER_COMMENT.EMPLOYER_COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerManagerComment.EMPLOYER_MANAGER_COMMENT.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return EmployerManagerComment.EMPLOYER_MANAGER_COMMENT.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EmployerManagerComment.EMPLOYER_MANAGER_COMMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmployerManagerComment.EMPLOYER_MANAGER_COMMENT.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerCommentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getCreationTime();
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
    public String value5() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord value1(Integer value) {
        setEmployerCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord value2(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord value3(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord value5(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerCommentRecord values(Integer value1, Integer value2, LocalDateTime value3, Integer value4, String value5) {
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
     * Create a detached EmployerManagerCommentRecord
     */
    public EmployerManagerCommentRecord() {
        super(EmployerManagerComment.EMPLOYER_MANAGER_COMMENT);
    }

    /**
     * Create a detached, initialised EmployerManagerCommentRecord
     */
    public EmployerManagerCommentRecord(Integer employerCommentId, Integer employerManagerId, LocalDateTime creationTime, Integer userId, String comment) {
        super(EmployerManagerComment.EMPLOYER_MANAGER_COMMENT);

        set(0, employerCommentId);
        set(1, employerManagerId);
        set(2, creationTime);
        set(3, userId);
        set(4, comment);
    }
}
