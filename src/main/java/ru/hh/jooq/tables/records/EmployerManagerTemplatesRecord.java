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

import ru.hh.jooq.tables.EmployerManagerTemplates;


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
public class EmployerManagerTemplatesRecord extends UpdatableRecordImpl<EmployerManagerTemplatesRecord> implements Record4<Integer, Integer, String, Short> {

    private static final long serialVersionUID = 919507768;

    /**
     * Setter for <code>public.employer_manager_templates.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employer_manager_templates.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.employer_manager_templates.employer_manager_id</code>.
     */
    public void setEmployerManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employer_manager_templates.employer_manager_id</code>.
     */
    public Integer getEmployerManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.employer_manager_templates.template</code>.
     */
    public void setTemplate(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employer_manager_templates.template</code>.
     */
    public String getTemplate() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employer_manager_templates.type</code>.
     */
    public void setType(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employer_manager_templates.type</code>.
     */
    public Short getType() {
        return (Short) get(3);
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
    public Row4<Integer, Integer, String, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES.EMPLOYER_MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES.TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES.TYPE;
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
    public Integer value2() {
        return getEmployerManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerTemplatesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerTemplatesRecord value2(Integer value) {
        setEmployerManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerTemplatesRecord value3(String value) {
        setTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerTemplatesRecord value4(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerManagerTemplatesRecord values(Integer value1, Integer value2, String value3, Short value4) {
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
     * Create a detached EmployerManagerTemplatesRecord
     */
    public EmployerManagerTemplatesRecord() {
        super(EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES);
    }

    /**
     * Create a detached, initialised EmployerManagerTemplatesRecord
     */
    public EmployerManagerTemplatesRecord(Integer id, Integer employerManagerId, String template, Short type) {
        super(EmployerManagerTemplates.EMPLOYER_MANAGER_TEMPLATES);

        set(0, id);
        set(1, employerManagerId);
        set(2, template);
        set(3, type);
    }
}
