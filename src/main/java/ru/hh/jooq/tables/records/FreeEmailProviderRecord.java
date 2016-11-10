/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.FreeEmailProvider;


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
public class FreeEmailProviderRecord extends UpdatableRecordImpl<FreeEmailProviderRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1221117833;

    /**
     * Setter for <code>public.free_email_provider.free_email_provider_id</code>.
     */
    public void setFreeEmailProviderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.free_email_provider.free_email_provider_id</code>.
     */
    public Integer getFreeEmailProviderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.free_email_provider.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.free_email_provider.name</code>.
     */
    public String getName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FreeEmailProvider.FREE_EMAIL_PROVIDER.FREE_EMAIL_PROVIDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FreeEmailProvider.FREE_EMAIL_PROVIDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFreeEmailProviderId();
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
    public FreeEmailProviderRecord value1(Integer value) {
        setFreeEmailProviderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeEmailProviderRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeEmailProviderRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FreeEmailProviderRecord
     */
    public FreeEmailProviderRecord() {
        super(FreeEmailProvider.FREE_EMAIL_PROVIDER);
    }

    /**
     * Create a detached, initialised FreeEmailProviderRecord
     */
    public FreeEmailProviderRecord(Integer freeEmailProviderId, String name) {
        super(FreeEmailProvider.FREE_EMAIL_PROVIDER);

        set(0, freeEmailProviderId);
        set(1, name);
    }
}