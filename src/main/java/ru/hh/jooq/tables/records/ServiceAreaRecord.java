/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ServiceArea;


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
public class ServiceAreaRecord extends UpdatableRecordImpl<ServiceAreaRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -2109978181;

    /**
     * Setter for <code>public.service_area.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.service_area.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.service_area.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.service_area.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
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
        return ServiceArea.SERVICE_AREA.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ServiceArea.SERVICE_AREA.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getServiceId();
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
    public ServiceAreaRecord value1(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceAreaRecord value2(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceAreaRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceAreaRecord
     */
    public ServiceAreaRecord() {
        super(ServiceArea.SERVICE_AREA);
    }

    /**
     * Create a detached, initialised ServiceAreaRecord
     */
    public ServiceAreaRecord(Integer serviceId, Integer areaId) {
        super(ServiceArea.SERVICE_AREA);

        set(0, serviceId);
        set(1, areaId);
    }
}
