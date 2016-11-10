/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;

import ru.hh.jooq.Public;


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
public class PgRelpages2 extends AbstractRoutine<Long> {

    private static final long serialVersionUID = -1329469139;

    /**
     * The parameter <code>public.pg_relpages.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>public.pg_relpages.relname</code>.
     */
    public static final Parameter<Object> RELNAME = createParameter("relname", org.jooq.impl.DefaultDataType.getDefaultDataType("regclass"), false, false);

    /**
     * Create a new routine call instance
     */
    public PgRelpages2() {
        super("pg_relpages", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RELNAME);
        setOverloaded(true);
    }

    /**
     * Set the <code>relname</code> parameter IN value to the routine
     */
    public void setRelname(Object value) {
        setValue(RELNAME, value);
    }

    /**
     * Set the <code>relname</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRelname(Field<Object> field) {
        setField(RELNAME, field);
    }
}