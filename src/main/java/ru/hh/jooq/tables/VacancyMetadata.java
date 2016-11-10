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
import ru.hh.jooq.tables.records.VacancyMetadataRecord;


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
public class VacancyMetadata extends TableImpl<VacancyMetadataRecord> {

    private static final long serialVersionUID = 1697237277;

    /**
     * The reference instance of <code>public.vacancy_metadata</code>
     */
    public static final VacancyMetadata VACANCY_METADATA = new VacancyMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VacancyMetadataRecord> getRecordType() {
        return VacancyMetadataRecord.class;
    }

    /**
     * The column <code>public.vacancy_metadata.vacancy_metadata_id</code>.
     */
    public final TableField<VacancyMetadataRecord, Integer> VACANCY_METADATA_ID = createField("vacancy_metadata_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vacancy_metadata_vacancy_metadata_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy_metadata.vacancy_id</code>.
     */
    public final TableField<VacancyMetadataRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.vacancy_metadata.value_bool</code>.
     */
    public final TableField<VacancyMetadataRecord, Boolean> VALUE_BOOL = createField("value_bool", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.vacancy_metadata.entry_key</code>.
     */
    public final TableField<VacancyMetadataRecord, String> ENTRY_KEY = createField("entry_key", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>public.vacancy_metadata.creation_date</code>.
     */
    public final TableField<VacancyMetadataRecord, LocalDateTime> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.vacancy_metadata.expiration_date</code>.
     */
    public final TableField<VacancyMetadataRecord, LocalDateTime> EXPIRATION_DATE = createField("expiration_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>public.vacancy_metadata</code> table reference
     */
    public VacancyMetadata() {
        this("vacancy_metadata", null);
    }

    /**
     * Create an aliased <code>public.vacancy_metadata</code> table reference
     */
    public VacancyMetadata(String alias) {
        this(alias, VACANCY_METADATA);
    }

    private VacancyMetadata(String alias, Table<VacancyMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private VacancyMetadata(String alias, Table<VacancyMetadataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VacancyMetadataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VACANCY_METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VacancyMetadataRecord> getPrimaryKey() {
        return Keys.VACANCY_METADATA_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VacancyMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<VacancyMetadataRecord>>asList(Keys.VACANCY_METADATA_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VacancyMetadataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VacancyMetadataRecord, ?>>asList(Keys.VACANCY_METADATA__FK1D94A7334416E37);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyMetadata as(String alias) {
        return new VacancyMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VacancyMetadata rename(String name) {
        return new VacancyMetadata(name, null);
    }
}