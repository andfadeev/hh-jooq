/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.SpentTicket;


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
public class SpentTicketRecord extends UpdatableRecordImpl<SpentTicketRecord> implements Record6<Boolean, Long, LocalDateTime, Integer, Boolean, Integer> {

    private static final long serialVersionUID = -402148058;

    /**
     * Setter for <code>public.spent_ticket.sent</code>. unused
     */
    public void setSent(Boolean value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spent_ticket.sent</code>. unused
     */
    public Boolean getSent() {
        return (Boolean) get(0);
    }

    /**
     * Setter for <code>public.spent_ticket.uid</code>.
     */
    public void setUid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spent_ticket.uid</code>.
     */
    public Long getUid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.spent_ticket.time</code>.
     */
    public void setTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spent_ticket.time</code>.
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.spent_ticket.vacancy_id</code>.
     */
    public void setVacancyId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spent_ticket.vacancy_id</code>.
     */
    public Integer getVacancyId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.spent_ticket.restored</code>. unused
     */
    public void setRestored(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spent_ticket.restored</code>. unused
     */
    public Boolean getRestored() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.spent_ticket.manager_id</code>.
     */
    public void setManagerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.spent_ticket.manager_id</code>.
     */
    public Integer getManagerId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Boolean, Long, LocalDateTime, Integer, Boolean, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Boolean, Long, LocalDateTime, Integer, Boolean, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field1() {
        return SpentTicket.SPENT_TICKET.SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return SpentTicket.SPENT_TICKET.UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return SpentTicket.SPENT_TICKET.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SpentTicket.SPENT_TICKET.VACANCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return SpentTicket.SPENT_TICKET.RESTORED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SpentTicket.SPENT_TICKET.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value1() {
        return getSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getTime();
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
    public Boolean value5() {
        return getRestored();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value1(Boolean value) {
        setSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value2(Long value) {
        setUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value3(LocalDateTime value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value4(Integer value) {
        setVacancyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value5(Boolean value) {
        setRestored(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord value6(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicketRecord values(Boolean value1, Long value2, LocalDateTime value3, Integer value4, Boolean value5, Integer value6) {
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
     * Create a detached SpentTicketRecord
     */
    public SpentTicketRecord() {
        super(SpentTicket.SPENT_TICKET);
    }

    /**
     * Create a detached, initialised SpentTicketRecord
     */
    public SpentTicketRecord(Boolean sent, Long uid, LocalDateTime time, Integer vacancyId, Boolean restored, Integer managerId) {
        super(SpentTicket.SPENT_TICKET);

        set(0, sent);
        set(1, uid);
        set(2, time);
        set(3, vacancyId);
        set(4, restored);
        set(5, managerId);
    }
}
