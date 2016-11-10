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
import ru.hh.jooq.tables.records.VacancyRecord;


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
public class Vacancy extends TableImpl<VacancyRecord> {

    private static final long serialVersionUID = -1832551382;

    /**
     * The reference instance of <code>public.vacancy</code>
     */
    public static final Vacancy VACANCY = new Vacancy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VacancyRecord> getRecordType() {
        return VacancyRecord.class;
    }

    /**
     * The column <code>public.vacancy.vacancy_id</code>.
     */
    public final TableField<VacancyRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vacancy_vacancy_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.creation_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.vacancy.expire_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> EXPIRE_TIME = createField("expire_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.vacancy.type</code>.
     */
    public final TableField<VacancyRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.manager_notified</code>.
     */
    public final TableField<VacancyRecord, Integer> MANAGER_NOTIFIED = createField("manager_notified", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.moderator_id</code>.
     */
    public final TableField<VacancyRecord, Integer> MODERATOR_ID = createField("moderator_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.moderate_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> MODERATE_TIME = createField("moderate_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.vacancy.last_change_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> LAST_CHANGE_TIME = createField("last_change_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.vacancy.moderate_assign_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> MODERATE_ASSIGN_TIME = createField("moderate_assign_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.vacancy.publication_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> PUBLICATION_TIME = createField("publication_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.vacancy.employer_id</code>.
     */
    public final TableField<VacancyRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.source_type</code>.
     */
    public final TableField<VacancyRecord, Integer> SOURCE_TYPE = createField("source_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.platform_code</code>.
     */
    public final TableField<VacancyRecord, Integer> PLATFORM_CODE = createField("platform_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.archivation_time</code>.
     */
    public final TableField<VacancyRecord, LocalDateTime> ARCHIVATION_TIME = createField("archivation_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.vacancy.metallic</code>.
     */
    public final TableField<VacancyRecord, Integer> METALLIC = createField("metallic", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.vacancy.premoderate_status</code>.
     */
    public final TableField<VacancyRecord, Integer> PREMODERATE_STATUS = createField("premoderate_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.archived</code>.
     */
    public final TableField<VacancyRecord, Boolean> ARCHIVED = createField("archived", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.vacancy.disabled</code>.
     */
    public final TableField<VacancyRecord, Boolean> DISABLED = createField("disabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.vacancy.approved</code>.
     */
    public final TableField<VacancyRecord, Boolean> APPROVED = createField("approved", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.vacancy.visible</code>.
     */
    public final TableField<VacancyRecord, Boolean> VISIBLE = createField("visible", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.vacancy.vacancy_body_id</code>.
     */
    public final TableField<VacancyRecord, Integer> VACANCY_BODY_ID = createField("vacancy_body_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy.employer_manager_id</code>.
     */
    public final TableField<VacancyRecord, Integer> EMPLOYER_MANAGER_ID = createField("employer_manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.retrieve_on_platforms_code</code>.
     */
    public final TableField<VacancyRecord, Integer> RETRIEVE_ON_PLATFORMS_CODE = createField("retrieve_on_platforms_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy.site_id</code>.
     */
    public final TableField<VacancyRecord, Integer> SITE_ID = createField("site_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy.job_site</code>.
     */
    public final TableField<VacancyRecord, String> JOB_SITE = createField("job_site", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>public.vacancy.previous_id</code>.
     */
    public final TableField<VacancyRecord, Integer> PREVIOUS_ID = createField("previous_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy.vacancy_multipost_link_id</code>.
     */
    public final TableField<VacancyRecord, Integer> VACANCY_MULTIPOST_LINK_ID = createField("vacancy_multipost_link_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy.vacancy_search_boost_up</code>.
     */
    public final TableField<VacancyRecord, Integer> VACANCY_SEARCH_BOOST_UP = createField("vacancy_search_boost_up", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.vacancy.area_id</code>.
     */
    public final TableField<VacancyRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.vacancy</code> table reference
     */
    public Vacancy() {
        this("vacancy", null);
    }

    /**
     * Create an aliased <code>public.vacancy</code> table reference
     */
    public Vacancy(String alias) {
        this(alias, VACANCY);
    }

    private Vacancy(String alias, Table<VacancyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Vacancy(String alias, Table<VacancyRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VacancyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VACANCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VacancyRecord> getPrimaryKey() {
        return Keys.VACANCY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VacancyRecord>> getKeys() {
        return Arrays.<UniqueKey<VacancyRecord>>asList(Keys.VACANCY_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VacancyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VacancyRecord, ?>>asList(Keys.VACANCY__EMPLOYER_ID_FKEY, Keys.VACANCY__VACANCY_VACANCY_BODY_FK, Keys.VACANCY__VACANCY_EMPLOYER_MANAGER_FK, Keys.VACANCY__SITE_ID_FKEY, Keys.VACANCY__PREVIOUS_ID_VACANCY_FK, Keys.VACANCY__AREA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Vacancy as(String alias) {
        return new Vacancy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Vacancy rename(String name) {
        return new Vacancy(name, null);
    }
}