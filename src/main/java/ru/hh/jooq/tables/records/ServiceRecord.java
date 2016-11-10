/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Service;


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
public class ServiceRecord extends UpdatableRecordImpl<ServiceRecord> {

    private static final long serialVersionUID = -1507199143;

    /**
     * Setter for <code>public.service.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.service.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.service.service_category_id</code>.
     */
    public void setServiceCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.service.service_category_id</code>.
     */
    public Integer getServiceCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.service.visible</code>.
     */
    public void setVisible(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.service.visible</code>.
     */
    public Boolean getVisible() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.service.name</code>. unused
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.service.name</code>. unused
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.service.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.service.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.service.price</code>.
     */
    public void setPrice(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.service.price</code>.
     */
    public Long getPrice() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.service.priority</code>.
     */
    public void setPriority(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.service.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.service.period</code>.
     */
    public void setPeriod(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.service.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.service.hash</code>.
     */
    public void setHash(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.service.hash</code>.
     */
    public String getHash() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.service.period_cost</code>.
     */
    public void setPeriodCost(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.service.period_cost</code>.
     */
    public Long getPeriodCost() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.service.period_price</code>.
     */
    public void setPeriodPrice(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.service.period_price</code>.
     */
    public Long getPeriodPrice() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>public.service.bonus_amount</code>.
     */
    public void setBonusAmount(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.service.bonus_amount</code>.
     */
    public BigDecimal getBonusAmount() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>public.service.service_source_id</code>.
     */
    public void setServiceSourceId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.service.service_source_id</code>.
     */
    public Integer getServiceSourceId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.service.bonus_score_amount</code>.
     */
    public void setBonusScoreAmount(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.service.bonus_score_amount</code>.
     */
    public BigDecimal getBonusScoreAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>public.service.currency</code>.
     */
    public void setCurrency(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.service.currency</code>.
     */
    public String getCurrency() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.service.bonus_currency</code>.
     */
    public void setBonusCurrency(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.service.bonus_currency</code>.
     */
    public String getBonusCurrency() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.service.period_currency</code>.
     */
    public void setPeriodCurrency(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.service.period_currency</code>.
     */
    public String getPeriodCurrency() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.service.bonus_score_currency</code>.
     */
    public void setBonusScoreCurrency(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.service.bonus_score_currency</code>.
     */
    public String getBonusScoreCurrency() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.service.service_type</code>.
     */
    public void setServiceType(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.service.service_type</code>.
     */
    public String getServiceType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.service.agency</code>.
     */
    public void setAgency(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.service.agency</code>.
     */
    public Boolean getAgency() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>public.service.gift</code>.
     */
    public void setGift(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.service.gift</code>.
     */
    public Boolean getGift() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>public.service.gross_price</code>.
     */
    public void setGrossPrice(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.service.gross_price</code>.
     */
    public BigDecimal getGrossPrice() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>public.service.gross_currency</code>.
     */
    public void setGrossCurrency(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.service.gross_currency</code>.
     */
    public String getGrossCurrency() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.service.fixed_cost</code>.
     */
    public void setFixedCost(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.service.fixed_cost</code>.
     */
    public BigDecimal getFixedCost() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>public.service.special_offer_id</code>.
     */
    public void setSpecialOfferId(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.service.special_offer_id</code>.
     */
    public String getSpecialOfferId() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.service.gift_item</code>.
     */
    public void setGiftItem(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.service.gift_item</code>.
     */
    public Boolean getGiftItem() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>public.service.detailed_entries</code>.
     */
    public void setDetailedEntries(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.service.detailed_entries</code>.
     */
    public Boolean getDetailedEntries() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>public.service.title</code>.
     */
    public void setTitle(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.service.title</code>.
     */
    public String getTitle() {
        return (String) get(27);
    }

    /**
     * Setter for <code>public.service.product_id</code>.
     */
    public void setProductId(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.service.product_id</code>.
     */
    public Integer getProductId() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.service.mds_price_code</code>.
     */
    public void setMdsPriceCode(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.service.mds_price_code</code>.
     */
    public String getMdsPriceCode() {
        return (String) get(29);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceRecord
     */
    public ServiceRecord() {
        super(Service.SERVICE);
    }

    /**
     * Create a detached, initialised ServiceRecord
     */
    public ServiceRecord(Integer serviceId, Integer serviceCategoryId, Boolean visible, String name, String description, Long price, Integer priority, Integer period, String hash, Long periodCost, Long periodPrice, BigDecimal bonusAmount, Integer serviceSourceId, BigDecimal bonusScoreAmount, String currency, String bonusCurrency, String periodCurrency, String bonusScoreCurrency, String serviceType, Boolean agency, Boolean gift, BigDecimal grossPrice, String grossCurrency, BigDecimal fixedCost, String specialOfferId, Boolean giftItem, Boolean detailedEntries, String title, Integer productId, String mdsPriceCode) {
        super(Service.SERVICE);

        set(0, serviceId);
        set(1, serviceCategoryId);
        set(2, visible);
        set(3, name);
        set(4, description);
        set(5, price);
        set(6, priority);
        set(7, period);
        set(8, hash);
        set(9, periodCost);
        set(10, periodPrice);
        set(11, bonusAmount);
        set(12, serviceSourceId);
        set(13, bonusScoreAmount);
        set(14, currency);
        set(15, bonusCurrency);
        set(16, periodCurrency);
        set(17, bonusScoreCurrency);
        set(18, serviceType);
        set(19, agency);
        set(20, gift);
        set(21, grossPrice);
        set(22, grossCurrency);
        set(23, fixedCost);
        set(24, specialOfferId);
        set(25, giftItem);
        set(26, detailedEntries);
        set(27, title);
        set(28, productId);
        set(29, mdsPriceCode);
    }
}
