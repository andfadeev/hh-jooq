/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.SyncUsers;


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
public class SyncUsersRecord extends UpdatableRecordImpl<SyncUsersRecord> implements Record1<String> {

    private static final long serialVersionUID = -933886487;

    /**
     * Setter for <code>public.sync_users.login</code>.
     */
    public void setLogin(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.sync_users.login</code>.
     */
    public String getLogin() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SyncUsers.SYNC_USERS.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncUsersRecord value1(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyncUsersRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SyncUsersRecord
     */
    public SyncUsersRecord() {
        super(SyncUsers.SYNC_USERS);
    }

    /**
     * Create a detached, initialised SyncUsersRecord
     */
    public SyncUsersRecord(String login) {
        super(SyncUsers.SYNC_USERS);

        set(0, login);
    }
}
