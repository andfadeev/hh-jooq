/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.FaUpsellRecord;


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
public class FaUpsell extends TableImpl<FaUpsellRecord> {

    private static final long serialVersionUID = -1392097427;

    /**
     * The reference instance of <code>public.fa_upsell</code>
     */
    public static final FaUpsell FA_UPSELL = new FaUpsell();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FaUpsellRecord> getRecordType() {
        return FaUpsellRecord.class;
    }

    /**
     * The column <code>public.fa_upsell.employer_id</code>.
     */
    public final TableField<FaUpsellRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.fa_upsell.tag</code>.
     */
    public final TableField<FaUpsellRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.fa_upsell</code> table reference
     */
    public FaUpsell() {
        this("fa_upsell", null);
    }

    /**
     * Create an aliased <code>public.fa_upsell</code> table reference
     */
    public FaUpsell(String alias) {
        this(alias, FA_UPSELL);
    }

    private FaUpsell(String alias, Table<FaUpsellRecord> aliased) {
        this(alias, aliased, null);
    }

    private FaUpsell(String alias, Table<FaUpsellRecord> aliased, Field<?>[] parameters) {
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
    public FaUpsell as(String alias) {
        return new FaUpsell(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FaUpsell rename(String name) {
        return new FaUpsell(name, null);
    }
}