/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Account;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> {

    private static final long serialVersionUID = -431655612;

    /**
     * Setter for <code>public.account.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.account.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.account.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.account.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.account.white_buh_date</code>.
     */
    public void setWhiteBuhDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.account.white_buh_date</code>.
     */
    public LocalDateTime getWhiteBuhDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.account.vacancy_free_last_update</code>.
     */
    public void setVacancyFreeLastUpdate(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.account.vacancy_free_last_update</code>.
     */
    public LocalDate getVacancyFreeLastUpdate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>public.account.seller_account_id</code>.
     */
    public void setSellerAccountId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.account.seller_account_id</code>.
     */
    public Integer getSellerAccountId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.account.employer_deeds_report_email</code>.
     */
    public void setEmployerDeedsReportEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.account.employer_deeds_report_email</code>.
     */
    public String getEmployerDeedsReportEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.account.credit_line_amount</code>.
     */
    public void setCreditLineAmount(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.account.credit_line_amount</code>.
     */
    public Long getCreditLineAmount() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.account.version_</code>.
     */
    public void setVersion_(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.account.version_</code>.
     */
    public Integer getVersion_() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.account.main_individual_payer_id</code>.
     */
    public void setMainIndividualPayerId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.account.main_individual_payer_id</code>.
     */
    public Integer getMainIndividualPayerId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.account.employer_name</code>.
     */
    public void setEmployerName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.account.employer_name</code>.
     */
    public String getEmployerName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.account.employer_category</code>.
     */
    public void setEmployerCategory(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.account.employer_category</code>.
     */
    public Integer getEmployerCategory() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.account.employer_state</code>.
     */
    public void setEmployerState(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.account.employer_state</code>.
     */
    public Integer getEmployerState() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.account.hh_manager_id</code>.
     */
    public void setHhManagerId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_id</code>.
     */
    public Integer getHhManagerId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.account.hh_manager_full_name</code>.
     */
    public void setHhManagerFullName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_full_name</code>.
     */
    public String getHhManagerFullName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.account.hh_manager_email</code>.
     */
    public void setHhManagerEmail(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_email</code>.
     */
    public String getHhManagerEmail() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.account.employer_manager_first_name</code>.
     */
    public void setEmployerManagerFirstName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.account.employer_manager_first_name</code>.
     */
    public String getEmployerManagerFirstName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.account.employer_manager_last_name</code>.
     */
    public void setEmployerManagerLastName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.account.employer_manager_last_name</code>.
     */
    public String getEmployerManagerLastName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.account.employer_manager_email</code>.
     */
    public void setEmployerManagerEmail(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.account.employer_manager_email</code>.
     */
    public String getEmployerManagerEmail() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.account.employer_manager_lang</code>.
     */
    public void setEmployerManagerLang(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.account.employer_manager_lang</code>.
     */
    public String getEmployerManagerLang() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.account.employer_msg_version</code>.
     */
    public void setEmployerMsgVersion(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.account.employer_msg_version</code>.
     */
    public Integer getEmployerMsgVersion() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>public.account.paid</code>.
     */
    public void setPaid(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.account.paid</code>.
     */
    public Boolean getPaid() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>public.account.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.account.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>public.account.new_assist</code>. unused
     */
    public void setNewAssist(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.account.new_assist</code>. unused
     */
    public Boolean getNewAssist() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>public.account.employer_job_site</code>.
     */
    public void setEmployerJobSite(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.account.employer_job_site</code>.
     */
    public Integer getEmployerJobSite() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>public.account.fake</code>.
     */
    public void setFake(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.account.fake</code>.
     */
    public Boolean getFake() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>public.account.employer_discarded</code>.
     */
    public void setEmployerDiscarded(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.account.employer_discarded</code>.
     */
    public Boolean getEmployerDiscarded() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>public.account.employer_area_id</code>.
     */
    public void setEmployerAreaId(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.account.employer_area_id</code>.
     */
    public Integer getEmployerAreaId() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>public.account.employer_site_id</code>.
     */
    public void setEmployerSiteId(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.account.employer_site_id</code>.
     */
    public Integer getEmployerSiteId() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>public.account.hh_manager_contact_email</code>.
     */
    public void setHhManagerContactEmail(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_contact_email</code>.
     */
    public String getHhManagerContactEmail() {
        return (String) get(28);
    }

    /**
     * Setter for <code>public.account.hh_manager_phone</code>.
     */
    public void setHhManagerPhone(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_phone</code>.
     */
    public String getHhManagerPhone() {
        return (String) get(29);
    }

    /**
     * Setter for <code>public.account.hh_manager_lang</code>.
     */
    public void setHhManagerLang(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.account.hh_manager_lang</code>.
     */
    public String getHhManagerLang() {
        return (String) get(30);
    }

    /**
     * Setter for <code>public.account.employer_manager_user_id</code>.
     */
    public void setEmployerManagerUserId(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.account.employer_manager_user_id</code>.
     */
    public Integer getEmployerManagerUserId() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>public.account.regional_office_id</code>.
     */
    public void setRegionalOfficeId(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>public.account.regional_office_id</code>.
     */
    public Integer getRegionalOfficeId() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>public.account.email_verification_date</code>.
     */
    public void setEmailVerificationDate(LocalDateTime value) {
        set(33, value);
    }

    /**
     * Getter for <code>public.account.email_verification_date</code>.
     */
    public LocalDateTime getEmailVerificationDate() {
        return (LocalDateTime) get(33);
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
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Integer accountId, Integer employerId, LocalDateTime whiteBuhDate, LocalDate vacancyFreeLastUpdate, Integer sellerAccountId, String employerDeedsReportEmail, Long creditLineAmount, Integer version_, Integer mainIndividualPayerId, String employerName, Integer employerCategory, Integer employerState, Integer hhManagerId, String hhManagerFullName, String hhManagerEmail, String employerManagerFirstName, String employerManagerLastName, String employerManagerEmail, String employerManagerLang, Integer employerMsgVersion, Boolean paid, LocalDateTime created, Boolean newAssist, Integer employerJobSite, Boolean fake, Boolean employerDiscarded, Integer employerAreaId, Integer employerSiteId, String hhManagerContactEmail, String hhManagerPhone, String hhManagerLang, Integer employerManagerUserId, Integer regionalOfficeId, LocalDateTime emailVerificationDate) {
        super(Account.ACCOUNT);

        set(0, accountId);
        set(1, employerId);
        set(2, whiteBuhDate);
        set(3, vacancyFreeLastUpdate);
        set(4, sellerAccountId);
        set(5, employerDeedsReportEmail);
        set(6, creditLineAmount);
        set(7, version_);
        set(8, mainIndividualPayerId);
        set(9, employerName);
        set(10, employerCategory);
        set(11, employerState);
        set(12, hhManagerId);
        set(13, hhManagerFullName);
        set(14, hhManagerEmail);
        set(15, employerManagerFirstName);
        set(16, employerManagerLastName);
        set(17, employerManagerEmail);
        set(18, employerManagerLang);
        set(19, employerMsgVersion);
        set(20, paid);
        set(21, created);
        set(22, newAssist);
        set(23, employerJobSite);
        set(24, fake);
        set(25, employerDiscarded);
        set(26, employerAreaId);
        set(27, employerSiteId);
        set(28, hhManagerContactEmail);
        set(29, hhManagerPhone);
        set(30, hhManagerLang);
        set(31, employerManagerUserId);
        set(32, regionalOfficeId);
        set(33, emailVerificationDate);
    }
}
