/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BillingTemplate implements Serializable {

    private static final long serialVersionUID = -1695213325;

    private final Integer       billingTemplateId;
    private final LocalDateTime creationTime;
    private final Integer       type;
    private final Integer       siteId;
    private final Integer       lang;
    private final Integer       templateFileId;

    public BillingTemplate(BillingTemplate value) {
        this.billingTemplateId = value.billingTemplateId;
        this.creationTime = value.creationTime;
        this.type = value.type;
        this.siteId = value.siteId;
        this.lang = value.lang;
        this.templateFileId = value.templateFileId;
    }

    public BillingTemplate(
        Integer       billingTemplateId,
        LocalDateTime creationTime,
        Integer       type,
        Integer       siteId,
        Integer       lang,
        Integer       templateFileId
    ) {
        this.billingTemplateId = billingTemplateId;
        this.creationTime = creationTime;
        this.type = type;
        this.siteId = siteId;
        this.lang = lang;
        this.templateFileId = templateFileId;
    }

    public Integer getBillingTemplateId() {
        return this.billingTemplateId;
    }

    public LocalDateTime getCreationTime() {
        return this.creationTime;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSiteId() {
        return this.siteId;
    }

    public Integer getLang() {
        return this.lang;
    }

    public Integer getTemplateFileId() {
        return this.templateFileId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BillingTemplate (");

        sb.append(billingTemplateId);
        sb.append(", ").append(creationTime);
        sb.append(", ").append(type);
        sb.append(", ").append(siteId);
        sb.append(", ").append(lang);
        sb.append(", ").append(templateFileId);

        sb.append(")");
        return sb.toString();
    }
}