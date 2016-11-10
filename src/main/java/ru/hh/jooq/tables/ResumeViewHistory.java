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
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumeViewHistoryRecord;


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
public class ResumeViewHistory extends TableImpl<ResumeViewHistoryRecord> {

    private static final long serialVersionUID = -122886866;

    /**
     * The reference instance of <code>public.resume_view_history</code>
     */
    public static final ResumeViewHistory RESUME_VIEW_HISTORY = new ResumeViewHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeViewHistoryRecord> getRecordType() {
        return ResumeViewHistoryRecord.class;
    }

    /**
     * The column <code>public.resume_view_history.date</code>.
     */
    public final TableField<ResumeViewHistoryRecord, LocalDateTime> DATE = createField("date", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.resume_view_history.employer_id</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_view_history.user_id</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_view_history.resume_id</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.resume_view_history.vacancy_id</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.resume_view_history.user_ip</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Integer> USER_IP = createField("user_ip", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.resume_view_history.counters_increased</code>.
     */
    public final TableField<ResumeViewHistoryRecord, Boolean> COUNTERS_INCREASED = createField("counters_increased", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>public.resume_view_history</code> table reference
     */
    public ResumeViewHistory() {
        this("resume_view_history", null);
    }

    /**
     * Create an aliased <code>public.resume_view_history</code> table reference
     */
    public ResumeViewHistory(String alias) {
        this(alias, RESUME_VIEW_HISTORY);
    }

    private ResumeViewHistory(String alias, Table<ResumeViewHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeViewHistory(String alias, Table<ResumeViewHistoryRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<ResumeViewHistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeViewHistoryRecord, ?>>asList(Keys.RESUME_VIEW_HISTORY__EMPLOYER_ID_FKEY, Keys.RESUME_VIEW_HISTORY__RESUME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeViewHistory as(String alias) {
        return new ResumeViewHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeViewHistory rename(String name) {
        return new ResumeViewHistory(name, null);
    }
}
