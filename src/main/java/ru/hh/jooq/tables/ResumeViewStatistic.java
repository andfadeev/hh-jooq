/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDate;
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
import ru.hh.jooq.tables.records.ResumeViewStatisticRecord;


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
public class ResumeViewStatistic extends TableImpl<ResumeViewStatisticRecord> {

    private static final long serialVersionUID = -1859819708;

    /**
     * The reference instance of <code>public.resume_view_statistic</code>
     */
    public static final ResumeViewStatistic RESUME_VIEW_STATISTIC = new ResumeViewStatistic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeViewStatisticRecord> getRecordType() {
        return ResumeViewStatisticRecord.class;
    }

    /**
     * The column <code>public.resume_view_statistic.date</code>.
     */
    public final TableField<ResumeViewStatisticRecord, LocalDate> DATE = createField("date", org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.resume_view_statistic.employer_manager_id</code>.
     */
    public final TableField<ResumeViewStatisticRecord, Integer> EMPLOYER_MANAGER_ID = createField("employer_manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_view_statistic.view_count</code>.
     */
    public final TableField<ResumeViewStatisticRecord, Integer> VIEW_COUNT = createField("view_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.resume_view_statistic</code> table reference
     */
    public ResumeViewStatistic() {
        this("resume_view_statistic", null);
    }

    /**
     * Create an aliased <code>public.resume_view_statistic</code> table reference
     */
    public ResumeViewStatistic(String alias) {
        this(alias, RESUME_VIEW_STATISTIC);
    }

    private ResumeViewStatistic(String alias, Table<ResumeViewStatisticRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeViewStatistic(String alias, Table<ResumeViewStatisticRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ResumeViewStatisticRecord> getPrimaryKey() {
        return Keys.RESUME_VIEW_STATISTIC_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeViewStatisticRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeViewStatisticRecord>>asList(Keys.RESUME_VIEW_STATISTIC_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewStatistic as(String alias) {
        return new ResumeViewStatistic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeViewStatistic rename(String name) {
        return new ResumeViewStatistic(name, null);
    }
}
