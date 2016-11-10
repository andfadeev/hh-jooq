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
import ru.hh.jooq.tables.records.BoughtResumeRecord;


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
public class BoughtResume extends TableImpl<BoughtResumeRecord> {

    private static final long serialVersionUID = 301603320;

    /**
     * The reference instance of <code>public.bought_resume</code>
     */
    public static final BoughtResume BOUGHT_RESUME = new BoughtResume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BoughtResumeRecord> getRecordType() {
        return BoughtResumeRecord.class;
    }

    /**
     * The column <code>public.bought_resume.id</code>.
     */
    public final TableField<BoughtResumeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('bought_resume_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.bought_resume.employer_id</code>.
     */
    public final TableField<BoughtResumeRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bought_resume.resume_id</code>.
     */
    public final TableField<BoughtResumeRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bought_resume.user_id</code>.
     */
    public final TableField<BoughtResumeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.bought_resume.creation_time</code>.
     */
    public final TableField<BoughtResumeRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.bought_resume</code> table reference
     */
    public BoughtResume() {
        this("bought_resume", null);
    }

    /**
     * Create an aliased <code>public.bought_resume</code> table reference
     */
    public BoughtResume(String alias) {
        this(alias, BOUGHT_RESUME);
    }

    private BoughtResume(String alias, Table<BoughtResumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BoughtResume(String alias, Table<BoughtResumeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BoughtResumeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BOUGHT_RESUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BoughtResumeRecord> getPrimaryKey() {
        return Keys.BOUGHT_RESUME_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BoughtResumeRecord>> getKeys() {
        return Arrays.<UniqueKey<BoughtResumeRecord>>asList(Keys.BOUGHT_RESUME_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BoughtResumeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BoughtResumeRecord, ?>>asList(Keys.BOUGHT_RESUME__BOUGHT_RESUME_EMPLOYER_ID_FKEY, Keys.BOUGHT_RESUME__BOUGHT_RESUME_RESUME_ID_FKEY, Keys.BOUGHT_RESUME__BOUGHT_RESUME_USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoughtResume as(String alias) {
        return new BoughtResume(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BoughtResume rename(String name) {
        return new BoughtResume(name, null);
    }
}
