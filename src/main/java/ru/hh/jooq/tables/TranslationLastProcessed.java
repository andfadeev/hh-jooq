/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.TranslationLastProcessedRecord;


/**
 * Store last processed translation history id
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TranslationLastProcessed extends TableImpl<TranslationLastProcessedRecord> {

    private static final long serialVersionUID = -166004722;

    /**
     * The reference instance of <code>public.translation_last_processed</code>
     */
    public static final TranslationLastProcessed TRANSLATION_LAST_PROCESSED = new TranslationLastProcessed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TranslationLastProcessedRecord> getRecordType() {
        return TranslationLastProcessedRecord.class;
    }

    /**
     * The column <code>public.translation_last_processed.last_processed_id</code>.
     */
    public final TableField<TranslationLastProcessedRecord, Integer> LAST_PROCESSED_ID = createField("last_processed_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.translation_last_processed</code> table reference
     */
    public TranslationLastProcessed() {
        this("translation_last_processed", null);
    }

    /**
     * Create an aliased <code>public.translation_last_processed</code> table reference
     */
    public TranslationLastProcessed(String alias) {
        this(alias, TRANSLATION_LAST_PROCESSED);
    }

    private TranslationLastProcessed(String alias, Table<TranslationLastProcessedRecord> aliased) {
        this(alias, aliased, null);
    }

    private TranslationLastProcessed(String alias, Table<TranslationLastProcessedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Store last processed translation history id");
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
    public TranslationLastProcessed as(String alias) {
        return new TranslationLastProcessed(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TranslationLastProcessed rename(String name) {
        return new TranslationLastProcessed(name, null);
    }
}