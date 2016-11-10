/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.FirstPageEmployer;


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
public class FirstPageEmployerRecord extends UpdatableRecordImpl<FirstPageEmployerRecord> implements Record9<Integer, Integer, Integer, Integer, String, String, LocalDate, LocalDate, Boolean> {

    private static final long serialVersionUID = 1845717929;

    /**
     * Setter for <code>public.first_page_employer.first_page_employer_id</code>.
     */
    public void setFirstPageEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.first_page_employer.first_page_employer_id</code>.
     */
    public Integer getFirstPageEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.first_page_employer.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.first_page_employer.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.first_page_employer.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.first_page_employer.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.first_page_employer.position</code>.
     */
    public void setPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.first_page_employer.position</code>.
     */
    public Integer getPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.first_page_employer.pretty_name</code>.
     */
    public void setPrettyName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.first_page_employer.pretty_name</code>.
     */
    public String getPrettyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.first_page_employer.industry</code>.
     */
    public void setIndustry(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.first_page_employer.industry</code>.
     */
    public String getIndustry() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.first_page_employer.fix_start</code>.
     */
    public void setFixStart(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.first_page_employer.fix_start</code>.
     */
    public LocalDate getFixStart() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>public.first_page_employer.fix_end</code>.
     */
    public void setFixEnd(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.first_page_employer.fix_end</code>.
     */
    public LocalDate getFixEnd() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>public.first_page_employer.rotate_free</code>.
     */
    public void setRotateFree(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.first_page_employer.rotate_free</code>.
     */
    public Boolean getRotateFree() {
        return (Boolean) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, String, String, LocalDate, LocalDate, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, String, String, LocalDate, LocalDate, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.FIRST_PAGE_EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.PRETTY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.INDUSTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field7() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.FIX_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field8() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.FIX_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return FirstPageEmployer.FIRST_PAGE_EMPLOYER.ROTATE_FREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFirstPageEmployerId();
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
    public Integer value3() {
        return getSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPrettyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIndustry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value7() {
        return getFixStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value8() {
        return getFixEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getRotateFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value1(Integer value) {
        setFirstPageEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value2(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value3(Integer value) {
        setSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value4(Integer value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value5(String value) {
        setPrettyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value6(String value) {
        setIndustry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value7(LocalDate value) {
        setFixStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value8(LocalDate value) {
        setFixEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord value9(Boolean value) {
        setRotateFree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageEmployerRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, String value6, LocalDate value7, LocalDate value8, Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FirstPageEmployerRecord
     */
    public FirstPageEmployerRecord() {
        super(FirstPageEmployer.FIRST_PAGE_EMPLOYER);
    }

    /**
     * Create a detached, initialised FirstPageEmployerRecord
     */
    public FirstPageEmployerRecord(Integer firstPageEmployerId, Integer employerId, Integer siteId, Integer position, String prettyName, String industry, LocalDate fixStart, LocalDate fixEnd, Boolean rotateFree) {
        super(FirstPageEmployer.FIRST_PAGE_EMPLOYER);

        set(0, firstPageEmployerId);
        set(1, employerId);
        set(2, siteId);
        set(3, position);
        set(4, prettyName);
        set(5, industry);
        set(6, fixStart);
        set(7, fixEnd);
        set(8, rotateFree);
    }
}