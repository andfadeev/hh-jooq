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
public class AreaSync extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -66979817;

    /**
     * The parameter <code>public.area_sync.RETURN_VALUE</code>.
     */
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"), false, false);

    /**
     * Create a new routine call instance
     */
    public AreaSync() {
        super("area_sync", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

        setReturnParameter(RETURN_VALUE);
    }
}