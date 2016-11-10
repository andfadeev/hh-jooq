/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.routines;


import java.time.LocalDateTime;

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
public class MigrateResumeHistory extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 535586113;

    /**
     * The parameter <code>public.migrate_resume_history.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.migrate_resume_history.date_from</code>.
     */
    public static final Parameter<LocalDateTime> DATE_FROM = createParameter("date_from", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.migrate_resume_history.date_to</code>.
     */
    public static final Parameter<LocalDateTime> DATE_TO = createParameter("date_to", org.jooq.impl.SQLDataType.LOCALDATETIME, false, false);

    /**
     * The parameter <code>public.migrate_resume_history.select_interval</code>.
     */
    public static final Parameter<Object> SELECT_INTERVAL = createParameter("select_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), false, false);

    /**
     * Create a new routine call instance
     */
    public MigrateResumeHistory() {
        super("migrate_resume_history", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(DATE_FROM);
        addInParameter(DATE_TO);
        addInParameter(SELECT_INTERVAL);
    }

    /**
     * Set the <code>date_from</code> parameter IN value to the routine
     */
    public void setDateFrom(LocalDateTime value) {
        setValue(DATE_FROM, value);
    }

    /**
     * Set the <code>date_from</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDateFrom(Field<LocalDateTime> field) {
        setField(DATE_FROM, field);
    }

    /**
     * Set the <code>date_to</code> parameter IN value to the routine
     */
    public void setDateTo(LocalDateTime value) {
        setValue(DATE_TO, value);
    }

    /**
     * Set the <code>date_to</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDateTo(Field<LocalDateTime> field) {
        setField(DATE_TO, field);
    }

    /**
     * Set the <code>select_interval</code> parameter IN value to the routine
     */
    public void setSelectInterval(Object value) {
        setValue(SELECT_INTERVAL, value);
    }

    /**
     * Set the <code>select_interval</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSelectInterval(Field<Object> field) {
        setField(SELECT_INTERVAL, field);
    }
}
