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
import ru.hh.jooq.tables.records.ResumeSearchRecordRecord;


/**
 * Saved last unique resume search creteria for employer manager.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResumeSearchRecord extends TableImpl<ResumeSearchRecordRecord> {

    private static final long serialVersionUID = 15095508;

    /**
     * The reference instance of <code>public.resume_search_record</code>
     */
    public static final ResumeSearchRecord RESUME_SEARCH_RECORD = new ResumeSearchRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumeSearchRecordRecord> getRecordType() {
        return ResumeSearchRecordRecord.class;
    }

    /**
     * The column <code>public.resume_search_record.resume_search_record_id</code>.
     */
    public final TableField<ResumeSearchRecordRecord, Integer> RESUME_SEARCH_RECORD_ID = createField("resume_search_record_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('resume_search_record_resume_search_record_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.resume_search_record.creation_time</code>.
     */
    public final TableField<ResumeSearchRecordRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.resume_search_record.criteria</code>.
     */
    public final TableField<ResumeSearchRecordRecord, byte[]> CRITERIA = createField("criteria", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>public.resume_search_record.items_on_page</code>.
     */
    public final TableField<ResumeSearchRecordRecord, Integer> ITEMS_ON_PAGE = createField("items_on_page", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.resume_search_record.user_id</code>.
     */
    public final TableField<ResumeSearchRecordRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_search_record.hash</code>.
     */
    public final TableField<ResumeSearchRecordRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * Create a <code>public.resume_search_record</code> table reference
     */
    public ResumeSearchRecord() {
        this("resume_search_record", null);
    }

    /**
     * Create an aliased <code>public.resume_search_record</code> table reference
     */
    public ResumeSearchRecord(String alias) {
        this(alias, RESUME_SEARCH_RECORD);
    }

    private ResumeSearchRecord(String alias, Table<ResumeSearchRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumeSearchRecord(String alias, Table<ResumeSearchRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Saved last unique resume search creteria for employer manager.");
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
    public Identity<ResumeSearchRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESUME_SEARCH_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResumeSearchRecordRecord> getPrimaryKey() {
        return Keys.RESUME_SEARCH_RECORD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumeSearchRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumeSearchRecordRecord>>asList(Keys.RESUME_SEARCH_RECORD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumeSearchRecordRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumeSearchRecordRecord, ?>>asList(Keys.RESUME_SEARCH_RECORD__RESUME_SEARCH_RECORD_FK_EM_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeSearchRecord as(String alias) {
        return new ResumeSearchRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumeSearchRecord rename(String name) {
        return new ResumeSearchRecord(name, null);
    }
}
