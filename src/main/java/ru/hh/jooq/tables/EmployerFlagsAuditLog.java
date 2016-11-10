/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.EmployerFlagsAuditLogRecord;


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
public class EmployerFlagsAuditLog extends TableImpl<EmployerFlagsAuditLogRecord> {

    private static final long serialVersionUID = 1573754897;

    /**
     * The reference instance of <code>public.employer_flags_audit_log</code>
     */
    public static final EmployerFlagsAuditLog EMPLOYER_FLAGS_AUDIT_LOG = new EmployerFlagsAuditLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployerFlagsAuditLogRecord> getRecordType() {
        return EmployerFlagsAuditLogRecord.class;
    }

    /**
     * The column <code>public.employer_flags_audit_log.id</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('employer_flags_audit_log_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.employer_flags_audit_log.ts</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, LocalDateTime> TS = createField("ts", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("clock_timestamp()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.employer_flags_audit_log.query</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_query()", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>public.employer_flags_audit_log.employer_id</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.employer_flags_audit_log.old_flag_id</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, Integer> OLD_FLAG_ID = createField("old_flag_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.employer_flags_audit_log.new_flag_id</code>.
     */
    public final TableField<EmployerFlagsAuditLogRecord, Integer> NEW_FLAG_ID = createField("new_flag_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.employer_flags_audit_log</code> table reference
     */
    public EmployerFlagsAuditLog() {
        this("employer_flags_audit_log", null);
    }

    /**
     * Create an aliased <code>public.employer_flags_audit_log</code> table reference
     */
    public EmployerFlagsAuditLog(String alias) {
        this(alias, EMPLOYER_FLAGS_AUDIT_LOG);
    }

    private EmployerFlagsAuditLog(String alias, Table<EmployerFlagsAuditLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployerFlagsAuditLog(String alias, Table<EmployerFlagsAuditLogRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EmployerFlagsAuditLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMPLOYER_FLAGS_AUDIT_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployerFlagsAuditLogRecord> getPrimaryKey() {
        return Keys.EMPLOYER_FLAGS_AUDIT_LOG_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployerFlagsAuditLogRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployerFlagsAuditLogRecord>>asList(Keys.EMPLOYER_FLAGS_AUDIT_LOG_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerFlagsAuditLog as(String alias) {
        return new EmployerFlagsAuditLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployerFlagsAuditLog rename(String name) {
        return new EmployerFlagsAuditLog(name, null);
    }
}