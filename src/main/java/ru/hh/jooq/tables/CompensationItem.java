/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.CompensationItemRecord;


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
public class CompensationItem extends TableImpl<CompensationItemRecord> {

    private static final long serialVersionUID = -132160363;

    /**
     * The reference instance of <code>public.compensation_item</code>
     */
    public static final CompensationItem COMPENSATION_ITEM = new CompensationItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompensationItemRecord> getRecordType() {
        return CompensationItemRecord.class;
    }

    /**
     * The column <code>public.compensation_item.compensation_item_id</code>.
     */
    public final TableField<CompensationItemRecord, Integer> COMPENSATION_ITEM_ID = createField("compensation_item_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('compensation_item_compensation_item_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.compensation_item.compensation_id</code>.
     */
    public final TableField<CompensationItemRecord, Integer> COMPENSATION_ID = createField("compensation_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.compensation_item.employer_service_id</code>.
     */
    public final TableField<CompensationItemRecord, Integer> EMPLOYER_SERVICE_ID = createField("employer_service_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.compensation_item</code> table reference
     */
    public CompensationItem() {
        this("compensation_item", null);
    }

    /**
     * Create an aliased <code>public.compensation_item</code> table reference
     */
    public CompensationItem(String alias) {
        this(alias, COMPENSATION_ITEM);
    }

    private CompensationItem(String alias, Table<CompensationItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompensationItem(String alias, Table<CompensationItemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CompensationItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMPENSATION_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompensationItemRecord> getPrimaryKey() {
        return Keys.COMPENSATION_ITEM_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompensationItemRecord>> getKeys() {
        return Arrays.<UniqueKey<CompensationItemRecord>>asList(Keys.COMPENSATION_ITEM_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompensationItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompensationItemRecord, ?>>asList(Keys.COMPENSATION_ITEM__COMPENSATION_ITEM_COMPENSATION_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompensationItem as(String alias) {
        return new CompensationItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompensationItem rename(String name) {
        return new CompensationItem(name, null);
    }
}