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
import ru.hh.jooq.tables.records.AccountServiceItemRecord;


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
public class AccountServiceItem extends TableImpl<AccountServiceItemRecord> {

    private static final long serialVersionUID = 1796413142;

    /**
     * The reference instance of <code>public.account_service_item</code>
     */
    public static final AccountServiceItem ACCOUNT_SERVICE_ITEM = new AccountServiceItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountServiceItemRecord> getRecordType() {
        return AccountServiceItemRecord.class;
    }

    /**
     * The column <code>public.account_service_item.items_count</code>.
     */
    public final TableField<AccountServiceItemRecord, Integer> ITEMS_COUNT = createField("items_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account_service_item.account_id</code>.
     */
    public final TableField<AccountServiceItemRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.account_service_item.service_entry</code>.
     */
    public final TableField<AccountServiceItemRecord, String> SERVICE_ENTRY = createField("service_entry", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * Create a <code>public.account_service_item</code> table reference
     */
    public AccountServiceItem() {
        this("account_service_item", null);
    }

    /**
     * Create an aliased <code>public.account_service_item</code> table reference
     */
    public AccountServiceItem(String alias) {
        this(alias, ACCOUNT_SERVICE_ITEM);
    }

    private AccountServiceItem(String alias, Table<AccountServiceItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountServiceItem(String alias, Table<AccountServiceItemRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<AccountServiceItemRecord> getPrimaryKey() {
        return Keys.ACCOUNT_SERVICE_ITEM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountServiceItemRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountServiceItemRecord>>asList(Keys.ACCOUNT_SERVICE_ITEM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountServiceItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountServiceItemRecord, ?>>asList(Keys.ACCOUNT_SERVICE_ITEM__FKEFC9E72FA760195F, Keys.ACCOUNT_SERVICE_ITEM__ACCOUNT_SERVICE_ITEM_SERVICE_ENTRY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountServiceItem as(String alias) {
        return new AccountServiceItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountServiceItem rename(String name) {
        return new AccountServiceItem(name, null);
    }
}