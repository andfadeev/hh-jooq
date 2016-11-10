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
import ru.hh.jooq.tables.records.VacancyClassificatorValueRecord;


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
public class VacancyClassificatorValue extends TableImpl<VacancyClassificatorValueRecord> {

    private static final long serialVersionUID = 1894392227;

    /**
     * The reference instance of <code>public.vacancy_classificator_value</code>
     */
    public static final VacancyClassificatorValue VACANCY_CLASSIFICATOR_VALUE = new VacancyClassificatorValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VacancyClassificatorValueRecord> getRecordType() {
        return VacancyClassificatorValueRecord.class;
    }

    /**
     * The column <code>public.vacancy_classificator_value.vacancy_classificator_value_id</code>.
     */
    public final TableField<VacancyClassificatorValueRecord, Integer> VACANCY_CLASSIFICATOR_VALUE_ID = createField("vacancy_classificator_value_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vacancy_classificator_value_vacancy_classificator_value_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.vacancy_classificator_value.classificator_code</code>.
     */
    public final TableField<VacancyClassificatorValueRecord, String> CLASSIFICATOR_CODE = createField("classificator_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.vacancy_classificator_value.value</code>.
     */
    public final TableField<VacancyClassificatorValueRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>public.vacancy_classificator_value.vacancy_id</code>.
     */
    public final TableField<VacancyClassificatorValueRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.vacancy_classificator_value</code> table reference
     */
    public VacancyClassificatorValue() {
        this("vacancy_classificator_value", null);
    }

    /**
     * Create an aliased <code>public.vacancy_classificator_value</code> table reference
     */
    public VacancyClassificatorValue(String alias) {
        this(alias, VACANCY_CLASSIFICATOR_VALUE);
    }

    private VacancyClassificatorValue(String alias, Table<VacancyClassificatorValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private VacancyClassificatorValue(String alias, Table<VacancyClassificatorValueRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VacancyClassificatorValueRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VACANCY_CLASSIFICATOR_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VacancyClassificatorValueRecord> getPrimaryKey() {
        return Keys.VACANCY_CLASSIFICATOR_VALUE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VacancyClassificatorValueRecord>> getKeys() {
        return Arrays.<UniqueKey<VacancyClassificatorValueRecord>>asList(Keys.VACANCY_CLASSIFICATOR_VALUE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VacancyClassificatorValueRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VacancyClassificatorValueRecord, ?>>asList(Keys.VACANCY_CLASSIFICATOR_VALUE__FKAC82A93334416E37);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VacancyClassificatorValue as(String alias) {
        return new VacancyClassificatorValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VacancyClassificatorValue rename(String name) {
        return new VacancyClassificatorValue(name, null);
    }
}
