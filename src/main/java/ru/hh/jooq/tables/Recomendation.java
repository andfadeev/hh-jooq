/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.RecomendationRecord;


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
public class Recomendation extends TableImpl<RecomendationRecord> {

    private static final long serialVersionUID = 824147800;

    /**
     * The reference instance of <code>public.recomendation</code>
     */
    public static final Recomendation RECOMENDATION = new Recomendation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecomendationRecord> getRecordType() {
        return RecomendationRecord.class;
    }

    /**
     * The column <code>public.recomendation.recomendation_id</code>.
     */
    public final TableField<RecomendationRecord, Integer> RECOMENDATION_ID = createField("recomendation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('recomendation_recomendation_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.recomendation.resume_id</code>.
     */
    public final TableField<RecomendationRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.recomendation.name</code>.
     */
    public final TableField<RecomendationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.recomendation.organization</code>.
     */
    public final TableField<RecomendationRecord, String> ORGANIZATION = createField("organization", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.recomendation.contact_info</code>.
     */
    public final TableField<RecomendationRecord, String> CONTACT_INFO = createField("contact_info", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.recomendation.post</code>.
     */
    public final TableField<RecomendationRecord, String> POST = createField("post", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.recomendation</code> table reference
     */
    public Recomendation() {
        this("recomendation", null);
    }

    /**
     * Create an aliased <code>public.recomendation</code> table reference
     */
    public Recomendation(String alias) {
        this(alias, RECOMENDATION);
    }

    private Recomendation(String alias, Table<RecomendationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Recomendation(String alias, Table<RecomendationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<RecomendationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RECOMENDATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RecomendationRecord> getPrimaryKey() {
        return Keys.RECOMENDATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RecomendationRecord>> getKeys() {
        return Arrays.<UniqueKey<RecomendationRecord>>asList(Keys.RECOMENDATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Recomendation as(String alias) {
        return new Recomendation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Recomendation rename(String name) {
        return new Recomendation(name, null);
    }
}
