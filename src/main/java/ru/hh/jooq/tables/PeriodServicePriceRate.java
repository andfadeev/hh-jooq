/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.math.BigDecimal;
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
import ru.hh.jooq.tables.records.PeriodServicePriceRateRecord;


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
public class PeriodServicePriceRate extends TableImpl<PeriodServicePriceRateRecord> {

    private static final long serialVersionUID = 1035552685;

    /**
     * The reference instance of <code>public.period_service_price_rate</code>
     */
    public static final PeriodServicePriceRate PERIOD_SERVICE_PRICE_RATE = new PeriodServicePriceRate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PeriodServicePriceRateRecord> getRecordType() {
        return PeriodServicePriceRateRecord.class;
    }

    /**
     * The column <code>public.period_service_price_rate.period</code>.
     */
    public final TableField<PeriodServicePriceRateRecord, Integer> PERIOD = createField("period", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.period_service_price_rate.rate</code>. unused
     */
    public final TableField<PeriodServicePriceRateRecord, BigDecimal> RATE = createField("rate", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 8).defaultValue(org.jooq.impl.DSL.field("NULL::numeric", org.jooq.impl.SQLDataType.NUMERIC)), this, "unused");

    /**
     * The column <code>public.period_service_price_rate.period_service_price_rate_id</code>.
     */
    public final TableField<PeriodServicePriceRateRecord, Integer> PERIOD_SERVICE_PRICE_RATE_ID = createField("period_service_price_rate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('period_service_price_rate_period_service_price_rate_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.period_service_price_rate.service_type</code>.
     */
    public final TableField<PeriodServicePriceRateRecord, String> SERVICE_TYPE = createField("service_type", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>public.period_service_price_rate</code> table reference
     */
    public PeriodServicePriceRate() {
        this("period_service_price_rate", null);
    }

    /**
     * Create an aliased <code>public.period_service_price_rate</code> table reference
     */
    public PeriodServicePriceRate(String alias) {
        this(alias, PERIOD_SERVICE_PRICE_RATE);
    }

    private PeriodServicePriceRate(String alias, Table<PeriodServicePriceRateRecord> aliased) {
        this(alias, aliased, null);
    }

    private PeriodServicePriceRate(String alias, Table<PeriodServicePriceRateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PeriodServicePriceRateRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PERIOD_SERVICE_PRICE_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PeriodServicePriceRateRecord> getPrimaryKey() {
        return Keys.PERIOD_SERVICE_PRICE_RATE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PeriodServicePriceRateRecord>> getKeys() {
        return Arrays.<UniqueKey<PeriodServicePriceRateRecord>>asList(Keys.PERIOD_SERVICE_PRICE_RATE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PeriodServicePriceRate as(String alias) {
        return new PeriodServicePriceRate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PeriodServicePriceRate rename(String name) {
        return new PeriodServicePriceRate(name, null);
    }
}