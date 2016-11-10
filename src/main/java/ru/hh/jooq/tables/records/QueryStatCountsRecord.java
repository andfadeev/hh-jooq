/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.QueryStatCounts;


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
public class QueryStatCountsRecord extends TableRecordImpl<QueryStatCountsRecord> implements Record1<Record> {

    private static final long serialVersionUID = 2003160818;

    /**
     * Setter for <code>public.query_stat_counts.query_stat_counts</code>.
     */
    public void setQueryStatCounts(Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.query_stat_counts.query_stat_counts</code>.
     */
    public Record getQueryStatCounts() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Record> field1() {
        return QueryStatCounts.QUERY_STAT_COUNTS.QUERY_STAT_COUNTS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record value1() {
        return getQueryStatCounts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryStatCountsRecord value1(Record value) {
        setQueryStatCounts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryStatCountsRecord values(Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QueryStatCountsRecord
     */
    public QueryStatCountsRecord() {
        super(QueryStatCounts.QUERY_STAT_COUNTS);
    }

    /**
     * Create a detached, initialised QueryStatCountsRecord
     */
    public QueryStatCountsRecord(Record queryStatCounts) {
        super(QueryStatCounts.QUERY_STAT_COUNTS);

        set(0, queryStatCounts);
    }
}