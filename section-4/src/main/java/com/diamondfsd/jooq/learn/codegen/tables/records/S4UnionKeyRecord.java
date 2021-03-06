/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.tables.records;


import com.diamondfsd.jooq.learn.codegen.tables.TS4UnionKey;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S4UnionKeyRecord extends UpdatableRecordImpl<S4UnionKeyRecord> implements Record4<Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 335109585;

    /**
     * Setter for <code>learn-jooq.s4_union_key.uk_1</code>. 联合ID1
     */
    public void setUk_1(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_union_key.uk_1</code>. 联合ID1
     */
    public Integer getUk_1() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>learn-jooq.s4_union_key.uk_2</code>. 联合ID2
     */
    public void setUk_2(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_union_key.uk_2</code>. 联合ID2
     */
    public Integer getUk_2() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>learn-jooq.s4_union_key.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_union_key.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>learn-jooq.s4_union_key.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>learn-jooq.s4_union_key.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TS4UnionKey.S4_UNION_KEY.UK_1;
    }

    @Override
    public Field<Integer> field2() {
        return TS4UnionKey.S4_UNION_KEY.UK_2;
    }

    @Override
    public Field<Timestamp> field3() {
        return TS4UnionKey.S4_UNION_KEY.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field4() {
        return TS4UnionKey.S4_UNION_KEY.UPDATE_TIME;
    }

    @Override
    public Integer component1() {
        return getUk_1();
    }

    @Override
    public Integer component2() {
        return getUk_2();
    }

    @Override
    public Timestamp component3() {
        return getCreateTime();
    }

    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    @Override
    public Integer value1() {
        return getUk_1();
    }

    @Override
    public Integer value2() {
        return getUk_2();
    }

    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    @Override
    public S4UnionKeyRecord value1(Integer value) {
        setUk_1(value);
        return this;
    }

    @Override
    public S4UnionKeyRecord value2(Integer value) {
        setUk_2(value);
        return this;
    }

    @Override
    public S4UnionKeyRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public S4UnionKeyRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public S4UnionKeyRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached S4UnionKeyRecord
     */
    public S4UnionKeyRecord() {
        super(TS4UnionKey.S4_UNION_KEY);
    }

    /**
     * Create a detached, initialised S4UnionKeyRecord
     */
    public S4UnionKeyRecord(Integer uk_1, Integer uk_2, Timestamp createTime, Timestamp updateTime) {
        super(TS4UnionKey.S4_UNION_KEY);

        set(0, uk_1);
        set(1, uk_2);
        set(2, createTime);
        set(3, updateTime);
    }
}
