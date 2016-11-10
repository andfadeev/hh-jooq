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
import ru.hh.jooq.tables.records.DbVersionHistoryRecord;


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
public class DbVersionHistory extends TableImpl<DbVersionHistoryRecord> {

    private static final long serialVersionUID = -1163595154;

    /**
     * The reference instance of <code>public.db_version_history</code>
     */
    public static final DbVersionHistory DB_VERSION_HISTORY = new DbVersionHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbVersionHistoryRecord> getRecordType() {
        return DbVersionHistoryRecord.class;
    }

    /**
     * The column <code>public.db_version_history.db_version_history_id</code>.
     */
    public final TableField<DbVersionHistoryRecord, Integer> DB_VERSION_HISTORY_ID = createField("db_version_history_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('db_version_history_db_version_history_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.db_version_history.install_time</code>.
     */
    public final TableField<DbVersionHistoryRecord, LocalDateTime> INSTALL_TIME = createField("install_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.db_version_history.version</code>.
     */
    public final TableField<DbVersionHistoryRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.db_version_history</code> table reference
     */
    public DbVersionHistory() {
        this("db_version_history", null);
    }

    /**
     * Create an aliased <code>public.db_version_history</code> table reference
     */
    public DbVersionHistory(String alias) {
        this(alias, DB_VERSION_HISTORY);
    }

    private DbVersionHistory(String alias, Table<DbVersionHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private DbVersionHistory(String alias, Table<DbVersionHistoryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DbVersionHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DB_VERSION_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DbVersionHistoryRecord> getPrimaryKey() {
        return Keys.DB_VERSION_HISTORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DbVersionHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<DbVersionHistoryRecord>>asList(Keys.DB_VERSION_HISTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbVersionHistory as(String alias) {
        return new DbVersionHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DbVersionHistory rename(String name) {
        return new DbVersionHistory(name, null);
    }
}
