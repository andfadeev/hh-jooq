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
import ru.hh.jooq.tables.records.HowHearAboutUsRecord;


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
public class HowHearAboutUs extends TableImpl<HowHearAboutUsRecord> {

    private static final long serialVersionUID = -271613659;

    /**
     * The reference instance of <code>public.how_hear_about_us</code>
     */
    public static final HowHearAboutUs HOW_HEAR_ABOUT_US = new HowHearAboutUs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HowHearAboutUsRecord> getRecordType() {
        return HowHearAboutUsRecord.class;
    }

    /**
     * The column <code>public.how_hear_about_us.how_hear_about_us_id</code>.
     */
    public final TableField<HowHearAboutUsRecord, Integer> HOW_HEAR_ABOUT_US_ID = createField("how_hear_about_us_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('how_hear_about_us_how_hear_about_us_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.how_hear_about_us</code> table reference
     */
    public HowHearAboutUs() {
        this("how_hear_about_us", null);
    }

    /**
     * Create an aliased <code>public.how_hear_about_us</code> table reference
     */
    public HowHearAboutUs(String alias) {
        this(alias, HOW_HEAR_ABOUT_US);
    }

    private HowHearAboutUs(String alias, Table<HowHearAboutUsRecord> aliased) {
        this(alias, aliased, null);
    }

    private HowHearAboutUs(String alias, Table<HowHearAboutUsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HowHearAboutUsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HOW_HEAR_ABOUT_US;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HowHearAboutUsRecord> getPrimaryKey() {
        return Keys.HOW_HEAR_ABOUT_US_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HowHearAboutUsRecord>> getKeys() {
        return Arrays.<UniqueKey<HowHearAboutUsRecord>>asList(Keys.HOW_HEAR_ABOUT_US_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HowHearAboutUs as(String alias) {
        return new HowHearAboutUs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HowHearAboutUs rename(String name) {
        return new HowHearAboutUs(name, null);
    }
}
