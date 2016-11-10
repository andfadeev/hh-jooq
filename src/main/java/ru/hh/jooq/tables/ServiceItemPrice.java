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
import ru.hh.jooq.tables.records.ServiceItemPriceRecord;


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
public class ServiceItemPrice extends TableImpl<ServiceItemPriceRecord> {

    private static final long serialVersionUID = -599598684;

    /**
     * The reference instance of <code>public.service_item_price</code>
     */
    public static final ServiceItemPrice SERVICE_ITEM_PRICE = new ServiceItemPrice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceItemPriceRecord> getRecordType() {
        return ServiceItemPriceRecord.class;
    }

    /**
     * The column <code>public.service_item_price.seller_account_id</code>.
     */
    public final TableField<ServiceItemPriceRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.service_item_price.price</code>.
     */
    public final TableField<ServiceItemPriceRecord, Long> PRICE = createField("price", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.service_item_price.service_entry</code>.
     */
    public final TableField<ServiceItemPriceRecord, String> SERVICE_ENTRY = createField("service_entry", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>public.service_item_price.rounding_mode</code>.
     */
    public final TableField<ServiceItemPriceRecord, Integer> ROUNDING_MODE = createField("rounding_mode", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.service_item_price.rounding_scale</code>.
     */
    public final TableField<ServiceItemPriceRecord, Integer> ROUNDING_SCALE = createField("rounding_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.service_item_price.bill_type</code>.
     */
    public final TableField<ServiceItemPriceRecord, Integer> BILL_TYPE = createField("bill_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.service_item_price</code> table reference
     */
    public ServiceItemPrice() {
        this("service_item_price", null);
    }

    /**
     * Create an aliased <code>public.service_item_price</code> table reference
     */
    public ServiceItemPrice(String alias) {
        this(alias, SERVICE_ITEM_PRICE);
    }

    private ServiceItemPrice(String alias, Table<ServiceItemPriceRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceItemPrice(String alias, Table<ServiceItemPriceRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ServiceItemPriceRecord> getPrimaryKey() {
        return Keys.SERVICE_ITEM_PRICE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServiceItemPriceRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceItemPriceRecord>>asList(Keys.SERVICE_ITEM_PRICE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ServiceItemPriceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ServiceItemPriceRecord, ?>>asList(Keys.SERVICE_ITEM_PRICE__SERVICE_ITEM_PRICE_SELLER_ACCOUNT_ID_FKEY, Keys.SERVICE_ITEM_PRICE__SERVICE_ITEM_PRICE_SERVICE_ENTRY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceItemPrice as(String alias) {
        return new ServiceItemPrice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceItemPrice rename(String name) {
        return new ServiceItemPrice(name, null);
    }
}