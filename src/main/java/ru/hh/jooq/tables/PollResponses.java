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
import ru.hh.jooq.tables.records.PollResponsesRecord;


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
public class PollResponses extends TableImpl<PollResponsesRecord> {

    private static final long serialVersionUID = -1504195407;

    /**
     * The reference instance of <code>public.poll_responses</code>
     */
    public static final PollResponses POLL_RESPONSES = new PollResponses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PollResponsesRecord> getRecordType() {
        return PollResponsesRecord.class;
    }

    /**
     * The column <code>public.poll_responses.poll_response_id</code>.
     */
    public final TableField<PollResponsesRecord, Integer> POLL_RESPONSE_ID = createField("poll_response_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('poll_responses_poll_response_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.poll_responses.question_id</code>.
     */
    public final TableField<PollResponsesRecord, Integer> QUESTION_ID = createField("question_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.poll_responses.user_id</code>.
     */
    public final TableField<PollResponsesRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.poll_responses.value</code>.
     */
    public final TableField<PollResponsesRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.poll_responses.date_taken</code>.
     */
    public final TableField<PollResponsesRecord, LocalDateTime> DATE_TAKEN = createField("date_taken", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.poll_responses</code> table reference
     */
    public PollResponses() {
        this("poll_responses", null);
    }

    /**
     * Create an aliased <code>public.poll_responses</code> table reference
     */
    public PollResponses(String alias) {
        this(alias, POLL_RESPONSES);
    }

    private PollResponses(String alias, Table<PollResponsesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PollResponses(String alias, Table<PollResponsesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PollResponsesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_POLL_RESPONSES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PollResponsesRecord> getPrimaryKey() {
        return Keys.POLL_RESPONSES_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PollResponsesRecord>> getKeys() {
        return Arrays.<UniqueKey<PollResponsesRecord>>asList(Keys.POLL_RESPONSES_PKEY, Keys.POLL_RESPONSES_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PollResponsesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PollResponsesRecord, ?>>asList(Keys.POLL_RESPONSES__POLL_RESPONSES_QUESTION_FK, Keys.POLL_RESPONSES__POLL_RESPONSES_HHUSER_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PollResponses as(String alias) {
        return new PollResponses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PollResponses rename(String name) {
        return new PollResponses(name, null);
    }
}