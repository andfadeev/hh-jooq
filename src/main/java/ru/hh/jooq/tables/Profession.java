/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.ProfessionRecord;


/**
 * profession is an entity that is used to suggest resume or vacancy names 
 * and links to set of specializations with text stored in translations
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Profession extends TableImpl<ProfessionRecord> {

    private static final long serialVersionUID = 651677097;

    /**
     * The reference instance of <code>public.profession</code>
     */
    public static final Profession PROFESSION = new Profession();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfessionRecord> getRecordType() {
        return ProfessionRecord.class;
    }

    /**
     * The column <code>public.profession.profession_id</code>.
     */
    public final TableField<ProfessionRecord, Integer> PROFESSION_ID = createField("profession_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('profession_profession_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.profession.rating</code>.
     */
    public final TableField<ProfessionRecord, Integer> RATING = createField("rating", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.profession.profession_group_id</code>.
     */
    public final TableField<ProfessionRecord, Integer> PROFESSION_GROUP_ID = createField("profession_group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.profession</code> table reference
     */
    public Profession() {
        this("profession", null);
    }

    /**
     * Create an aliased <code>public.profession</code> table reference
     */
    public Profession(String alias) {
        this(alias, PROFESSION);
    }

    private Profession(String alias, Table<ProfessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Profession(String alias, Table<ProfessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "profession is an entity that is used to suggest resume or vacancy names and links to set of specializations with text stored in translations");
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
    public Identity<ProfessionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROFESSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProfessionRecord> getPrimaryKey() {
        return Keys.PROFESSION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfessionRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfessionRecord>>asList(Keys.PROFESSION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProfessionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProfessionRecord, ?>>asList(Keys.PROFESSION__PROFESSION_PROFESSION_GROUP_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Profession as(String alias) {
        return new Profession(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Profession rename(String name) {
        return new Profession(name, null);
    }
}
