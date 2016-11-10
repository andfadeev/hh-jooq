/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.math.BigDecimal;
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
import ru.hh.jooq.tables.records.ServiceRecord;


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
public class Service extends TableImpl<ServiceRecord> {

    private static final long serialVersionUID = -152632985;

    /**
     * The reference instance of <code>public.service</code>
     */
    public static final Service SERVICE = new Service();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceRecord> getRecordType() {
        return ServiceRecord.class;
    }

    /**
     * The column <code>public.service.service_id</code>.
     */
    public final TableField<ServiceRecord, Integer> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('service_service_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service.service_category_id</code>.
     */
    public final TableField<ServiceRecord, Integer> SERVICE_CATEGORY_ID = createField("service_category_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.service.visible</code>.
     */
    public final TableField<ServiceRecord, Boolean> VISIBLE = createField("visible", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.service.name</code>. unused
     */
    public final TableField<ServiceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(4095).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "unused");

    /**
     * The column <code>public.service.description</code>.
     */
    public final TableField<ServiceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.service.price</code>.
     */
    public final TableField<ServiceRecord, Long> PRICE = createField("price", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.service.priority</code>.
     */
    public final TableField<ServiceRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service.period</code>.
     */
    public final TableField<ServiceRecord, Integer> PERIOD = createField("period", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service.hash</code>.
     */
    public final TableField<ServiceRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.service.period_cost</code>.
     */
    public final TableField<ServiceRecord, Long> PERIOD_COST = createField("period_cost", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.service.period_price</code>.
     */
    public final TableField<ServiceRecord, Long> PERIOD_PRICE = createField("period_price", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.service.bonus_amount</code>.
     */
    public final TableField<ServiceRecord, BigDecimal> BONUS_AMOUNT = createField("bonus_amount", org.jooq.impl.SQLDataType.NUMERIC.precision(19, 2).defaultValue(org.jooq.impl.DSL.field("NULL::numeric", org.jooq.impl.SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>public.service.service_source_id</code>.
     */
    public final TableField<ServiceRecord, Integer> SERVICE_SOURCE_ID = createField("service_source_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.service.bonus_score_amount</code>.
     */
    public final TableField<ServiceRecord, BigDecimal> BONUS_SCORE_AMOUNT = createField("bonus_score_amount", org.jooq.impl.SQLDataType.NUMERIC.precision(19, 2), this, "");

    /**
     * The column <code>public.service.currency</code>.
     */
    public final TableField<ServiceRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

    /**
     * The column <code>public.service.bonus_currency</code>.
     */
    public final TableField<ServiceRecord, String> BONUS_CURRENCY = createField("bonus_currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

    /**
     * The column <code>public.service.period_currency</code>.
     */
    public final TableField<ServiceRecord, String> PERIOD_CURRENCY = createField("period_currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

    /**
     * The column <code>public.service.bonus_score_currency</code>.
     */
    public final TableField<ServiceRecord, String> BONUS_SCORE_CURRENCY = createField("bonus_score_currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

    /**
     * The column <code>public.service.service_type</code>.
     */
    public final TableField<ServiceRecord, String> SERVICE_TYPE = createField("service_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.service.agency</code>.
     */
    public final TableField<ServiceRecord, Boolean> AGENCY = createField("agency", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.service.gift</code>.
     */
    public final TableField<ServiceRecord, Boolean> GIFT = createField("gift", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.service.gross_price</code>.
     */
    public final TableField<ServiceRecord, BigDecimal> GROSS_PRICE = createField("gross_price", org.jooq.impl.SQLDataType.NUMERIC.precision(19, 2), this, "");

    /**
     * The column <code>public.service.gross_currency</code>.
     */
    public final TableField<ServiceRecord, String> GROSS_CURRENCY = createField("gross_currency", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>public.service.fixed_cost</code>.
     */
    public final TableField<ServiceRecord, BigDecimal> FIXED_COST = createField("fixed_cost", org.jooq.impl.SQLDataType.NUMERIC.precision(19, 2), this, "");

    /**
     * The column <code>public.service.special_offer_id</code>.
     */
    public final TableField<ServiceRecord, String> SPECIAL_OFFER_ID = createField("special_offer_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.service.gift_item</code>.
     */
    public final TableField<ServiceRecord, Boolean> GIFT_ITEM = createField("gift_item", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.service.detailed_entries</code>.
     */
    public final TableField<ServiceRecord, Boolean> DETAILED_ENTRIES = createField("detailed_entries", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.service.title</code>.
     */
    public final TableField<ServiceRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.service.product_id</code>.
     */
    public final TableField<ServiceRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.service.mds_price_code</code>.
     */
    public final TableField<ServiceRecord, String> MDS_PRICE_CODE = createField("mds_price_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>public.service</code> table reference
     */
    public Service() {
        this("service", null);
    }

    /**
     * Create an aliased <code>public.service</code> table reference
     */
    public Service(String alias) {
        this(alias, SERVICE);
    }

    private Service(String alias, Table<ServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Service(String alias, Table<ServiceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ServiceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServiceRecord> getPrimaryKey() {
        return Keys.SERVICE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceRecord>>asList(Keys.SERVICE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ServiceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ServiceRecord, ?>>asList(Keys.SERVICE__SERVICE_SERVICE_CATEGORY_ID_FKEY, Keys.SERVICE__SERVICE_CURRENCY, Keys.SERVICE__SERVICE_BONUS_CURRENCY, Keys.SERVICE__SERVICE_PERIOD_CURRENCY, Keys.SERVICE__SERVICE_BONUS_SCORE_CURRENCY, Keys.SERVICE__SERVICE_PRODUCT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Service as(String alias) {
        return new Service(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Service rename(String name) {
        return new Service(name, null);
    }
}
