/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
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
import ru.hh.jooq.tables.records.EventRecord;


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
public class Event extends TableImpl<EventRecord> {

    private static final long serialVersionUID = -1976968787;

    /**
     * The reference instance of <code>public.event</code>
     */
    public static final Event EVENT = new Event();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventRecord> getRecordType() {
        return EventRecord.class;
    }

    /**
     * The column <code>public.event.event_id</code>.
     */
    public final TableField<EventRecord, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('event_event_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.event.event_type_id</code>.
     */
    public final TableField<EventRecord, Integer> EVENT_TYPE_ID = createField("event_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.event.employer_id</code>.
     */
    public final TableField<EventRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.event.user_id</code>.
     */
    public final TableField<EventRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.event.creation_time</code>.
     */
    public final TableField<EventRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("'1970-01-01 00:00:00'::timestamp without time zone", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.event.description</code>.
     */
    public final TableField<EventRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.event.end_time</code>.
     */
    public final TableField<EventRecord, LocalDateTime> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.event.notification_time</code>.
     */
    public final TableField<EventRecord, LocalDateTime> NOTIFICATION_TIME = createField("notification_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.event.title</code>.
     */
    public final TableField<EventRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.event.disabled</code>.
     */
    public final TableField<EventRecord, Boolean> DISABLED = createField("disabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.event.notified</code>.
     */
    public final TableField<EventRecord, Boolean> NOTIFIED = createField("notified", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.event.done</code>.
     */
    public final TableField<EventRecord, Boolean> DONE = createField("done", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.event.whole_day</code>.
     */
    public final TableField<EventRecord, Boolean> WHOLE_DAY = createField("whole_day", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.event.task</code>.
     */
    public final TableField<EventRecord, Boolean> TASK = createField("task", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.event.billing_event_id</code>.
     */
    public final TableField<EventRecord, Integer> BILLING_EVENT_ID = createField("billing_event_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.event</code> table reference
     */
    public Event() {
        this("event", null);
    }

    /**
     * Create an aliased <code>public.event</code> table reference
     */
    public Event(String alias) {
        this(alias, EVENT);
    }

    private Event(String alias, Table<EventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Event(String alias, Table<EventRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventRecord> getPrimaryKey() {
        return Keys.EVENT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventRecord>> getKeys() {
        return Arrays.<UniqueKey<EventRecord>>asList(Keys.EVENT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventRecord, ?>>asList(Keys.EVENT__EVENT_TYPE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Event as(String alias) {
        return new Event(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Event rename(String name) {
        return new Event(name, null);
    }
}