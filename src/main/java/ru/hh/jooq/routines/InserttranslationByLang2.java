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
public class InserttranslationByLang2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1370677842;

    /**
     * The parameter <code>public.inserttranslation_by_lang._1</code>.
     */
    public static final Parameter<String> _1 = createParameter("_1", org.jooq.impl.SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>public.inserttranslation_by_lang._2</code>.
     */
    public static final Parameter<String> _2 = createParameter("_2", org.jooq.impl.SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>public.inserttranslation_by_lang._3</code>.
     */
    public static final Parameter<String> _3 = createParameter("_3", org.jooq.impl.SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>public.inserttranslation_by_lang._4</code>.
     */
    public static final Parameter<Integer> _4 = createParameter("_4", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public InserttranslationByLang2() {
        super("inserttranslation_by_lang", Public.PUBLIC);

        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(String value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Integer value) {
        setValue(_4, value);
    }
}
