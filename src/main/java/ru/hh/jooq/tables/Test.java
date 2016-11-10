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
import ru.hh.jooq.tables.records.TestRecord;


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
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = -1871731995;

    /**
     * The reference instance of <code>public.test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>public.test.id</code>.
     */
    public final TableField<TestRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.test.is_finished</code>.
     */
    public final TableField<TestRecord, Integer> IS_FINISHED = createField("is_finished", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.test</code> table reference
     */
    public Test() {
        this("test", null);
    }

    /**
     * Create an aliased <code>public.test</code> table reference
     */
    public Test(String alias) {
        this(alias, TEST);
    }

    private Test(String alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(String alias, Table<TestRecord> aliased, Field<?>[] parameters) {
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
    public Test as(String alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(name, null);
    }
}