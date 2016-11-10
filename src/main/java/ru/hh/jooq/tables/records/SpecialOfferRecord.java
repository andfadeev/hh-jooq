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

import ru.hh.jooq.tables.SpecialOffer;


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
public class SpecialOfferRecord extends UpdatableRecordImpl<SpecialOfferRecord> implements Record20<String, BigDecimal, Integer, String, Integer, Integer, Integer, Integer, Boolean, Boolean, BigDecimal, Boolean, Boolean, Boolean, Boolean, Boolean, BigDecimal, Boolean, Boolean, Integer> {

    private static final long serialVersionUID = -2081293694;

    /**
     * Setter for <code>public.special_offer.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.special_offer.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.special_offer.cost</code>.
     */
    public void setCost(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.special_offer.cost</code>.
     */
    public BigDecimal getCost() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.special_offer.employer_category</code>.
     */
    public void setEmployerCategory(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.special_offer.employer_category</code>.
     */
    public Integer getEmployerCategory() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.special_offer.currency</code>.
     */
    public void setCurrency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.special_offer.currency</code>.
     */
    public String getCurrency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.special_offer.seller_account_id</code>.
     */
    public void setSellerAccountId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.special_offer.seller_account_id</code>.
     */
    public Integer getSellerAccountId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.special_offer.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.special_offer.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.special_offer.order_</code>.
     */
    public void setOrder_(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.special_offer.order_</code>.
     */
    public Integer getOrder_() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.special_offer.job_site</code>.
     */
    public void setJobSite(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.special_offer.job_site</code>.
     */
    public Integer getJobSite() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.special_offer.first_offer</code>.
     */
    public void setFirstOffer(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.special_offer.first_offer</code>.
     */
    public Boolean getFirstOffer() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.special_offer.geo_targeted</code>.
     */
    public void setGeoTargeted(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.special_offer.geo_targeted</code>.
     */
    public Boolean getGeoTargeted() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.special_offer.discount_rate</code>.
     */
    public void setDiscountRate(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.special_offer.discount_rate</code>.
     */
    public BigDecimal getDiscountRate() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.special_offer.additional_title</code>.
     */
    public void setAdditionalTitle(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.special_offer.additional_title</code>.
     */
    public Boolean getAdditionalTitle() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.special_offer.capital</code>.
     */
    public void setCapital(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.special_offer.capital</code>.
     */
    public Boolean getCapital() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.special_offer.category_direct</code>.
     */
    public void setCategoryDirect(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.special_offer.category_direct</code>.
     */
    public Boolean getCategoryDirect() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.special_offer.category_agency</code>.
     */
    public void setCategoryAgency(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.special_offer.category_agency</code>.
     */
    public Boolean getCategoryAgency() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>public.special_offer.category_other</code>.
     */
    public void setCategoryOther(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.special_offer.category_other</code>.
     */
    public Boolean getCategoryOther() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.special_offer.gross_price</code>.
     */
    public void setGrossPrice(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.special_offer.gross_price</code>.
     */
    public BigDecimal getGrossPrice() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>public.special_offer.category_anonymous</code>.
     */
    public void setCategoryAnonymous(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.special_offer.category_anonymous</code>.
     */
    public Boolean getCategoryAnonymous() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>public.special_offer.legacy</code>.
     */
    public void setLegacy(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.special_offer.legacy</code>.
     */
    public Boolean getLegacy() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>public.special_offer.rounding_first_digits</code>.
     */
    public void setRoundingFirstDigits(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.special_offer.rounding_first_digits</code>.
     */
    public Integer getRoundingFirstDigits() {
        return (Integer) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, BigDecimal, Integer, String, Integer, Integer, Integer, Integer, Boolean, Boolean, BigDecimal, Boolean, Boolean, Boolean, Boolean, Boolean, BigDecimal, Boolean, Boolean, Integer> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, BigDecimal, Integer, String, Integer, Integer, Integer, Integer, Boolean, Boolean, BigDecimal, Boolean, Boolean, Boolean, Boolean, Boolean, BigDecimal, Boolean, Boolean, Integer> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SpecialOffer.SPECIAL_OFFER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return SpecialOffer.SPECIAL_OFFER.COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SpecialOffer.SPECIAL_OFFER.EMPLOYER_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SpecialOffer.SPECIAL_OFFER.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SpecialOffer.SPECIAL_OFFER.SELLER_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SpecialOffer.SPECIAL_OFFER.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return SpecialOffer.SPECIAL_OFFER.ORDER_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SpecialOffer.SPECIAL_OFFER.JOB_SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return SpecialOffer.SPECIAL_OFFER.FIRST_OFFER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return SpecialOffer.SPECIAL_OFFER.GEO_TARGETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return SpecialOffer.SPECIAL_OFFER.DISCOUNT_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return SpecialOffer.SPECIAL_OFFER.ADDITIONAL_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return SpecialOffer.SPECIAL_OFFER.CAPITAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return SpecialOffer.SPECIAL_OFFER.CATEGORY_DIRECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return SpecialOffer.SPECIAL_OFFER.CATEGORY_AGENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return SpecialOffer.SPECIAL_OFFER.CATEGORY_OTHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return SpecialOffer.SPECIAL_OFFER.GROSS_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return SpecialOffer.SPECIAL_OFFER.CATEGORY_ANONYMOUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field19() {
        return SpecialOffer.SPECIAL_OFFER.LEGACY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field20() {
        return SpecialOffer.SPECIAL_OFFER.ROUNDING_FIRST_DIGITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEmployerCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSellerAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getOrder_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getJobSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getFirstOffer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getGeoTargeted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getDiscountRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getAdditionalTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getCapital();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getCategoryDirect();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getCategoryAgency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getCategoryOther();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getGrossPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getCategoryAnonymous();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value19() {
        return getLegacy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value20() {
        return getRoundingFirstDigits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value2(BigDecimal value) {
        setCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value3(Integer value) {
        setEmployerCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value4(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value5(Integer value) {
        setSellerAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value6(Integer value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value7(Integer value) {
        setOrder_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value8(Integer value) {
        setJobSite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value9(Boolean value) {
        setFirstOffer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value10(Boolean value) {
        setGeoTargeted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value11(BigDecimal value) {
        setDiscountRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value12(Boolean value) {
        setAdditionalTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value13(Boolean value) {
        setCapital(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value14(Boolean value) {
        setCategoryDirect(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value15(Boolean value) {
        setCategoryAgency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value16(Boolean value) {
        setCategoryOther(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value17(BigDecimal value) {
        setGrossPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value18(Boolean value) {
        setCategoryAnonymous(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value19(Boolean value) {
        setLegacy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord value20(Integer value) {
        setRoundingFirstDigits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialOfferRecord values(String value1, BigDecimal value2, Integer value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Boolean value9, Boolean value10, BigDecimal value11, Boolean value12, Boolean value13, Boolean value14, Boolean value15, Boolean value16, BigDecimal value17, Boolean value18, Boolean value19, Integer value20) {
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
     * Create a detached SpecialOfferRecord
     */
    public SpecialOfferRecord() {
        super(SpecialOffer.SPECIAL_OFFER);
    }

    /**
     * Create a detached, initialised SpecialOfferRecord
     */
    public SpecialOfferRecord(String id, BigDecimal cost, Integer employerCategory, String currency, Integer sellerAccountId, Integer serviceId, Integer order_, Integer jobSite, Boolean firstOffer, Boolean geoTargeted, BigDecimal discountRate, Boolean additionalTitle, Boolean capital, Boolean categoryDirect, Boolean categoryAgency, Boolean categoryOther, BigDecimal grossPrice, Boolean categoryAnonymous, Boolean legacy, Integer roundingFirstDigits) {
        super(SpecialOffer.SPECIAL_OFFER);

        set(0, id);
        set(1, cost);
        set(2, employerCategory);
        set(3, currency);
        set(4, sellerAccountId);
        set(5, serviceId);
        set(6, order_);
        set(7, jobSite);
        set(8, firstOffer);
        set(9, geoTargeted);
        set(10, discountRate);
        set(11, additionalTitle);
        set(12, capital);
        set(13, categoryDirect);
        set(14, categoryAgency);
        set(15, categoryOther);
        set(16, grossPrice);
        set(17, categoryAnonymous);
        set(18, legacy);
        set(19, roundingFirstDigits);
    }
}