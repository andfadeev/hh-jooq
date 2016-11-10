/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.FreeEmailProviderRecord;


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
public class FreeEmailProvider extends TableImpl<FreeEmailProviderRecord> {

    private static final long serialVersionUID = 1113691817;

    /**
     * The reference instance of <code>public.free_email_provider</code>
     */
    public static final FreeEmailProvider FREE_EMAIL_PROVIDER = new FreeEmailProvider();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FreeEmailProviderRecord> getRecordType() {
        return FreeEmailProviderRecord.class;
    }

    /**
     * The column <code>public.free_email_provider.free_email_provider_id</code>.
     */
    public final TableField<FreeEmailProviderRecord, Integer> FREE_EMAIL_PROVIDER_ID = createField("free_email_provider_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('free_email_provider_free_email_provider_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.free_email_provider.name</code>.
     */
    public final TableField<FreeEmailProviderRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>public.free_email_provider</code> table reference
     */
    public FreeEmailProvider() {
        this("free_email_provider", null);
    }

    /**
     * Create an aliased <code>public.free_email_provider</code> table reference
     */
    public FreeEmailProvider(String alias) {
        this(alias, FREE_EMAIL_PROVIDER);
    }

    private FreeEmailProvider(String alias, Table<FreeEmailProviderRecord> aliased) {
        this(alias, aliased, null);
    }

    private FreeEmailProvider(String alias, Table<FreeEmailProviderRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FreeEmailProviderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FREE_EMAIL_PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FreeEmailProviderRecord> getPrimaryKey() {
        return Keys.FREE_EMAIL_PROVIDER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FreeEmailProviderRecord>> getKeys() {
        return Arrays.<UniqueKey<FreeEmailProviderRecord>>asList(Keys.FREE_EMAIL_PROVIDER_PK, Keys.FREE_EMAIL_PROVIDER_NAME_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FreeEmailProvider as(String alias) {
        return new FreeEmailProvider(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FreeEmailProvider rename(String name) {
        return new FreeEmailProvider(name, null);
    }
}
