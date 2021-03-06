/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.SiteRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Site extends TableImpl<SiteRecord> {

    private static final long serialVersionUID = -253257584;

    /**
     * The reference instance of <code>public.site</code>
     */
    public static final Site SITE = new Site();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SiteRecord> getRecordType() {
        return SiteRecord.class;
    }

    /**
     * The column <code>public.site.site_id</code>.
     */
    public final TableField<SiteRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('site_site_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.base_url</code>.
     */
    public final TableField<SiteRecord, String> BASE_URL = createField("base_url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.site.area_id</code>.
     */
    public final TableField<SiteRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.service_category_id</code>.
     */
    public final TableField<SiteRecord, Integer> SERVICE_CATEGORY_ID = createField("service_category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.seller_account_id</code>.
     */
    public final TableField<SiteRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.platform_id</code>.
     */
    public final TableField<SiteRecord, Integer> PLATFORM_ID = createField("platform_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.code</code>.
     */
    public final TableField<SiteRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.site.price_region_id</code>.
     */
    public final TableField<SiteRecord, Integer> PRICE_REGION_ID = createField("price_region_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.site.sms_service_enabled</code>.
     */
    public final TableField<SiteRecord, Integer> SMS_SERVICE_ENABLED = createField("sms_service_enabled", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.site.language_id</code>.
     */
    public final TableField<SiteRecord, Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.site.region_center</code>.
     */
    public final TableField<SiteRecord, Integer> REGION_CENTER = createField("region_center", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.site.phone_country_code</code>.
     */
    public final TableField<SiteRecord, Integer> PHONE_COUNTRY_CODE = createField("phone_country_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.site</code> table reference
     */
    public Site() {
        this("site", null);
    }

    /**
     * Create an aliased <code>public.site</code> table reference
     */
    public Site(String alias) {
        this(alias, SITE);
    }

    private Site(String alias, Table<SiteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Site(String alias, Table<SiteRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SiteRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SiteRecord> getPrimaryKey() {
        return Keys.SITE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SiteRecord>> getKeys() {
        return Arrays.<UniqueKey<SiteRecord>>asList(Keys.SITE_PK, Keys.SITE_BASE_URL_UNIQ, Keys.SITE_CODE_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Site as(String alias) {
        return new Site(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Site rename(String name) {
        return new Site(name, null);
    }
}
