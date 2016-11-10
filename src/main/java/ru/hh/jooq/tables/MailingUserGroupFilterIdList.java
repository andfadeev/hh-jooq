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
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.MailingUserGroupFilterIdListRecord;


/**
 * Ids for template (e.g. employer ids)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MailingUserGroupFilterIdList extends TableImpl<MailingUserGroupFilterIdListRecord> {

    private static final long serialVersionUID = 450957647;

    /**
     * The reference instance of <code>public.mailing_user_group_filter_id_list</code>
     */
    public static final MailingUserGroupFilterIdList MAILING_USER_GROUP_FILTER_ID_LIST = new MailingUserGroupFilterIdList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MailingUserGroupFilterIdListRecord> getRecordType() {
        return MailingUserGroupFilterIdListRecord.class;
    }

    /**
     * The column <code>public.mailing_user_group_filter_id_list.mailing_user_group_filter_id</code>.
     */
    public final TableField<MailingUserGroupFilterIdListRecord, Integer> MAILING_USER_GROUP_FILTER_ID = createField("mailing_user_group_filter_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mailing_user_group_filter_id_list.id</code>.
     */
    public final TableField<MailingUserGroupFilterIdListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.mailing_user_group_filter_id_list</code> table reference
     */
    public MailingUserGroupFilterIdList() {
        this("mailing_user_group_filter_id_list", null);
    }

    /**
     * Create an aliased <code>public.mailing_user_group_filter_id_list</code> table reference
     */
    public MailingUserGroupFilterIdList(String alias) {
        this(alias, MAILING_USER_GROUP_FILTER_ID_LIST);
    }

    private MailingUserGroupFilterIdList(String alias, Table<MailingUserGroupFilterIdListRecord> aliased) {
        this(alias, aliased, null);
    }

    private MailingUserGroupFilterIdList(String alias, Table<MailingUserGroupFilterIdListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Ids for template (e.g. employer ids)");
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
    public List<ForeignKey<MailingUserGroupFilterIdListRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MailingUserGroupFilterIdListRecord, ?>>asList(Keys.MAILING_USER_GROUP_FILTER_ID_LIST__MAILING_USER_GROUP_FILTER_ID_LIST_MAILING_USER_GROUP_FILTER_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingUserGroupFilterIdList as(String alias) {
        return new MailingUserGroupFilterIdList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MailingUserGroupFilterIdList rename(String name) {
        return new MailingUserGroupFilterIdList(name, null);
    }
}
