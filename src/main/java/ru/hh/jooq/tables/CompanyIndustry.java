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
import ru.hh.jooq.tables.records.CompanyIndustryRecord;


/**
 * many-to-many cross table between company and industry
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyIndustry extends TableImpl<CompanyIndustryRecord> {

    private static final long serialVersionUID = 1970242061;

    /**
     * The reference instance of <code>public.company_industry</code>
     */
    public static final CompanyIndustry COMPANY_INDUSTRY = new CompanyIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyIndustryRecord> getRecordType() {
        return CompanyIndustryRecord.class;
    }

    /**
     * The column <code>public.company_industry.company_id</code>.
     */
    public final TableField<CompanyIndustryRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.company_industry.industry_id</code>.
     */
    public final TableField<CompanyIndustryRecord, Integer> INDUSTRY_ID = createField("industry_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.company_industry</code> table reference
     */
    public CompanyIndustry() {
        this("company_industry", null);
    }

    /**
     * Create an aliased <code>public.company_industry</code> table reference
     */
    public CompanyIndustry(String alias) {
        this(alias, COMPANY_INDUSTRY);
    }

    private CompanyIndustry(String alias, Table<CompanyIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyIndustry(String alias, Table<CompanyIndustryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "many-to-many cross table between company and industry");
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
    public UniqueKey<CompanyIndustryRecord> getPrimaryKey() {
        return Keys.COMPANY_INDUSTRY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompanyIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<CompanyIndustryRecord>>asList(Keys.COMPANY_INDUSTRY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompanyIndustryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompanyIndustryRecord, ?>>asList(Keys.COMPANY_INDUSTRY__COMPANY_INDUSTRY_COMPANY_ID_FKEY, Keys.COMPANY_INDUSTRY__COMPANY_INDUSTRY_INDUSTRY_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyIndustry as(String alias) {
        return new CompanyIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyIndustry rename(String name) {
        return new CompanyIndustry(name, null);
    }
}