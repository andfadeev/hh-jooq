/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDate;
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
import ru.hh.jooq.tables.records.DayOffRangeRecord;


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
public class DayOffRange extends TableImpl<DayOffRangeRecord> {

    private static final long serialVersionUID = 1850859526;

    /**
     * The reference instance of <code>public.day_off_range</code>
     */
    public static final DayOffRange DAY_OFF_RANGE = new DayOffRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DayOffRangeRecord> getRecordType() {
        return DayOffRangeRecord.class;
    }

    /**
     * The column <code>public.day_off_range.day_off_id</code>.
     */
    public final TableField<DayOffRangeRecord, Integer> DAY_OFF_ID = createField("day_off_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('day_off_range_day_off_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.day_off_range.user_id</code>.
     */
    public final TableField<DayOffRangeRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.day_off_range.area_id</code>.
     */
    public final TableField<DayOffRangeRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.day_off_range.date_from</code>.
     */
    public final TableField<DayOffRangeRecord, LocalDate> DATE_FROM = createField("date_from", org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.day_off_range.date_to</code>.
     */
    public final TableField<DayOffRangeRecord, LocalDate> DATE_TO = createField("date_to", org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.day_off_range.working</code>.
     */
    public final TableField<DayOffRangeRecord, Boolean> WORKING = createField("working", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.day_off_range</code> table reference
     */
    public DayOffRange() {
        this("day_off_range", null);
    }

    /**
     * Create an aliased <code>public.day_off_range</code> table reference
     */
    public DayOffRange(String alias) {
        this(alias, DAY_OFF_RANGE);
    }

    private DayOffRange(String alias, Table<DayOffRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private DayOffRange(String alias, Table<DayOffRangeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DayOffRangeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DAY_OFF_RANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DayOffRangeRecord> getPrimaryKey() {
        return Keys.DAY_OFF_RANGE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DayOffRangeRecord>> getKeys() {
        return Arrays.<UniqueKey<DayOffRangeRecord>>asList(Keys.DAY_OFF_RANGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DayOffRangeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DayOffRangeRecord, ?>>asList(Keys.DAY_OFF_RANGE__DAY_OFF_RANGE_USER_ID_FKEY, Keys.DAY_OFF_RANGE__DAY_OFF_RANGE_AREA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DayOffRange as(String alias) {
        return new DayOffRange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DayOffRange rename(String name) {
        return new DayOffRange(name, null);
    }
}