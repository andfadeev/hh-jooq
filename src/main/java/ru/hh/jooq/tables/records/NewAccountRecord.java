/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.NewAccount;


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
public class NewAccountRecord extends UpdatableRecordImpl<NewAccountRecord> implements Record12<Integer, LocalDateTime, Integer, Integer, String, Boolean, String, Boolean, Boolean, Integer, LocalDateTime, Integer> {

    private static final long serialVersionUID = -171664843;

    /**
     * Setter for <code>public.new_account.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.new_account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.new_account.reset_mode</code>. unused
     */
    public void setResetMode(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.new_account.reset_mode</code>. unused
     */
    public LocalDateTime getResetMode() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.new_account.version</code>.
     */
    public void setVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.new_account.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.new_account.employer_msg_version</code>.
     */
    public void setEmployerMsgVersion(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.new_account.employer_msg_version</code>.
     */
    public Integer getEmployerMsgVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.new_account.employer_msg_hash</code>.
     */
    public void setEmployerMsgHash(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.new_account.employer_msg_hash</code>.
     */
    public String getEmployerMsgHash() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.new_account.stale</code>.
     */
    public void setStale(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.new_account.stale</code>.
     */
    public Boolean getStale() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.new_account.tax_number</code>. unused
     */
    public void setTaxNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.new_account.tax_number</code>. unused
     */
    public String getTaxNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.new_account.paid</code>.
     */
    public void setPaid(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.new_account.paid</code>.
     */
    public Boolean getPaid() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>public.new_account.new_billing</code>.
     */
    public void setNewBilling(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.new_account.new_billing</code>.
     */
    public Boolean getNewBilling() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.new_account.billing_employer_msg_version</code>.
     */
    public void setBillingEmployerMsgVersion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.new_account.billing_employer_msg_version</code>.
     */
    public Integer getBillingEmployerMsgVersion() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.new_account.billing_employer_msg_version_time</code>.
     */
    public void setBillingEmployerMsgVersionTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.new_account.billing_employer_msg_version_time</code>.
     */
    public LocalDateTime getBillingEmployerMsgVersionTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>public.new_account.version_</code>.
     */
    public void setVersion_(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.new_account.version_</code>.
     */
    public Integer getVersion_() {
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
    public Row12<Integer, LocalDateTime, Integer, Integer, String, Boolean, String, Boolean, Boolean, Integer, LocalDateTime, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, LocalDateTime, Integer, Integer, String, Boolean, String, Boolean, Boolean, Integer, LocalDateTime, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return NewAccount.NEW_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return NewAccount.NEW_ACCOUNT.RESET_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return NewAccount.NEW_ACCOUNT.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return NewAccount.NEW_ACCOUNT.EMPLOYER_MSG_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return NewAccount.NEW_ACCOUNT.EMPLOYER_MSG_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return NewAccount.NEW_ACCOUNT.STALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return NewAccount.NEW_ACCOUNT.TAX_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return NewAccount.NEW_ACCOUNT.PAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return NewAccount.NEW_ACCOUNT.NEW_BILLING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return NewAccount.NEW_ACCOUNT.BILLING_EMPLOYER_MSG_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return NewAccount.NEW_ACCOUNT.BILLING_EMPLOYER_MSG_VERSION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return NewAccount.NEW_ACCOUNT.VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getResetMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEmployerMsgVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmployerMsgHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getStale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTaxNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getPaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getNewBilling();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getBillingEmployerMsgVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getBillingEmployerMsgVersionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getVersion_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value2(LocalDateTime value) {
        setResetMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value3(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value4(Integer value) {
        setEmployerMsgVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value5(String value) {
        setEmployerMsgHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value6(Boolean value) {
        setStale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value7(String value) {
        setTaxNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value8(Boolean value) {
        setPaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value9(Boolean value) {
        setNewBilling(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value10(Integer value) {
        setBillingEmployerMsgVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value11(LocalDateTime value) {
        setBillingEmployerMsgVersionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord value12(Integer value) {
        setVersion_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NewAccountRecord values(Integer value1, LocalDateTime value2, Integer value3, Integer value4, String value5, Boolean value6, String value7, Boolean value8, Boolean value9, Integer value10, LocalDateTime value11, Integer value12) {
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
     * Create a detached NewAccountRecord
     */
    public NewAccountRecord() {
        super(NewAccount.NEW_ACCOUNT);
    }

    /**
     * Create a detached, initialised NewAccountRecord
     */
    public NewAccountRecord(Integer id, LocalDateTime resetMode, Integer version, Integer employerMsgVersion, String employerMsgHash, Boolean stale, String taxNumber, Boolean paid, Boolean newBilling, Integer billingEmployerMsgVersion, LocalDateTime billingEmployerMsgVersionTime, Integer version_) {
        super(NewAccount.NEW_ACCOUNT);

        set(0, id);
        set(1, resetMode);
        set(2, version);
        set(3, employerMsgVersion);
        set(4, employerMsgHash);
        set(5, stale);
        set(6, taxNumber);
        set(7, paid);
        set(8, newBilling);
        set(9, billingEmployerMsgVersion);
        set(10, billingEmployerMsgVersionTime);
        set(11, version_);
    }
}