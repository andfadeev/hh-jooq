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
import ru.hh.jooq.tables.records.CitizenshipRecord;


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
public class Citizenship extends TableImpl<CitizenshipRecord> {

    private static final long serialVersionUID = 560651760;

    /**
     * The reference instance of <code>public.citizenship</code>
     */
    public static final Citizenship CITIZENSHIP = new Citizenship();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CitizenshipRecord> getRecordType() {
        return CitizenshipRecord.class;
    }

    /**
     * The column <code>public.citizenship.resume_id</code>.
     */
    public final TableField<CitizenshipRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.citizenship.area_id</code>.
     */
    public final TableField<CitizenshipRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.citizenship</code> table reference
     */
    public Citizenship() {
        this("citizenship", null);
    }

    /**
     * Create an aliased <code>public.citizenship</code> table reference
     */
    public Citizenship(String alias) {
        this(alias, CITIZENSHIP);
    }

    private Citizenship(String alias, Table<CitizenshipRecord> aliased) {
        this(alias, aliased, null);
    }

    private Citizenship(String alias, Table<CitizenshipRecord> aliased, Field<?>[] parameters) {
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
    public List<ForeignKey<CitizenshipRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CitizenshipRecord, ?>>asList(Keys.CITIZENSHIP__RESUME_CITIZENSHIP_FK, Keys.CITIZENSHIP__AREA_CITIZENSHIP_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Citizenship as(String alias) {
        return new Citizenship(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Citizenship rename(String name) {
        return new Citizenship(name, null);
    }
}
