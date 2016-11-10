/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
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
import ru.hh.jooq.tables.records.HrxmlHitRecord;


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
public class HrxmlHit extends TableImpl<HrxmlHitRecord> {

    private static final long serialVersionUID = -1163770861;

    /**
     * The reference instance of <code>public.hrxml_hit</code>
     */
    public static final HrxmlHit HRXML_HIT = new HrxmlHit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrxmlHitRecord> getRecordType() {
        return HrxmlHitRecord.class;
    }

    /**
     * The column <code>public.hrxml_hit.hrxml_hit_id</code>.
     */
    public final TableField<HrxmlHitRecord, Integer> HRXML_HIT_ID = createField("hrxml_hit_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('hrxml_hit_hrxml_hit_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.hrxml_hit.applicationname</code>.
     */
    public final TableField<HrxmlHitRecord, String> APPLICATIONNAME = createField("applicationname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.applicationversion</code>.
     */
    public final TableField<HrxmlHitRecord, String> APPLICATIONVERSION = createField("applicationversion", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.date</code>.
     */
    public final TableField<HrxmlHitRecord, LocalDateTime> DATE = createField("date", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.hits</code>.
     */
    public final TableField<HrxmlHitRecord, Integer> HITS = createField("hits", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.operationname</code>.
     */
    public final TableField<HrxmlHitRecord, String> OPERATIONNAME = createField("operationname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.runas</code>.
     */
    public final TableField<HrxmlHitRecord, Boolean> RUNAS = createField("runas", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.hrxml_hit.user_id</code>.
     */
    public final TableField<HrxmlHitRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.hrxml_hit</code> table reference
     */
    public HrxmlHit() {
        this("hrxml_hit", null);
    }

    /**
     * Create an aliased <code>public.hrxml_hit</code> table reference
     */
    public HrxmlHit(String alias) {
        this(alias, HRXML_HIT);
    }

    private HrxmlHit(String alias, Table<HrxmlHitRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrxmlHit(String alias, Table<HrxmlHitRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HrxmlHitRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HRXML_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrxmlHitRecord> getPrimaryKey() {
        return Keys.HRXML_HIT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrxmlHitRecord>> getKeys() {
        return Arrays.<UniqueKey<HrxmlHitRecord>>asList(Keys.HRXML_HIT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<HrxmlHitRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HrxmlHitRecord, ?>>asList(Keys.HRXML_HIT__USER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrxmlHit as(String alias) {
        return new HrxmlHit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrxmlHit rename(String name) {
        return new HrxmlHit(name, null);
    }
}