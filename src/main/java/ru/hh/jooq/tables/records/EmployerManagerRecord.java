/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.EmployerManager;
import ru.hh.jooq.udt.records.PhoneEmbeddedRecord;


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
public class EmployerManagerRecord extends UpdatableRecordImpl<EmployerManagerRecord> {

    private static final long serialVersionUID = 769480568;

    /**
     * Setter for <code>public.employer_manager.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_manager.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_manager.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_manager.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_manager.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.employer_manager.type</code>.
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_manager.type</code>.
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.employer_manager.html_editor</code>.
     */
    public void setHtmlEditor(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employer_manager.html_editor</code>.
     */
    public Integer getHtmlEditor() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.employer_manager.use_vacancy_template</code>.
     */
    public void setUseVacancyTemplate(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employer_manager.use_vacancy_template</code>.
     */
    public Boolean getUseVacancyTemplate() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.employer_manager.send_sms</code>.
     */
    public void setSendSms(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.employer_manager.send_sms</code>.
     */
    public Boolean getSendSms() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.employer_manager.vacancy_order</code>.
     */
    public void setVacancyOrder(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.employer_manager.vacancy_order</code>.
     */
    public Integer getVacancyOrder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.employer_manager.decision_maker</code>.
     */
    public void setDecisionMaker(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.employer_manager.decision_maker</code>.
     */
    public Boolean getDecisionMaker() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.employer_manager.m_position</code>.
     */
    public void setMPosition(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.employer_manager.m_position</code>.
     */
    public String getMPosition() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.employer_manager.use_resume_search_suggestion</code>.
     */
    public void setUseResumeSearchSuggestion(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.employer_manager.use_resume_search_suggestion</code>.
     */
    public Boolean getUseResumeSearchSuggestion() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.employer_manager.special_note_1</code>.
     */
    public void setSpecialNote_1(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.employer_manager.special_note_1</code>.
     */
    public String getSpecialNote_1() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.employer_manager.special_note_2</code>.
     */
    public void setSpecialNote_2(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.employer_manager.special_note_2</code>.
     */
    public String getSpecialNote_2() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.employer_manager.stars_add_type</code>.
     */
    public void setStarsAddType(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.employer_manager.stars_add_type</code>.
     */
    public Integer getStarsAddType() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>public.employer_manager.stars_add_number</code>.
     */
    public void setStarsAddNumber(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.employer_manager.stars_add_number</code>.
     */
    public Integer getStarsAddNumber() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>public.employer_manager.open_resume_new_window</code>.
     */
    public void setOpenResumeNewWindow(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.employer_manager.open_resume_new_window</code>.
     */
    public Boolean getOpenResumeNewWindow() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.employer_manager.vacancy_currency_code</code>.
     */
    public void setVacancyCurrencyCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.employer_manager.vacancy_currency_code</code>.
     */
    public String getVacancyCurrencyCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.employer_manager.premoderator_id</code>.
     */
    public void setPremoderatorId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.employer_manager.premoderator_id</code>.
     */
    public Integer getPremoderatorId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.employer_manager.anonymous_send_sms</code>.
     */
    public void setAnonymousSendSms(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.employer_manager.anonymous_send_sms</code>.
     */
    public Boolean getAnonymousSendSms() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>public.employer_manager.agency_contact_manager</code>.
     */
    public void setAgencyContactManager(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.employer_manager.agency_contact_manager</code>.
     */
    public Boolean getAgencyContactManager() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>public.employer_manager.salary_stat_user_type</code>.
     */
    public void setSalaryStatUserType(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.employer_manager.salary_stat_user_type</code>.
     */
    public Integer getSalaryStatUserType() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.employer_manager.last_change_time</code>.
     */
    public void setLastChangeTime(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.employer_manager.last_change_time</code>.
     */
    public LocalDateTime getLastChangeTime() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>public.employer_manager.phone</code>.
     */
    public void setPhone(PhoneEmbeddedRecord value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.employer_manager.phone</code>.
     */
    public PhoneEmbeddedRecord getPhone() {
        return (PhoneEmbeddedRecord) get(22);
    }

    /**
     * Setter for <code>public.employer_manager.additional_phone</code>.
     */
    public void setAdditionalPhone(PhoneEmbeddedRecord value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.employer_manager.additional_phone</code>.
     */
    public PhoneEmbeddedRecord getAdditionalPhone() {
        return (PhoneEmbeddedRecord) get(23);
    }

    /**
     * Setter for <code>public.employer_manager.implant_type</code>. 0 - unknown, 1 - staff member, 2 - freelancer, null - employer manager is not an implant
     */
    public void setImplantType(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.employer_manager.implant_type</code>. 0 - unknown, 1 - staff member, 2 - freelancer, null - employer manager is not an implant
     */
    public Integer getImplantType() {
        return (Integer) get(24);
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
     * Create a detached EmployerManagerRecord
     */
    public EmployerManagerRecord() {
        super(EmployerManager.EMPLOYER_MANAGER);
    }

    /**
     * Create a detached, initialised EmployerManagerRecord
     */
    public EmployerManagerRecord(Integer employerManagerId, Integer employerId, Integer userId, Integer type, Integer htmlEditor, Boolean useVacancyTemplate, Boolean sendSms, Integer vacancyOrder, Boolean decisionMaker, String mPosition, Boolean useResumeSearchSuggestion, String specialNote_1, String specialNote_2, Integer starsAddType, Integer starsAddNumber, Boolean openResumeNewWindow, String vacancyCurrencyCode, Integer premoderatorId, Boolean anonymousSendSms, Boolean agencyContactManager, Integer salaryStatUserType, LocalDateTime lastChangeTime, PhoneEmbeddedRecord phone, PhoneEmbeddedRecord additionalPhone, Integer implantType) {
        super(EmployerManager.EMPLOYER_MANAGER);

        set(0, employerManagerId);
        set(1, employerId);
        set(2, userId);
        set(3, type);
        set(4, htmlEditor);
        set(5, useVacancyTemplate);
        set(6, sendSms);
        set(7, vacancyOrder);
        set(8, decisionMaker);
        set(9, mPosition);
        set(10, useResumeSearchSuggestion);
        set(11, specialNote_1);
        set(12, specialNote_2);
        set(13, starsAddType);
        set(14, starsAddNumber);
        set(15, openResumeNewWindow);
        set(16, vacancyCurrencyCode);
        set(17, premoderatorId);
        set(18, anonymousSendSms);
        set(19, agencyContactManager);
        set(20, salaryStatUserType);
        set(21, lastChangeTime);
        set(22, phone);
        set(23, additionalPhone);
        set(24, implantType);
    }
}
