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
import ru.hh.jooq.tables.records.Invoice_07_09_2016Record;


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
public class Invoice_07_09_2016 extends TableImpl<Invoice_07_09_2016Record> {

    private static final long serialVersionUID = -413148442;

    /**
     * The reference instance of <code>public.invoice_07_09_2016</code>
     */
    public static final Invoice_07_09_2016 INVOICE_07_09_2016 = new Invoice_07_09_2016();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Invoice_07_09_2016Record> getRecordType() {
        return Invoice_07_09_2016Record.class;
    }

    /**
     * The column <code>public.invoice_07_09_2016.creation_time</code>.
     */
    public final TableField<Invoice_07_09_2016Record, String> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>public.invoice_07_09_2016.number</code>.
     */
    public final TableField<Invoice_07_09_2016Record, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>public.invoice_07_09_2016.file_id</code>.
     */
    public final TableField<Invoice_07_09_2016Record, Integer> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.invoice_07_09_2016.bar_code</code>.
     */
    public final TableField<Invoice_07_09_2016Record, String> BAR_CODE = createField("bar_code", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>public.invoice_07_09_2016.key_</code>.
     */
    public final TableField<Invoice_07_09_2016Record, String> KEY_ = createField("key_", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>public.invoice_07_09_2016.deed_id</code>.
     */
    public final TableField<Invoice_07_09_2016Record, Integer> DEED_ID = createField("deed_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.invoice_07_09_2016.title</code>.
     */
    public final TableField<Invoice_07_09_2016Record, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>public.invoice_07_09_2016.billing_file_id</code>.
     */
    public final TableField<Invoice_07_09_2016Record, Integer> BILLING_FILE_ID = createField("billing_file_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.invoice_07_09_2016</code> table reference
     */
    public Invoice_07_09_2016() {
        this("invoice_07_09_2016", null);
    }

    /**
     * Create an aliased <code>public.invoice_07_09_2016</code> table reference
     */
    public Invoice_07_09_2016(String alias) {
        this(alias, INVOICE_07_09_2016);
    }

    private Invoice_07_09_2016(String alias, Table<Invoice_07_09_2016Record> aliased) {
        this(alias, aliased, null);
    }

    private Invoice_07_09_2016(String alias, Table<Invoice_07_09_2016Record> aliased, Field<?>[] parameters) {
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
    public Invoice_07_09_2016 as(String alias) {
        return new Invoice_07_09_2016(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Invoice_07_09_2016 rename(String name) {
        return new Invoice_07_09_2016(name, null);
    }
}