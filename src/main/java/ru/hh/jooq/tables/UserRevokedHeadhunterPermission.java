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
import ru.hh.jooq.tables.records.UserRevokedHeadhunterPermissionRecord;


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
public class UserRevokedHeadhunterPermission extends TableImpl<UserRevokedHeadhunterPermissionRecord> {

    private static final long serialVersionUID = -91258755;

    /**
     * The reference instance of <code>public.user_revoked_headhunter_permission</code>
     */
    public static final UserRevokedHeadhunterPermission USER_REVOKED_HEADHUNTER_PERMISSION = new UserRevokedHeadhunterPermission();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRevokedHeadhunterPermissionRecord> getRecordType() {
        return UserRevokedHeadhunterPermissionRecord.class;
    }

    /**
     * The column <code>public.user_revoked_headhunter_permission.user_revoked_headhunter_permission_id</code>.
     */
    public final TableField<UserRevokedHeadhunterPermissionRecord, Integer> USER_REVOKED_HEADHUNTER_PERMISSION_ID = createField("user_revoked_headhunter_permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('user_revoked_headhunter_permission_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.user_revoked_headhunter_permission.denied_user_id</code>.
     */
    public final TableField<UserRevokedHeadhunterPermissionRecord, Integer> DENIED_USER_ID = createField("denied_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.user_revoked_headhunter_permission.revoked_headhunter_permission_id</code>.
     */
    public final TableField<UserRevokedHeadhunterPermissionRecord, Integer> REVOKED_HEADHUNTER_PERMISSION_ID = createField("revoked_headhunter_permission_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.user_revoked_headhunter_permission</code> table reference
     */
    public UserRevokedHeadhunterPermission() {
        this("user_revoked_headhunter_permission", null);
    }

    /**
     * Create an aliased <code>public.user_revoked_headhunter_permission</code> table reference
     */
    public UserRevokedHeadhunterPermission(String alias) {
        this(alias, USER_REVOKED_HEADHUNTER_PERMISSION);
    }

    private UserRevokedHeadhunterPermission(String alias, Table<UserRevokedHeadhunterPermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRevokedHeadhunterPermission(String alias, Table<UserRevokedHeadhunterPermissionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserRevokedHeadhunterPermissionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_REVOKED_HEADHUNTER_PERMISSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRevokedHeadhunterPermissionRecord> getPrimaryKey() {
        return Keys.USER_REVOKED_HEADHUNTER_PERMISSION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRevokedHeadhunterPermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRevokedHeadhunterPermissionRecord>>asList(Keys.USER_REVOKED_HEADHUNTER_PERMISSION_PK, Keys.USER_REVOKED_HEADHUNTER_PERMISSION_DENIED_USER_ID_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserRevokedHeadhunterPermissionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRevokedHeadhunterPermissionRecord, ?>>asList(Keys.USER_REVOKED_HEADHUNTER_PERMISSION__USER_REVOKED_HEADHUNTER_PERMISSION_IBFK_1, Keys.USER_REVOKED_HEADHUNTER_PERMISSION__USER_REVOKED_HEADHUNTER_PERMISSION_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRevokedHeadhunterPermission as(String alias) {
        return new UserRevokedHeadhunterPermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRevokedHeadhunterPermission rename(String name) {
        return new UserRevokedHeadhunterPermission(name, null);
    }
}