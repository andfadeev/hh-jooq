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
import ru.hh.jooq.tables.records.TmpWrongAspesRecord;


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
public class TmpWrongAspes extends TableImpl<TmpWrongAspesRecord> {

    private static final long serialVersionUID = -639038262;

    /**
     * The reference instance of <code>public.tmp_wrong_aspes</code>
     */
    public static final TmpWrongAspes TMP_WRONG_ASPES = new TmpWrongAspes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TmpWrongAspesRecord> getRecordType() {
        return TmpWrongAspesRecord.class;
    }

    /**
     * The column <code>public.tmp_wrong_aspes.id</code>.
     */
    public final TableField<TmpWrongAspesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tmp_wrong_aspes.count1</code>.
     */
    public final TableField<TmpWrongAspesRecord, Integer> COUNT1 = createField("count1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tmp_wrong_aspes.count2</code>.
     */
    public final TableField<TmpWrongAspesRecord, Integer> COUNT2 = createField("count2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.tmp_wrong_aspes</code> table reference
     */
    public TmpWrongAspes() {
        this("tmp_wrong_aspes", null);
    }

    /**
     * Create an aliased <code>public.tmp_wrong_aspes</code> table reference
     */
    public TmpWrongAspes(String alias) {
        this(alias, TMP_WRONG_ASPES);
    }

    private TmpWrongAspes(String alias, Table<TmpWrongAspesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TmpWrongAspes(String alias, Table<TmpWrongAspesRecord> aliased, Field<?>[] parameters) {
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
    public TmpWrongAspes as(String alias) {
        return new TmpWrongAspes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TmpWrongAspes rename(String name) {
        return new TmpWrongAspes(name, null);
    }
}