/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumeAllowEmployerRecord;


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
public class ResumeAllowEmployer extends TableImpl<ResumeAllowEmployerRecord> {

    private static final long serialVersionUID = -855196737;

    /**
     * The reference instance of <code>public.resume_allow_employer</code>
     */
    public static final ResumeAllowEmployer RESUME_ALLOW_EMPLOYER = new ResumeAllowEmployer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeAllowEmployerRecord> getRecordType() {
        return ResumeAllowEmployerRecord.class;
    }

    /**
     * The column <code>public.resume_allow_employer.employer_id</code>.
     */
    public final TableField<ResumeAllowEmployerRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_allow_employer.resume_id</code>.
     */
    public final TableField<ResumeAllowEmployerRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.resume_allow_employer</code> table reference
     */
    public ResumeAllowEmployer() {
        this("resume_allow_employer", null);
    }

    /**
     * Create an aliased <code>public.resume_allow_employer</code> table reference
     */
    public ResumeAllowEmployer(String alias) {
        this(alias, RESUME_ALLOW_EMPLOYER);
    }

    private ResumeAllowEmployer(String alias, Table<ResumeAllowEmployerRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeAllowEmployer(String alias, Table<ResumeAllowEmployerRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<ResumeAllowEmployerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeAllowEmployerRecord, ?>>asList(Keys.RESUME_ALLOW_EMPLOYER__RESUME_ALLOW_EMPLOYER_EMPLOYER_ID_FKEY, Keys.RESUME_ALLOW_EMPLOYER__RESUME_ALLOW_EMPLOYER_RESUME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeAllowEmployer as(String alias) {
        return new ResumeAllowEmployer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeAllowEmployer rename(String name) {
        return new ResumeAllowEmployer(name, null);
    }
}