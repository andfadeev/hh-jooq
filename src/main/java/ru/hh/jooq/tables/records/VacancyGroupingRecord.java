/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.VacancyGrouping;


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
public class VacancyGroupingRecord extends UpdatableRecordImpl<VacancyGroupingRecord> implements Record4<String, String, Integer, String> {

    private static final long serialVersionUID = 756526097;

    /**
     * Setter for <code>public.vacancy_grouping.vacancy_grouping_code</code>.
     */
    public void setVacancyGroupingCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vacancy_grouping.vacancy_grouping_code</code>.
     */
    public String getVacancyGroupingCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.vacancy_grouping.grouping_type</code>.
     */
    public void setGroupingType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vacancy_grouping.grouping_type</code>.
     */
    public String getGroupingType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.vacancy_grouping.vacancy_id</code>.
     */
    public void setVacancyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vacancy_grouping.vacancy_id</code>.
     */
    public Integer getVacancyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.vacancy_grouping.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vacancy_grouping.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<String, String, Integer, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return VacancyGrouping.VACANCY_GROUPING.VACANCY_GROUPING_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VacancyGrouping.VACANCY_GROUPING.GROUPING_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VacancyGrouping.VACANCY_GROUPING.VACANCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VacancyGrouping.VACANCY_GROUPING.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getVacancyGroupingCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGroupingType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVacancyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyGroupingRecord value1(String value) {
        setVacancyGroupingCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyGroupingRecord value2(String value) {
        setGroupingType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyGroupingRecord value3(Integer value) {
        setVacancyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyGroupingRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyGroupingRecord values(String value1, String value2, Integer value3, String value4) {
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
     * Create a detached VacancyGroupingRecord
     */
    public VacancyGroupingRecord() {
        super(VacancyGrouping.VACANCY_GROUPING);
    }

    /**
     * Create a detached, initialised VacancyGroupingRecord
     */
    public VacancyGroupingRecord(String vacancyGroupingCode, String groupingType, Integer vacancyId, String value) {
        super(VacancyGrouping.VACANCY_GROUPING);

        set(0, vacancyGroupingCode);
        set(1, groupingType);
        set(2, vacancyId);
        set(3, value);
    }
}
