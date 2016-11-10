/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Deed;


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
public class DeedRecord extends UpdatableRecordImpl<DeedRecord> {

    private static final long serialVersionUID = 1731685267;

    /**
     * Setter for <code>public.deed.deed_id</code>.
     */
    public void setDeedId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.deed.deed_id</code>.
     */
    public Integer getDeedId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.deed.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.deed.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.deed.employer_service_id</code>.
     */
    public void setEmployerServiceId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.deed.employer_service_id</code>.
     */
    public Integer getEmployerServiceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.deed.is_document_sent</code>.
     */
    public void setIsDocumentSent(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.deed.is_document_sent</code>.
     */
    public Boolean getIsDocumentSent() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.deed.required_work_finished</code>.
     */
    public void setRequiredWorkFinished(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.deed.required_work_finished</code>.
     */
    public Boolean getRequiredWorkFinished() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.deed.visibility</code>.
     */
    public void setVisibility(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.deed.visibility</code>.
     */
    public Boolean getVisibility() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.deed.subject</code>.
     */
    public void setSubject(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.deed.subject</code>.
     */
    public String getSubject() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.deed.number</code>.
     */
    public void setNumber(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.deed.number</code>.
     */
    public String getNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.deed.deed_state_id</code>.
     */
    public void setDeedStateId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.deed.deed_state_id</code>.
     */
    public Integer getDeedStateId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.deed.part</code>.
     */
    public void setPart(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.deed.part</code>.
     */
    public Integer getPart() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.deed.bank_detail_id</code>.
     */
    public void setBankDetailId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.deed.bank_detail_id</code>.
     */
    public Integer getBankDetailId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.deed.start</code>.
     */
    public void setStart(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.deed.start</code>.
     */
    public LocalDate getStart() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>public.deed.days</code>.
     */
    public void setDays(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.deed.days</code>.
     */
    public Integer getDays() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.deed.index_</code>.
     */
    public void setIndex_(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.deed.index_</code>.
     */
    public Integer getIndex_() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.deed.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.deed.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.deed.bonus_subject</code>.
     */
    public void setBonusSubject(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.deed.bonus_subject</code>.
     */
    public String getBonusSubject() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.deed.bonus_employer_service_id</code>.
     */
    public void setBonusEmployerServiceId(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.deed.bonus_employer_service_id</code>.
     */
    public Integer getBonusEmployerServiceId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.deed.recipient_id</code>.
     */
    public void setRecipientId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.deed.recipient_id</code>.
     */
    public Integer getRecipientId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.deed.currency</code>.
     */
    public void setCurrency(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.deed.currency</code>.
     */
    public String getCurrency() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.deed.file_id</code>.
     */
    public void setFileId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.deed.file_id</code>.
     */
    public Integer getFileId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>public.deed.sent</code>.
     */
    public void setSent(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.deed.sent</code>.
     */
    public Boolean getSent() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>public.deed.hard_copy_state</code>.
     */
    public void setHardCopyState(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.deed.hard_copy_state</code>.
     */
    public Integer getHardCopyState() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>public.deed.hard_copy_time</code>.
     */
    public void setHardCopyTime(LocalDateTime value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.deed.hard_copy_time</code>.
     */
    public LocalDateTime getHardCopyTime() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>public.deed.aspe_quantity</code>.
     */
    public void setAspeQuantity(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.deed.aspe_quantity</code>.
     */
    public Integer getAspeQuantity() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>public.deed.aspe_id</code>.
     */
    public void setAspeId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.deed.aspe_id</code>.
     */
    public Integer getAspeId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>public.deed.billing_file_id</code>.
     */
    public void setBillingFileId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.deed.billing_file_id</code>.
     */
    public Integer getBillingFileId() {
        return (Integer) get(25);
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
     * Create a detached DeedRecord
     */
    public DeedRecord() {
        super(Deed.DEED);
    }

    /**
     * Create a detached, initialised DeedRecord
     */
    public DeedRecord(Integer deedId, LocalDateTime creationTime, Integer employerServiceId, Boolean isDocumentSent, Boolean requiredWorkFinished, Boolean visibility, String subject, String number, Integer deedStateId, Integer part, Integer bankDetailId, LocalDate start, Integer days, Integer index_, BigDecimal price, String bonusSubject, Integer bonusEmployerServiceId, Integer recipientId, String currency, Integer fileId, Boolean sent, Integer hardCopyState, LocalDateTime hardCopyTime, Integer aspeQuantity, Integer aspeId, Integer billingFileId) {
        super(Deed.DEED);

        set(0, deedId);
        set(1, creationTime);
        set(2, employerServiceId);
        set(3, isDocumentSent);
        set(4, requiredWorkFinished);
        set(5, visibility);
        set(6, subject);
        set(7, number);
        set(8, deedStateId);
        set(9, part);
        set(10, bankDetailId);
        set(11, start);
        set(12, days);
        set(13, index_);
        set(14, price);
        set(15, bonusSubject);
        set(16, bonusEmployerServiceId);
        set(17, recipientId);
        set(18, currency);
        set(19, fileId);
        set(20, sent);
        set(21, hardCopyState);
        set(22, hardCopyTime);
        set(23, aspeQuantity);
        set(24, aspeId);
        set(25, billingFileId);
    }
}
