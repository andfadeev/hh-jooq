/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ResumePortfolioRecord;


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
public class ResumePortfolio extends TableImpl<ResumePortfolioRecord> {

    private static final long serialVersionUID = -819276060;

    /**
     * The reference instance of <code>public.resume_portfolio</code>
     */
    public static final ResumePortfolio RESUME_PORTFOLIO = new ResumePortfolio();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResumePortfolioRecord> getRecordType() {
        return ResumePortfolioRecord.class;
    }

    /**
     * The column <code>public.resume_portfolio.resume_portfolio_id</code>.
     */
    public final TableField<ResumePortfolioRecord, Integer> RESUME_PORTFOLIO_ID = createField("resume_portfolio_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('resume_portfolio_resume_portfolio_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.resume_portfolio.attachment_date</code>.
     */
    public final TableField<ResumePortfolioRecord, LocalDateTime> ATTACHMENT_DATE = createField("attachment_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>public.resume_portfolio.resume_id</code>.
     */
    public final TableField<ResumePortfolioRecord, Integer> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.resume_portfolio.user_image_id</code>.
     */
    public final TableField<ResumePortfolioRecord, Integer> USER_IMAGE_ID = createField("user_image_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.resume_portfolio</code> table reference
     */
    public ResumePortfolio() {
        this("resume_portfolio", null);
    }

    /**
     * Create an aliased <code>public.resume_portfolio</code> table reference
     */
    public ResumePortfolio(String alias) {
        this(alias, RESUME_PORTFOLIO);
    }

    private ResumePortfolio(String alias, Table<ResumePortfolioRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResumePortfolio(String alias, Table<ResumePortfolioRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ResumePortfolioRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESUME_PORTFOLIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResumePortfolioRecord> getPrimaryKey() {
        return Keys.RESUME_PORTFOLIO_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResumePortfolioRecord>> getKeys() {
        return Arrays.<UniqueKey<ResumePortfolioRecord>>asList(Keys.RESUME_PORTFOLIO_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ResumePortfolioRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ResumePortfolioRecord, ?>>asList(Keys.RESUME_PORTFOLIO__FK4E0533B6B5C0798D, Keys.RESUME_PORTFOLIO__RESUME_PORTFOLIO_IMAGE_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResumePortfolio as(String alias) {
        return new ResumePortfolio(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResumePortfolio rename(String name) {
        return new ResumePortfolio(name, null);
    }
}
