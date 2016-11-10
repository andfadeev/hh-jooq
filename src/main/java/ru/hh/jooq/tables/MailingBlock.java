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
import ru.hh.jooq.tables.records.MailingBlockRecord;


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
public class MailingBlock extends TableImpl<MailingBlockRecord> {

    private static final long serialVersionUID = 2031840520;

    /**
     * The reference instance of <code>public.mailing_block</code>
     */
    public static final MailingBlock MAILING_BLOCK = new MailingBlock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MailingBlockRecord> getRecordType() {
        return MailingBlockRecord.class;
    }

    /**
     * The column <code>public.mailing_block.mailing_block_id</code>.
     */
    public final TableField<MailingBlockRecord, Integer> MAILING_BLOCK_ID = createField("mailing_block_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('mailing_block_mailing_block_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.mailing_block.block_value</code>.
     */
    public final TableField<MailingBlockRecord, String> BLOCK_VALUE = createField("block_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mailing_block.mailing_id</code>.
     */
    public final TableField<MailingBlockRecord, Integer> MAILING_ID = createField("mailing_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.mailing_block.block_index</code>.
     */
    public final TableField<MailingBlockRecord, Integer> BLOCK_INDEX = createField("block_index", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.mailing_block.mailing_user_group_id</code>.
     */
    public final TableField<MailingBlockRecord, Integer> MAILING_USER_GROUP_ID = createField("mailing_user_group_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mailing_block.subject</code>.
     */
    public final TableField<MailingBlockRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.mailing_block.title</code>.
     */
    public final TableField<MailingBlockRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.mailing_block</code> table reference
     */
    public MailingBlock() {
        this("mailing_block", null);
    }

    /**
     * Create an aliased <code>public.mailing_block</code> table reference
     */
    public MailingBlock(String alias) {
        this(alias, MAILING_BLOCK);
    }

    private MailingBlock(String alias, Table<MailingBlockRecord> aliased) {
        this(alias, aliased, null);
    }

    private MailingBlock(String alias, Table<MailingBlockRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MailingBlockRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MAILING_BLOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MailingBlockRecord> getPrimaryKey() {
        return Keys.MAILING_BLOCK_VALUE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MailingBlockRecord>> getKeys() {
        return Arrays.<UniqueKey<MailingBlockRecord>>asList(Keys.MAILING_BLOCK_VALUE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MailingBlockRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MailingBlockRecord, ?>>asList(Keys.MAILING_BLOCK__FK4F4383CB4E0D7B87, Keys.MAILING_BLOCK__MAILING_BLOCK_VALUE_MAILING_USER_GROUP_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MailingBlock as(String alias) {
        return new MailingBlock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MailingBlock rename(String name) {
        return new MailingBlock(name, null);
    }
}
