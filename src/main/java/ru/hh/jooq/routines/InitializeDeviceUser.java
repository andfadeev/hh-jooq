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
public class InitializeDeviceUser extends AbstractRoutine<String> {

    private static final long serialVersionUID = -259233568;

    /**
     * The parameter <code>public.initialize_device_user.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.initialize_device_user.user_id</code>.
     */
    public static final Parameter<Integer> USER_ID = createParameter("user_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.initialize_device_user.device_id</code>.
     */
    public static final Parameter<Integer> DEVICE_ID = createParameter("device_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public InitializeDeviceUser() {
        super("initialize_device_user", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(USER_ID);
        addInParameter(DEVICE_ID);
    }

    /**
     * Set the <code>user_id</code> parameter IN value to the routine
     */
    public void setUserId(Integer value) {
        setValue(USER_ID, value);
    }

    /**
     * Set the <code>user_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUserId(Field<Integer> field) {
        setField(USER_ID, field);
    }

    /**
     * Set the <code>device_id</code> parameter IN value to the routine
     */
    public void setDeviceId(Integer value) {
        setValue(DEVICE_ID, value);
    }

    /**
     * Set the <code>device_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDeviceId(Field<Integer> field) {
        setField(DEVICE_ID, field);
    }
}