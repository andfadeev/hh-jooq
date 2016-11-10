/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumeVideoResumeRecord;


/**
 * temp table that store relations between resume and video resume
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResumeVideoResume extends TableImpl<ResumeVideoResumeRecord> {

    private static final long serialVersionUID = -1220166806;

    /**
     * The reference instance of <code>public.resume_video_resume</code>
     */
    public static final ResumeVideoResume RESUME_VIDEO_RESUME = new ResumeVideoResume();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeVideoResumeRecord> getRecordType() {
        return ResumeVideoResumeRecord.class;
    }

    /**
     * The column <code>public.resume_video_resume.resume_id</code>.
     */
    public final TableField<ResumeVideoResumeRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_video_resume.video_resume_id</code>.
     */
    public final TableField<ResumeVideoResumeRecord, Integer> VIDEO_RESUME_ID = createField("video_resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.resume_video_resume</code> table reference
     */
    public ResumeVideoResume() {
        this("resume_video_resume", null);
    }

    /**
     * Create an aliased <code>public.resume_video_resume</code> table reference
     */
    public ResumeVideoResume(String alias) {
        this(alias, RESUME_VIDEO_RESUME);
    }

    private ResumeVideoResume(String alias, Table<ResumeVideoResumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeVideoResume(String alias, Table<ResumeVideoResumeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "temp table that store relations between resume and video resume");
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
    public UniqueKey<ResumeVideoResumeRecord> getPrimaryKey() {
        return Keys.RESUME_VIDEO_RESUME_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeVideoResumeRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeVideoResumeRecord>>asList(Keys.RESUME_VIDEO_RESUME_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeVideoResume as(String alias) {
        return new ResumeVideoResume(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeVideoResume rename(String name) {
        return new ResumeVideoResume(name, null);
    }
}
