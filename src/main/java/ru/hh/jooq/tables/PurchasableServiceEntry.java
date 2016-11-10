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
import ru.hh.jooq.tables.records.PurchasableServiceEntryRecord;


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
public class PurchasableServiceEntry extends TableImpl<PurchasableServiceEntryRecord> {

    private static final long serialVersionUID = -49380201;

    /**
     * The reference instance of <code>public.purchasable_service_entry</code>
     */
    public static final PurchasableServiceEntry PURCHASABLE_SERVICE_ENTRY = new PurchasableServiceEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PurchasableServiceEntryRecord> getRecordType() {
        return PurchasableServiceEntryRecord.class;
    }

    /**
     * The column <code>public.purchasable_service_entry.seller_account_id</code>.
     */
    public final TableField<PurchasableServiceEntryRecord, Integer> SELLER_ACCOUNT_ID = createField("seller_account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.purchasable_service_entry.code</code>.
     */
    public final TableField<PurchasableServiceEntryRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.purchasable_service_entry.employer_category</code>.
     */
    public final TableField<PurchasableServiceEntryRecord, Integer> EMPLOYER_CATEGORY = createField("employer_category", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.purchasable_service_entry.job_site</code>.
     */
    public final TableField<PurchasableServiceEntryRecord, Integer> JOB_SITE = createField("job_site", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.purchasable_service_entry.back_office_only</code>.
     */
    public final TableField<PurchasableServiceEntryRecord, Boolean> BACK_OFFICE_ONLY = createField("back_office_only", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.purchasable_service_entry</code> table reference
     */
    public PurchasableServiceEntry() {
        this("purchasable_service_entry", null);
    }

    /**
     * Create an aliased <code>public.purchasable_service_entry</code> table reference
     */
    public PurchasableServiceEntry(String alias) {
        this(alias, PURCHASABLE_SERVICE_ENTRY);
    }

    private PurchasableServiceEntry(String alias, Table<PurchasableServiceEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private PurchasableServiceEntry(String alias, Table<PurchasableServiceEntryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<PurchasableServiceEntryRecord> getPrimaryKey() {
        return Keys.PURCHASABLE_SERVICE_ENTRY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PurchasableServiceEntryRecord>> getKeys() {
        return Arrays.<UniqueKey<PurchasableServiceEntryRecord>>asList(Keys.PURCHASABLE_SERVICE_ENTRY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PurchasableServiceEntryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PurchasableServiceEntryRecord, ?>>asList(Keys.PURCHASABLE_SERVICE_ENTRY__PURCHASABLE_SERVICE_ENTRY_SELLER_ACCOUNT_ID_FKEY, Keys.PURCHASABLE_SERVICE_ENTRY__PURCHASABLE_SERVICE_ENTRY_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PurchasableServiceEntry as(String alias) {
        return new PurchasableServiceEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PurchasableServiceEntry rename(String name) {
        return new PurchasableServiceEntry(name, null);
    }
}
