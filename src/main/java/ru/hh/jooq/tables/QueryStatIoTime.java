/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.QueryStatIoTimeRecord;


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
public class QueryStatIoTime extends TableImpl<QueryStatIoTimeRecord> {

    private static final long serialVersionUID = 131256757;

    /**
     * The reference instance of <code>public.query_stat_io_time</code>
     */
    public static final QueryStatIoTime QUERY_STAT_IO_TIME = new QueryStatIoTime();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QueryStatIoTimeRecord> getRecordType() {
        return QueryStatIoTimeRecord.class;
    }

    /**
     * The column <code>public.query_stat_io_time.time_percent</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> TIME_PERCENT = createField("time_percent", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.iotime_percent</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> IOTIME_PERCENT = createField("iotime_percent", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.cputime_percent</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> CPUTIME_PERCENT = createField("cputime_percent", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.total_time</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> TOTAL_TIME = createField("total_time", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.avg_time</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> AVG_TIME = createField("avg_time", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.query_stat_io_time.avg_io_time</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> AVG_IO_TIME = createField("avg_io_time", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.query_stat_io_time.calls</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> CALLS = createField("calls", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.query_stat_io_time.calls_percent</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> CALLS_PERCENT = createField("calls_percent", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.rows</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> ROWS = createField("rows", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.query_stat_io_time.row_percent</code>.
     */
    public final TableField<QueryStatIoTimeRecord, BigDecimal> ROW_PERCENT = createField("row_percent", org.jooq.impl.SQLDataType.NUMERIC.precision(20, 2), this, "");

    /**
     * The column <code>public.query_stat_io_time.query</code>.
     */
    public final TableField<QueryStatIoTimeRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.query_stat_io_time</code> table reference
     */
    public QueryStatIoTime() {
        this("query_stat_io_time", null);
    }

    /**
     * Create an aliased <code>public.query_stat_io_time</code> table reference
     */
    public QueryStatIoTime(String alias) {
        this(alias, QUERY_STAT_IO_TIME);
    }

    private QueryStatIoTime(String alias, Table<QueryStatIoTimeRecord> aliased) {
        this(alias, aliased, null);
    }

    private QueryStatIoTime(String alias, Table<QueryStatIoTimeRecord> aliased, Field<?>[] parameters) {
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
    public QueryStatIoTime as(String alias) {
        return new QueryStatIoTime(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QueryStatIoTime rename(String name) {
        return new QueryStatIoTime(name, null);
    }
}
