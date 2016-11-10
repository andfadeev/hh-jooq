/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Area;


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
public class AreaRecord extends UpdatableRecordImpl<AreaRecord> implements Record20<Integer, Integer, String, Integer, Integer, String, Integer, Integer, String, Short, Boolean, String, Integer, Boolean, String, String, Integer, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1698096949;

    /**
     * Setter for <code>public.area.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.area.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.area.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.area.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.area.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.area.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.area.priority</code>.
     */
    public void setPriority(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.area.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.area.alias</code>.
     */
    public void setAlias(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.area.alias</code>.
     */
    public Integer getAlias() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.area.country</code>.
     */
    public void setCountry(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.area.country</code>.
     */
    public String getCountry() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.area.vacancy_post_status</code>. unused
     */
    public void setVacancyPostStatus(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.area.vacancy_post_status</code>. unused
     */
    public Integer getVacancyPostStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.area.geoip_location_id</code>.
     */
    public void setGeoipLocationId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.area.geoip_location_id</code>.
     */
    public Integer getGeoipLocationId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.area.code</code>.
     */
    public void setCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.area.code</code>.
     */
    public String getCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.area.type</code>.
     */
    public void setType(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.area.type</code>.
     */
    public Short getType() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>public.area.deprecated</code>.
     */
    public void setDeprecated(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.area.deprecated</code>.
     */
    public Boolean getDeprecated() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.area.path</code>.
     */
    public void setPath(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.area.path</code>.
     */
    public String getPath() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.area.bonus_program_id</code>.
     */
    public void setBonusProgramId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.area.bonus_program_id</code>.
     */
    public Integer getBonusProgramId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.area.central_premium</code>.
     */
    public void setCentralPremium(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.area.central_premium</code>.
     */
    public Boolean getCentralPremium() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.area.iso_code</code>.
     */
    public void setIsoCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.area.iso_code</code>.
     */
    public String getIsoCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.area.time_zone</code>.
     */
    public void setTimeZone(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.area.time_zone</code>.
     */
    public String getTimeZone() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.area.weight</code>.
     */
    public void setWeight(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.area.weight</code>.
     */
    public Integer getWeight() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.area.aho_office_email</code>.
     */
    public void setAhoOfficeEmail(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.area.aho_office_email</code>.
     */
    public String getAhoOfficeEmail() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.area.lat</code>.
     */
    public void setLat(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.area.lat</code>.
     */
    public BigDecimal getLat() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>public.area.lng</code>.
     */
    public void setLng(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.area.lng</code>.
     */
    public BigDecimal getLng() {
        return (BigDecimal) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, String, Integer, Integer, String, Integer, Integer, String, Short, Boolean, String, Integer, Boolean, String, String, Integer, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, String, Integer, Integer, String, Integer, Integer, String, Short, Boolean, String, Integer, Boolean, String, String, Integer, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Area.AREA.AREA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Area.AREA.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Area.AREA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Area.AREA.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Area.AREA.ALIAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Area.AREA.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Area.AREA.VACANCY_POST_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Area.AREA.GEOIP_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Area.AREA.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return Area.AREA.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Area.AREA.DEPRECATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Area.AREA.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Area.AREA.BONUS_PROGRAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Area.AREA.CENTRAL_PREMIUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Area.AREA.ISO_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Area.AREA.TIME_ZONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return Area.AREA.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Area.AREA.AHO_OFFICE_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field19() {
        return Area.AREA.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field20() {
        return Area.AREA.LNG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAreaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAlias();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getVacancyPostStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getGeoipLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getDeprecated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getBonusProgramId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getCentralPremium();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getIsoCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTimeZone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getAhoOfficeEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value19() {
        return getLat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value20() {
        return getLng();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value1(Integer value) {
        setAreaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value2(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value4(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value5(Integer value) {
        setAlias(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value6(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value7(Integer value) {
        setVacancyPostStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value8(Integer value) {
        setGeoipLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value9(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value10(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value11(Boolean value) {
        setDeprecated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value12(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value13(Integer value) {
        setBonusProgramId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value14(Boolean value) {
        setCentralPremium(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value15(String value) {
        setIsoCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value16(String value) {
        setTimeZone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value17(Integer value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value18(String value) {
        setAhoOfficeEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value19(BigDecimal value) {
        setLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord value20(BigDecimal value) {
        setLng(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AreaRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, String value6, Integer value7, Integer value8, String value9, Short value10, Boolean value11, String value12, Integer value13, Boolean value14, String value15, String value16, Integer value17, String value18, BigDecimal value19, BigDecimal value20) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AreaRecord
     */
    public AreaRecord() {
        super(Area.AREA);
    }

    /**
     * Create a detached, initialised AreaRecord
     */
    public AreaRecord(Integer areaId, Integer parentId, String name, Integer priority, Integer alias, String country, Integer vacancyPostStatus, Integer geoipLocationId, String code, Short type, Boolean deprecated, String path, Integer bonusProgramId, Boolean centralPremium, String isoCode, String timeZone, Integer weight, String ahoOfficeEmail, BigDecimal lat, BigDecimal lng) {
        super(Area.AREA);

        set(0, areaId);
        set(1, parentId);
        set(2, name);
        set(3, priority);
        set(4, alias);
        set(5, country);
        set(6, vacancyPostStatus);
        set(7, geoipLocationId);
        set(8, code);
        set(9, type);
        set(10, deprecated);
        set(11, path);
        set(12, bonusProgramId);
        set(13, centralPremium);
        set(14, isoCode);
        set(15, timeZone);
        set(16, weight);
        set(17, ahoOfficeEmail);
        set(18, lat);
        set(19, lng);
    }
}