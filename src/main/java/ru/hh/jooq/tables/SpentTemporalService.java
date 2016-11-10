/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.SpentTemporalServiceRecord;


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
public class SpentTemporalService extends TableImpl<SpentTemporalServiceRecord> {

    private static final long serialVersionUID = 1021260709;

    /**
     * The reference instance of <code>public.spent_temporal_service</code>
     */
    public static final SpentTemporalService SPENT_TEMPORAL_SERVICE = new SpentTemporalService();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpentTemporalServiceRecord> getRecordType() {
        return SpentTemporalServiceRecord.class;
    }

    /**
     * The column <code>public.spent_temporal_service.id</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('spent_temporal_service_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.spent_temporal_service.sent</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Boolean> SENT = createField("sent", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.spent_temporal_service.service_id</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Integer> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.spent_temporal_service.time</code>.
     */
    public final TableField<SpentTemporalServiceRecord, LocalDateTime> TIME = createField("time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.spent_temporal_service.vacancy_id</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.spent_temporal_service.restored</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Boolean> RESTORED = createField("restored", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.spent_temporal_service.manager_id</code>.
     */
    public final TableField<SpentTemporalServiceRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.spent_temporal_service</code> table reference
     */
    public SpentTemporalService() {
        this("spent_temporal_service", null);
    }

    /**
     * Create an aliased <code>public.spent_temporal_service</code> table reference
     */
    public SpentTemporalService(String alias) {
        this(alias, SPENT_TEMPORAL_SERVICE);
    }

    private SpentTemporalService(String alias, Table<SpentTemporalServiceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpentTemporalService(String alias, Table<SpentTemporalServiceRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SpentTemporalServiceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SPENT_TEMPORAL_SERVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpentTemporalServiceRecord> getPrimaryKey() {
        return Keys.SPENT_TEMPORAL_SERVICE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpentTemporalServiceRecord>> getKeys() {
        return Arrays.<UniqueKey<SpentTemporalServiceRecord>>asList(Keys.SPENT_TEMPORAL_SERVICE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpentTemporalService as(String alias) {
        return new SpentTemporalService(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpentTemporalService rename(String name) {
        return new SpentTemporalService(name, null);
    }
}