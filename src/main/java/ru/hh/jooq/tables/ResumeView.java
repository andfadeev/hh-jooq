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
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumeViewRecord;


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
public class ResumeView extends TableImpl<ResumeViewRecord> {

    private static final long serialVersionUID = 1073971897;

    /**
     * The reference instance of <code>public.resume_view</code>
     */
    public static final ResumeView RESUME_VIEW = new ResumeView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeViewRecord> getRecordType() {
        return ResumeViewRecord.class;
    }

    /**
     * The column <code>public.resume_view.resume_id</code>.
     */
    public final TableField<ResumeViewRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_view.count_</code>.
     */
    public final TableField<ResumeViewRecord, Integer> COUNT_ = createField("count_", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_view.new_count</code>.
     */
    public final TableField<ResumeViewRecord, Integer> NEW_COUNT = createField("new_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.resume_view.last_history_visit</code>.
     */
    public final TableField<ResumeViewRecord, LocalDateTime> LAST_HISTORY_VISIT = createField("last_history_visit", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.resume_view</code> table reference
     */
    public ResumeView() {
        this("resume_view", null);
    }

    /**
     * Create an aliased <code>public.resume_view</code> table reference
     */
    public ResumeView(String alias) {
        this(alias, RESUME_VIEW);
    }

    private ResumeView(String alias, Table<ResumeViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeView(String alias, Table<ResumeViewRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ResumeViewRecord> getPrimaryKey() {
        return Keys.RESUME_VIEW_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeViewRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeViewRecord>>asList(Keys.RESUME_VIEW_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumeViewRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeViewRecord, ?>>asList(Keys.RESUME_VIEW__RESUME_VIEW_RESUME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeView as(String alias) {
        return new ResumeView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeView rename(String name) {
        return new ResumeView(name, null);
    }
}