/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.udt.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UDTRecordImpl;

import ru.hh.jooq.udt.PhoneEmbedded;


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
public class PhoneEmbeddedRecord extends UDTRecordImpl<PhoneEmbeddedRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 867726291;

    /**
     * Setter for <code>public.phone_embedded.country</code>.
     */
    public void setCountry(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.phone_embedded.country</code>.
     */
    public String getCountry() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.phone_embedded.city</code>.
     */
    public void setCity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.phone_embedded.city</code>.
     */
    public String getCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.phone_embedded.number</code>.
     */
    public void setNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.phone_embedded.number</code>.
     */
    public String getNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.phone_embedded.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.phone_embedded.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PhoneEmbedded.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PhoneEmbedded.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PhoneEmbedded.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PhoneEmbedded.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoneEmbeddedRecord value1(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoneEmbeddedRecord value2(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoneEmbeddedRecord value3(String value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoneEmbeddedRecord value4(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhoneEmbeddedRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached PhoneEmbeddedRecord
     */
    public PhoneEmbeddedRecord() {
        super(PhoneEmbedded.PHONE_EMBEDDED);
    }

    /**
     * Create a detached, initialised PhoneEmbeddedRecord
     */
    public PhoneEmbeddedRecord(String country, String city, String number, String comment) {
        super(PhoneEmbedded.PHONE_EMBEDDED);

        set(0, country);
        set(1, city);
        set(2, number);
        set(3, comment);
    }
}