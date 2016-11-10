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
import ru.hh.jooq.tables.records.CompanySynonymRecord;


/**
 * HH-37617 Create company synonym relation
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanySynonym extends TableImpl<CompanySynonymRecord> {

    private static final long serialVersionUID = -1465661389;

    /**
     * The reference instance of <code>public.company_synonym</code>
     */
    public static final CompanySynonym COMPANY_SYNONYM = new CompanySynonym();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanySynonymRecord> getRecordType() {
        return CompanySynonymRecord.class;
    }

    /**
     * The column <code>public.company_synonym.name</code>.
     */
    public final TableField<CompanySynonymRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.company_synonym.company_synonym_id</code>.
     */
    public final TableField<CompanySynonymRecord, Integer> COMPANY_SYNONYM_ID = createField("company_synonym_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('company_synonym_company_synonym_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.company_synonym.company_id</code>.
     */
    public final TableField<CompanySynonymRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.company_synonym.rate</code>.
     */
    public final TableField<CompanySynonymRecord, Integer> RATE = createField("rate", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.company_synonym</code> table reference
     */
    public CompanySynonym() {
        this("company_synonym", null);
    }

    /**
     * Create an aliased <code>public.company_synonym</code> table reference
     */
    public CompanySynonym(String alias) {
        this(alias, COMPANY_SYNONYM);
    }

    private CompanySynonym(String alias, Table<CompanySynonymRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanySynonym(String alias, Table<CompanySynonymRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "HH-37617 Create company synonym relation");
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
    public Identity<CompanySynonymRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMPANY_SYNONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompanySynonymRecord> getPrimaryKey() {
        return Keys.COMPANY_SYNONYM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompanySynonymRecord>> getKeys() {
        return Arrays.<UniqueKey<CompanySynonymRecord>>asList(Keys.COMPANY_SYNONYM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompanySynonymRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompanySynonymRecord, ?>>asList(Keys.COMPANY_SYNONYM__COMPANY_SYNONYM_COMPANY_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanySynonym as(String alias) {
        return new CompanySynonym(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanySynonym rename(String name) {
        return new CompanySynonym(name, null);
    }
}