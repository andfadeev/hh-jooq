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
import ru.hh.jooq.tables.records.FeedConsumerRecord;


/**
 * HH-57212 to provide acces by unique key for feed consumers
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeedConsumer extends TableImpl<FeedConsumerRecord> {

    private static final long serialVersionUID = -1512631709;

    /**
     * The reference instance of <code>public.feed_consumer</code>
     */
    public static final FeedConsumer FEED_CONSUMER = new FeedConsumer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeedConsumerRecord> getRecordType() {
        return FeedConsumerRecord.class;
    }

    /**
     * The column <code>public.feed_consumer.feed_consumer_id</code>.
     */
    public final TableField<FeedConsumerRecord, Integer> FEED_CONSUMER_ID = createField("feed_consumer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('feed_consumer_feed_consumer_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.feed_consumer.name</code>.
     */
    public final TableField<FeedConsumerRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>public.feed_consumer.key</code>.
     */
    public final TableField<FeedConsumerRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

    /**
     * The column <code>public.feed_consumer.enabled</code>.
     */
    public final TableField<FeedConsumerRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.feed_consumer</code> table reference
     */
    public FeedConsumer() {
        this("feed_consumer", null);
    }

    /**
     * Create an aliased <code>public.feed_consumer</code> table reference
     */
    public FeedConsumer(String alias) {
        this(alias, FEED_CONSUMER);
    }

    private FeedConsumer(String alias, Table<FeedConsumerRecord> aliased) {
        this(alias, aliased, null);
    }

    private FeedConsumer(String alias, Table<FeedConsumerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "HH-57212 to provide acces by unique key for feed consumers");
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
    public Identity<FeedConsumerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEED_CONSUMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FeedConsumerRecord> getPrimaryKey() {
        return Keys.FEED_CONSUMER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FeedConsumerRecord>> getKeys() {
        return Arrays.<UniqueKey<FeedConsumerRecord>>asList(Keys.FEED_CONSUMER_PKEY, Keys.FEED_CONSTRAINT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeedConsumer as(String alias) {
        return new FeedConsumer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FeedConsumer rename(String name) {
        return new FeedConsumer(name, null);
    }
}