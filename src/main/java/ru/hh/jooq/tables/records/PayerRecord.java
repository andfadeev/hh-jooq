/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Payer;


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
public class PayerRecord extends UpdatableRecordImpl<PayerRecord> implements Record12<Integer, String, Integer, Integer, Integer, Boolean, Integer, String, Boolean, Boolean, Boolean, Integer> {

    private static final long serialVersionUID = -1892746316;

    /**
     * Setter for <code>public.payer.payer_id</code>.
     */
    public void setPayerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payer.payer_id</code>.
     */
    public Integer getPayerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payer.payer_name</code>.
     */
    public void setPayerName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payer.payer_name</code>.
     */
    public String getPayerName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.payer.main_bank_detail_id</code>.
     */
    public void setMainBankDetailId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payer.main_bank_detail_id</code>.
     */
    public Integer getMainBankDetailId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.payer.employer_organization_type_id</code>.
     */
    public void setEmployerOrganizationTypeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payer.employer_organization_type_id</code>.
     */
    public Integer getEmployerOrganizationTypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.payer.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payer.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.payer.disabled</code>.
     */
    public void setDisabled(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payer.disabled</code>.
     */
    public Boolean getDisabled() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.payer.delivery_address_id</code>.
     */
    public void setDeliveryAddressId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.payer.delivery_address_id</code>.
     */
    public Integer getDeliveryAddressId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.payer.tax_number</code>.
     */
    public void setTaxNumber(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.payer.tax_number</code>.
     */
    public String getTaxNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.payer.fixed_name</code>.
     */
    public void setFixedName(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.payer.fixed_name</code>.
     */
    public Boolean getFixedName() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.payer.electronic_record</code>.
     */
    public void setElectronicRecord(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.payer.electronic_record</code>.
     */
    public Boolean getElectronicRecord() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>public.payer.adv_stop_notified</code>.
     */
    public void setAdvStopNotified(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.payer.adv_stop_notified</code>.
     */
    public Boolean getAdvStopNotified() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.payer.recipient_id</code>.
     */
    public void setRecipientId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.payer.recipient_id</code>.
     */
    public Integer getRecipientId() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Integer, Integer, Integer, Boolean, Integer, String, Boolean, Boolean, Boolean, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, Integer, Integer, Integer, Boolean, Integer, String, Boolean, Boolean, Boolean, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Payer.PAYER.PAYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Payer.PAYER.PAYER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Payer.PAYER.MAIN_BANK_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Payer.PAYER.EMPLOYER_ORGANIZATION_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Payer.PAYER.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Payer.PAYER.DISABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Payer.PAYER.DELIVERY_ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Payer.PAYER.TAX_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Payer.PAYER.FIXED_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Payer.PAYER.ELECTRONIC_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Payer.PAYER.ADV_STOP_NOTIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Payer.PAYER.RECIPIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPayerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPayerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMainBankDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEmployerOrganizationTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDisabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDeliveryAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTaxNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getFixedName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getElectronicRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getAdvStopNotified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRecipientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value1(Integer value) {
        setPayerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value2(String value) {
        setPayerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value3(Integer value) {
        setMainBankDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value4(Integer value) {
        setEmployerOrganizationTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value5(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value6(Boolean value) {
        setDisabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value7(Integer value) {
        setDeliveryAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value8(String value) {
        setTaxNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value9(Boolean value) {
        setFixedName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value10(Boolean value) {
        setElectronicRecord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value11(Boolean value) {
        setAdvStopNotified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord value12(Integer value) {
        setRecipientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayerRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Boolean value6, Integer value7, String value8, Boolean value9, Boolean value10, Boolean value11, Integer value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayerRecord
     */
    public PayerRecord() {
        super(Payer.PAYER);
    }

    /**
     * Create a detached, initialised PayerRecord
     */
    public PayerRecord(Integer payerId, String payerName, Integer mainBankDetailId, Integer employerOrganizationTypeId, Integer accountId, Boolean disabled, Integer deliveryAddressId, String taxNumber, Boolean fixedName, Boolean electronicRecord, Boolean advStopNotified, Integer recipientId) {
        super(Payer.PAYER);

        set(0, payerId);
        set(1, payerName);
        set(2, mainBankDetailId);
        set(3, employerOrganizationTypeId);
        set(4, accountId);
        set(5, disabled);
        set(6, deliveryAddressId);
        set(7, taxNumber);
        set(8, fixedName);
        set(9, electronicRecord);
        set(10, advStopNotified);
        set(11, recipientId);
    }
}
