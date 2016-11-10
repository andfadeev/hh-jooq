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
import ru.hh.jooq.tables.records.ResumeFieldChangeHistoryRecord;


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
public class ResumeFieldChangeHistory extends TableImpl<ResumeFieldChangeHistoryRecord> {

    private static final long serialVersionUID = -2002870737;

    /**
     * The reference instance of <code>public.resume_field_change_history</code>
     */
    public static final ResumeFieldChangeHistory RESUME_FIELD_CHANGE_HISTORY = new ResumeFieldChangeHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeFieldChangeHistoryRecord> getRecordType() {
        return ResumeFieldChangeHistoryRecord.class;
    }

    /**
     * The column <code>public.resume_field_change_history.resume_field_change_history_id</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, Integer> RESUME_FIELD_CHANGE_HISTORY_ID = createField("resume_field_change_history_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('resume_field_change_history_resume_field_change_history_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.resume_field_change_history.resume_id</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_field_change_history.user_id</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_field_change_history.request_id</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, String> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.resume_field_change_history.field_name</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>public.resume_field_change_history.change_date</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, LocalDateTime> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.resume_field_change_history.old_value</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, String> OLD_VALUE = createField("old_value", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "");

    /**
     * The column <code>public.resume_field_change_history.new_value</code>.
     */
    public final TableField<ResumeFieldChangeHistoryRecord, String> NEW_VALUE = createField("new_value", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "");

    /**
     * Create a <code>public.resume_field_change_history</code> table reference
     */
    public ResumeFieldChangeHistory() {
        this("resume_field_change_history", null);
    }

    /**
     * Create an aliased <code>public.resume_field_change_history</code> table reference
     */
    public ResumeFieldChangeHistory(String alias) {
        this(alias, RESUME_FIELD_CHANGE_HISTORY);
    }

    private ResumeFieldChangeHistory(String alias, Table<ResumeFieldChangeHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeFieldChangeHistory(String alias, Table<ResumeFieldChangeHistoryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ResumeFieldChangeHistoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESUME_FIELD_CHANGE_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResumeFieldChangeHistoryRecord> getPrimaryKey() {
        return Keys.RESUME_FIELD_CHANGE_HISTORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeFieldChangeHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeFieldChangeHistoryRecord>>asList(Keys.RESUME_FIELD_CHANGE_HISTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumeFieldChangeHistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeFieldChangeHistoryRecord, ?>>asList(Keys.RESUME_FIELD_CHANGE_HISTORY__FK_RESUME_FIELD_CHANGE_HISTORY_RESUME, Keys.RESUME_FIELD_CHANGE_HISTORY__FK_RESUME_FIELD_CHANGE_HISTORY_HHUSER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeFieldChangeHistory as(String alias) {
        return new ResumeFieldChangeHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeFieldChangeHistory rename(String name) {
        return new ResumeFieldChangeHistory(name, null);
    }
}