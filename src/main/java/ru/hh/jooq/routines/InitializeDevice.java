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
public class InitializeDevice extends AbstractRoutine<String> {

    private static final long serialVersionUID = -935414836;

    /**
     * The parameter <code>public.initialize_device.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.initialize_device.device_token</code>.
     */
    public static final Parameter<String> DEVICE_TOKEN = createParameter("device_token", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.initialize_device.os_type</code>.
     */
    public static final Parameter<String> OS_TYPE = createParameter("os_type", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public InitializeDevice() {
        super("initialize_device", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(DEVICE_TOKEN);
        addInParameter(OS_TYPE);
    }

    /**
     * Set the <code>device_token</code> parameter IN value to the routine
     */
    public void setDeviceToken(String value) {
        setValue(DEVICE_TOKEN, value);
    }

    /**
     * Set the <code>device_token</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDeviceToken(Field<String> field) {
        setField(DEVICE_TOKEN, field);
    }

    /**
     * Set the <code>os_type</code> parameter IN value to the routine
     */
    public void setOsType(String value) {
        setValue(OS_TYPE, value);
    }

    /**
     * Set the <code>os_type</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setOsType(Field<String> field) {
        setField(OS_TYPE, field);
    }
}
