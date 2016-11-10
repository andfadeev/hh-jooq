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
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.EmployerRegistrationInfoRecord;


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
public class EmployerRegistrationInfo extends TableImpl<EmployerRegistrationInfoRecord> {

    private static final long serialVersionUID = 253146390;

    /**
     * The reference instance of <code>public.employer_registration_info</code>
     */
    public static final EmployerRegistrationInfo EMPLOYER_REGISTRATION_INFO = new EmployerRegistrationInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployerRegistrationInfoRecord> getRecordType() {
        return EmployerRegistrationInfoRecord.class;
    }

    /**
     * The column <code>public.employer_registration_info.employer_id</code>.
     */
    public final TableField<EmployerRegistrationInfoRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.employer_registration_info.hash</code>.
     */
    public final TableField<EmployerRegistrationInfoRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

    /**
     * The column <code>public.employer_registration_info.ip</code>.
     */
    public final TableField<EmployerRegistrationInfoRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(15).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.employer_registration_info</code> table reference
     */
    public EmployerRegistrationInfo() {
        this("employer_registration_info", null);
    }

    /**
     * Create an aliased <code>public.employer_registration_info</code> table reference
     */
    public EmployerRegistrationInfo(String alias) {
        this(alias, EMPLOYER_REGISTRATION_INFO);
    }

    private EmployerRegistrationInfo(String alias, Table<EmployerRegistrationInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployerRegistrationInfo(String alias, Table<EmployerRegistrationInfoRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EmployerRegistrationInfoRecord> getPrimaryKey() {
        return Keys.EMPLOYER_REGISTRATION_INFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployerRegistrationInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployerRegistrationInfoRecord>>asList(Keys.EMPLOYER_REGISTRATION_INFO_PKEY, Keys.EMPLOYER_REGISTRATION_INFO_HASH_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EmployerRegistrationInfoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EmployerRegistrationInfoRecord, ?>>asList(Keys.EMPLOYER_REGISTRATION_INFO__EMPLOYER_REGISTRATION_INFO_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRegistrationInfo as(String alias) {
        return new EmployerRegistrationInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployerRegistrationInfo rename(String name) {
        return new EmployerRegistrationInfo(name, null);
    }
}