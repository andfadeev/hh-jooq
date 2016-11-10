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
import ru.hh.jooq.tables.records.BankMoneyPaymentTypeRecord;


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
public class BankMoneyPaymentType extends TableImpl<BankMoneyPaymentTypeRecord> {

    private static final long serialVersionUID = -1258721207;

    /**
     * The reference instance of <code>public.bank_money_payment_type</code>
     */
    public static final BankMoneyPaymentType BANK_MONEY_PAYMENT_TYPE = new BankMoneyPaymentType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankMoneyPaymentTypeRecord> getRecordType() {
        return BankMoneyPaymentTypeRecord.class;
    }

    /**
     * The column <code>public.bank_money_payment_type.bank_money_payment_type_id</code>.
     */
    public final TableField<BankMoneyPaymentTypeRecord, Integer> BANK_MONEY_PAYMENT_TYPE_ID = createField("bank_money_payment_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('bank_money_payment_type_bank_money_payment_type_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.bank_money_payment_type.payment_type</code>.
     */
    public final TableField<BankMoneyPaymentTypeRecord, Integer> PAYMENT_TYPE = createField("payment_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.bank_money_payment_type.money_type</code>.
     */
    public final TableField<BankMoneyPaymentTypeRecord, Integer> MONEY_TYPE = createField("money_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.bank_money_payment_type.bank_id</code>.
     */
    public final TableField<BankMoneyPaymentTypeRecord, Integer> BANK_ID = createField("bank_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_money_payment_type.view_order</code>.
     */
    public final TableField<BankMoneyPaymentTypeRecord, Integer> VIEW_ORDER = createField("view_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.bank_money_payment_type</code> table reference
     */
    public BankMoneyPaymentType() {
        this("bank_money_payment_type", null);
    }

    /**
     * Create an aliased <code>public.bank_money_payment_type</code> table reference
     */
    public BankMoneyPaymentType(String alias) {
        this(alias, BANK_MONEY_PAYMENT_TYPE);
    }

    private BankMoneyPaymentType(String alias, Table<BankMoneyPaymentTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankMoneyPaymentType(String alias, Table<BankMoneyPaymentTypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BankMoneyPaymentTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BANK_MONEY_PAYMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BankMoneyPaymentTypeRecord> getPrimaryKey() {
        return Keys.BANK_MONEY_PAYMENT_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankMoneyPaymentTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<BankMoneyPaymentTypeRecord>>asList(Keys.BANK_MONEY_PAYMENT_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BankMoneyPaymentTypeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BankMoneyPaymentTypeRecord, ?>>asList(Keys.BANK_MONEY_PAYMENT_TYPE__BANK_MONEY_PAYMENT_TYPE_BANK_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankMoneyPaymentType as(String alias) {
        return new BankMoneyPaymentType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankMoneyPaymentType rename(String name) {
        return new BankMoneyPaymentType(name, null);
    }
}
