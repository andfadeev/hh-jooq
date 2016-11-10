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

import ru.hh.jooq.tables.HeadhunterPermission;


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
public class HeadhunterPermissionRecord extends UpdatableRecordImpl<HeadhunterPermissionRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1378698237;

    /**
     * Setter for <code>public.headhunter_permission.headhunter_permission_id</code>.
     */
    public void setHeadhunterPermissionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.headhunter_permission.headhunter_permission_id</code>.
     */
    public Integer getHeadhunterPermissionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.headhunter_permission.target_name</code>.
     */
    public void setTargetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.headhunter_permission.target_name</code>.
     */
    public String getTargetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.headhunter_permission.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.headhunter_permission.description</code>.
     */
    public String getDescription() {
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
        return HeadhunterPermission.HEADHUNTER_PERMISSION.HEADHUNTER_PERMISSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HeadhunterPermission.HEADHUNTER_PERMISSION.TARGET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HeadhunterPermission.HEADHUNTER_PERMISSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHeadhunterPermissionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTargetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadhunterPermissionRecord value1(Integer value) {
        setHeadhunterPermissionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadhunterPermissionRecord value2(String value) {
        setTargetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadhunterPermissionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HeadhunterPermissionRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HeadhunterPermissionRecord
     */
    public HeadhunterPermissionRecord() {
        super(HeadhunterPermission.HEADHUNTER_PERMISSION);
    }

    /**
     * Create a detached, initialised HeadhunterPermissionRecord
     */
    public HeadhunterPermissionRecord(Integer headhunterPermissionId, String targetName, String description) {
        super(HeadhunterPermission.HEADHUNTER_PERMISSION);

        set(0, headhunterPermissionId);
        set(1, targetName);
        set(2, description);
    }
}