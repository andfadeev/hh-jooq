/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
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
import ru.hh.jooq.tables.records.VerificationRecord;


/**
 * HH-60278 Verification
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Verification extends TableImpl<VerificationRecord> {

    private static final long serialVersionUID = -1560440401;

    /**
     * The reference instance of <code>public.verification</code>
     */
    public static final Verification VERIFICATION = new Verification();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VerificationRecord> getRecordType() {
        return VerificationRecord.class;
    }

    /**
     * The column <code>public.verification.verification_id</code>.
     */
    public final TableField<VerificationRecord, Long> VERIFICATION_ID = createField("verification_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('verification_verification_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.verification.login</code>.
     */
    public final TableField<VerificationRecord, String> LOGIN = createField("login", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>public.verification.code</code>.
     */
    public final TableField<VerificationRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.verification.sent_count</code>.
     */
    public final TableField<VerificationRecord, Integer> SENT_COUNT = createField("sent_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.verification.confirmation_attempt_count</code>.
     */
    public final TableField<VerificationRecord, Integer> CONFIRMATION_ATTEMPT_COUNT = createField("confirmation_attempt_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.verification.last_sent_time</code>.
     */
    public final TableField<VerificationRecord, LocalDateTime> LAST_SENT_TIME = createField("last_sent_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.verification.expiration_time</code>.
     */
    public final TableField<VerificationRecord, LocalDateTime> EXPIRATION_TIME = createField("expiration_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.verification.next_send_time</code>.
     */
    public final TableField<VerificationRecord, LocalDateTime> NEXT_SEND_TIME = createField("next_send_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.verification.last_confirm_attempt_time</code>.
     */
    public final TableField<VerificationRecord, LocalDateTime> LAST_CONFIRM_ATTEMPT_TIME = createField("last_confirm_attempt_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.verification.next_confirm_time</code>.
     */
    public final TableField<VerificationRecord, LocalDateTime> NEXT_CONFIRM_TIME = createField("next_confirm_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.verification.used</code>.
     */
    public final TableField<VerificationRecord, Boolean> USED = createField("used", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.verification</code> table reference
     */
    public Verification() {
        this("verification", null);
    }

    /**
     * Create an aliased <code>public.verification</code> table reference
     */
    public Verification(String alias) {
        this(alias, VERIFICATION);
    }

    private Verification(String alias, Table<VerificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Verification(String alias, Table<VerificationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "HH-60278 Verification");
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
    public Identity<VerificationRecord, Long> getIdentity() {
        return Keys.IDENTITY_VERIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VerificationRecord> getPrimaryKey() {
        return Keys.VERIFICATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VerificationRecord>> getKeys() {
        return Arrays.<UniqueKey<VerificationRecord>>asList(Keys.VERIFICATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Verification as(String alias) {
        return new Verification(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Verification rename(String name) {
        return new Verification(name, null);
    }
}
