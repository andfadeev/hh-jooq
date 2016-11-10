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
public class Int2Dist extends AbstractRoutine<Short> {

    private static final long serialVersionUID = 1279148722;

    /**
     * The parameter <code>public.int2_dist.RETURN_VALUE</code>.
     */
    public static final Parameter<Short> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.int2_dist._1</code>.
     */
    public static final Parameter<Short> _1 = createParameter("_1", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * The parameter <code>public.int2_dist._2</code>.
     */
    public static final Parameter<Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Int2Dist() {
        super("int2_dist", Public.PUBLIC, org.jooq.impl.SQLDataType.SMALLINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Short value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Short> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Short value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Short> field) {
        setField(_2, field);
    }
}