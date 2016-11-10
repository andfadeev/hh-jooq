/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.MailingUserGroupFilter;


/**
 * Template for building mailing sql
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MailingUserGroupFilterRecord extends UpdatableRecordImpl<MailingUserGroupFilterRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -577557940;

    /**
     * Setter for <code>public.mailing_user_group_filter.mailing_user_group_filter_id</code>.
     */
    public void setMailingUserGroupFilterId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mailing_user_group_filter.mailing_user_group_filter_id</code>.
     */
    public Integer getMailingUserGroupFilterId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.mailing_user_group_filter.template</code>.
     */
    public void setTemplate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mailing_user_group_filter.template</code>.
     */
    public String getTemplate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mailing_user_group_filter.params_json</code>.
     */
    public void setParamsJson(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mailing_user_group_filter.params_json</code>.
     */
    public String getParamsJson() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MailingUserGroupFilter.MAILING_USER_GROUP_FILTER.MAILING_USER_GROUP_FILTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MailingUserGroupFilter.MAILING_USER_GROUP_FILTER.TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MailingUserGroupFilter.MAILING_USER_GROUP_FILTER.PARAMS_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMailingUserGroupFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParamsJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupFilterRecord value1(Integer value) {
        setMailingUserGroupFilterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupFilterRecord value2(String value) {
        setTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupFilterRecord value3(String value) {
        setParamsJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupFilterRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MailingUserGroupFilterRecord
     */
    public MailingUserGroupFilterRecord() {
        super(MailingUserGroupFilter.MAILING_USER_GROUP_FILTER);
    }

    /**
     * Create a detached, initialised MailingUserGroupFilterRecord
     */
    public MailingUserGroupFilterRecord(Integer mailingUserGroupFilterId, String template, String paramsJson) {
        super(MailingUserGroupFilter.MAILING_USER_GROUP_FILTER);

        set(0, mailingUserGroupFilterId);
        set(1, template);
        set(2, paramsJson);
    }
}