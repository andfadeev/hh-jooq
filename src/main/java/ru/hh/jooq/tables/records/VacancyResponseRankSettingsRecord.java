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

import ru.hh.jooq.tables.VacancyResponseRankSettings;


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
public class VacancyResponseRankSettingsRecord extends UpdatableRecordImpl<VacancyResponseRankSettingsRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 581751333;

    /**
     * Setter for <code>public.vacancy_response_rank_settings.vacancy_response_rank_id</code>.
     */
    public void setVacancyResponseRankId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vacancy_response_rank_settings.vacancy_response_rank_id</code>.
     */
    public Integer getVacancyResponseRankId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.vacancy_response_rank_settings.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vacancy_response_rank_settings.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.vacancy_response_rank_settings.vacancy_id</code>.
     */
    public void setVacancyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vacancy_response_rank_settings.vacancy_id</code>.
     */
    public Integer getVacancyId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.vacancy_response_rank_settings.type</code>.
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vacancy_response_rank_settings.type</code>.
     */
    public Integer getType() {
        return (Integer) get(3);
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
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS.VACANCY_RESPONSE_RANK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS.VACANCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVacancyResponseRankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerManagerId();
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
    public Integer value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyResponseRankSettingsRecord value1(Integer value) {
        setVacancyResponseRankId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyResponseRankSettingsRecord value2(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyResponseRankSettingsRecord value3(Integer value) {
        setVacancyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyResponseRankSettingsRecord value4(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyResponseRankSettingsRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
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
     * Create a detached VacancyResponseRankSettingsRecord
     */
    public VacancyResponseRankSettingsRecord() {
        super(VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS);
    }

    /**
     * Create a detached, initialised VacancyResponseRankSettingsRecord
     */
    public VacancyResponseRankSettingsRecord(Integer vacancyResponseRankId, Integer employerManagerId, Integer vacancyId, Integer type) {
        super(VacancyResponseRankSettings.VACANCY_RESPONSE_RANK_SETTINGS);

        set(0, vacancyResponseRankId);
        set(1, employerManagerId);
        set(2, vacancyId);
        set(3, type);
    }
}
