/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.VacancyBlackList;


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
public class VacancyBlackListRecord extends UpdatableRecordImpl<VacancyBlackListRecord> implements Record4<Integer, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = -2026825828;

    /**
     * Setter for <code>public.vacancy_black_list.vacancy_black_list_id</code>.
     */
    public void setVacancyBlackListId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vacancy_black_list.vacancy_black_list_id</code>.
     */
    public Integer getVacancyBlackListId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.vacancy_black_list.creation_date</code>.
     */
    public void setCreationDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vacancy_black_list.creation_date</code>.
     */
    public LocalDateTime getCreationDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.vacancy_black_list.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vacancy_black_list.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.vacancy_black_list.vacancy_id</code>.
     */
    public void setVacancyId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vacancy_black_list.vacancy_id</code>.
     */
    public Integer getVacancyId() {
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
    public Row4<Integer, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return VacancyBlackList.VACANCY_BLACK_LIST.VACANCY_BLACK_LIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return VacancyBlackList.VACANCY_BLACK_LIST.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return VacancyBlackList.VACANCY_BLACK_LIST.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return VacancyBlackList.VACANCY_BLACK_LIST.VACANCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVacancyBlackListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVacancyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyBlackListRecord value1(Integer value) {
        setVacancyBlackListId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyBlackListRecord value2(LocalDateTime value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyBlackListRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyBlackListRecord value4(Integer value) {
        setVacancyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyBlackListRecord values(Integer value1, LocalDateTime value2, Integer value3, Integer value4) {
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
     * Create a detached VacancyBlackListRecord
     */
    public VacancyBlackListRecord() {
        super(VacancyBlackList.VACANCY_BLACK_LIST);
    }

    /**
     * Create a detached, initialised VacancyBlackListRecord
     */
    public VacancyBlackListRecord(Integer vacancyBlackListId, LocalDateTime creationDate, Integer userId, Integer vacancyId) {
        super(VacancyBlackList.VACANCY_BLACK_LIST);

        set(0, vacancyBlackListId);
        set(1, creationDate);
        set(2, userId);
        set(3, vacancyId);
    }
}
