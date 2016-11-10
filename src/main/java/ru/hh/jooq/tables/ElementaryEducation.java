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
import ru.hh.jooq.tables.records.ElementaryEducationRecord;


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
public class ElementaryEducation extends TableImpl<ElementaryEducationRecord> {

    private static final long serialVersionUID = -1124062518;

    /**
     * The reference instance of <code>public.elementary_education</code>
     */
    public static final ElementaryEducation ELEMENTARY_EDUCATION = new ElementaryEducation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ElementaryEducationRecord> getRecordType() {
        return ElementaryEducationRecord.class;
    }

    /**
     * The column <code>public.elementary_education.elementary_education_id</code>.
     */
    public final TableField<ElementaryEducationRecord, Integer> ELEMENTARY_EDUCATION_ID = createField("elementary_education_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('elementary_education_elementary_education_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.elementary_education.name</code>.
     */
    public final TableField<ElementaryEducationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>public.elementary_education.end_date</code>.
     */
    public final TableField<ElementaryEducationRecord, LocalDateTime> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.elementary_education.resume_id</code>.
     */
    public final TableField<ElementaryEducationRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.elementary_education.sort_order</code>.
     */
    public final TableField<ElementaryEducationRecord, Integer> SORT_ORDER = createField("sort_order", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.elementary_education</code> table reference
     */
    public ElementaryEducation() {
        this("elementary_education", null);
    }

    /**
     * Create an aliased <code>public.elementary_education</code> table reference
     */
    public ElementaryEducation(String alias) {
        this(alias, ELEMENTARY_EDUCATION);
    }

    private ElementaryEducation(String alias, Table<ElementaryEducationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ElementaryEducation(String alias, Table<ElementaryEducationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ElementaryEducationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ELEMENTARY_EDUCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ElementaryEducationRecord> getPrimaryKey() {
        return Keys.ELEMENTARY_EDUCATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ElementaryEducationRecord>> getKeys() {
        return Arrays.<UniqueKey<ElementaryEducationRecord>>asList(Keys.ELEMENTARY_EDUCATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ElementaryEducationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ElementaryEducationRecord, ?>>asList(Keys.ELEMENTARY_EDUCATION__ELEMENTARY_EDUCATION_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ElementaryEducation as(String alias) {
        return new ElementaryEducation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementaryEducation rename(String name) {
        return new ElementaryEducation(name, null);
    }
}