/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
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
import ru.hh.jooq.tables.records.CartRecord;


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
public class Cart extends TableImpl<CartRecord> {

    private static final long serialVersionUID = -785470824;

    /**
     * The reference instance of <code>public.cart</code>
     */
    public static final Cart CART = new Cart();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CartRecord> getRecordType() {
        return CartRecord.class;
    }

    /**
     * The column <code>public.cart.cart_id</code>.
     */
    public final TableField<CartRecord, Integer> CART_ID = createField("cart_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('cart_cart_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.cart.account_id</code>.
     */
    public final TableField<CartRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.cart.visible</code>.
     */
    public final TableField<CartRecord, Boolean> VISIBLE = createField("visible", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.cart.auto</code>.
     */
    public final TableField<CartRecord, Boolean> AUTO = createField("auto", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.cart.creation_time</code>.
     */
    public final TableField<CartRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.cart.status</code>.
     */
    public final TableField<CartRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.cart.bill_id</code>.
     */
    public final TableField<CartRecord, Integer> BILL_ID = createField("bill_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.cart.bill_type</code>.
     */
    public final TableField<CartRecord, Integer> BILL_TYPE = createField("bill_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.cart</code> table reference
     */
    public Cart() {
        this("cart", null);
    }

    /**
     * Create an aliased <code>public.cart</code> table reference
     */
    public Cart(String alias) {
        this(alias, CART);
    }

    private Cart(String alias, Table<CartRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cart(String alias, Table<CartRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CartRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CartRecord> getPrimaryKey() {
        return Keys.CART_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CartRecord>> getKeys() {
        return Arrays.<UniqueKey<CartRecord>>asList(Keys.CART_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CartRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CartRecord, ?>>asList(Keys.CART__FK2E7B20A760195F, Keys.CART__CART_BILL_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cart as(String alias) {
        return new Cart(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cart rename(String name) {
        return new Cart(name, null);
    }
}
