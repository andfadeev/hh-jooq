/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EmployerDenyHost;


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
public class EmployerDenyHostRecord extends UpdatableRecordImpl<EmployerDenyHostRecord> implements Record4<Integer, Integer, String, Boolean> {

    private static final long serialVersionUID = -1206571121;

    /**
     * Setter for <code>public.employer_deny_host.employer_deny_host_id</code>.
     */
    public void setEmployerDenyHostId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_deny_host.employer_deny_host_id</code>.
     */
    public Integer getEmployerDenyHostId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_deny_host.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_deny_host.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_deny_host.remote_host</code>.
     */
    public void setRemoteHost(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_deny_host.remote_host</code>.
     */
    public String getRemoteHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employer_deny_host.blocked</code>.
     */
    public void setBlocked(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_deny_host.blocked</code>.
     */
    public Boolean getBlocked() {
        return (Boolean) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerDenyHost.EMPLOYER_DENY_HOST.EMPLOYER_DENY_HOST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerDenyHost.EMPLOYER_DENY_HOST.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployerDenyHost.EMPLOYER_DENY_HOST.REMOTE_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return EmployerDenyHost.EMPLOYER_DENY_HOST.BLOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerDenyHostId();
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
    public String value3() {
        return getRemoteHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getBlocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerDenyHostRecord value1(Integer value) {
        setEmployerDenyHostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerDenyHostRecord value2(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerDenyHostRecord value3(String value) {
        setRemoteHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerDenyHostRecord value4(Boolean value) {
        setBlocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerDenyHostRecord values(Integer value1, Integer value2, String value3, Boolean value4) {
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
     * Create a detached EmployerDenyHostRecord
     */
    public EmployerDenyHostRecord() {
        super(EmployerDenyHost.EMPLOYER_DENY_HOST);
    }

    /**
     * Create a detached, initialised EmployerDenyHostRecord
     */
    public EmployerDenyHostRecord(Integer employerDenyHostId, Integer employerId, String remoteHost, Boolean blocked) {
        super(EmployerDenyHost.EMPLOYER_DENY_HOST);

        set(0, employerDenyHostId);
        set(1, employerId);
        set(2, remoteHost);
        set(3, blocked);
    }
}
