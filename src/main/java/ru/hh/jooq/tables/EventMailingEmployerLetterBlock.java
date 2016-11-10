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
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.EventMailingEmployerLetterBlockRecord;


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
public class EventMailingEmployerLetterBlock extends TableImpl<EventMailingEmployerLetterBlockRecord> {

    private static final long serialVersionUID = -1303309562;

    /**
     * The reference instance of <code>public.event_mailing_employer_letter_block</code>
     */
    public static final EventMailingEmployerLetterBlock EVENT_MAILING_EMPLOYER_LETTER_BLOCK = new EventMailingEmployerLetterBlock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventMailingEmployerLetterBlockRecord> getRecordType() {
        return EventMailingEmployerLetterBlockRecord.class;
    }

    /**
     * The column <code>public.event_mailing_employer_letter_block.employer_letter_id</code>.
     */
    public final TableField<EventMailingEmployerLetterBlockRecord, Long> EMPLOYER_LETTER_ID = createField("employer_letter_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.event_mailing_employer_letter_block.employer_block_id</code>.
     */
    public final TableField<EventMailingEmployerLetterBlockRecord, Short> EMPLOYER_BLOCK_ID = createField("employer_block_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.event_mailing_employer_letter_block.last_changed_datetime</code>.
     */
    public final TableField<EventMailingEmployerLetterBlockRecord, LocalDateTime> LAST_CHANGED_DATETIME = createField("last_changed_datetime", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.event_mailing_employer_letter_block.status</code>.
     */
    public final TableField<EventMailingEmployerLetterBlockRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.event_mailing_employer_letter_block</code> table reference
     */
    public EventMailingEmployerLetterBlock() {
        this("event_mailing_employer_letter_block", null);
    }

    /**
     * Create an aliased <code>public.event_mailing_employer_letter_block</code> table reference
     */
    public EventMailingEmployerLetterBlock(String alias) {
        this(alias, EVENT_MAILING_EMPLOYER_LETTER_BLOCK);
    }

    private EventMailingEmployerLetterBlock(String alias, Table<EventMailingEmployerLetterBlockRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventMailingEmployerLetterBlock(String alias, Table<EventMailingEmployerLetterBlockRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EventMailingEmployerLetterBlockRecord> getPrimaryKey() {
        return Keys.EVENT_MAILING_EMPLOYER_LETTER_BLOCK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventMailingEmployerLetterBlockRecord>> getKeys() {
        return Arrays.<UniqueKey<EventMailingEmployerLetterBlockRecord>>asList(Keys.EVENT_MAILING_EMPLOYER_LETTER_BLOCK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EventMailingEmployerLetterBlockRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventMailingEmployerLetterBlockRecord, ?>>asList(Keys.EVENT_MAILING_EMPLOYER_LETTER_BLOCK__EVENT_MAILING_EMPLOYER_LETTER_BLOCK_EMPLOYER_LETTER_ID_FKEY, Keys.EVENT_MAILING_EMPLOYER_LETTER_BLOCK__EVENT_MAILING_EMPLOYER_LETTER_BLOCK_EMPLOYER_BLOCK_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventMailingEmployerLetterBlock as(String alias) {
        return new EventMailingEmployerLetterBlock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventMailingEmployerLetterBlock rename(String name) {
        return new EventMailingEmployerLetterBlock(name, null);
    }
}
