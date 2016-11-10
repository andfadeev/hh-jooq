/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.hh.jooq.Keys;
import ru.hh.jooq.Public;
import ru.hh.jooq.tables.records.ProfessionGroupKeySkillRecord;


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
public class ProfessionGroupKeySkill extends TableImpl<ProfessionGroupKeySkillRecord> {

    private static final long serialVersionUID = 2139415216;

    /**
     * The reference instance of <code>public.profession_group_key_skill</code>
     */
    public static final ProfessionGroupKeySkill PROFESSION_GROUP_KEY_SKILL = new ProfessionGroupKeySkill();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfessionGroupKeySkillRecord> getRecordType() {
        return ProfessionGroupKeySkillRecord.class;
    }

    /**
     * The column <code>public.profession_group_key_skill.profession_group_id</code>.
     */
    public final TableField<ProfessionGroupKeySkillRecord, Integer> PROFESSION_GROUP_ID = createField("profession_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.profession_group_key_skill.key_skill_id</code>.
     */
    public final TableField<ProfessionGroupKeySkillRecord, Integer> KEY_SKILL_ID = createField("key_skill_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.profession_group_key_skill</code> table reference
     */
    public ProfessionGroupKeySkill() {
        this("profession_group_key_skill", null);
    }

    /**
     * Create an aliased <code>public.profession_group_key_skill</code> table reference
     */
    public ProfessionGroupKeySkill(String alias) {
        this(alias, PROFESSION_GROUP_KEY_SKILL);
    }

    private ProfessionGroupKeySkill(String alias, Table<ProfessionGroupKeySkillRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfessionGroupKeySkill(String alias, Table<ProfessionGroupKeySkillRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ProfessionGroupKeySkillRecord> getPrimaryKey() {
        return Keys.PROFESSION_GROUP_KEY_SKILL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProfessionGroupKeySkillRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfessionGroupKeySkillRecord>>asList(Keys.PROFESSION_GROUP_KEY_SKILL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProfessionGroupKeySkillRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProfessionGroupKeySkillRecord, ?>>asList(Keys.PROFESSION_GROUP_KEY_SKILL__PROFESSION_GROUP_KEY_SKILL_PROFESSION_GROUP_ID_FKEY, Keys.PROFESSION_GROUP_KEY_SKILL__PROFESSION_GROUP_KEY_SKILL_KEY_SKILL_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfessionGroupKeySkill as(String alias) {
        return new ProfessionGroupKeySkill(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfessionGroupKeySkill rename(String name) {
        return new ProfessionGroupKeySkill(name, null);
    }
}