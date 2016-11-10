/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.WorkTicket;


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
public class WorkTicketRecord extends UpdatableRecordImpl<WorkTicketRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -987893248;

    /**
     * Setter for <code>public.work_ticket.work_ticket_id</code>.
     */
    public void setWorkTicketId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.work_ticket.work_ticket_id</code>.
     */
    public Integer getWorkTicketId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.work_ticket.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.work_ticket.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.work_ticket.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.work_ticket.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(2);
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
        return WorkTicket.WORK_TICKET.WORK_TICKET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return WorkTicket.WORK_TICKET.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WorkTicket.WORK_TICKET.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getWorkTicketId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkTicketRecord value1(Integer value) {
        setWorkTicketId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkTicketRecord value2(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkTicketRecord value3(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkTicketRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkTicketRecord
     */
    public WorkTicketRecord() {
        super(WorkTicket.WORK_TICKET);
    }

    /**
     * Create a detached, initialised WorkTicketRecord
     */
    public WorkTicketRecord(Integer workTicketId, Integer resumeId, Integer areaId) {
        super(WorkTicket.WORK_TICKET);

        set(0, workTicketId);
        set(1, resumeId);
        set(2, areaId);
    }
}