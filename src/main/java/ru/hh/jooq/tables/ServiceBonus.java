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
import ru.hh.jooq.tables.records.ServiceBonusRecord;


/**
 * unused
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServiceBonus extends TableImpl<ServiceBonusRecord> {

    private static final long serialVersionUID = -244478614;

    /**
     * The reference instance of <code>public.service_bonus</code>
     */
    public static final ServiceBonus SERVICE_BONUS = new ServiceBonus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceBonusRecord> getRecordType() {
        return ServiceBonusRecord.class;
    }

    /**
     * The column <code>public.service_bonus.period_service_price_rate_id</code>.
     */
    public final TableField<ServiceBonusRecord, Integer> PERIOD_SERVICE_PRICE_RATE_ID = createField("period_service_price_rate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_bonus.area_id</code>.
     */
    public final TableField<ServiceBonusRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_bonus.direct_count</code>.
     */
    public final TableField<ServiceBonusRecord, Integer> DIRECT_COUNT = createField("direct_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service_bonus.agency_count</code>.
     */
    public final TableField<ServiceBonusRecord, Integer> AGENCY_COUNT = createField("agency_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.service_bonus.service_entry</code>.
     */
    public final TableField<ServiceBonusRecord, String> SERVICE_ENTRY = createField("service_entry", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.service_bonus.special_offer</code>.
     */
    public final TableField<ServiceBonusRecord, Boolean> SPECIAL_OFFER = createField("special_offer", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.service_bonus</code> table reference
     */
    public ServiceBonus() {
        this("service_bonus", null);
    }

    /**
     * Create an aliased <code>public.service_bonus</code> table reference
     */
    public ServiceBonus(String alias) {
        this(alias, SERVICE_BONUS);
    }

    private ServiceBonus(String alias, Table<ServiceBonusRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceBonus(String alias, Table<ServiceBonusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "unused");
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
    public UniqueKey<ServiceBonusRecord> getPrimaryKey() {
        return Keys.SERVICE_BONUS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceBonusRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceBonusRecord>>asList(Keys.SERVICE_BONUS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ServiceBonusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ServiceBonusRecord, ?>>asList(Keys.SERVICE_BONUS__FK9854AE15FD760CEC, Keys.SERVICE_BONUS__FK9854AE159C775180);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceBonus as(String alias) {
        return new ServiceBonus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceBonus rename(String name) {
        return new ServiceBonus(name, null);
    }
}