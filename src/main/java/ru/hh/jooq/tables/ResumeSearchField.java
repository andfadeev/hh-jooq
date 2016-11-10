/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.ResumeSearchFieldRecord;


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
public class ResumeSearchField extends TableImpl<ResumeSearchFieldRecord> {

    private static final long serialVersionUID = -540846384;

    /**
     * The reference instance of <code>public.resume_search_field</code>
     */
    public static final ResumeSearchField RESUME_SEARCH_FIELD = new ResumeSearchField();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeSearchFieldRecord> getRecordType() {
        return ResumeSearchFieldRecord.class;
    }

    /**
     * The column <code>public.resume_search_field.user_id</code>.
     */
    public final TableField<ResumeSearchFieldRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_search_field.name</code>.
     */
    public final TableField<ResumeSearchFieldRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

    /**
     * Create a <code>public.resume_search_field</code> table reference
     */
    public ResumeSearchField() {
        this("resume_search_field", null);
    }

    /**
     * Create an aliased <code>public.resume_search_field</code> table reference
     */
    public ResumeSearchField(String alias) {
        this(alias, RESUME_SEARCH_FIELD);
    }

    private ResumeSearchField(String alias, Table<ResumeSearchFieldRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeSearchField(String alias, Table<ResumeSearchFieldRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ResumeSearchFieldRecord> getPrimaryKey() {
        return Keys.RESUME_SEARCH_FIELD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeSearchFieldRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeSearchFieldRecord>>asList(Keys.RESUME_SEARCH_FIELD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumeSearchFieldRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeSearchFieldRecord, ?>>asList(Keys.RESUME_SEARCH_FIELD__RESUME_SEARCH_FIELD_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeSearchField as(String alias) {
        return new ResumeSearchField(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeSearchField rename(String name) {
        return new ResumeSearchField(name, null);
    }
}