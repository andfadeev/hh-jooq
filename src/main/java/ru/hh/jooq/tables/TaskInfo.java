/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


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
import ru.hh.jooq.tables.records.TaskInfoRecord;


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
public class TaskInfo extends TableImpl<TaskInfoRecord> {

    private static final long serialVersionUID = -152159562;

    /**
     * The reference instance of <code>public.task_info</code>
     */
    public static final TaskInfo TASK_INFO = new TaskInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskInfoRecord> getRecordType() {
        return TaskInfoRecord.class;
    }

    /**
     * The column <code>public.task_info.task_info_id</code>.
     */
    public final TableField<TaskInfoRecord, Integer> TASK_INFO_ID = createField("task_info_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('task_info_task_info_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.task_info.name</code>.
     */
    public final TableField<TaskInfoRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.task_info.description</code>.
     */
    public final TableField<TaskInfoRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.task_info.enabled</code>.
     */
    public final TableField<TaskInfoRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.task_info.class_name</code>.
     */
    public final TableField<TaskInfoRecord, String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>public.task_info.delay</code>.
     */
    public final TableField<TaskInfoRecord, Long> DELAY = createField("delay", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.task_info.repeat_interval</code>.
     */
    public final TableField<TaskInfoRecord, Long> REPEAT_INTERVAL = createField("repeat_interval", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.task_info.start_at_hour</code>.
     */
    public final TableField<TaskInfoRecord, Integer> START_AT_HOUR = createField("start_at_hour", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.task_info.start_at_minute</code>.
     */
    public final TableField<TaskInfoRecord, Integer> START_AT_MINUTE = createField("start_at_minute", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.task_info.start_at_second</code>.
     */
    public final TableField<TaskInfoRecord, Integer> START_AT_SECOND = createField("start_at_second", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.task_info.target_host</code>.
     */
    public final TableField<TaskInfoRecord, String> TARGET_HOST = createField("target_host", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>public.task_info.disabled_days_mask</code>.
     */
    public final TableField<TaskInfoRecord, Long> DISABLED_DAYS_MASK = createField("disabled_days_mask", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.task_info.args</code>.
     */
    public final TableField<TaskInfoRecord, String> ARGS = createField("args", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "");

    /**
     * The column <code>public.task_info.use_disabled_period_during_day</code>.
     */
    public final TableField<TaskInfoRecord, Boolean> USE_DISABLED_PERIOD_DURING_DAY = createField("use_disabled_period_during_day", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.task_info.disabled_from_hour</code>.
     */
    public final TableField<TaskInfoRecord, Integer> DISABLED_FROM_HOUR = createField("disabled_from_hour", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.task_info.disabled_from_minute</code>.
     */
    public final TableField<TaskInfoRecord, Integer> DISABLED_FROM_MINUTE = createField("disabled_from_minute", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.task_info.disabled_to_hour</code>.
     */
    public final TableField<TaskInfoRecord, Integer> DISABLED_TO_HOUR = createField("disabled_to_hour", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.task_info.disabled_to_minute</code>.
     */
    public final TableField<TaskInfoRecord, Integer> DISABLED_TO_MINUTE = createField("disabled_to_minute", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.task_info</code> table reference
     */
    public TaskInfo() {
        this("task_info", null);
    }

    /**
     * Create an aliased <code>public.task_info</code> table reference
     */
    public TaskInfo(String alias) {
        this(alias, TASK_INFO);
    }

    private TaskInfo(String alias, Table<TaskInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskInfo(String alias, Table<TaskInfoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TaskInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TASK_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TaskInfoRecord> getPrimaryKey() {
        return Keys.TASK_INFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TaskInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskInfoRecord>>asList(Keys.TASK_INFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskInfo as(String alias) {
        return new TaskInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskInfo rename(String name) {
        return new TaskInfo(name, null);
    }
}
