/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.VacancyTemplate;


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
public class VacancyTemplateRecord extends UpdatableRecordImpl<VacancyTemplateRecord> implements Record6<Integer, Integer, String, Boolean, Integer, Integer> {

    private static final long serialVersionUID = -1943286471;

    /**
     * Setter for <code>public.vacancy_template.vacancy_template_id</code>.
     */
    public void setVacancyTemplateId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vacancy_template.vacancy_template_id</code>.
     */
    public Integer getVacancyTemplateId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.vacancy_template.vacancy_body_id</code>.
     */
    public void setVacancyBodyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vacancy_template.vacancy_body_id</code>.
     */
    public Integer getVacancyBodyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.vacancy_template.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vacancy_template.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.vacancy_template.shared</code>.
     */
    public void setShared(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vacancy_template.shared</code>.
     */
    public Boolean getShared() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.vacancy_template.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.vacancy_template.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.vacancy_template.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.vacancy_template.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Boolean, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Boolean, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VacancyTemplate.VACANCY_TEMPLATE.VACANCY_TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return VacancyTemplate.VACANCY_TEMPLATE.VACANCY_BODY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VacancyTemplate.VACANCY_TEMPLATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return VacancyTemplate.VACANCY_TEMPLATE.SHARED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return VacancyTemplate.VACANCY_TEMPLATE.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return VacancyTemplate.VACANCY_TEMPLATE.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVacancyTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getVacancyBodyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getShared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value1(Integer value) {
        setVacancyTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value2(Integer value) {
        setVacancyBodyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value4(Boolean value) {
        setShared(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value5(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord value6(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyTemplateRecord values(Integer value1, Integer value2, String value3, Boolean value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VacancyTemplateRecord
     */
    public VacancyTemplateRecord() {
        super(VacancyTemplate.VACANCY_TEMPLATE);
    }

    /**
     * Create a detached, initialised VacancyTemplateRecord
     */
    public VacancyTemplateRecord(Integer vacancyTemplateId, Integer vacancyBodyId, String name, Boolean shared, Integer employerManagerId, Integer employerId) {
        super(VacancyTemplate.VACANCY_TEMPLATE);

        set(0, vacancyTemplateId);
        set(1, vacancyBodyId);
        set(2, name);
        set(3, shared);
        set(4, employerManagerId);
        set(5, employerId);
    }
}