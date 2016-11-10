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
import ru.hh.jooq.tables.records.ParentIdRecord;


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
public class ParentId extends TableImpl<ParentIdRecord> {

    private static final long serialVersionUID = -1424493465;

    /**
     * The reference instance of <code>public.parent_id</code>
     */
    public static final ParentId PARENT_ID = new ParentId();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParentIdRecord> getRecordType() {
        return ParentIdRecord.class;
    }

    /**
     * The column <code>public.parent_id.area_id</code>.
     */
    public final TableField<ParentIdRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.parent_id</code> table reference
     */
    public ParentId() {
        this("parent_id", null);
    }

    /**
     * Create an aliased <code>public.parent_id</code> table reference
     */
    public ParentId(String alias) {
        this(alias, PARENT_ID);
    }

    private ParentId(String alias, Table<ParentIdRecord> aliased) {
        this(alias, aliased, null);
    }

    private ParentId(String alias, Table<ParentIdRecord> aliased, Field<?>[] parameters) {
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
    public ParentId as(String alias) {
        return new ParentId(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ParentId rename(String name) {
        return new ParentId(name, null);
    }
}