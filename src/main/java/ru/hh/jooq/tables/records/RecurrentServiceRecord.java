/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.RecurrentService;


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
public class RecurrentServiceRecord extends UpdatableRecordImpl<RecurrentServiceRecord> implements Record8<Integer, Integer, Integer, Integer, String, Boolean, Integer, Integer> {

    private static final long serialVersionUID = 556986402;

    /**
     * Setter for <code>public.recurrent_service.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.recurrent_service.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.recurrent_service.seller_account_id</code>.
     */
    public void setSellerAccountId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.recurrent_service.seller_account_id</code>.
     */
    public Integer getSellerAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.recurrent_service.category</code>.
     */
    public void setCategory(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.recurrent_service.category</code>.
     */
    public Integer getCategory() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.recurrent_service.job_site</code>.
     */
    public void setJobSite(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.recurrent_service.job_site</code>.
     */
    public Integer getJobSite() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.recurrent_service.code</code>.
     */
    public void setCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.recurrent_service.code</code>.
     */
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.recurrent_service.welcome</code>. HH-59962 values moved to recurrent_type. Has to be dropped
     */
    public void setWelcome(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.recurrent_service.welcome</code>. HH-59962 values moved to recurrent_type. Has to be dropped
     */
    public Boolean getWelcome() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.recurrent_service.value</code>.
     */
    public void setValue(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.recurrent_service.value</code>.
     */
    public Integer getValue() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.recurrent_service.recurrent_type</code>.
     */
    public void setRecurrentType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.recurrent_service.recurrent_type</code>.
     */
    public Integer getRecurrentType() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, String, Boolean, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, String, Boolean, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RecurrentService.RECURRENT_SERVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RecurrentService.RECURRENT_SERVICE.SELLER_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RecurrentService.RECURRENT_SERVICE.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return RecurrentService.RECURRENT_SERVICE.JOB_SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RecurrentService.RECURRENT_SERVICE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return RecurrentService.RECURRENT_SERVICE.WELCOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return RecurrentService.RECURRENT_SERVICE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return RecurrentService.RECURRENT_SERVICE.RECURRENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSellerAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getJobSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getWelcome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRecurrentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value2(Integer value) {
        setSellerAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value3(Integer value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value4(Integer value) {
        setJobSite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value5(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value6(Boolean value) {
        setWelcome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value7(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord value8(Integer value) {
        setRecurrentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecurrentServiceRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Boolean value6, Integer value7, Integer value8) {
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
     * Create a detached RecurrentServiceRecord
     */
    public RecurrentServiceRecord() {
        super(RecurrentService.RECURRENT_SERVICE);
    }

    /**
     * Create a detached, initialised RecurrentServiceRecord
     */
    public RecurrentServiceRecord(Integer id, Integer sellerAccountId, Integer category, Integer jobSite, String code, Boolean welcome, Integer value, Integer recurrentType) {
        super(RecurrentService.RECURRENT_SERVICE);

        set(0, id);
        set(1, sellerAccountId);
        set(2, category);
        set(3, jobSite);
        set(4, code);
        set(5, welcome);
        set(6, value);
        set(7, recurrentType);
    }
}