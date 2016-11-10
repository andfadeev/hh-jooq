/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Translation;


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
public class TranslationRecord extends UpdatableRecordImpl<TranslationRecord> implements Record7<Integer, String, String, Integer, String, Boolean, Boolean> {

    private static final long serialVersionUID = -161087710;

    /**
     * Setter for <code>public.translation.translation_id</code>.
     */
    public void setTranslationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.translation.translation_id</code>.
     */
    public Integer getTranslationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.translation.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.translation.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.translation.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.translation.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.translation.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.translation.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.translation.lang</code>.
     */
    public void setLang(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.translation.lang</code>.
     */
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.translation.dirty</code>.
     */
    public void setDirty(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.translation.dirty</code>.
     */
    public Boolean getDirty() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.translation.ui</code>.
     */
    public void setUi(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.translation.ui</code>.
     */
    public Boolean getUi() {
        return (Boolean) get(6);
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
    public Row7<Integer, String, String, Integer, String, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Integer, String, Boolean, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Translation.TRANSLATION.TRANSLATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Translation.TRANSLATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Translation.TRANSLATION.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Translation.TRANSLATION.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Translation.TRANSLATION.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Translation.TRANSLATION.DIRTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Translation.TRANSLATION.UI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTranslationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getValue();
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
    public Boolean value6() {
        return getDirty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getUi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value1(Integer value) {
        setTranslationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value3(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value4(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value6(Boolean value) {
        setDirty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord value7(Boolean value) {
        setUi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TranslationRecord values(Integer value1, String value2, String value3, Integer value4, String value5, Boolean value6, Boolean value7) {
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
     * Create a detached TranslationRecord
     */
    public TranslationRecord() {
        super(Translation.TRANSLATION);
    }

    /**
     * Create a detached, initialised TranslationRecord
     */
    public TranslationRecord(Integer translationId, String name, String value, Integer siteId, String lang, Boolean dirty, Boolean ui) {
        super(Translation.TRANSLATION);

        set(0, translationId);
        set(1, name);
        set(2, value);
        set(3, siteId);
        set(4, lang);
        set(5, dirty);
        set(6, ui);
    }
}
