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
import ru.hh.jooq.tables.records.ComplainRecord;


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
public class Complain extends TableImpl<ComplainRecord> {

    private static final long serialVersionUID = 1967771098;

    /**
     * The reference instance of <code>public.complain</code>
     */
    public static final Complain COMPLAIN = new Complain();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComplainRecord> getRecordType() {
        return ComplainRecord.class;
    }

    /**
     * The column <code>public.complain.feedback_id</code>.
     */
    public final TableField<ComplainRecord, Integer> FEEDBACK_ID = createField("feedback_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.complain.employer_id</code>.
     */
    public final TableField<ComplainRecord, Integer> EMPLOYER_ID = createField("employer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.complain.user_id</code>.
     */
    public final TableField<ComplainRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.complain.vacancy_id</code>.
     */
    public final TableField<ComplainRecord, Integer> VACANCY_ID = createField("vacancy_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.complain</code> table reference
     */
    public Complain() {
        this("complain", null);
    }

    /**
     * Create an aliased <code>public.complain</code> table reference
     */
    public Complain(String alias) {
        this(alias, COMPLAIN);
    }

    private Complain(String alias, Table<ComplainRecord> aliased) {
        this(alias, aliased, null);
    }

    private Complain(String alias, Table<ComplainRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ComplainRecord> getPrimaryKey() {
        return Keys.COMPLAIN_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ComplainRecord>> getKeys() {
        return Arrays.<UniqueKey<ComplainRecord>>asList(Keys.COMPLAIN_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ComplainRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ComplainRecord, ?>>asList(Keys.COMPLAIN__FKDC4520E96D1D5BA9, Keys.COMPLAIN__FKDC4520E9543B7049, Keys.COMPLAIN__FKDC4520E98E001D91, Keys.COMPLAIN__FKDC4520E934416E37);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Complain as(String alias) {
        return new Complain(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Complain rename(String name) {
        return new Complain(name, null);
    }
}