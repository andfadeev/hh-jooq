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

import ru.hh.jooq.tables.ClassificationValues;


/**
 * Список типов классификаций у работодателя или холдинга. Перенесено из схемы 
 * hhservice.hhemployer по задаче HH-38267
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassificationValuesRecord extends UpdatableRecordImpl<ClassificationValuesRecord> implements Record6<String, Integer, String, Integer, Integer, String> {

    private static final long serialVersionUID = 1290863969;

    /**
     * Setter for <code>public.classification_values.holding_code</code>.
     */
    public void setHoldingCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.classification_values.holding_code</code>.
     */
    public String getHoldingCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.classification_values.employer_id</code>.
     */
    public void setEmployerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.classification_values.employer_id</code>.
     */
    public Integer getEmployerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.classification_values.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.classification_values.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.classification_values.position</code>.
     */
    public void setPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.classification_values.position</code>.
     */
    public Integer getPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.classification_values.classification_values_id</code>.
     */
    public void setClassificationValuesId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.classification_values.classification_values_id</code>.
     */
    public Integer getClassificationValuesId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.classification_values.classification_name</code>.
     */
    public void setClassificationName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.classification_values.classification_name</code>.
     */
    public String getClassificationName() {
        return (String) get(5);
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
    public Row6<String, Integer, String, Integer, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Integer, String, Integer, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ClassificationValues.CLASSIFICATION_VALUES.HOLDING_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ClassificationValues.CLASSIFICATION_VALUES.EMPLOYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClassificationValues.CLASSIFICATION_VALUES.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ClassificationValues.CLASSIFICATION_VALUES.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ClassificationValues.CLASSIFICATION_VALUES.CLASSIFICATION_VALUES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ClassificationValues.CLASSIFICATION_VALUES.CLASSIFICATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHoldingCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEmployerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getClassificationValuesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClassificationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value1(String value) {
        setHoldingCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value2(Integer value) {
        setEmployerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value4(Integer value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value5(Integer value) {
        setClassificationValuesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord value6(String value) {
        setClassificationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClassificationValuesRecord values(String value1, Integer value2, String value3, Integer value4, Integer value5, String value6) {
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
     * Create a detached ClassificationValuesRecord
     */
    public ClassificationValuesRecord() {
        super(ClassificationValues.CLASSIFICATION_VALUES);
    }

    /**
     * Create a detached, initialised ClassificationValuesRecord
     */
    public ClassificationValuesRecord(String holdingCode, Integer employerId, String code, Integer position, Integer classificationValuesId, String classificationName) {
        super(ClassificationValues.CLASSIFICATION_VALUES);

        set(0, holdingCode);
        set(1, employerId);
        set(2, code);
        set(3, position);
        set(4, classificationValuesId);
        set(5, classificationName);
    }
}