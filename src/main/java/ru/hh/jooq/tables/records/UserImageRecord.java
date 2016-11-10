/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.UserImage;


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
public class UserImageRecord extends UpdatableRecordImpl<UserImageRecord> implements Record6<Long, LocalDateTime, String, String, Integer, Integer> {

    private static final long serialVersionUID = -35670683;

    /**
     * Setter for <code>public.user_image.user_image_id</code>.
     */
    public void setUserImageId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_image.user_image_id</code>.
     */
    public Long getUserImageId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user_image.creation_time</code>.
     */
    public void setCreationTime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_image.creation_time</code>.
     */
    public LocalDateTime getCreationTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.user_image.original_url</code>.
     */
    public void setOriginalUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_image.original_url</code>.
     */
    public String getOriginalUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user_image.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user_image.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user_image.type</code>.
     */
    public void setType(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user_image.type</code>.
     */
    public Integer getType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.user_image.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user_image.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, LocalDateTime, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, LocalDateTime, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserImage.USER_IMAGE.USER_IMAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return UserImage.USER_IMAGE.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserImage.USER_IMAGE.ORIGINAL_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserImage.USER_IMAGE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserImage.USER_IMAGE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return UserImage.USER_IMAGE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUserImageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOriginalUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value1(Long value) {
        setUserImageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value2(LocalDateTime value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value3(String value) {
        setOriginalUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value5(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserImageRecord values(Long value1, LocalDateTime value2, String value3, String value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserImageRecord
     */
    public UserImageRecord() {
        super(UserImage.USER_IMAGE);
    }

    /**
     * Create a detached, initialised UserImageRecord
     */
    public UserImageRecord(Long userImageId, LocalDateTime creationTime, String originalUrl, String title, Integer type, Integer userId) {
        super(UserImage.USER_IMAGE);

        set(0, userImageId);
        set(1, creationTime);
        set(2, originalUrl);
        set(3, title);
        set(4, type);
        set(5, userId);
    }
}
