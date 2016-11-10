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
import ru.hh.jooq.tables.records.NotificationFailureRecord;


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
public class NotificationFailure extends TableImpl<NotificationFailureRecord> {

    private static final long serialVersionUID = -312130221;

    /**
     * The reference instance of <code>public.notification_failure</code>
     */
    public static final NotificationFailure NOTIFICATION_FAILURE = new NotificationFailure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationFailureRecord> getRecordType() {
        return NotificationFailureRecord.class;
    }

    /**
     * The column <code>public.notification_failure.notification_failure_id</code>.
     */
    public final TableField<NotificationFailureRecord, Long> NOTIFICATION_FAILURE_ID = createField("notification_failure_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('notification_failure_notification_failure_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.notification_failure.device_id</code>.
     */
    public final TableField<NotificationFailureRecord, Integer> DEVICE_ID = createField("device_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.notification_failure.failure_datetime</code>.
     */
    public final TableField<NotificationFailureRecord, LocalDateTime> FAILURE_DATETIME = createField("failure_datetime", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.notification_failure.failure_cause</code>.
     */
    public final TableField<NotificationFailureRecord, String> FAILURE_CAUSE = createField("failure_cause", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

    /**
     * Create a <code>public.notification_failure</code> table reference
     */
    public NotificationFailure() {
        this("notification_failure", null);
    }

    /**
     * Create an aliased <code>public.notification_failure</code> table reference
     */
    public NotificationFailure(String alias) {
        this(alias, NOTIFICATION_FAILURE);
    }

    private NotificationFailure(String alias, Table<NotificationFailureRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationFailure(String alias, Table<NotificationFailureRecord> aliased, Field<?>[] parameters) {
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
    public Identity<NotificationFailureRecord, Long> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_FAILURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NotificationFailureRecord> getPrimaryKey() {
        return Keys.NOTIFICATION_FAILURE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NotificationFailureRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationFailureRecord>>asList(Keys.NOTIFICATION_FAILURE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NotificationFailureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NotificationFailureRecord, ?>>asList(Keys.NOTIFICATION_FAILURE__NOTIFICATION_FAILURE_DEVICE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NotificationFailure as(String alias) {
        return new NotificationFailure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationFailure rename(String name) {
        return new NotificationFailure(name, null);
    }
}