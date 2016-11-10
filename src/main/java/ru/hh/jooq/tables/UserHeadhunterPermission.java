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
import ru.hh.jooq.tables.records.UserHeadhunterPermissionRecord;


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
public class UserHeadhunterPermission extends TableImpl<UserHeadhunterPermissionRecord> {

    private static final long serialVersionUID = -1314247666;

    /**
     * The reference instance of <code>public.user_headhunter_permission</code>
     */
    public static final UserHeadhunterPermission USER_HEADHUNTER_PERMISSION = new UserHeadhunterPermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserHeadhunterPermissionRecord> getRecordType() {
        return UserHeadhunterPermissionRecord.class;
    }

    /**
     * The column <code>public.user_headhunter_permission.user_headhunter_permission_id</code>.
     */
    public final TableField<UserHeadhunterPermissionRecord, Integer> USER_HEADHUNTER_PERMISSION_ID = createField("user_headhunter_permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_headhunter_permission_user_headhunter_permission_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_headhunter_permission.user_id</code>.
     */
    public final TableField<UserHeadhunterPermissionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_headhunter_permission.headhunter_permission_id</code>.
     */
    public final TableField<UserHeadhunterPermissionRecord, Integer> HEADHUNTER_PERMISSION_ID = createField("headhunter_permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.user_headhunter_permission</code> table reference
     */
    public UserHeadhunterPermission() {
        this("user_headhunter_permission", null);
    }

    /**
     * Create an aliased <code>public.user_headhunter_permission</code> table reference
     */
    public UserHeadhunterPermission(String alias) {
        this(alias, USER_HEADHUNTER_PERMISSION);
    }

    private UserHeadhunterPermission(String alias, Table<UserHeadhunterPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserHeadhunterPermission(String alias, Table<UserHeadhunterPermissionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserHeadhunterPermissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_HEADHUNTER_PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserHeadhunterPermissionRecord> getPrimaryKey() {
        return Keys.USER_HEADHUNTER_PERMISSION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserHeadhunterPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserHeadhunterPermissionRecord>>asList(Keys.USER_HEADHUNTER_PERMISSION_PK, Keys.USER_HEADHUNTER_PERMISSION_USER_ID_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserHeadhunterPermissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserHeadhunterPermissionRecord, ?>>asList(Keys.USER_HEADHUNTER_PERMISSION__USER_HEADHUNTER_PERMISSION_IBFK_1, Keys.USER_HEADHUNTER_PERMISSION__USER_HEADHUNTER_PERMISSION_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHeadhunterPermission as(String alias) {
        return new UserHeadhunterPermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserHeadhunterPermission rename(String name) {
        return new UserHeadhunterPermission(name, null);
    }
}
