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

import ru.hh.jooq.tables.University;


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
public class UniversityRecord extends UpdatableRecordImpl<UniversityRecord> implements Record5<Integer, String, Long, Integer, Integer> {

    private static final long serialVersionUID = -1145768104;

    /**
     * Setter for <code>public.university.university_id</code>.
     */
    public void setUniversityId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.university.university_id</code>.
     */
    public Integer getUniversityId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.university.synonyms</code>.
     */
    public void setSynonyms(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.university.synonyms</code>.
     */
    public String getSynonyms() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.university.original_id</code>.
     */
    public void setOriginalId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.university.original_id</code>.
     */
    public Long getOriginalId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.university.rate</code>.
     */
    public void setRate(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.university.rate</code>.
     */
    public Integer getRate() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.university.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.university.area_id</code>.
     */
    public Integer getAreaId() {
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
    public Row5<Integer, String, Long, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Long, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return University.UNIVERSITY.UNIVERSITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return University.UNIVERSITY.SYNONYMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return University.UNIVERSITY.ORIGINAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return University.UNIVERSITY.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return University.UNIVERSITY.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUniversityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOriginalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value1(Integer value) {
        setUniversityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value2(String value) {
        setSynonyms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value3(Long value) {
        setOriginalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value4(Integer value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord value5(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniversityRecord values(Integer value1, String value2, Long value3, Integer value4, Integer value5) {
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
     * Create a detached UniversityRecord
     */
    public UniversityRecord() {
        super(University.UNIVERSITY);
    }

    /**
     * Create a detached, initialised UniversityRecord
     */
    public UniversityRecord(Integer universityId, String synonyms, Long originalId, Integer rate, Integer areaId) {
        super(University.UNIVERSITY);

        set(0, universityId);
        set(1, synonyms);
        set(2, originalId);
        set(3, rate);
        set(4, areaId);
    }
}
