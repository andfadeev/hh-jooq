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
import ru.hh.jooq.tables.records.PriceRegionAreaRecord;


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
public class PriceRegionArea extends TableImpl<PriceRegionAreaRecord> {

    private static final long serialVersionUID = -141381228;

    /**
     * The reference instance of <code>public.price_region_area</code>
     */
    public static final PriceRegionArea PRICE_REGION_AREA = new PriceRegionArea();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PriceRegionAreaRecord> getRecordType() {
        return PriceRegionAreaRecord.class;
    }

    /**
     * The column <code>public.price_region_area.price_region_id</code>.
     */
    public final TableField<PriceRegionAreaRecord, Integer> PRICE_REGION_ID = createField("price_region_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.price_region_area.area_id</code>.
     */
    public final TableField<PriceRegionAreaRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.price_region_area.index_</code>.
     */
    public final TableField<PriceRegionAreaRecord, Integer> INDEX_ = createField("index_", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.price_region_area</code> table reference
     */
    public PriceRegionArea() {
        this("price_region_area", null);
    }

    /**
     * Create an aliased <code>public.price_region_area</code> table reference
     */
    public PriceRegionArea(String alias) {
        this(alias, PRICE_REGION_AREA);
    }

    private PriceRegionArea(String alias, Table<PriceRegionAreaRecord> aliased) {
        this(alias, aliased, null);
    }

    private PriceRegionArea(String alias, Table<PriceRegionAreaRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<PriceRegionAreaRecord> getPrimaryKey() {
        return Keys.PRICE_REGION_AREA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PriceRegionAreaRecord>> getKeys() {
        return Arrays.<UniqueKey<PriceRegionAreaRecord>>asList(Keys.PRICE_REGION_AREA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PriceRegionAreaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PriceRegionAreaRecord, ?>>asList(Keys.PRICE_REGION_AREA__FK884E05027D454CB2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriceRegionArea as(String alias) {
        return new PriceRegionArea(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PriceRegionArea rename(String name) {
        return new PriceRegionArea(name, null);
    }
}