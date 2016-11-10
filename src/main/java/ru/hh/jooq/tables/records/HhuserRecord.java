/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Hhuser;
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
public class HhuserRecord extends UpdatableRecordImpl<HhuserRecord> {

    private static final long serialVersionUID = 884952627;

    /**
     * Setter for <code>public.hhuser.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.hhuser.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.hhuser.icq</code>.
     */
    public void setIcq(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.hhuser.icq</code>.
     */
    public String getIcq() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.hhuser.type</code>.
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.hhuser.type</code>.
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.hhuser.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.hhuser.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.hhuser.uid_cookie</code>.
     */
    public void setUidCookie(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.hhuser.uid_cookie</code>.
     */
    public String getUidCookie() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.hhuser.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.hhuser.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.hhuser.show_archived_vacncies_replies</code>.
     */
    public void setShowArchivedVacnciesReplies(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.hhuser.show_archived_vacncies_replies</code>.
     */
    public Boolean getShowArchivedVacnciesReplies() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.hhuser.inheritance_tag</code>.
     */
    public void setInheritanceTag(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.hhuser.inheritance_tag</code>.
     */
    public String getInheritanceTag() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.hhuser.phone_ext</code>.
     */
    public void setPhoneExt(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.hhuser.phone_ext</code>.
     */
    public String getPhoneExt() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.hhuser.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.hhuser.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.hhuser.show_negative_vacancies_replies</code>.
     */
    public void setShowNegativeVacanciesReplies(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.hhuser.show_negative_vacancies_replies</code>.
     */
    public Boolean getShowNegativeVacanciesReplies() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>public.hhuser.guid</code>.
     */
    public void setGuid(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.hhuser.guid</code>.
     */
    public String getGuid() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.hhuser.filter_number</code>.
     */
    public void setFilterNumber(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.hhuser.filter_number</code>.
     */
    public Integer getFilterNumber() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.hhuser.has_oferta</code>.
     */
    public void setHasOferta(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.hhuser.has_oferta</code>.
     */
    public Boolean getHasOferta() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.hhuser.hhid</code>.
     */
    public void setHhid(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.hhuser.hhid</code>.
     */
    public Long getHhid() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.hhuser.begun_partner</code>.
     */
    public void setBegunPartner(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.hhuser.begun_partner</code>.
     */
    public Boolean getBegunPartner() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.hhuser.lj_partner</code>.
     */
    public void setLjPartner(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.hhuser.lj_partner</code>.
     */
    public Boolean getLjPartner() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.hhuser.lang</code>.
     */
    public void setLang(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.hhuser.lang</code>.
     */
    public String getLang() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.hhuser.resume_view_limit</code>.
     */
    public void setResumeViewLimit(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.hhuser.resume_view_limit</code>.
     */
    public Integer getResumeViewLimit() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.hhuser.source</code>.
     */
    public void setSource(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.hhuser.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>public.hhuser.source_user_id</code>.
     */
    public void setSourceUserId(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.hhuser.source_user_id</code>.
     */
    public Integer getSourceUserId() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.hhuser.reset_password_key</code>.
     */
    public void setResetPasswordKey(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.hhuser.reset_password_key</code>.
     */
    public String getResetPasswordKey() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.hhuser.blocked_cache</code>.
     */
    public void setBlockedCache(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.hhuser.blocked_cache</code>.
     */
    public Integer getBlockedCache() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>public.hhuser.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.hhuser.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>public.hhuser.freezing_day</code>.
     */
    public void setFreezingDay(LocalDateTime value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.hhuser.freezing_day</code>.
     */
    public LocalDateTime getFreezingDay() {
        return (LocalDateTime) get(24);
    }

    /**
     * Setter for <code>public.hhuser.hhresume_migration_state</code>.
     */
    public void setHhresumeMigrationState(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.hhuser.hhresume_migration_state</code>.
     */
    public Integer getHhresumeMigrationState() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>public.hhuser.employer_contact_email</code>.
     */
    public void setEmployerContactEmail(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.hhuser.employer_contact_email</code>.
     */
    public String getEmployerContactEmail() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.hhuser.first_name_cache</code>.
     */
    public void setFirstNameCache(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.hhuser.first_name_cache</code>.
     */
    public String getFirstNameCache() {
        return (String) get(27);
    }

    /**
     * Setter for <code>public.hhuser.middle_name_cache</code>.
     */
    public void setMiddleNameCache(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.hhuser.middle_name_cache</code>.
     */
    public String getMiddleNameCache() {
        return (String) get(28);
    }

    /**
     * Setter for <code>public.hhuser.last_name_cache</code>.
     */
    public void setLastNameCache(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.hhuser.last_name_cache</code>.
     */
    public String getLastNameCache() {
        return (String) get(29);
    }

    /**
     * Setter for <code>public.hhuser.phone</code>.
     */
    public void setPhone(PhoneEmbeddedRecord value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.hhuser.phone</code>.
     */
    public PhoneEmbeddedRecord getPhone() {
        return (PhoneEmbeddedRecord) get(30);
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
     * Create a detached HhuserRecord
     */
    public HhuserRecord() {
        super(Hhuser.HHUSER);
    }

    /**
     * Create a detached, initialised HhuserRecord
     */
    public HhuserRecord(Integer userId, String icq, Integer type, LocalDateTime creationTime, String uidCookie, Integer areaId, Boolean showArchivedVacnciesReplies, String inheritanceTag, String phoneExt, String description, Boolean showNegativeVacanciesReplies, String guid, Integer filterNumber, Boolean hasOferta, Long hhid, Boolean begunPartner, Boolean ljPartner, String lang, Integer resumeViewLimit, Integer source, Integer sourceUserId, String resetPasswordKey, Integer blockedCache, Integer siteId, LocalDateTime freezingDay, Integer hhresumeMigrationState, String employerContactEmail, String firstNameCache, String middleNameCache, String lastNameCache, PhoneEmbeddedRecord phone) {
        super(Hhuser.HHUSER);

        set(0, userId);
        set(1, icq);
        set(2, type);
        set(3, creationTime);
        set(4, uidCookie);
        set(5, areaId);
        set(6, showArchivedVacnciesReplies);
        set(7, inheritanceTag);
        set(8, phoneExt);
        set(9, description);
        set(10, showNegativeVacanciesReplies);
        set(11, guid);
        set(12, filterNumber);
        set(13, hasOferta);
        set(14, hhid);
        set(15, begunPartner);
        set(16, ljPartner);
        set(17, lang);
        set(18, resumeViewLimit);
        set(19, source);
        set(20, sourceUserId);
        set(21, resetPasswordKey);
        set(22, blockedCache);
        set(23, siteId);
        set(24, freezingDay);
        set(25, hhresumeMigrationState);
        set(26, employerContactEmail);
        set(27, firstNameCache);
        set(28, middleNameCache);
        set(29, lastNameCache);
        set(30, phone);
    }
}