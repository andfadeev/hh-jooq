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

import ru.hh.jooq.tables.MultipleGroup;


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
public class MultipleGroupRecord extends UpdatableRecordImpl<MultipleGroupRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1329481534;

    /**
     * Setter for <code>public.multiple_group.multiple_group_id</code>.
     */
    public void setMultipleGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.multiple_group.multiple_group_id</code>.
     */
    public Integer getMultipleGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.multiple_group.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.multiple_group.name</code>.
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
        return MultipleGroup.MULTIPLE_GROUP.MULTIPLE_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MultipleGroup.MULTIPLE_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMultipleGroupId();
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
    public MultipleGroupRecord value1(Integer value) {
        setMultipleGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MultipleGroupRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MultipleGroupRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MultipleGroupRecord
     */
    public MultipleGroupRecord() {
        super(MultipleGroup.MULTIPLE_GROUP);
    }

    /**
     * Create a detached, initialised MultipleGroupRecord
     */
    public MultipleGroupRecord(Integer multipleGroupId, String name) {
        super(MultipleGroup.MULTIPLE_GROUP);

        set(0, multipleGroupId);
        set(1, name);
    }
}