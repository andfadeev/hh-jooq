/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.Resume;
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
public class ResumeRecord extends UpdatableRecordImpl<ResumeRecord> {

    private static final long serialVersionUID = 2080372657;

    /**
     * Setter for <code>public.resume.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.resume.middle_name</code>.
     */
    public void setMiddleName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.resume.last_name</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.resume.last_name</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.resume.gender</code>.
     */
    public void setGender(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.resume.gender</code>.
     */
    public Integer getGender() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.resume.birth_day</code>.
     */
    public void setBirthDay(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.resume.birth_day</code>.
     */
    public LocalDateTime getBirthDay() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.resume.education_id</code>.
     */
    public void setEducationId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.resume.education_id</code>.
     */
    public Integer getEducationId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.resume.work_experience</code>.
     */
    public void setWorkExperience(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.resume.work_experience</code>.
     */
    public Integer getWorkExperience() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.resume.desireable_compensation</code>.
     */
    public void setDesireableCompensation(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.resume.desireable_compensation</code>.
     */
    public Long getDesireableCompensation() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.resume.area_id</code>.
     */
    public void setAreaId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.resume.area_id</code>.
     */
    public Integer getAreaId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.resume.relocation</code>.
     */
    public void setRelocation(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.resume.relocation</code>.
     */
    public Integer getRelocation() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.resume.email</code>.
     */
    public void setEmail(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.resume.email</code>.
     */
    public String getEmail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.resume.home_address</code>.
     */
    public void setHomeAddress(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.resume.home_address</code>.
     */
    public String getHomeAddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.resume.prefered_link</code>.
     */
    public void setPreferedLink(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.resume.prefered_link</code>.
     */
    public Integer getPreferedLink() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>public.resume.access_type</code>.
     */
    public void setAccessType(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.resume.access_type</code>.
     */
    public Integer getAccessType() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>public.resume.lang</code>.
     */
    public void setLang(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.resume.lang</code>.
     */
    public String getLang() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.resume.is_finished</code>.
     */
    public void setIsFinished(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.resume.is_finished</code>.
     */
    public Integer getIsFinished() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.resume.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.resume.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>public.resume.last_change_time</code>.
     */
    public void setLastChangeTime(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.resume.last_change_time</code>.
     */
    public LocalDateTime getLastChangeTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>public.resume.step</code>.
     */
    public void setStep(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.resume.step</code>.
     */
    public Integer getStep() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.resume.moderator_user_id</code>.
     */
    public void setModeratorUserId(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.resume.moderator_user_id</code>.
     */
    public Integer getModeratorUserId() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>public.resume.moderate_time</code>.
     */
    public void setModerateTime(LocalDateTime value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.resume.moderate_time</code>.
     */
    public LocalDateTime getModerateTime() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>public.resume.moderate_assign_time</code>.
     */
    public void setModerateAssignTime(LocalDateTime value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.resume.moderate_assign_time</code>.
     */
    public LocalDateTime getModerateAssignTime() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>public.resume.source</code>.
     */
    public void setSource(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.resume.source</code>.
     */
    public Integer getSource() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>public.resume.last_experience_id</code>.
     */
    public void setLastExperienceId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.resume.last_experience_id</code>.
     */
    public Integer getLastExperienceId() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>public.resume.post</code>.
     */
    public void setPost(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.resume.post</code>.
     */
    public String getPost() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.resume.metro_station_id</code>.
     */
    public void setMetroStationId(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.resume.metro_station_id</code>.
     */
    public Integer getMetroStationId() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>public.resume.road_time_type</code>.
     */
    public void setRoadTimeType(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.resume.road_time_type</code>.
     */
    public Integer getRoadTimeType() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.resume.platform_code</code>.
     */
    public void setPlatformCode(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.resume.platform_code</code>.
     */
    public Integer getPlatformCode() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>public.resume.resume_photo_id</code>.
     */
    public void setResumePhotoId(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.resume.resume_photo_id</code>.
     */
    public Integer getResumePhotoId() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>public.resume.site_id</code>.
     */
    public void setSiteId(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.resume.site_id</code>.
     */
    public Integer getSiteId() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>public.resume.desireable_compensation_currency_code</code>.
     */
    public void setDesireableCompensationCurrencyCode(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>public.resume.desireable_compensation_currency_code</code>.
     */
    public String getDesireableCompensationCurrencyCode() {
        return (String) get(32);
    }

    /**
     * Setter for <code>public.resume.mark_expire_time</code>.
     */
    public void setMarkExpireTime(LocalDateTime value) {
        set(33, value);
    }

    /**
     * Getter for <code>public.resume.mark_expire_time</code>.
     */
    public LocalDateTime getMarkExpireTime() {
        return (LocalDateTime) get(33);
    }

    /**
     * Setter for <code>public.resume.secret_word</code>.
     */
    public void setSecretWord(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>public.resume.secret_word</code>.
     */
    public String getSecretWord() {
        return (String) get(34);
    }

    /**
     * Setter for <code>public.resume.business_trip_readiness</code>.
     */
    public void setBusinessTripReadiness(Integer value) {
        set(35, value);
    }

    /**
     * Getter for <code>public.resume.business_trip_readiness</code>.
     */
    public Integer getBusinessTripReadiness() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>public.resume.moderation_notes_mask</code>.
     */
    public void setModerationNotesMask(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>public.resume.moderation_notes_mask</code>.
     */
    public Integer getModerationNotesMask() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>public.resume.renewal_expire_time</code>.
     */
    public void setRenewalExpireTime(LocalDateTime value) {
        set(37, value);
    }

    /**
     * Getter for <code>public.resume.renewal_expire_time</code>.
     */
    public LocalDateTime getRenewalExpireTime() {
        return (LocalDateTime) get(37);
    }

    /**
     * Setter for <code>public.resume.disabled</code>.
     */
    public void setDisabled(Boolean value) {
        set(38, value);
    }

    /**
     * Getter for <code>public.resume.disabled</code>.
     */
    public Boolean getDisabled() {
        return (Boolean) get(38);
    }

    /**
     * Setter for <code>public.resume.work_experience_month_count</code>.
     */
    public void setWorkExperienceMonthCount(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>public.resume.work_experience_month_count</code>.
     */
    public Integer getWorkExperienceMonthCount() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>public.resume.work_experience_calculation_time</code>.
     */
    public void setWorkExperienceCalculationTime(LocalDateTime value) {
        set(40, value);
    }

    /**
     * Getter for <code>public.resume.work_experience_calculation_time</code>.
     */
    public LocalDateTime getWorkExperienceCalculationTime() {
        return (LocalDateTime) get(40);
    }

    /**
     * Setter for <code>public.resume.career_guidance_result_id</code>.
     */
    public void setCareerGuidanceResultId(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>public.resume.career_guidance_result_id</code>.
     */
    public Integer getCareerGuidanceResultId() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>public.resume.employments</code>.
     */
    public void setEmployments(Short... value) {
        set(42, value);
    }

    /**
     * Getter for <code>public.resume.employments</code>.
     */
    public Short[] getEmployments() {
        return (Short[]) get(42);
    }

    /**
     * Setter for <code>public.resume.work_schedules</code>.
     */
    public void setWorkSchedules(Short... value) {
        set(43, value);
    }

    /**
     * Getter for <code>public.resume.work_schedules</code>.
     */
    public Short[] getWorkSchedules() {
        return (Short[]) get(43);
    }

    /**
     * Setter for <code>public.resume.replication_heartbeat</code>.
     */
    public void setReplicationHeartbeat(LocalDateTime value) {
        set(44, value);
    }

    /**
     * Getter for <code>public.resume.replication_heartbeat</code>.
     */
    public LocalDateTime getReplicationHeartbeat() {
        return (LocalDateTime) get(44);
    }

    /**
     * Setter for <code>public.resume.home_phone</code>.
     */
    public void setHomePhone(PhoneEmbeddedRecord value) {
        set(45, value);
    }

    /**
     * Getter for <code>public.resume.home_phone</code>.
     */
    public PhoneEmbeddedRecord getHomePhone() {
        return (PhoneEmbeddedRecord) get(45);
    }

    /**
     * Setter for <code>public.resume.work_phone</code>.
     */
    public void setWorkPhone(PhoneEmbeddedRecord value) {
        set(46, value);
    }

    /**
     * Getter for <code>public.resume.work_phone</code>.
     */
    public PhoneEmbeddedRecord getWorkPhone() {
        return (PhoneEmbeddedRecord) get(46);
    }

    /**
     * Setter for <code>public.resume.cell_phone</code>.
     */
    public void setCellPhone(PhoneEmbeddedRecord value) {
        set(47, value);
    }

    /**
     * Getter for <code>public.resume.cell_phone</code>.
     */
    public PhoneEmbeddedRecord getCellPhone() {
        return (PhoneEmbeddedRecord) get(47);
    }

    /**
     * Setter for <code>public.resume.moderation_flags_mask</code>.
     */
    public void setModerationFlagsMask(Integer value) {
        set(48, value);
    }

    /**
     * Getter for <code>public.resume.moderation_flags_mask</code>.
     */
    public Integer getModerationFlagsMask() {
        return (Integer) get(48);
    }

    /**
     * Setter for <code>public.resume.auto_approve_decision</code>.
     */
    public void setAutoApproveDecision(Boolean value) {
        set(49, value);
    }

    /**
     * Getter for <code>public.resume.auto_approve_decision</code>.
     */
    public Boolean getAutoApproveDecision() {
        return (Boolean) get(49);
    }

    /**
     * Setter for <code>public.resume.auto_moderation_flags_mask</code>.
     */
    public void setAutoModerationFlagsMask(Integer value) {
        set(50, value);
    }

    /**
     * Getter for <code>public.resume.auto_moderation_flags_mask</code>.
     */
    public Integer getAutoModerationFlagsMask() {
        return (Integer) get(50);
    }

    /**
     * Setter for <code>public.resume.moderation_approve_score</code>.
     */
    public void setModerationApproveScore(Double value) {
        set(51, value);
    }

    /**
     * Getter for <code>public.resume.moderation_approve_score</code>.
     */
    public Double getModerationApproveScore() {
        return (Double) get(51);
    }

    /**
     * Setter for <code>public.resume.auto_block_decision</code>.
     */
    public void setAutoBlockDecision(Boolean value) {
        set(52, value);
    }

    /**
     * Getter for <code>public.resume.auto_block_decision</code>.
     */
    public Boolean getAutoBlockDecision() {
        return (Boolean) get(52);
    }

    /**
     * Setter for <code>public.resume.moderation_block_score</code>.
     */
    public void setModerationBlockScore(Double value) {
        set(53, value);
    }

    /**
     * Getter for <code>public.resume.moderation_block_score</code>.
     */
    public Double getModerationBlockScore() {
        return (Double) get(53);
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
     * Create a detached ResumeRecord
     */
    public ResumeRecord() {
        super(Resume.RESUME);
    }

    /**
     * Create a detached, initialised ResumeRecord
     */
    public ResumeRecord(Integer resumeId, Integer userId, String firstName, String middleName, String lastName, Integer gender, LocalDateTime birthDay, Integer educationId, Integer workExperience, Long desireableCompensation, Integer areaId, Integer relocation, String email, String homeAddress, Integer preferedLink, Integer accessType, String lang, Integer isFinished, LocalDateTime creationTime, LocalDateTime lastChangeTime, Integer step, Integer moderatorUserId, LocalDateTime moderateTime, LocalDateTime moderateAssignTime, Integer source, Integer lastExperienceId, String post, Integer metroStationId, Integer roadTimeType, Integer platformCode, Integer resumePhotoId, Integer siteId, String desireableCompensationCurrencyCode, LocalDateTime markExpireTime, String secretWord, Integer businessTripReadiness, Integer moderationNotesMask, LocalDateTime renewalExpireTime, Boolean disabled, Integer workExperienceMonthCount, LocalDateTime workExperienceCalculationTime, Integer careerGuidanceResultId, Short[] employments, Short[] workSchedules, LocalDateTime replicationHeartbeat, PhoneEmbeddedRecord homePhone, PhoneEmbeddedRecord workPhone, PhoneEmbeddedRecord cellPhone, Integer moderationFlagsMask, Boolean autoApproveDecision, Integer autoModerationFlagsMask, Double moderationApproveScore, Boolean autoBlockDecision, Double moderationBlockScore) {
        super(Resume.RESUME);

        set(0, resumeId);
        set(1, userId);
        set(2, firstName);
        set(3, middleName);
        set(4, lastName);
        set(5, gender);
        set(6, birthDay);
        set(7, educationId);
        set(8, workExperience);
        set(9, desireableCompensation);
        set(10, areaId);
        set(11, relocation);
        set(12, email);
        set(13, homeAddress);
        set(14, preferedLink);
        set(15, accessType);
        set(16, lang);
        set(17, isFinished);
        set(18, creationTime);
        set(19, lastChangeTime);
        set(20, step);
        set(21, moderatorUserId);
        set(22, moderateTime);
        set(23, moderateAssignTime);
        set(24, source);
        set(25, lastExperienceId);
        set(26, post);
        set(27, metroStationId);
        set(28, roadTimeType);
        set(29, platformCode);
        set(30, resumePhotoId);
        set(31, siteId);
        set(32, desireableCompensationCurrencyCode);
        set(33, markExpireTime);
        set(34, secretWord);
        set(35, businessTripReadiness);
        set(36, moderationNotesMask);
        set(37, renewalExpireTime);
        set(38, disabled);
        set(39, workExperienceMonthCount);
        set(40, workExperienceCalculationTime);
        set(41, careerGuidanceResultId);
        set(42, employments);
        set(43, workSchedules);
        set(44, replicationHeartbeat);
        set(45, homePhone);
        set(46, workPhone);
        set(47, cellPhone);
        set(48, moderationFlagsMask);
        set(49, autoApproveDecision);
        set(50, autoModerationFlagsMask);
        set(51, moderationApproveScore);
        set(52, autoBlockDecision);
        set(53, moderationBlockScore);
    }
}
