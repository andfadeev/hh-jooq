/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.hh.jooq.tables.ResumeRelocationArea;


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
public class ResumeRelocationAreaRecord extends TableRecordImpl<ResumeRelocationAreaRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1317475159;

    /**
     * Setter for <code>public.resume_relocation_area.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_relocation_area.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_relocation_area.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_relocation_area.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumeRelocationArea.RESUME_RELOCATION_AREA.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumeRelocationArea.RESUME_RELOCATION_AREA.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRelocationAreaRecord value1(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRelocationAreaRecord value2(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumeRelocationAreaRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumeRelocationAreaRecord
     */
    public ResumeRelocationAreaRecord() {
        super(ResumeRelocationArea.RESUME_RELOCATION_AREA);
    }

    /**
     * Create a detached, initialised ResumeRelocationAreaRecord
     */
    public ResumeRelocationAreaRecord(Integer resumeId, Integer areaId) {
        super(ResumeRelocationArea.RESUME_RELOCATION_AREA);

        set(0, resumeId);
        set(1, areaId);
    }
}