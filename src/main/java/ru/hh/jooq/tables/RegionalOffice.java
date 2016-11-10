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
import ru.hh.jooq.tables.records.RegionalOfficeRecord;


/**
 * Area scope of regional office
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegionalOffice extends TableImpl<RegionalOfficeRecord> {

    private static final long serialVersionUID = 824457902;

    /**
     * The reference instance of <code>public.regional_office</code>
     */
    public static final RegionalOffice REGIONAL_OFFICE = new RegionalOffice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegionalOfficeRecord> getRecordType() {
        return RegionalOfficeRecord.class;
    }

    /**
     * The column <code>public.regional_office.regional_office_id</code>.
     */
    public final TableField<RegionalOfficeRecord, Integer> REGIONAL_OFFICE_ID = createField("regional_office_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('regional_office_regional_office_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.regional_office.code</code>.
     */
    public final TableField<RegionalOfficeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false), this, "");

    /**
     * The column <code>public.regional_office.aho_email</code>.
     */
    public final TableField<RegionalOfficeRecord, String> AHO_EMAIL = createField("aho_email", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.regional_office.base_site_url</code>.
     */
    public final TableField<RegionalOfficeRecord, String> BASE_SITE_URL = createField("base_site_url", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.regional_office.seller_account_id</code>.
     */
    public final TableField<RegionalOfficeRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.regional_office</code> table reference
     */
    public RegionalOffice() {
        this("regional_office", null);
    }

    /**
     * Create an aliased <code>public.regional_office</code> table reference
     */
    public RegionalOffice(String alias) {
        this(alias, REGIONAL_OFFICE);
    }

    private RegionalOffice(String alias, Table<RegionalOfficeRecord> aliased) {
        this(alias, aliased, null);
    }

    private RegionalOffice(String alias, Table<RegionalOfficeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Area scope of regional office");
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
    public Identity<RegionalOfficeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REGIONAL_OFFICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RegionalOfficeRecord> getPrimaryKey() {
        return Keys.REGIONAL_OFFICE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RegionalOfficeRecord>> getKeys() {
        return Arrays.<UniqueKey<RegionalOfficeRecord>>asList(Keys.REGIONAL_OFFICE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RegionalOfficeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RegionalOfficeRecord, ?>>asList(Keys.REGIONAL_OFFICE__REGIONAL_OFFICE_SELLER_ACCOUNT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegionalOffice as(String alias) {
        return new RegionalOffice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RegionalOffice rename(String name) {
        return new RegionalOffice(name, null);
    }
}