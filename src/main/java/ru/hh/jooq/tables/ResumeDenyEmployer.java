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
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumeDenyEmployerRecord;


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
public class ResumeDenyEmployer extends TableImpl<ResumeDenyEmployerRecord> {

    private static final long serialVersionUID = 232701055;

    /**
     * The reference instance of <code>public.resume_deny_employer</code>
     */
    public static final ResumeDenyEmployer RESUME_DENY_EMPLOYER = new ResumeDenyEmployer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeDenyEmployerRecord> getRecordType() {
        return ResumeDenyEmployerRecord.class;
    }

    /**
     * The column <code>public.resume_deny_employer.employer_id</code>.
     */
    public final TableField<ResumeDenyEmployerRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_deny_employer.resume_id</code>.
     */
    public final TableField<ResumeDenyEmployerRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.resume_deny_employer</code> table reference
     */
    public ResumeDenyEmployer() {
        this("resume_deny_employer", null);
    }

    /**
     * Create an aliased <code>public.resume_deny_employer</code> table reference
     */
    public ResumeDenyEmployer(String alias) {
        this(alias, RESUME_DENY_EMPLOYER);
    }

    private ResumeDenyEmployer(String alias, Table<ResumeDenyEmployerRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeDenyEmployer(String alias, Table<ResumeDenyEmployerRecord> aliased, Field<?>[] parameters) {
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
    public List<UniqueKey<ResumeDenyEmployerRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeDenyEmployerRecord>>asList(Keys.RESUME_DENY_EMPLOYER_UNQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumeDenyEmployerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeDenyEmployerRecord, ?>>asList(Keys.RESUME_DENY_EMPLOYER__RESUME_DENY_EMPLOYER_EMPLOYER_ID_FKEY, Keys.RESUME_DENY_EMPLOYER__RESUME_DENY_EMPLOYER_RESUME_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeDenyEmployer as(String alias) {
        return new ResumeDenyEmployer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeDenyEmployer rename(String name) {
        return new ResumeDenyEmployer(name, null);
    }
}