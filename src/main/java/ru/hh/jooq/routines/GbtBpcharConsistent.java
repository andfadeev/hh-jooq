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
public class GbtBpcharConsistent extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1434372507;

    /**
     * The parameter <code>public.gbt_bpchar_consistent.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>public.gbt_bpchar_consistent._1</code>.
     */
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>public.gbt_bpchar_consistent._2</code>.
     */
    public static final Parameter<String> _2 = createParameter("_2", org.jooq.impl.SQLDataType.CHAR, false, true);

    /**
     * The parameter <code>public.gbt_bpchar_consistent._3</code>.
     */
    public static final Parameter<Short> _3 = createParameter("_3", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * The parameter <code>public.gbt_bpchar_consistent._4</code>.
     */
    public static final Parameter<Long> _4 = createParameter("_4", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>public.gbt_bpchar_consistent._5</code>.
     */
    public static final Parameter<Object> _5 = createParameter("_5", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * Create a new routine call instance
     */
    public GbtBpcharConsistent() {
        super("gbt_bpchar_consistent", Public.PUBLIC, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        addInParameter(_5);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<String> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Short value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Short> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Long value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Long> field) {
        setField(_4, field);
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    public void set__5(Object value) {
        setValue(_5, value);
    }

    /**
     * Set the <code>_5</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__5(Field<Object> field) {
        setField(_5, field);
    }
}
