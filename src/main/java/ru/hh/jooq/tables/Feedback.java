/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.FeedbackRecord;


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
public class Feedback extends TableImpl<FeedbackRecord> {

    private static final long serialVersionUID = -1893504502;

    /**
     * The reference instance of <code>public.feedback</code>
     */
    public static final Feedback FEEDBACK = new Feedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeedbackRecord> getRecordType() {
        return FeedbackRecord.class;
    }

    /**
     * The column <code>public.feedback.feedback_id</code>.
     */
    public final TableField<FeedbackRecord, Integer> FEEDBACK_ID = createField("feedback_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('feedback_feedback_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.feedback.creation_time</code>.
     */
    public final TableField<FeedbackRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.feedback.name</code>.
     */
    public final TableField<FeedbackRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.feedback.subject</code>.
     */
    public final TableField<FeedbackRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.feedback.email</code>.
     */
    public final TableField<FeedbackRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.feedback.content</code>.
     */
    public final TableField<FeedbackRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.feedback.status</code>.
     */
    public final TableField<FeedbackRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.feedback.user_data</code>.
     */
    public final TableField<FeedbackRecord, String> USER_DATA = createField("user_data", org.jooq.impl.SQLDataType.VARCHAR.length(2048), this, "");

    /**
     * The column <code>public.feedback.type</code>.
     */
    public final TableField<FeedbackRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.feedback</code> table reference
     */
    public Feedback() {
        this("feedback", null);
    }

    /**
     * Create an aliased <code>public.feedback</code> table reference
     */
    public Feedback(String alias) {
        this(alias, FEEDBACK);
    }

    private Feedback(String alias, Table<FeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private Feedback(String alias, Table<FeedbackRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FeedbackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEEDBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FeedbackRecord> getPrimaryKey() {
        return Keys.FEEDBACK_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<FeedbackRecord>>asList(Keys.FEEDBACK_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feedback as(String alias) {
        return new Feedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Feedback rename(String name) {
        return new Feedback(name, null);
    }
}