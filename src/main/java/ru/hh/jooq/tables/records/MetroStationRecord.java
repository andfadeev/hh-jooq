/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.MetroStation;


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
public class MetroStationRecord extends UpdatableRecordImpl<MetroStationRecord> implements Record13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, Integer, BigDecimal, BigDecimal, Integer, String> {

    private static final long serialVersionUID = 1632037559;

    /**
     * Setter for <code>public.metro_station.metro_station_id</code>.
     */
    public void setMetroStationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.metro_station.metro_station_id</code>.
     */
    public Integer getMetroStationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.metro_station.city_id</code>.
     */
    public void setCityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.metro_station.city_id</code>.
     */
    public Integer getCityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.metro_station.metro_line_id</code>.
     */
    public void setMetroLineId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.metro_station.metro_line_id</code>.
     */
    public Integer getMetroLineId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.metro_station.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.metro_station.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.metro_station.image_point_x</code>.
     */
    public void setImagePointX(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.metro_station.image_point_x</code>.
     */
    public Integer getImagePointX() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.metro_station.image_point_y</code>.
     */
    public void setImagePointY(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.metro_station.image_point_y</code>.
     */
    public Integer getImagePointY() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.metro_station.acronym_line</code>.
     */
    public void setAcronymLine(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.metro_station.acronym_line</code>.
     */
    public String getAcronymLine() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.metro_station.colocation</code>.
     */
    public void setColocation(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.metro_station.colocation</code>.
     */
    public Integer getColocation() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.metro_station.order_</code>.
     */
    public void setOrder_(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.metro_station.order_</code>.
     */
    public Integer getOrder_() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.metro_station.lng</code>.
     */
    public void setLng(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.metro_station.lng</code>.
     */
    public BigDecimal getLng() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.metro_station.lat</code>.
     */
    public void setLat(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.metro_station.lat</code>.
     */
    public BigDecimal getLat() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.metro_station.main_alias_station_id</code>.
     */
    public void setMainAliasStationId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.metro_station.main_alias_station_id</code>.
     */
    public Integer getMainAliasStationId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.metro_station.translit</code>.
     */
    public void setTranslit(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.metro_station.translit</code>.
     */
    public String getTranslit() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, Integer, BigDecimal, BigDecimal, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, String, Integer, Integer, String, Integer, Integer, BigDecimal, BigDecimal, Integer, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MetroStation.METRO_STATION.METRO_STATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MetroStation.METRO_STATION.CITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MetroStation.METRO_STATION.METRO_LINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MetroStation.METRO_STATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MetroStation.METRO_STATION.IMAGE_POINT_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MetroStation.METRO_STATION.IMAGE_POINT_Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MetroStation.METRO_STATION.ACRONYM_LINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MetroStation.METRO_STATION.COLOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return MetroStation.METRO_STATION.ORDER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return MetroStation.METRO_STATION.LNG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return MetroStation.METRO_STATION.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return MetroStation.METRO_STATION.MAIN_ALIAS_STATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return MetroStation.METRO_STATION.TRANSLIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMetroStationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMetroLineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getImagePointX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getImagePointY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAcronymLine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getColocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getOrder_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getLng();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getMainAliasStationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTranslit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value1(Integer value) {
        setMetroStationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value2(Integer value) {
        setCityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value3(Integer value) {
        setMetroLineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value5(Integer value) {
        setImagePointX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value6(Integer value) {
        setImagePointY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value7(String value) {
        setAcronymLine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value8(Integer value) {
        setColocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value9(Integer value) {
        setOrder_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value10(BigDecimal value) {
        setLng(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value11(BigDecimal value) {
        setLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value12(Integer value) {
        setMainAliasStationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord value13(String value) {
        setTranslit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetroStationRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, Integer value6, String value7, Integer value8, Integer value9, BigDecimal value10, BigDecimal value11, Integer value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetroStationRecord
     */
    public MetroStationRecord() {
        super(MetroStation.METRO_STATION);
    }

    /**
     * Create a detached, initialised MetroStationRecord
     */
    public MetroStationRecord(Integer metroStationId, Integer cityId, Integer metroLineId, String name, Integer imagePointX, Integer imagePointY, String acronymLine, Integer colocation, Integer order_, BigDecimal lng, BigDecimal lat, Integer mainAliasStationId, String translit) {
        super(MetroStation.METRO_STATION);

        set(0, metroStationId);
        set(1, cityId);
        set(2, metroLineId);
        set(3, name);
        set(4, imagePointX);
        set(5, imagePointY);
        set(6, acronymLine);
        set(7, colocation);
        set(8, order_);
        set(9, lng);
        set(10, lat);
        set(11, mainAliasStationId);
        set(12, translit);
    }
}
