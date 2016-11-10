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
public class Float8Dist extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -1611650726;

    /**
     * The parameter <code>public.float8_dist.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.float8_dist._1</code>.
     */
    public static final Parameter<Double> _1 = createParameter("_1", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * The parameter <code>public.float8_dist._2</code>.
     */
    public static final Parameter<Double> _2 = createParameter("_2", org.jooq.impl.SQLDataType.DOUBLE, false, true);

    /**
     * Create a new routine call instance
     */
    public Float8Dist() {
        super("float8_dist", Public.PUBLIC, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double> field) {
        setField(_2, field);
    }
}
