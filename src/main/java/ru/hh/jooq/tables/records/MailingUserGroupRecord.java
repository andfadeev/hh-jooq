/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.MailingUserGroup;


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
public class MailingUserGroupRecord extends UpdatableRecordImpl<MailingUserGroupRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 1903121558;

    /**
     * Setter for <code>public.mailing_user_group.mailing_user_group_id</code>.
     */
    public void setMailingUserGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.mailing_user_group.mailing_user_group_id</code>.
     */
    public Integer getMailingUserGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.mailing_user_group.descr</code>.
     */
    public void setDescr(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.mailing_user_group.descr</code>.
     */
    public String getDescr() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.mailing_user_group.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.mailing_user_group.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.mailing_user_group.sql_string</code>.
     */
    public void setSqlString(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.mailing_user_group.sql_string</code>.
     */
    public String getSqlString() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.mailing_user_group.filter_id</code>.
     */
    public void setFilterId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.mailing_user_group.filter_id</code>.
     */
    public Integer getFilterId() {
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
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MailingUserGroup.MAILING_USER_GROUP.MAILING_USER_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MailingUserGroup.MAILING_USER_GROUP.DESCR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MailingUserGroup.MAILING_USER_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MailingUserGroup.MAILING_USER_GROUP.SQL_STRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MailingUserGroup.MAILING_USER_GROUP.FILTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMailingUserGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDescr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSqlString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord value1(Integer value) {
        setMailingUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord value2(String value) {
        setDescr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord value4(String value) {
        setSqlString(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord value5(Integer value) {
        setFilterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached MailingUserGroupRecord
     */
    public MailingUserGroupRecord() {
        super(MailingUserGroup.MAILING_USER_GROUP);
    }

    /**
     * Create a detached, initialised MailingUserGroupRecord
     */
    public MailingUserGroupRecord(Integer mailingUserGroupId, String descr, String name, String sqlString, Integer filterId) {
        super(MailingUserGroup.MAILING_USER_GROUP);

        set(0, mailingUserGroupId);
        set(1, descr);
        set(2, name);
        set(3, sqlString);
        set(4, filterId);
    }
}