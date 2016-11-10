/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.MailedSearchHistory;


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
public class MailedSearchHistoryRecord extends UpdatableRecordImpl<MailedSearchHistoryRecord> implements Record4<Integer, byte[], String, LocalDateTime> {

    private static final long serialVersionUID = -1323759059;

    /**
     * Setter for <code>public.mailed_search_history.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mailed_search_history.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.mailed_search_history.attempt_hash</code>.
     */
    public void setAttemptHash(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mailed_search_history.attempt_hash</code>.
     */
    public byte[] getAttemptHash() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>public.mailed_search_history.attempt</code>.
     */
    public void setAttempt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mailed_search_history.attempt</code>.
     */
    public String getAttempt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mailed_search_history.mail_time</code>.
     */
    public void setMailTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mailed_search_history.mail_time</code>.
     */
    public LocalDateTime getMailTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, byte[]> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, byte[], String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, byte[], String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MailedSearchHistory.MAILED_SEARCH_HISTORY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return MailedSearchHistory.MAILED_SEARCH_HISTORY.ATTEMPT_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MailedSearchHistory.MAILED_SEARCH_HISTORY.ATTEMPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return MailedSearchHistory.MAILED_SEARCH_HISTORY.MAIL_TIME;
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
    public byte[] value2() {
        return getAttemptHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAttempt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getMailTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistoryRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistoryRecord value2(byte... value) {
        setAttemptHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistoryRecord value3(String value) {
        setAttempt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistoryRecord value4(LocalDateTime value) {
        setMailTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistoryRecord values(Integer value1, byte[] value2, String value3, LocalDateTime value4) {
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
     * Create a detached MailedSearchHistoryRecord
     */
    public MailedSearchHistoryRecord() {
        super(MailedSearchHistory.MAILED_SEARCH_HISTORY);
    }

    /**
     * Create a detached, initialised MailedSearchHistoryRecord
     */
    public MailedSearchHistoryRecord(Integer userId, byte[] attemptHash, String attempt, LocalDateTime mailTime) {
        super(MailedSearchHistory.MAILED_SEARCH_HISTORY);

        set(0, userId);
        set(1, attemptHash);
        set(2, attempt);
        set(3, mailTime);
    }
}
