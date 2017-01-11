/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
import ru.hh.jooq.tables.records.AccountRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = -1743564189;

    /**
     * The reference instance of <code>public.account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>public.account.account_id</code>.
     */
    public final TableField<AccountRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('account_account_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.account.employer_id</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.account.white_buh_date</code>.
     */
    public final TableField<AccountRecord, LocalDateTime> WHITE_BUH_DATE = createField("white_buh_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.account.vacancy_free_last_update</code>.
     */
    public final TableField<AccountRecord, LocalDate> VACANCY_FREE_LAST_UPDATE = createField("vacancy_free_last_update", org.jooq.impl.SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.account.seller_account_id</code>.
     */
    public final TableField<AccountRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.account.employer_deeds_report_email</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_DEEDS_REPORT_EMAIL = createField("employer_deeds_report_email", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.account.credit_line_amount</code>.
     */
    public final TableField<AccountRecord, Long> CREDIT_LINE_AMOUNT = createField("credit_line_amount", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.account.version_</code>.
     */
    public final TableField<AccountRecord, Integer> VERSION_ = createField("version_", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.account.main_individual_payer_id</code>.
     */
    public final TableField<AccountRecord, Integer> MAIN_INDIVIDUAL_PAYER_ID = createField("main_individual_payer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.employer_name</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_NAME = createField("employer_name", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

    /**
     * The column <code>public.account.employer_category</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_CATEGORY = createField("employer_category", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.employer_state</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_STATE = createField("employer_state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.hh_manager_id</code>.
     */
    public final TableField<AccountRecord, Integer> HH_MANAGER_ID = createField("hh_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.hh_manager_full_name</code>.
     */
    public final TableField<AccountRecord, String> HH_MANAGER_FULL_NAME = createField("hh_manager_full_name", org.jooq.impl.SQLDataType.VARCHAR.length(765), this, "");

    /**
     * The column <code>public.account.hh_manager_email</code>.
     */
    public final TableField<AccountRecord, String> HH_MANAGER_EMAIL = createField("hh_manager_email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.employer_manager_first_name</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_MANAGER_FIRST_NAME = createField("employer_manager_first_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.employer_manager_last_name</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_MANAGER_LAST_NAME = createField("employer_manager_last_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.employer_manager_email</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_MANAGER_EMAIL = createField("employer_manager_email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.employer_manager_lang</code>.
     */
    public final TableField<AccountRecord, String> EMPLOYER_MANAGER_LANG = createField("employer_manager_lang", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.employer_msg_version</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_MSG_VERSION = createField("employer_msg_version", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.account.paid</code>.
     */
    public final TableField<AccountRecord, Boolean> PAID = createField("paid", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.account.created</code>.
     */
    public final TableField<AccountRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.account.new_assist</code>. unused
     */
    public final TableField<AccountRecord, Boolean> NEW_ASSIST = createField("new_assist", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "unused");

    /**
     * The column <code>public.account.employer_job_site</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_JOB_SITE = createField("employer_job_site", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.account.fake</code>.
     */
    public final TableField<AccountRecord, Boolean> FAKE = createField("fake", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.account.employer_discarded</code>.
     */
    public final TableField<AccountRecord, Boolean> EMPLOYER_DISCARDED = createField("employer_discarded", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.account.employer_area_id</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_AREA_ID = createField("employer_area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.employer_site_id</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_SITE_ID = createField("employer_site_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.hh_manager_contact_email</code>.
     */
    public final TableField<AccountRecord, String> HH_MANAGER_CONTACT_EMAIL = createField("hh_manager_contact_email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.hh_manager_phone</code>.
     */
    public final TableField<AccountRecord, String> HH_MANAGER_PHONE = createField("hh_manager_phone", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.account.hh_manager_lang</code>.
     */
    public final TableField<AccountRecord, String> HH_MANAGER_LANG = createField("hh_manager_lang", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * The column <code>public.account.employer_manager_user_id</code>.
     */
    public final TableField<AccountRecord, Integer> EMPLOYER_MANAGER_USER_ID = createField("employer_manager_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.regional_office_id</code>.
     */
    public final TableField<AccountRecord, Integer> REGIONAL_OFFICE_ID = createField("regional_office_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.account.email_verification_date</code>.
     */
    public final TableField<AccountRecord, LocalDateTime> EMAIL_VERIFICATION_DATE = createField("email_verification_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.account</code> table reference
     */
    public Account() {
        this("account", null);
    }

    /**
     * Create an aliased <code>public.account</code> table reference
     */
    public Account(String alias) {
        this(alias, ACCOUNT);
    }

    private Account(String alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(String alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AccountRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.ACCOUNT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.ACCOUNT_PK, Keys.ACCOUNT_EMPLOYER_ID_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountRecord, ?>>asList(Keys.ACCOUNT__ACCOUNT_MAIN_INDIVIDUAL_PAYER, Keys.ACCOUNT__ACCOUNT_EMPLOYER_SITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(String alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(name, null);
    }
}
