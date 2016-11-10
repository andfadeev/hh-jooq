/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
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
import ru.hh.jooq.tables.records.MailedSearchHistoryRecord;


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
public class MailedSearchHistory extends TableImpl<MailedSearchHistoryRecord> {

    private static final long serialVersionUID = -1537802995;

    /**
     * The reference instance of <code>public.mailed_search_history</code>
     */
    public static final MailedSearchHistory MAILED_SEARCH_HISTORY = new MailedSearchHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MailedSearchHistoryRecord> getRecordType() {
        return MailedSearchHistoryRecord.class;
    }

    /**
     * The column <code>public.mailed_search_history.user_id</code>.
     */
    public final TableField<MailedSearchHistoryRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.mailed_search_history.attempt_hash</code>.
     */
    public final TableField<MailedSearchHistoryRecord, byte[]> ATTEMPT_HASH = createField("attempt_hash", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>public.mailed_search_history.attempt</code>.
     */
    public final TableField<MailedSearchHistoryRecord, String> ATTEMPT = createField("attempt", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.mailed_search_history.mail_time</code>.
     */
    public final TableField<MailedSearchHistoryRecord, LocalDateTime> MAIL_TIME = createField("mail_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.mailed_search_history</code> table reference
     */
    public MailedSearchHistory() {
        this("mailed_search_history", null);
    }

    /**
     * Create an aliased <code>public.mailed_search_history</code> table reference
     */
    public MailedSearchHistory(String alias) {
        this(alias, MAILED_SEARCH_HISTORY);
    }

    private MailedSearchHistory(String alias, Table<MailedSearchHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MailedSearchHistory(String alias, Table<MailedSearchHistoryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<MailedSearchHistoryRecord> getPrimaryKey() {
        return Keys.MAILED_SEARCH_HISTORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MailedSearchHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<MailedSearchHistoryRecord>>asList(Keys.MAILED_SEARCH_HISTORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailedSearchHistory as(String alias) {
        return new MailedSearchHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MailedSearchHistory rename(String name) {
        return new MailedSearchHistory(name, null);
    }
}
