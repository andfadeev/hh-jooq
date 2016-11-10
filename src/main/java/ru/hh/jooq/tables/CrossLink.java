/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.CrossLinkRecord;


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
public class CrossLink extends TableImpl<CrossLinkRecord> {

    private static final long serialVersionUID = -1143856814;

    /**
     * The reference instance of <code>public.cross_link</code>
     */
    public static final CrossLink CROSS_LINK = new CrossLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrossLinkRecord> getRecordType() {
        return CrossLinkRecord.class;
    }

    /**
     * The column <code>public.cross_link.area_from</code>.
     */
    public final TableField<CrossLinkRecord, Integer> AREA_FROM = createField("area_from", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.cross_link.area_to</code>.
     */
    public final TableField<CrossLinkRecord, Integer> AREA_TO = createField("area_to", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.cross_link</code> table reference
     */
    public CrossLink() {
        this("cross_link", null);
    }

    /**
     * Create an aliased <code>public.cross_link</code> table reference
     */
    public CrossLink(String alias) {
        this(alias, CROSS_LINK);
    }

    private CrossLink(String alias, Table<CrossLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private CrossLink(String alias, Table<CrossLinkRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CrossLinkRecord> getPrimaryKey() {
        return Keys.CROSS_LINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CrossLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<CrossLinkRecord>>asList(Keys.CROSS_LINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossLink as(String alias) {
        return new CrossLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CrossLink rename(String name) {
        return new CrossLink(name, null);
    }
}