/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.FirstPageIndustryToBeDeletedRecord;


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
public class FirstPageIndustryToBeDeleted extends TableImpl<FirstPageIndustryToBeDeletedRecord> {

    private static final long serialVersionUID = 1070101214;

    /**
     * The reference instance of <code>public.first_page_industry_to_be_deleted</code>
     */
    public static final FirstPageIndustryToBeDeleted FIRST_PAGE_INDUSTRY_TO_BE_DELETED = new FirstPageIndustryToBeDeleted();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FirstPageIndustryToBeDeletedRecord> getRecordType() {
        return FirstPageIndustryToBeDeletedRecord.class;
    }

    /**
     * The column <code>public.first_page_industry_to_be_deleted.code</code>.
     */
    public final TableField<FirstPageIndustryToBeDeletedRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>public.first_page_industry_to_be_deleted</code> table reference
     */
    public FirstPageIndustryToBeDeleted() {
        this("first_page_industry_to_be_deleted", null);
    }

    /**
     * Create an aliased <code>public.first_page_industry_to_be_deleted</code> table reference
     */
    public FirstPageIndustryToBeDeleted(String alias) {
        this(alias, FIRST_PAGE_INDUSTRY_TO_BE_DELETED);
    }

    private FirstPageIndustryToBeDeleted(String alias, Table<FirstPageIndustryToBeDeletedRecord> aliased) {
        this(alias, aliased, null);
    }

    private FirstPageIndustryToBeDeleted(String alias, Table<FirstPageIndustryToBeDeletedRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FirstPageIndustryToBeDeletedRecord> getPrimaryKey() {
        return Keys.FIRST_PAGE_INDUSTRY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FirstPageIndustryToBeDeletedRecord>> getKeys() {
        return Arrays.<UniqueKey<FirstPageIndustryToBeDeletedRecord>>asList(Keys.FIRST_PAGE_INDUSTRY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirstPageIndustryToBeDeleted as(String alias) {
        return new FirstPageIndustryToBeDeleted(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FirstPageIndustryToBeDeleted rename(String name) {
        return new FirstPageIndustryToBeDeleted(name, null);
    }
}