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
public class PageHeader extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -249726156;

    /**
     * The parameter <code>public.page_header.page</code>.
     */
    public static final Parameter<byte[]> PAGE = createParameter("page", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * The parameter <code>public.page_header.lsn</code>.
     */
    public static final Parameter<Object> LSN = createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), false, false);

    /**
     * The parameter <code>public.page_header.checksum</code>.
     */
    public static final Parameter<Short> CHECKSUM = createParameter("checksum", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.flags</code>.
     */
    public static final Parameter<Short> FLAGS = createParameter("flags", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.lower</code>.
     */
    public static final Parameter<Short> LOWER = createParameter("lower", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.upper</code>.
     */
    public static final Parameter<Short> UPPER = createParameter("upper", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.special</code>.
     */
    public static final Parameter<Short> SPECIAL = createParameter("special", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.pagesize</code>.
     */
    public static final Parameter<Short> PAGESIZE = createParameter("pagesize", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.version</code>.
     */
    public static final Parameter<Short> VERSION = createParameter("version", org.jooq.impl.SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>public.page_header.prune_xid</code>.
     */
    public static final Parameter<Long> PRUNE_XID = createParameter("prune_xid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PageHeader() {
        super("page_header", Public.PUBLIC);

        addInParameter(PAGE);
        addOutParameter(LSN);
        addOutParameter(CHECKSUM);
        addOutParameter(FLAGS);
        addOutParameter(LOWER);
        addOutParameter(UPPER);
        addOutParameter(SPECIAL);
        addOutParameter(PAGESIZE);
        addOutParameter(VERSION);
        addOutParameter(PRUNE_XID);
    }

    /**
     * Set the <code>page</code> parameter IN value to the routine
     */
    public void setPage(byte... value) {
        setValue(PAGE, value);
    }

    /**
     * Get the <code>lsn</code> parameter OUT value from the routine
     */
    public Object getLsn() {
        return get(LSN);
    }

    /**
     * Get the <code>checksum</code> parameter OUT value from the routine
     */
    public Short getChecksum() {
        return get(CHECKSUM);
    }

    /**
     * Get the <code>flags</code> parameter OUT value from the routine
     */
    public Short getFlags() {
        return get(FLAGS);
    }

    /**
     * Get the <code>lower</code> parameter OUT value from the routine
     */
    public Short getLower() {
        return get(LOWER);
    }

    /**
     * Get the <code>upper</code> parameter OUT value from the routine
     */
    public Short getUpper() {
        return get(UPPER);
    }

    /**
     * Get the <code>special</code> parameter OUT value from the routine
     */
    public Short getSpecial() {
        return get(SPECIAL);
    }

    /**
     * Get the <code>pagesize</code> parameter OUT value from the routine
     */
    public Short getPagesize() {
        return get(PAGESIZE);
    }

    /**
     * Get the <code>version</code> parameter OUT value from the routine
     */
    public Short getVersion() {
        return get(VERSION);
    }

    /**
     * Get the <code>prune_xid</code> parameter OUT value from the routine
     */
    public Long getPruneXid() {
        return get(PRUNE_XID);
    }
}
