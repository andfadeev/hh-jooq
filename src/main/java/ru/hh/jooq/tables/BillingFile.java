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
import ru.hh.jooq.tables.records.BillingFileRecord;


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
public class BillingFile extends TableImpl<BillingFileRecord> {

    private static final long serialVersionUID = -754370024;

    /**
     * The reference instance of <code>public.billing_file</code>
     */
    public static final BillingFile BILLING_FILE = new BillingFile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BillingFileRecord> getRecordType() {
        return BillingFileRecord.class;
    }

    /**
     * The column <code>public.billing_file.billing_file_id</code>.
     */
    public final TableField<BillingFileRecord, Integer> BILLING_FILE_ID = createField("billing_file_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('billing_file_billing_file_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.billing_file.type</code>.
     */
    public final TableField<BillingFileRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.billing_file.name</code>.
     */
    public final TableField<BillingFileRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.billing_file.ext</code>.
     */
    public final TableField<BillingFileRecord, String> EXT = createField("ext", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>public.billing_file.legacy</code>.
     */
    public final TableField<BillingFileRecord, Boolean> LEGACY = createField("legacy", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.billing_file</code> table reference
     */
    public BillingFile() {
        this("billing_file", null);
    }

    /**
     * Create an aliased <code>public.billing_file</code> table reference
     */
    public BillingFile(String alias) {
        this(alias, BILLING_FILE);
    }

    private BillingFile(String alias, Table<BillingFileRecord> aliased) {
        this(alias, aliased, null);
    }

    private BillingFile(String alias, Table<BillingFileRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BillingFileRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BILLING_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BillingFileRecord> getPrimaryKey() {
        return Keys.BILLING_FILE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BillingFileRecord>> getKeys() {
        return Arrays.<UniqueKey<BillingFileRecord>>asList(Keys.BILLING_FILE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BillingFile as(String alias) {
        return new BillingFile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BillingFile rename(String name) {
        return new BillingFile(name, null);
    }
}
