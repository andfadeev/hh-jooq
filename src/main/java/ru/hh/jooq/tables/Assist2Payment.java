/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.math.BigDecimal;
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
import ru.hh.jooq.tables.records.Assist2PaymentRecord;


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
public class Assist2Payment extends TableImpl<Assist2PaymentRecord> {

    private static final long serialVersionUID = -477860710;

    /**
     * The reference instance of <code>public.assist2_payment</code>
     */
    public static final Assist2Payment ASSIST2_PAYMENT = new Assist2Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Assist2PaymentRecord> getRecordType() {
        return Assist2PaymentRecord.class;
    }

    /**
     * The column <code>public.assist2_payment.payment_id</code>.
     */
    public final TableField<Assist2PaymentRecord, Integer> PAYMENT_ID = createField("payment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('assist2_payment_payment_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.assist2_payment.amount</code>.
     */
    public final TableField<Assist2PaymentRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC.precision(15, 2).nullable(false), this, "");

    /**
     * The column <code>public.assist2_payment.card_owner</code>.
     */
    public final TableField<Assist2PaymentRecord, String> CARD_OWNER = createField("card_owner", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.assist2_payment.full_name</code>.
     */
    public final TableField<Assist2PaymentRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.assist2_payment.payment_time</code>.
     */
    public final TableField<Assist2PaymentRecord, LocalDateTime> PAYMENT_TIME = createField("payment_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.assist2_payment.status</code>.
     */
    public final TableField<Assist2PaymentRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.assist2_payment.currency</code>.
     */
    public final TableField<Assist2PaymentRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>public.assist2_payment.bill_id</code>.
     */
    public final TableField<Assist2PaymentRecord, Integer> BILL_ID = createField("bill_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.assist2_payment.order_number</code>.
     */
    public final TableField<Assist2PaymentRecord, String> ORDER_NUMBER = createField("order_number", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.assist2_payment.assist_bill_number</code>.
     */
    public final TableField<Assist2PaymentRecord, String> ASSIST_BILL_NUMBER = createField("assist_bill_number", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.assist2_payment.merchant_id</code>.
     */
    public final TableField<Assist2PaymentRecord, String> MERCHANT_ID = createField("merchant_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>public.assist2_payment</code> table reference
     */
    public Assist2Payment() {
        this("assist2_payment", null);
    }

    /**
     * Create an aliased <code>public.assist2_payment</code> table reference
     */
    public Assist2Payment(String alias) {
        this(alias, ASSIST2_PAYMENT);
    }

    private Assist2Payment(String alias, Table<Assist2PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Assist2Payment(String alias, Table<Assist2PaymentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<Assist2PaymentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ASSIST2_PAYMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Assist2PaymentRecord> getPrimaryKey() {
        return Keys.ASSIST2_PAYMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Assist2PaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<Assist2PaymentRecord>>asList(Keys.ASSIST2_PAYMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Assist2PaymentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<Assist2PaymentRecord, ?>>asList(Keys.ASSIST2_PAYMENT__FKB68AAAB0D4F7C5FD, Keys.ASSIST2_PAYMENT__FKB68AAAB04F7D2BB5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Assist2Payment as(String alias) {
        return new Assist2Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Assist2Payment rename(String name) {
        return new Assist2Payment(name, null);
    }
}
