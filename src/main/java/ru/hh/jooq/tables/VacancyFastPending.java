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
import ru.hh.jooq.tables.records.VacancyFastPendingRecord;


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
public class VacancyFastPending extends TableImpl<VacancyFastPendingRecord> {

    private static final long serialVersionUID = 1037446467;

    /**
     * The reference instance of <code>public.vacancy_fast_pending</code>
     */
    public static final VacancyFastPending VACANCY_FAST_PENDING = new VacancyFastPending();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VacancyFastPendingRecord> getRecordType() {
        return VacancyFastPendingRecord.class;
    }

    /**
     * The column <code>public.vacancy_fast_pending.vacancy_fast_pending_id</code>.
     */
    public final TableField<VacancyFastPendingRecord, Integer> VACANCY_FAST_PENDING_ID = createField("vacancy_fast_pending_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vacancy_fast_pending_vacancy_fast_pending_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.employer</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> EMPLOYER = createField("employer", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.job_position</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> JOB_POSITION = createField("job_position", org.jooq.impl.SQLDataType.VARCHAR.length(220).nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.description</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.specialization_ids</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> SPECIALIZATION_IDS = createField("specialization_ids", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.area_id</code>.
     */
    public final TableField<VacancyFastPendingRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.compensation_from</code>.
     */
    public final TableField<VacancyFastPendingRecord, Integer> COMPENSATION_FROM = createField("compensation_from", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy_fast_pending.compensation_to</code>.
     */
    public final TableField<VacancyFastPendingRecord, Integer> COMPENSATION_TO = createField("compensation_to", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy_fast_pending.phone_country</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> PHONE_COUNTRY = createField("phone_country", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.phone_city</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> PHONE_CITY = createField("phone_city", org.jooq.impl.SQLDataType.VARCHAR.length(6), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.phone_number</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.email</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.contact_person</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> CONTACT_PERSON = createField("contact_person", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.contact_comment</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> CONTACT_COMMENT = createField("contact_comment", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.created</code>.
     */
    public final TableField<VacancyFastPendingRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.vacancy_fast_pending.site_id</code>.
     */
    public final TableField<VacancyFastPendingRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy_fast_pending.lang</code>.
     */
    public final TableField<VacancyFastPendingRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * Create a <code>public.vacancy_fast_pending</code> table reference
     */
    public VacancyFastPending() {
        this("vacancy_fast_pending", null);
    }

    /**
     * Create an aliased <code>public.vacancy_fast_pending</code> table reference
     */
    public VacancyFastPending(String alias) {
        this(alias, VACANCY_FAST_PENDING);
    }

    private VacancyFastPending(String alias, Table<VacancyFastPendingRecord> aliased) {
        this(alias, aliased, null);
    }

    private VacancyFastPending(String alias, Table<VacancyFastPendingRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VacancyFastPendingRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VACANCY_FAST_PENDING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VacancyFastPendingRecord> getPrimaryKey() {
        return Keys.VACANCY_FAST_PENDING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VacancyFastPendingRecord>> getKeys() {
        return Arrays.<UniqueKey<VacancyFastPendingRecord>>asList(Keys.VACANCY_FAST_PENDING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VacancyFastPendingRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VacancyFastPendingRecord, ?>>asList(Keys.VACANCY_FAST_PENDING__VACANCY_FAST_PENDING_SITE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyFastPending as(String alias) {
        return new VacancyFastPending(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VacancyFastPending rename(String name) {
        return new VacancyFastPending(name, null);
    }
}
