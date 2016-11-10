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

import ru.hh.jooq.tables.EmployerComment;


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
public class EmployerCommentRecord extends UpdatableRecordImpl<EmployerCommentRecord> implements Record6<Integer, Integer, LocalDateTime, Integer, String, Integer> {

    private static final long serialVersionUID = -721086591;

    /**
     * Setter for <code>public.employer_comment.employer_comment_id</code>.
     */
    public void setEmployerCommentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_comment.employer_comment_id</code>.
     */
    public Integer getEmployerCommentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_comment.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_comment.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_comment.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_comment.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.employer_comment.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_comment.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.employer_comment.comment</code>.
     */
    public void setComment(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employer_comment.comment</code>.
     */
    public String getComment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.employer_comment.is_indexed</code>.
     */
    public void setIsIndexed(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employer_comment.is_indexed</code>.
     */
    public Integer getIsIndexed() {
        return (Integer) get(5);
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
    public Row6<Integer, Integer, LocalDateTime, Integer, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, LocalDateTime, Integer, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerComment.EMPLOYER_COMMENT.EMPLOYER_COMMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerComment.EMPLOYER_COMMENT.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return EmployerComment.EMPLOYER_COMMENT.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return EmployerComment.EMPLOYER_COMMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmployerComment.EMPLOYER_COMMENT.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return EmployerComment.EMPLOYER_COMMENT.IS_INDEXED;
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
        return getEmployerId();
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
    public Integer value6() {
        return getIsIndexed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value1(Integer value) {
        setEmployerCommentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value2(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value3(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value5(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord value6(Integer value) {
        setIsIndexed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerCommentRecord values(Integer value1, Integer value2, LocalDateTime value3, Integer value4, String value5, Integer value6) {
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
     * Create a detached EmployerCommentRecord
     */
    public EmployerCommentRecord() {
        super(EmployerComment.EMPLOYER_COMMENT);
    }

    /**
     * Create a detached, initialised EmployerCommentRecord
     */
    public EmployerCommentRecord(Integer employerCommentId, Integer employerId, LocalDateTime creationTime, Integer userId, String comment, Integer isIndexed) {
        super(EmployerComment.EMPLOYER_COMMENT);

        set(0, employerCommentId);
        set(1, employerId);
        set(2, creationTime);
        set(3, userId);
        set(4, comment);
        set(5, isIndexed);
    }
}
