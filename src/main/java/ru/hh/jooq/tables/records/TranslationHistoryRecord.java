/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.TranslationHistory;


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
public class TranslationHistoryRecord extends TableRecordImpl<TranslationHistoryRecord> implements Record8<Integer, LocalDateTime, Integer, Integer, String, String, String, String> {

    private static final long serialVersionUID = -1967521739;

    /**
     * Setter for <code>public.translation_history.translation_history_id</code>.
     */
    public void setTranslationHistoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.translation_history.translation_history_id</code>.
     */
    public Integer getTranslationHistoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.translation_history.modification_time</code>.
     */
    public void setModificationTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.translation_history.modification_time</code>.
     */
    public LocalDateTime getModificationTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.translation_history.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.translation_history.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.translation_history.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.translation_history.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.translation_history.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.translation_history.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.translation_history.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.translation_history.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.translation_history.old_value</code>.
     */
    public void setOldValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.translation_history.old_value</code>.
     */
    public String getOldValue() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.translation_history.new_value</code>.
     */
    public void setNewValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.translation_history.new_value</code>.
     */
    public String getNewValue() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, LocalDateTime, Integer, Integer, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, LocalDateTime, Integer, Integer, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TranslationHistory.TRANSLATION_HISTORY.TRANSLATION_HISTORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return TranslationHistory.TRANSLATION_HISTORY.MODIFICATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TranslationHistory.TRANSLATION_HISTORY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TranslationHistory.TRANSLATION_HISTORY.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TranslationHistory.TRANSLATION_HISTORY.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TranslationHistory.TRANSLATION_HISTORY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TranslationHistory.TRANSLATION_HISTORY.OLD_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TranslationHistory.TRANSLATION_HISTORY.NEW_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTranslationHistoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getModificationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOldValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNewValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value1(Integer value) {
        setTranslationHistoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value2(LocalDateTime value) {
        setModificationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value4(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value7(String value) {
        setOldValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord value8(String value) {
        setNewValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationHistoryRecord values(Integer value1, LocalDateTime value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8) {
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
     * Create a detached TranslationHistoryRecord
     */
    public TranslationHistoryRecord() {
        super(TranslationHistory.TRANSLATION_HISTORY);
    }

    /**
     * Create a detached, initialised TranslationHistoryRecord
     */
    public TranslationHistoryRecord(Integer translationHistoryId, LocalDateTime modificationTime, Integer userId, Integer siteId, String lang, String name, String oldValue, String newValue) {
        super(TranslationHistory.TRANSLATION_HISTORY);

        set(0, translationHistoryId);
        set(1, modificationTime);
        set(2, userId);
        set(3, siteId);
        set(4, lang);
        set(5, name);
        set(6, oldValue);
        set(7, newValue);
    }
}