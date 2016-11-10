/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.VacancySpentServiceAreaScope;


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
public class VacancySpentServiceAreaScopeRecord extends UpdatableRecordImpl<VacancySpentServiceAreaScopeRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1513924280;

    /**
     * Setter for <code>public.vacancy_spent_service_area_scope.vacancy_spent_service_id</code>.
     */
    public void setVacancySpentServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vacancy_spent_service_area_scope.vacancy_spent_service_id</code>.
     */
    public Integer getVacancySpentServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.vacancy_spent_service_area_scope.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vacancy_spent_service_area_scope.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.vacancy_spent_service_area_scope.index_</code>.
     */
    public void setIndex_(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vacancy_spent_service_area_scope.index_</code>.
     */
    public Integer getIndex_() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VacancySpentServiceAreaScope.VACANCY_SPENT_SERVICE_AREA_SCOPE.VACANCY_SPENT_SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return VacancySpentServiceAreaScope.VACANCY_SPENT_SERVICE_AREA_SCOPE.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VacancySpentServiceAreaScope.VACANCY_SPENT_SERVICE_AREA_SCOPE.INDEX_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVacancySpentServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIndex_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancySpentServiceAreaScopeRecord value1(Integer value) {
        setVacancySpentServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancySpentServiceAreaScopeRecord value2(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancySpentServiceAreaScopeRecord value3(Integer value) {
        setIndex_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancySpentServiceAreaScopeRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VacancySpentServiceAreaScopeRecord
     */
    public VacancySpentServiceAreaScopeRecord() {
        super(VacancySpentServiceAreaScope.VACANCY_SPENT_SERVICE_AREA_SCOPE);
    }

    /**
     * Create a detached, initialised VacancySpentServiceAreaScopeRecord
     */
    public VacancySpentServiceAreaScopeRecord(Integer vacancySpentServiceId, Integer areaId, Integer index_) {
        super(VacancySpentServiceAreaScope.VACANCY_SPENT_SERVICE_AREA_SCOPE);

        set(0, vacancySpentServiceId);
        set(1, areaId);
        set(2, index_);
    }
}