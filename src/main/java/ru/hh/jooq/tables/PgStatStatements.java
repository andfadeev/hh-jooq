/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.PgStatStatementsRecord;


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
public class PgStatStatements extends TableImpl<PgStatStatementsRecord> {

    private static final long serialVersionUID = 1817245603;

    /**
     * The reference instance of <code>public.pg_stat_statements</code>
     */
    public static final PgStatStatements PG_STAT_STATEMENTS = new PgStatStatements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatStatementsRecord> getRecordType() {
        return PgStatStatementsRecord.class;
    }

    /**
     * The column <code>public.pg_stat_statements.userid</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> USERID = createField("userid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.dbid</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> DBID = createField("dbid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.queryid</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> QUERYID = createField("queryid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.query</code>.
     */
    public final TableField<PgStatStatementsRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.pg_stat_statements.calls</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> CALLS = createField("calls", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.total_time</code>.
     */
    public final TableField<PgStatStatementsRecord, Double> TOTAL_TIME = createField("total_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.pg_stat_statements.rows</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> ROWS = createField("rows", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.shared_blks_hit</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> SHARED_BLKS_HIT = createField("shared_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.shared_blks_read</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> SHARED_BLKS_READ = createField("shared_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.shared_blks_dirtied</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> SHARED_BLKS_DIRTIED = createField("shared_blks_dirtied", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.shared_blks_written</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> SHARED_BLKS_WRITTEN = createField("shared_blks_written", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.local_blks_hit</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> LOCAL_BLKS_HIT = createField("local_blks_hit", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.local_blks_read</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> LOCAL_BLKS_READ = createField("local_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.local_blks_dirtied</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> LOCAL_BLKS_DIRTIED = createField("local_blks_dirtied", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.local_blks_written</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> LOCAL_BLKS_WRITTEN = createField("local_blks_written", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.temp_blks_read</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> TEMP_BLKS_READ = createField("temp_blks_read", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.temp_blks_written</code>.
     */
    public final TableField<PgStatStatementsRecord, Long> TEMP_BLKS_WRITTEN = createField("temp_blks_written", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pg_stat_statements.blk_read_time</code>.
     */
    public final TableField<PgStatStatementsRecord, Double> BLK_READ_TIME = createField("blk_read_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.pg_stat_statements.blk_write_time</code>.
     */
    public final TableField<PgStatStatementsRecord, Double> BLK_WRITE_TIME = createField("blk_write_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>public.pg_stat_statements</code> table reference
     */
    public PgStatStatements() {
        this("pg_stat_statements", null);
    }

    /**
     * Create an aliased <code>public.pg_stat_statements</code> table reference
     */
    public PgStatStatements(String alias) {
        this(alias, PG_STAT_STATEMENTS);
    }

    private PgStatStatements(String alias, Table<PgStatStatementsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatStatements(String alias, Table<PgStatStatementsRecord> aliased, Field<?>[] parameters) {
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
    public PgStatStatements as(String alias) {
        return new PgStatStatements(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatStatements rename(String name) {
        return new PgStatStatements(name, null);
    }
}
