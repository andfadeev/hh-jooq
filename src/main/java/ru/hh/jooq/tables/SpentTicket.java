/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.SpentTicketRecord;


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
public class SpentTicket extends TableImpl<SpentTicketRecord> {

    private static final long serialVersionUID = 643578932;

    /**
     * The reference instance of <code>public.spent_ticket</code>
     */
    public static final SpentTicket SPENT_TICKET = new SpentTicket();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpentTicketRecord> getRecordType() {
        return SpentTicketRecord.class;
    }

    /**
     * The column <code>public.spent_ticket.sent</code>. unused
     */
    public final TableField<SpentTicketRecord, Boolean> SENT = createField("sent", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "unused");

    /**
     * The column <code>public.spent_ticket.uid</code>.
     */
    public final TableField<SpentTicketRecord, Long> UID = createField("uid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.spent_ticket.time</code>.
     */
    public final TableField<SpentTicketRecord, LocalDateTime> TIME = createField("time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.spent_ticket.vacancy_id</code>.
     */
    public final TableField<SpentTicketRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.spent_ticket.restored</code>. unused
     */
    public final TableField<SpentTicketRecord, Boolean> RESTORED = createField("restored", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "unused");

    /**
     * The column <code>public.spent_ticket.manager_id</code>.
     */
    public final TableField<SpentTicketRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.spent_ticket</code> table reference
     */
    public SpentTicket() {
        this("spent_ticket", null);
    }

    /**
     * Create an aliased <code>public.spent_ticket</code> table reference
     */
    public SpentTicket(String alias) {
        this(alias, SPENT_TICKET);
    }

    private SpentTicket(String alias, Table<SpentTicketRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpentTicket(String alias, Table<SpentTicketRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SpentTicketRecord> getPrimaryKey() {
        return Keys.SPENT_TICKET_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpentTicketRecord>> getKeys() {
        return Arrays.<UniqueKey<SpentTicketRecord>>asList(Keys.SPENT_TICKET_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTicket as(String alias) {
        return new SpentTicket(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpentTicket rename(String name) {
        return new SpentTicket(name, null);
    }
}
