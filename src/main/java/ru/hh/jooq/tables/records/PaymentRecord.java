/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Payment;


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
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record22<Integer, Integer, Long, LocalDateTime, Integer, Integer, Integer, Boolean, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, Boolean, Boolean, Integer, Boolean, Boolean, Boolean> {

    private static final long serialVersionUID = -942311047;

    /**
     * Setter for <code>public.payment.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment.payment_id</code>.
     */
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payment.agreement_id</code>.
     */
    public void setAgreementId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment.agreement_id</code>.
     */
    public Integer getAgreementId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.payment.money</code>.
     */
    public void setMoney(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment.money</code>.
     */
    public Long getMoney() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.payment.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.payment.status</code>.
     */
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.payment.payment_type</code>.
     */
    public void setPaymentType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment.payment_type</code>.
     */
    public Integer getPaymentType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.payment.type</code>.
     */
    public void setType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.payment.type</code>.
     */
    public Integer getType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.payment.is_deleted</code>.
     */
    public void setIsDeleted(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.payment.is_deleted</code>.
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.payment.approved_by_manager_id</code>.
     */
    public void setApprovedByManagerId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.payment.approved_by_manager_id</code>.
     */
    public Integer getApprovedByManagerId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.payment.offshore</code>.
     */
    public void setOffshore(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.payment.offshore</code>.
     */
    public Boolean getOffshore() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.payment.moneta</code>.
     */
    public void setMoneta(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.payment.moneta</code>.
     */
    public Boolean getMoneta() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.payment.visibility</code>.
     */
    public void setVisibility(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.payment.visibility</code>.
     */
    public Boolean getVisibility() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.payment.key_payment</code>.
     */
    public void setKeyPayment(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.payment.key_payment</code>.
     */
    public Boolean getKeyPayment() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.payment.move_to_key</code>.
     */
    public void setMoveToKey(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.payment.move_to_key</code>.
     */
    public Boolean getMoveToKey() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.payment.advertising</code>.
     */
    public void setAdvertising(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.payment.advertising</code>.
     */
    public Boolean getAdvertising() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>public.payment.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.payment.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>public.payment.additional_services_for_key_payment</code>.
     */
    public void setAdditionalServicesForKeyPayment(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.payment.additional_services_for_key_payment</code>.
     */
    public Boolean getAdditionalServicesForKeyPayment() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.payment.barter</code>.
     */
    public void setBarter(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.payment.barter</code>.
     */
    public Boolean getBarter() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>public.payment.bill_id</code>.
     */
    public void setBillId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.payment.bill_id</code>.
     */
    public Integer getBillId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.payment.attribute1</code>.
     */
    public void setAttribute1(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.payment.attribute1</code>.
     */
    public Boolean getAttribute1() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>public.payment.attribute2</code>.
     */
    public void setAttribute2(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.payment.attribute2</code>.
     */
    public Boolean getAttribute2() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>public.payment.prolongation</code>.
     */
    public void setProlongation(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.payment.prolongation</code>.
     */
    public Boolean getProlongation() {
        return (Boolean) get(21);
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
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Long, LocalDateTime, Integer, Integer, Integer, Boolean, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, Boolean, Boolean, Integer, Boolean, Boolean, Boolean> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Integer, Integer, Long, LocalDateTime, Integer, Integer, Integer, Boolean, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Integer, Boolean, Boolean, Integer, Boolean, Boolean, Boolean> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Payment.PAYMENT.PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Payment.PAYMENT.AGREEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Payment.PAYMENT.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Payment.PAYMENT.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Payment.PAYMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Payment.PAYMENT.PAYMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Payment.PAYMENT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Payment.PAYMENT.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Payment.PAYMENT.APPROVED_BY_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Payment.PAYMENT.OFFSHORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Payment.PAYMENT.MONETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Payment.PAYMENT.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Payment.PAYMENT.KEY_PAYMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Payment.PAYMENT.MOVE_TO_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return Payment.PAYMENT.ADVERTISING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Payment.PAYMENT.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return Payment.PAYMENT.ADDITIONAL_SERVICES_FOR_KEY_PAYMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return Payment.PAYMENT.BARTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return Payment.PAYMENT.BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return Payment.PAYMENT.ATTRIBUTE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field21() {
        return Payment.PAYMENT.ATTRIBUTE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field22() {
        return Payment.PAYMENT.PROLONGATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAgreementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPaymentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getApprovedByManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getOffshore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getMoneta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getKeyPayment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getMoveToKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getAdvertising();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getAdditionalServicesForKeyPayment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getBarter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getAttribute1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value21() {
        return getAttribute2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value22() {
        return getProlongation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value1(Integer value) {
        setPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value2(Integer value) {
        setAgreementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value3(Long value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value4(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value5(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value6(Integer value) {
        setPaymentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value7(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value8(Boolean value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value9(Integer value) {
        setApprovedByManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value10(Boolean value) {
        setOffshore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value11(Boolean value) {
        setMoneta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value12(Boolean value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value13(Boolean value) {
        setKeyPayment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value14(Boolean value) {
        setMoveToKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value15(Boolean value) {
        setAdvertising(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value16(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value17(Boolean value) {
        setAdditionalServicesForKeyPayment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value18(Boolean value) {
        setBarter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value19(Integer value) {
        setBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value20(Boolean value) {
        setAttribute1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value21(Boolean value) {
        setAttribute2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value22(Boolean value) {
        setProlongation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord values(Integer value1, Integer value2, Long value3, LocalDateTime value4, Integer value5, Integer value6, Integer value7, Boolean value8, Integer value9, Boolean value10, Boolean value11, Boolean value12, Boolean value13, Boolean value14, Boolean value15, Integer value16, Boolean value17, Boolean value18, Integer value19, Boolean value20, Boolean value21, Boolean value22) {
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
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Integer paymentId, Integer agreementId, Long money, LocalDateTime creationTime, Integer status, Integer paymentType, Integer type, Boolean isDeleted, Integer approvedByManagerId, Boolean offshore, Boolean moneta, Boolean visibility, Boolean keyPayment, Boolean moveToKey, Boolean advertising, Integer employerId, Boolean additionalServicesForKeyPayment, Boolean barter, Integer billId, Boolean attribute1, Boolean attribute2, Boolean prolongation) {
        super(Payment.PAYMENT);

        set(0, paymentId);
        set(1, agreementId);
        set(2, money);
        set(3, creationTime);
        set(4, status);
        set(5, paymentType);
        set(6, type);
        set(7, isDeleted);
        set(8, approvedByManagerId);
        set(9, offshore);
        set(10, moneta);
        set(11, visibility);
        set(12, keyPayment);
        set(13, moveToKey);
        set(14, advertising);
        set(15, employerId);
        set(16, additionalServicesForKeyPayment);
        set(17, barter);
        set(18, billId);
        set(19, attribute1);
        set(20, attribute2);
        set(21, prolongation);
    }
}