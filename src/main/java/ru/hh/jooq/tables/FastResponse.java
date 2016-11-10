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
import ru.hh.jooq.tables.records.FastResponseRecord;


/**
 * HH-56767. Anonymous user fast vacancy responses
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FastResponse extends TableImpl<FastResponseRecord> {

    private static final long serialVersionUID = 1526325297;

    /**
     * The reference instance of <code>public.fast_response</code>
     */
    public static final FastResponse FAST_RESPONSE = new FastResponse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FastResponseRecord> getRecordType() {
        return FastResponseRecord.class;
    }

    /**
     * The column <code>public.fast_response.id</code>.
     */
    public final TableField<FastResponseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('fast_response_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.fast_response.contact</code>.
     */
    public final TableField<FastResponseRecord, String> CONTACT = createField("contact", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.fast_response.text</code>.
     */
    public final TableField<FastResponseRecord, String> TEXT = createField("text", org.jooq.impl.SQLDataType.VARCHAR.length(10000), this, "");

    /**
     * The column <code>public.fast_response.hhuid</code>.
     */
    public final TableField<FastResponseRecord, String> HHUID = createField("hhuid", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>public.fast_response.vacancy_id</code>.
     */
    public final TableField<FastResponseRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.fast_response.creation_time</code>.
     */
    public final TableField<FastResponseRecord, LocalDateTime> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.fast_response.unread</code>.
     */
    public final TableField<FastResponseRecord, Boolean> UNREAD = createField("unread", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.fast_response.contacts_shown</code>.
     */
    public final TableField<FastResponseRecord, Boolean> CONTACTS_SHOWN = createField("contacts_shown", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.fast_response.hidden</code>.
     */
    public final TableField<FastResponseRecord, Boolean> HIDDEN = createField("hidden", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.fast_response.source</code>.
     */
    public final TableField<FastResponseRecord, Integer> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("3", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.fast_response</code> table reference
     */
    public FastResponse() {
        this("fast_response", null);
    }

    /**
     * Create an aliased <code>public.fast_response</code> table reference
     */
    public FastResponse(String alias) {
        this(alias, FAST_RESPONSE);
    }

    private FastResponse(String alias, Table<FastResponseRecord> aliased) {
        this(alias, aliased, null);
    }

    private FastResponse(String alias, Table<FastResponseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "HH-56767. Anonymous user fast vacancy responses");
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
    public Identity<FastResponseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FAST_RESPONSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FastResponseRecord> getPrimaryKey() {
        return Keys.FAST_RESPONSE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FastResponseRecord>> getKeys() {
        return Arrays.<UniqueKey<FastResponseRecord>>asList(Keys.FAST_RESPONSE_PKEY, Keys.FAST_RESPONSE_HHUID_VACANCY_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FastResponseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FastResponseRecord, ?>>asList(Keys.FAST_RESPONSE__FAST_RESPONSE_VACANCY_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FastResponse as(String alias) {
        return new FastResponse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FastResponse rename(String name) {
        return new FastResponse(name, null);
    }
}