/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.HhuserTempRecord;
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
public class HhuserTemp extends TableImpl<HhuserTempRecord> {

    private static final long serialVersionUID = -2019099461;

    /**
     * The reference instance of <code>public.hhuser_temp</code>
     */
    public static final HhuserTemp HHUSER_TEMP = new HhuserTemp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HhuserTempRecord> getRecordType() {
        return HhuserTempRecord.class;
    }

    /**
     * The column <code>public.hhuser_temp.user_id</code>.
     */
    public final TableField<HhuserTempRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.icq</code>.
     */
    public final TableField<HhuserTempRecord, String> ICQ = createField("icq", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>public.hhuser_temp.type</code>.
     */
    public final TableField<HhuserTempRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.creation_time</code>.
     */
    public final TableField<HhuserTempRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.hhuser_temp.uid_cookie</code>.
     */
    public final TableField<HhuserTempRecord, String> UID_COOKIE = createField("uid_cookie", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>public.hhuser_temp.area_id</code>.
     */
    public final TableField<HhuserTempRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.show_archived_vacncies_replies</code>.
     */
    public final TableField<HhuserTempRecord, Boolean> SHOW_ARCHIVED_VACNCIES_REPLIES = createField("show_archived_vacncies_replies", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.hhuser_temp.inheritance_tag</code>.
     */
    public final TableField<HhuserTempRecord, String> INHERITANCE_TAG = createField("inheritance_tag", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>public.hhuser_temp.phone_ext</code>.
     */
    public final TableField<HhuserTempRecord, String> PHONE_EXT = createField("phone_ext", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>public.hhuser_temp.description</code>.
     */
    public final TableField<HhuserTempRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.hhuser_temp.show_negative_vacancies_replies</code>.
     */
    public final TableField<HhuserTempRecord, Boolean> SHOW_NEGATIVE_VACANCIES_REPLIES = createField("show_negative_vacancies_replies", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.hhuser_temp.guid</code>.
     */
    public final TableField<HhuserTempRecord, String> GUID = createField("guid", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>public.hhuser_temp.filter_number</code>.
     */
    public final TableField<HhuserTempRecord, Integer> FILTER_NUMBER = createField("filter_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.has_oferta</code>.
     */
    public final TableField<HhuserTempRecord, Boolean> HAS_OFERTA = createField("has_oferta", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.hhuser_temp.hhid</code>.
     */
    public final TableField<HhuserTempRecord, Long> HHID = createField("hhid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.hhuser_temp.begun_partner</code>.
     */
    public final TableField<HhuserTempRecord, Boolean> BEGUN_PARTNER = createField("begun_partner", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.hhuser_temp.lj_partner</code>.
     */
    public final TableField<HhuserTempRecord, Boolean> LJ_PARTNER = createField("lj_partner", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.hhuser_temp.lang</code>.
     */
    public final TableField<HhuserTempRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * The column <code>public.hhuser_temp.resume_view_limit</code>.
     */
    public final TableField<HhuserTempRecord, Integer> RESUME_VIEW_LIMIT = createField("resume_view_limit", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.source</code>.
     */
    public final TableField<HhuserTempRecord, Integer> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.source_user_id</code>.
     */
    public final TableField<HhuserTempRecord, Integer> SOURCE_USER_ID = createField("source_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.reset_password_key</code>.
     */
    public final TableField<HhuserTempRecord, String> RESET_PASSWORD_KEY = createField("reset_password_key", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>public.hhuser_temp.blocked_cache</code>.
     */
    public final TableField<HhuserTempRecord, Integer> BLOCKED_CACHE = createField("blocked_cache", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.site_id</code>.
     */
    public final TableField<HhuserTempRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.freezing_day</code>.
     */
    public final TableField<HhuserTempRecord, LocalDateTime> FREEZING_DAY = createField("freezing_day", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.hhuser_temp.hhresume_migration_state</code>.
     */
    public final TableField<HhuserTempRecord, Integer> HHRESUME_MIGRATION_STATE = createField("hhresume_migration_state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.hhuser_temp.employer_contact_email</code>.
     */
    public final TableField<HhuserTempRecord, String> EMPLOYER_CONTACT_EMAIL = createField("employer_contact_email", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.hhuser_temp.first_name_cache</code>.
     */
    public final TableField<HhuserTempRecord, String> FIRST_NAME_CACHE = createField("first_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>public.hhuser_temp.middle_name_cache</code>.
     */
    public final TableField<HhuserTempRecord, String> MIDDLE_NAME_CACHE = createField("middle_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>public.hhuser_temp.last_name_cache</code>.
     */
    public final TableField<HhuserTempRecord, String> LAST_NAME_CACHE = createField("last_name_cache", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>public.hhuser_temp.phone</code>.
     */
    public final TableField<HhuserTempRecord, PhoneEmbeddedRecord> PHONE = createField("phone", ru.hh.jooq.udt.PhoneEmbedded.PHONE_EMBEDDED.getDataType(), this, "");

    /**
     * Create a <code>public.hhuser_temp</code> table reference
     */
    public HhuserTemp() {
        this("hhuser_temp", null);
    }

    /**
     * Create an aliased <code>public.hhuser_temp</code> table reference
     */
    public HhuserTemp(String alias) {
        this(alias, HHUSER_TEMP);
    }

    private HhuserTemp(String alias, Table<HhuserTempRecord> aliased) {
        this(alias, aliased, null);
    }

    private HhuserTemp(String alias, Table<HhuserTempRecord> aliased, Field<?>[] parameters) {
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
    public HhuserTemp as(String alias) {
        return new HhuserTemp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HhuserTemp rename(String name) {
        return new HhuserTemp(name, null);
    }
}