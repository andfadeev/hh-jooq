/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
import ru.hh.jooq.tables.records.BillingTemplateRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BillingTemplate extends TableImpl<BillingTemplateRecord> {

    private static final long serialVersionUID = 1716741161;

    /**
     * The reference instance of <code>public.billing_template</code>
     */
    public static final BillingTemplate BILLING_TEMPLATE = new BillingTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillingTemplateRecord> getRecordType() {
        return BillingTemplateRecord.class;
    }

    /**
     * The column <code>public.billing_template.billing_template_id</code>.
     */
    public final TableField<BillingTemplateRecord, Integer> BILLING_TEMPLATE_ID = createField("billing_template_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('billing_template_portfolio_2703_billing_template_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.billing_template.creation_time</code>.
     */
    public final TableField<BillingTemplateRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.billing_template.type</code>.
     */
    public final TableField<BillingTemplateRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.billing_template.site_id</code>.
     */
    public final TableField<BillingTemplateRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.billing_template.lang</code>.
     */
    public final TableField<BillingTemplateRecord, Integer> LANG = createField("lang", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.billing_template.template_file_id</code>.
     */
    public final TableField<BillingTemplateRecord, Integer> TEMPLATE_FILE_ID = createField("template_file_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.billing_template</code> table reference
     */
    public BillingTemplate() {
        this("billing_template", null);
    }

    /**
     * Create an aliased <code>public.billing_template</code> table reference
     */
    public BillingTemplate(String alias) {
        this(alias, BILLING_TEMPLATE);
    }

    private BillingTemplate(String alias, Table<BillingTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillingTemplate(String alias, Table<BillingTemplateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BillingTemplateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BILLING_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BillingTemplateRecord> getPrimaryKey() {
        return Keys.BILLING_TEMPLATE_PORTFOLIO_2703_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BillingTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<BillingTemplateRecord>>asList(Keys.BILLING_TEMPLATE_PORTFOLIO_2703_PKEY, Keys.UNIQUE_TEMPLATE_VERSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BillingTemplateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BillingTemplateRecord, ?>>asList(Keys.BILLING_TEMPLATE__BILLING_TEMPLATE_PORTFOLIO_2703_SITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingTemplate as(String alias) {
        return new BillingTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BillingTemplate rename(String name) {
        return new BillingTemplate(name, null);
    }
}
