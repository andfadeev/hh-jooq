/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.hh.jooq.tables.ResumePersonalSite;


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
public class ResumePersonalSiteRecord extends UpdatableRecordImpl<ResumePersonalSiteRecord> implements Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = -2032463360;

    /**
     * Setter for <code>public.resume_personal_site.resume_personal_site_id</code>.
     */
    public void setResumePersonalSiteId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.resume_personal_site.resume_personal_site_id</code>.
     */
    public Integer getResumePersonalSiteId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.resume_personal_site.resume_id</code>.
     */
    public void setResumeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.resume_personal_site.resume_id</code>.
     */
    public Integer getResumeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.resume_personal_site.type</code>.
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.resume_personal_site.type</code>.
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.resume_personal_site.url</code>.
     */
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.resume_personal_site.url</code>.
     */
    public String getUrl() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ResumePersonalSite.RESUME_PERSONAL_SITE.RESUME_PERSONAL_SITE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ResumePersonalSite.RESUME_PERSONAL_SITE.RESUME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ResumePersonalSite.RESUME_PERSONAL_SITE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ResumePersonalSite.RESUME_PERSONAL_SITE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getResumePersonalSiteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getResumeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePersonalSiteRecord value1(Integer value) {
        setResumePersonalSiteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePersonalSiteRecord value2(Integer value) {
        setResumeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePersonalSiteRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePersonalSiteRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePersonalSiteRecord values(Integer value1, Integer value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResumePersonalSiteRecord
     */
    public ResumePersonalSiteRecord() {
        super(ResumePersonalSite.RESUME_PERSONAL_SITE);
    }

    /**
     * Create a detached, initialised ResumePersonalSiteRecord
     */
    public ResumePersonalSiteRecord(Integer resumePersonalSiteId, Integer resumeId, Integer type, String url) {
        super(ResumePersonalSite.RESUME_PERSONAL_SITE);

        set(0, resumePersonalSiteId);
        set(1, resumeId);
        set(2, type);
        set(3, url);
    }
}
