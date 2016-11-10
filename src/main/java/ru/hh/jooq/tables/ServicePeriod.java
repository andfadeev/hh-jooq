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
import ru.hh.jooq.tables.records.ServicePeriodRecord;


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
public class ServicePeriod extends TableImpl<ServicePeriodRecord> {

    private static final long serialVersionUID = -474575359;

    /**
     * The reference instance of <code>public.service_period</code>
     */
    public static final ServicePeriod SERVICE_PERIOD = new ServicePeriod();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServicePeriodRecord> getRecordType() {
        return ServicePeriodRecord.class;
    }

    /**
     * The column <code>public.service_period.seller_account_id</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_period.period</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> PERIOD = createField("period", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_period.days</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> DAYS = createField("days", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_period.service_period_id</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> SERVICE_PERIOD_ID = createField("service_period_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('service_period_service_period_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service_period.agency_days</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> AGENCY_DAYS = createField("agency_days", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_period.publications</code>.
     */
    public final TableField<ServicePeriodRecord, Integer> PUBLICATIONS = createField("publications", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.service_period</code> table reference
     */
    public ServicePeriod() {
        this("service_period", null);
    }

    /**
     * Create an aliased <code>public.service_period</code> table reference
     */
    public ServicePeriod(String alias) {
        this(alias, SERVICE_PERIOD);
    }

    private ServicePeriod(String alias, Table<ServicePeriodRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServicePeriod(String alias, Table<ServicePeriodRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ServicePeriodRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVICE_PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServicePeriodRecord> getPrimaryKey() {
        return Keys.SERVICE_PERIOD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServicePeriodRecord>> getKeys() {
        return Arrays.<UniqueKey<ServicePeriodRecord>>asList(Keys.SERVICE_PERIOD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ServicePeriodRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ServicePeriodRecord, ?>>asList(Keys.SERVICE_PERIOD__FK8999A68BFEFE8DE0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePeriod as(String alias) {
        return new ServicePeriod(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServicePeriod rename(String name) {
        return new ServicePeriod(name, null);
    }
}
