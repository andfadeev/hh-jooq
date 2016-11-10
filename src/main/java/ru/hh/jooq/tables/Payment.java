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
import ru.hh.jooq.tables.records.PaymentRecord;


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
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1602052410;

    /**
     * The reference instance of <code>public.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>public.payment.payment_id</code>.
     */
    public final TableField<PaymentRecord, Integer> PAYMENT_ID = createField("payment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('payment_payment_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.payment.agreement_id</code>.
     */
    public final TableField<PaymentRecord, Integer> AGREEMENT_ID = createField("agreement_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.payment.money</code>.
     */
    public final TableField<PaymentRecord, Long> MONEY = createField("money", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.payment.creation_time</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.payment.status</code>.
     */
    public final TableField<PaymentRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.payment.payment_type</code>.
     */
    public final TableField<PaymentRecord, Integer> PAYMENT_TYPE = createField("payment_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.payment.type</code>.
     */
    public final TableField<PaymentRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.payment.is_deleted</code>.
     */
    public final TableField<PaymentRecord, Boolean> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.approved_by_manager_id</code>.
     */
    public final TableField<PaymentRecord, Integer> APPROVED_BY_MANAGER_ID = createField("approved_by_manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.payment.offshore</code>.
     */
    public final TableField<PaymentRecord, Boolean> OFFSHORE = createField("offshore", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.moneta</code>.
     */
    public final TableField<PaymentRecord, Boolean> MONETA = createField("moneta", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.visibility</code>.
     */
    public final TableField<PaymentRecord, Boolean> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.key_payment</code>.
     */
    public final TableField<PaymentRecord, Boolean> KEY_PAYMENT = createField("key_payment", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.move_to_key</code>.
     */
    public final TableField<PaymentRecord, Boolean> MOVE_TO_KEY = createField("move_to_key", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.advertising</code>.
     */
    public final TableField<PaymentRecord, Boolean> ADVERTISING = createField("advertising", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.employer_id</code>.
     */
    public final TableField<PaymentRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.payment.additional_services_for_key_payment</code>.
     */
    public final TableField<PaymentRecord, Boolean> ADDITIONAL_SERVICES_FOR_KEY_PAYMENT = createField("additional_services_for_key_payment", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.barter</code>.
     */
    public final TableField<PaymentRecord, Boolean> BARTER = createField("barter", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.bill_id</code>.
     */
    public final TableField<PaymentRecord, Integer> BILL_ID = createField("bill_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.payment.attribute1</code>.
     */
    public final TableField<PaymentRecord, Boolean> ATTRIBUTE1 = createField("attribute1", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.attribute2</code>.
     */
    public final TableField<PaymentRecord, Boolean> ATTRIBUTE2 = createField("attribute2", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.payment.prolongation</code>.
     */
    public final TableField<PaymentRecord, Boolean> PROLONGATION = createField("prolongation", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.payment</code> table reference
     */
    public Payment() {
        this("payment", null);
    }

    /**
     * Create an aliased <code>public.payment</code> table reference
     */
    public Payment(String alias) {
        this(alias, PAYMENT);
    }

    private Payment(String alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payment(String alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PaymentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.PAYMENT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentRecord>>asList(Keys.PAYMENT_PK, Keys.PAYMENT_PAYMENT_BILL_ID_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PaymentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PaymentRecord, ?>>asList(Keys.PAYMENT__PAYMENT_IBFK_1, Keys.PAYMENT__PAYMENT_IBFK_3, Keys.PAYMENT__PAYMENT_BILL_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payment as(String alias) {
        return new Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(name, null);
    }
}
