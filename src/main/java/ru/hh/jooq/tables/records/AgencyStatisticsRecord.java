/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.AgencyStatistics;


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
public class AgencyStatisticsRecord extends UpdatableRecordImpl<AgencyStatisticsRecord> implements Record7<Integer, Integer, String, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1334910782;

    /**
     * Setter for <code>public.agency_statistics.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.agency_statistics.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.agency_statistics.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.agency_statistics.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.agency_statistics.area_path</code>.
     */
    public void setAreaPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.agency_statistics.area_path</code>.
     */
    public String getAreaPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.agency_statistics.professional_area_id</code>.
     */
    public void setProfessionalAreaId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.agency_statistics.professional_area_id</code>.
     */
    public Integer getProfessionalAreaId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.agency_statistics.vacancies_number</code>.
     */
    public void setVacanciesNumber(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.agency_statistics.vacancies_number</code>.
     */
    public Integer getVacanciesNumber() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.agency_statistics.rank</code>.
     */
    public void setRank(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.agency_statistics.rank</code>.
     */
    public Integer getRank() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.agency_statistics.normalised_rank</code>.
     */
    public void setNormalisedRank(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.agency_statistics.normalised_rank</code>.
     */
    public Integer getNormalisedRank() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, Integer, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AgencyStatistics.AGENCY_STATISTICS.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AgencyStatistics.AGENCY_STATISTICS.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AgencyStatistics.AGENCY_STATISTICS.AREA_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AgencyStatistics.AGENCY_STATISTICS.PROFESSIONAL_AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AgencyStatistics.AGENCY_STATISTICS.VACANCIES_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return AgencyStatistics.AGENCY_STATISTICS.RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return AgencyStatistics.AGENCY_STATISTICS.NORMALISED_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmployerId();
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
    public String value3() {
        return getAreaPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getProfessionalAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVacanciesNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getNormalisedRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value1(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value2(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value3(String value) {
        setAreaPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value4(Integer value) {
        setProfessionalAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value5(Integer value) {
        setVacanciesNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value6(Integer value) {
        setRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord value7(Integer value) {
        setNormalisedRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyStatisticsRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AgencyStatisticsRecord
     */
    public AgencyStatisticsRecord() {
        super(AgencyStatistics.AGENCY_STATISTICS);
    }

    /**
     * Create a detached, initialised AgencyStatisticsRecord
     */
    public AgencyStatisticsRecord(Integer employerId, Integer areaId, String areaPath, Integer professionalAreaId, Integer vacanciesNumber, Integer rank, Integer normalisedRank) {
        super(AgencyStatistics.AGENCY_STATISTICS);

        set(0, employerId);
        set(1, areaId);
        set(2, areaPath);
        set(3, professionalAreaId);
        set(4, vacanciesNumber);
        set(5, rank);
        set(6, normalisedRank);
    }
}