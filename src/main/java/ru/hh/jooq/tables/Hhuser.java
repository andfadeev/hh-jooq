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
import ru.hh.jooq.tables.records.HhuserRecord;
import ru.hh.jooq.udt.records.PhoneEmbeddedRecord;


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
public class Hhuser extends TableImpl<HhuserRecord> {

    private static final long serialVersionUID = 1974112555;

    /**
     * The reference instance of <code>public.hhuser</code>
     */
    public static final Hhuser HHUSER = new Hhuser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HhuserRecord> getRecordType() {
        return HhuserRecord.class;
    }

    /**
     * The column <code>public.hhuser.user_id</code>.
     */
    public final TableField<HhuserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('hhuser_user_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.icq</code>.
     */
    public final TableField<HhuserRecord, String> ICQ = createField("icq", org.jooq.impl.SQLDataType.VARCHAR.length(16).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.type</code>.
     */
    public final TableField<HhuserRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.creation_time</code>.
     */
    public final TableField<HhuserRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.hhuser.uid_cookie</code>.
     */
    public final TableField<HhuserRecord, String> UID_COOKIE = createField("uid_cookie", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.area_id</code>.
     */
    public final TableField<HhuserRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.show_archived_vacncies_replies</code>.
     */
    public final TableField<HhuserRecord, Boolean> SHOW_ARCHIVED_VACNCIES_REPLIES = createField("show_archived_vacncies_replies", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.hhuser.inheritance_tag</code>.
     */
    public final TableField<HhuserRecord, String> INHERITANCE_TAG = createField("inheritance_tag", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.phone_ext</code>.
     */
    public final TableField<HhuserRecord, String> PHONE_EXT = createField("phone_ext", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.description</code>.
     */
    public final TableField<HhuserRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.hhuser.show_negative_vacancies_replies</code>.
     */
    public final TableField<HhuserRecord, Boolean> SHOW_NEGATIVE_VACANCIES_REPLIES = createField("show_negative_vacancies_replies", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.hhuser.guid</code>.
     */
    public final TableField<HhuserRecord, String> GUID = createField("guid", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.filter_number</code>.
     */
    public final TableField<HhuserRecord, Integer> FILTER_NUMBER = createField("filter_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.has_oferta</code>.
     */
    public final TableField<HhuserRecord, Boolean> HAS_OFERTA = createField("has_oferta", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.hhuser.hhid</code>.
     */
    public final TableField<HhuserRecord, Long> HHID = createField("hhid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.hhuser.begun_partner</code>.
     */
    public final TableField<HhuserRecord, Boolean> BEGUN_PARTNER = createField("begun_partner", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.hhuser.lj_partner</code>.
     */
    public final TableField<HhuserRecord, Boolean> LJ_PARTNER = createField("lj_partner", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.hhuser.lang</code>.
     */
    public final TableField<HhuserRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR.length(2).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.resume_view_limit</code>.
     */
    public final TableField<HhuserRecord, Integer> RESUME_VIEW_LIMIT = createField("resume_view_limit", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("500", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.source</code>.
     */
    public final TableField<HhuserRecord, Integer> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.source_user_id</code>.
     */
    public final TableField<HhuserRecord, Integer> SOURCE_USER_ID = createField("source_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser.reset_password_key</code>.
     */
    public final TableField<HhuserRecord, String> RESET_PASSWORD_KEY = createField("reset_password_key", org.jooq.impl.SQLDataType.VARCHAR.length(32).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.hhuser.blocked_cache</code>.
     */
    public final TableField<HhuserRecord, Integer> BLOCKED_CACHE = createField("blocked_cache", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser.site_id</code>.
     */
    public final TableField<HhuserRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hhuser.freezing_day</code>.
     */
    public final TableField<HhuserRecord, LocalDateTime> FREEZING_DAY = createField("freezing_day", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.hhuser.hhresume_migration_state</code>.
     */
    public final TableField<HhuserRecord, Integer> HHRESUME_MIGRATION_STATE = createField("hhresume_migration_state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser.employer_contact_email</code>.
     */
    public final TableField<HhuserRecord, String> EMPLOYER_CONTACT_EMAIL = createField("employer_contact_email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.hhuser.first_name_cache</code>.
     */
    public final TableField<HhuserRecord, String> FIRST_NAME_CACHE = createField("first_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>public.hhuser.middle_name_cache</code>.
     */
    public final TableField<HhuserRecord, String> MIDDLE_NAME_CACHE = createField("middle_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>public.hhuser.last_name_cache</code>.
     */
    public final TableField<HhuserRecord, String> LAST_NAME_CACHE = createField("last_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>public.hhuser.phone</code>.
     */
    public final TableField<HhuserRecord, PhoneEmbeddedRecord> PHONE = createField("phone", ru.hh.jooq.udt.PhoneEmbedded.PHONE_EMBEDDED.getDataType(), this, "");

    /**
     * Create a <code>public.hhuser</code> table reference
     */
    public Hhuser() {
        this("hhuser", null);
    }

    /**
     * Create an aliased <code>public.hhuser</code> table reference
     */
    public Hhuser(String alias) {
        this(alias, HHUSER);
    }

    private Hhuser(String alias, Table<HhuserRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hhuser(String alias, Table<HhuserRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HhuserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HHUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HhuserRecord> getPrimaryKey() {
        return Keys.HHUSER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HhuserRecord>> getKeys() {
        return Arrays.<UniqueKey<HhuserRecord>>asList(Keys.HHUSER_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<HhuserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HhuserRecord, ?>>asList(Keys.HHUSER__HHUSER_AREA_ID_FKEY, Keys.HHUSER__SITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hhuser as(String alias) {
        return new Hhuser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hhuser rename(String name) {
        return new Hhuser(name, null);
    }
}
