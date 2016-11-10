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
import ru.hh.jooq.tables.records.AgencyRankRecord;


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
public class AgencyRank extends TableImpl<AgencyRankRecord> {

    private static final long serialVersionUID = 1298175350;

    /**
     * The reference instance of <code>public.agency_rank</code>
     */
    public static final AgencyRank AGENCY_RANK = new AgencyRank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AgencyRankRecord> getRecordType() {
        return AgencyRankRecord.class;
    }

    /**
     * The column <code>public.agency_rank.agency_id</code>.
     */
    public final TableField<AgencyRankRecord, Integer> AGENCY_ID = createField("agency_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.agency_rank.area_id</code>.
     */
    public final TableField<AgencyRankRecord, Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.agency_rank.professional_area_id</code>.
     */
    public final TableField<AgencyRankRecord, Integer> PROFESSIONAL_AREA_ID = createField("professional_area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.agency_rank.rank</code>.
     */
    public final TableField<AgencyRankRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.agency_rank</code> table reference
     */
    public AgencyRank() {
        this("agency_rank", null);
    }

    /**
     * Create an aliased <code>public.agency_rank</code> table reference
     */
    public AgencyRank(String alias) {
        this(alias, AGENCY_RANK);
    }

    private AgencyRank(String alias, Table<AgencyRankRecord> aliased) {
        this(alias, aliased, null);
    }

    private AgencyRank(String alias, Table<AgencyRankRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<AgencyRankRecord> getPrimaryKey() {
        return Keys.AGENCY_RANK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AgencyRankRecord>> getKeys() {
        return Arrays.<UniqueKey<AgencyRankRecord>>asList(Keys.AGENCY_RANK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRank as(String alias) {
        return new AgencyRank(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AgencyRank rename(String name) {
        return new AgencyRank(name, null);
    }
}
