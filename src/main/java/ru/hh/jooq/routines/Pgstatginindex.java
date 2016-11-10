/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.routines;


import javax.annotation.Generated;

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
public class Pgstatginindex extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -2008608354;

    /**
     * The parameter <code>public.pgstatginindex.relname</code>.
     */
    public static final Parameter<Object> RELNAME = createParameter("relname", org.jooq.impl.DefaultDataType.getDefaultDataType("regclass"), false, false);

    /**
     * The parameter <code>public.pgstatginindex.version</code>.
     */
    public static final Parameter<Integer> VERSION = createParameter("version", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.pgstatginindex.pending_pages</code>.
     */
    public static final Parameter<Integer> PENDING_PAGES = createParameter("pending_pages", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.pgstatginindex.pending_tuples</code>.
     */
    public static final Parameter<Long> PENDING_TUPLES = createParameter("pending_tuples", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public Pgstatginindex() {
        super("pgstatginindex", Public.PUBLIC);

        addInParameter(RELNAME);
        addOutParameter(VERSION);
        addOutParameter(PENDING_PAGES);
        addOutParameter(PENDING_TUPLES);
    }

    /**
     * Set the <code>relname</code> parameter IN value to the routine
     */
    public void setRelname(Object value) {
        setValue(RELNAME, value);
    }

    /**
     * Get the <code>version</code> parameter OUT value from the routine
     */
    public Integer getVersion() {
        return get(VERSION);
    }

    /**
     * Get the <code>pending_pages</code> parameter OUT value from the routine
     */
    public Integer getPendingPages() {
        return get(PENDING_PAGES);
    }

    /**
     * Get the <code>pending_tuples</code> parameter OUT value from the routine
     */
    public Long getPendingTuples() {
        return get(PENDING_TUPLES);
    }
}