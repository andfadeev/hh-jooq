/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.WorkTicketRecord;


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
public class WorkTicket extends TableImpl<WorkTicketRecord> {

    private static final long serialVersionUID = -1747863975;

    /**
     * The reference instance of <code>public.work_ticket</code>
     */
    public static final WorkTicket WORK_TICKET = new WorkTicket();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WorkTicketRecord> getRecordType() {
        return WorkTicketRecord.class;
    }

    /**
     * The column <code>public.work_ticket.work_ticket_id</code>.
     */
    public final TableField<WorkTicketRecord, Integer> WORK_TICKET_ID = createField("work_ticket_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('work_ticket_work_ticket_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.work_ticket.resume_id</code>.
     */
    public final TableField<WorkTicketRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.work_ticket.area_id</code>.
     */
    public final TableField<WorkTicketRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.work_ticket</code> table reference
     */
    public WorkTicket() {
        this("work_ticket", null);
    }

    /**
     * Create an aliased <code>public.work_ticket</code> table reference
     */
    public WorkTicket(String alias) {
        this(alias, WORK_TICKET);
    }

    private WorkTicket(String alias, Table<WorkTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private WorkTicket(String alias, Table<WorkTicketRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WorkTicketRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WORK_TICKET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WorkTicketRecord> getPrimaryKey() {
        return Keys.WORK_TICKET_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WorkTicketRecord>> getKeys() {
        return Arrays.<UniqueKey<WorkTicketRecord>>asList(Keys.WORK_TICKET_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<WorkTicketRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<WorkTicketRecord, ?>>asList(Keys.WORK_TICKET__AREA_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorkTicket as(String alias) {
        return new WorkTicket(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WorkTicket rename(String name) {
        return new WorkTicket(name, null);
    }
}