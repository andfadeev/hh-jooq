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
public class CreateSubdomain extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -40641930;

    /**
     * The parameter <code>public.create_subdomain.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.create_subdomain.in_site_code</code>.
     */
    public static final Parameter<String> IN_SITE_CODE = createParameter("in_site_code", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.create_subdomain.in_site_url</code>.
     */
    public static final Parameter<String> IN_SITE_URL = createParameter("in_site_url", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>public.create_subdomain.in_site_areaid</code>.
     */
    public static final Parameter<Integer> IN_SITE_AREAID = createParameter("in_site_areaid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.create_subdomain.in_parent_url</code>.
     */
    public static final Parameter<String> IN_PARENT_URL = createParameter("in_parent_url", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public CreateSubdomain() {
        super("create_subdomain", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_SITE_CODE);
        addInParameter(IN_SITE_URL);
        addInParameter(IN_SITE_AREAID);
        addInParameter(IN_PARENT_URL);
    }

    /**
     * Set the <code>in_site_code</code> parameter IN value to the routine
     */
    public void setInSiteCode(String value) {
        setValue(IN_SITE_CODE, value);
    }

    /**
     * Set the <code>in_site_code</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInSiteCode(Field<String> field) {
        setField(IN_SITE_CODE, field);
    }

    /**
     * Set the <code>in_site_url</code> parameter IN value to the routine
     */
    public void setInSiteUrl(String value) {
        setValue(IN_SITE_URL, value);
    }

    /**
     * Set the <code>in_site_url</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInSiteUrl(Field<String> field) {
        setField(IN_SITE_URL, field);
    }

    /**
     * Set the <code>in_site_areaid</code> parameter IN value to the routine
     */
    public void setInSiteAreaid(Integer value) {
        setValue(IN_SITE_AREAID, value);
    }

    /**
     * Set the <code>in_site_areaid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInSiteAreaid(Field<Integer> field) {
        setField(IN_SITE_AREAID, field);
    }

    /**
     * Set the <code>in_parent_url</code> parameter IN value to the routine
     */
    public void setInParentUrl(String value) {
        setValue(IN_PARENT_URL, value);
    }

    /**
     * Set the <code>in_parent_url</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInParentUrl(Field<String> field) {
        setField(IN_PARENT_URL, field);
    }
}
