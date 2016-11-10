/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.FavoriteResumeFolder;


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
public class FavoriteResumeFolderRecord extends UpdatableRecordImpl<FavoriteResumeFolderRecord> implements Record6<Integer, Integer, String, Integer, Boolean, Boolean> {

    private static final long serialVersionUID = -2051303105;

    /**
     * Setter for <code>public.favorite_resume_folder.favorite_resume_folder_id</code>.
     */
    public void setFavoriteResumeFolderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.favorite_resume_folder_id</code>.
     */
    public Integer getFavoriteResumeFolderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.favorite_resume_folder.owning_employer_manager_id</code>.
     */
    public void setOwningEmployerManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.owning_employer_manager_id</code>.
     */
    public Integer getOwningEmployerManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.favorite_resume_folder.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.favorite_resume_folder.access_type</code>.
     */
    public void setAccessType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.access_type</code>.
     */
    public Integer getAccessType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.favorite_resume_folder.trash</code>.
     */
    public void setTrash(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.trash</code>.
     */
    public Boolean getTrash() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.favorite_resume_folder.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.favorite_resume_folder.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Boolean, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Boolean, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.FAVORITE_RESUME_FOLDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.OWNING_EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.ACCESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.TRASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return FavoriteResumeFolder.FAVORITE_RESUME_FOLDER.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFavoriteResumeFolderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOwningEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAccessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getTrash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value1(Integer value) {
        setFavoriteResumeFolderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value2(Integer value) {
        setOwningEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value4(Integer value) {
        setAccessType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value5(Boolean value) {
        setTrash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord value6(Boolean value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FavoriteResumeFolderRecord values(Integer value1, Integer value2, String value3, Integer value4, Boolean value5, Boolean value6) {
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
     * Create a detached FavoriteResumeFolderRecord
     */
    public FavoriteResumeFolderRecord() {
        super(FavoriteResumeFolder.FAVORITE_RESUME_FOLDER);
    }

    /**
     * Create a detached, initialised FavoriteResumeFolderRecord
     */
    public FavoriteResumeFolderRecord(Integer favoriteResumeFolderId, Integer owningEmployerManagerId, String name, Integer accessType, Boolean trash, Boolean deleted) {
        super(FavoriteResumeFolder.FAVORITE_RESUME_FOLDER);

        set(0, favoriteResumeFolderId);
        set(1, owningEmployerManagerId);
        set(2, name);
        set(3, accessType);
        set(4, trash);
        set(5, deleted);
    }
}
