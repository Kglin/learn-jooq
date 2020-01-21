/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables.pojos;


import com.diamondfsd.jooq.learn.jooq.tables.interfaces.IS4ColumenGt22;

import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 表字段超22
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class S4ColumenGt22Pojo implements IS4ColumenGt22 {

    private static final long serialVersionUID = -1389550183;

    private Integer   id;
    private Integer   column_1;
    private Integer   column_2;
    private Integer   column_3;
    private Integer   column_4;
    private Integer   column_5;
    private Integer   column_6;
    private Integer   column_7;
    private Integer   column_8;
    private Integer   column_9;
    private Integer   column_10;
    private Integer   column_11;
    private Integer   column_12;
    private Integer   column_13;
    private Integer   column_14;
    private Integer   column_15;
    private String    column_16;
    private String    column_17;
    private String    column_18;
    private Timestamp column_19;
    private Boolean   column_20;
    private Byte      column_21;
    private Integer   column_22;
    private Integer   column_23;
    private Timestamp createTime;
    private Timestamp updateTime;

    public S4ColumenGt22Pojo() {}

    public S4ColumenGt22Pojo(IS4ColumenGt22 value) {
        this.id = value.getId();
        this.column_1 = value.getColumn_1();
        this.column_2 = value.getColumn_2();
        this.column_3 = value.getColumn_3();
        this.column_4 = value.getColumn_4();
        this.column_5 = value.getColumn_5();
        this.column_6 = value.getColumn_6();
        this.column_7 = value.getColumn_7();
        this.column_8 = value.getColumn_8();
        this.column_9 = value.getColumn_9();
        this.column_10 = value.getColumn_10();
        this.column_11 = value.getColumn_11();
        this.column_12 = value.getColumn_12();
        this.column_13 = value.getColumn_13();
        this.column_14 = value.getColumn_14();
        this.column_15 = value.getColumn_15();
        this.column_16 = value.getColumn_16();
        this.column_17 = value.getColumn_17();
        this.column_18 = value.getColumn_18();
        this.column_19 = value.getColumn_19();
        this.column_20 = value.getColumn_20();
        this.column_21 = value.getColumn_21();
        this.column_22 = value.getColumn_22();
        this.column_23 = value.getColumn_23();
        this.createTime = value.getCreateTime();
        this.updateTime = value.getUpdateTime();
    }

    public S4ColumenGt22Pojo(
        Integer   id,
        Integer   column_1,
        Integer   column_2,
        Integer   column_3,
        Integer   column_4,
        Integer   column_5,
        Integer   column_6,
        Integer   column_7,
        Integer   column_8,
        Integer   column_9,
        Integer   column_10,
        Integer   column_11,
        Integer   column_12,
        Integer   column_13,
        Integer   column_14,
        Integer   column_15,
        String    column_16,
        String    column_17,
        String    column_18,
        Timestamp column_19,
        Boolean   column_20,
        Byte      column_21,
        Integer   column_22,
        Integer   column_23,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.column_1 = column_1;
        this.column_2 = column_2;
        this.column_3 = column_3;
        this.column_4 = column_4;
        this.column_5 = column_5;
        this.column_6 = column_6;
        this.column_7 = column_7;
        this.column_8 = column_8;
        this.column_9 = column_9;
        this.column_10 = column_10;
        this.column_11 = column_11;
        this.column_12 = column_12;
        this.column_13 = column_13;
        this.column_14 = column_14;
        this.column_15 = column_15;
        this.column_16 = column_16;
        this.column_17 = column_17;
        this.column_18 = column_18;
        this.column_19 = column_19;
        this.column_20 = column_20;
        this.column_21 = column_21;
        this.column_22 = column_22;
        this.column_23 = column_23;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getColumn_1() {
        return this.column_1;
    }

    @Override
    public void setColumn_1(Integer column_1) {
        this.column_1 = column_1;
    }

    @Override
    public Integer getColumn_2() {
        return this.column_2;
    }

    @Override
    public void setColumn_2(Integer column_2) {
        this.column_2 = column_2;
    }

    @Override
    public Integer getColumn_3() {
        return this.column_3;
    }

    @Override
    public void setColumn_3(Integer column_3) {
        this.column_3 = column_3;
    }

    @Override
    public Integer getColumn_4() {
        return this.column_4;
    }

    @Override
    public void setColumn_4(Integer column_4) {
        this.column_4 = column_4;
    }

    @Override
    public Integer getColumn_5() {
        return this.column_5;
    }

    @Override
    public void setColumn_5(Integer column_5) {
        this.column_5 = column_5;
    }

    @Override
    public Integer getColumn_6() {
        return this.column_6;
    }

    @Override
    public void setColumn_6(Integer column_6) {
        this.column_6 = column_6;
    }

    @Override
    public Integer getColumn_7() {
        return this.column_7;
    }

    @Override
    public void setColumn_7(Integer column_7) {
        this.column_7 = column_7;
    }

    @Override
    public Integer getColumn_8() {
        return this.column_8;
    }

    @Override
    public void setColumn_8(Integer column_8) {
        this.column_8 = column_8;
    }

    @Override
    public Integer getColumn_9() {
        return this.column_9;
    }

    @Override
    public void setColumn_9(Integer column_9) {
        this.column_9 = column_9;
    }

    @Override
    public Integer getColumn_10() {
        return this.column_10;
    }

    @Override
    public void setColumn_10(Integer column_10) {
        this.column_10 = column_10;
    }

    @Override
    public Integer getColumn_11() {
        return this.column_11;
    }

    @Override
    public void setColumn_11(Integer column_11) {
        this.column_11 = column_11;
    }

    @Override
    public Integer getColumn_12() {
        return this.column_12;
    }

    @Override
    public void setColumn_12(Integer column_12) {
        this.column_12 = column_12;
    }

    @Override
    public Integer getColumn_13() {
        return this.column_13;
    }

    @Override
    public void setColumn_13(Integer column_13) {
        this.column_13 = column_13;
    }

    @Override
    public Integer getColumn_14() {
        return this.column_14;
    }

    @Override
    public void setColumn_14(Integer column_14) {
        this.column_14 = column_14;
    }

    @Override
    public Integer getColumn_15() {
        return this.column_15;
    }

    @Override
    public void setColumn_15(Integer column_15) {
        this.column_15 = column_15;
    }

    @Override
    public String getColumn_16() {
        return this.column_16;
    }

    @Override
    public void setColumn_16(String column_16) {
        this.column_16 = column_16;
    }

    @Override
    public String getColumn_17() {
        return this.column_17;
    }

    @Override
    public void setColumn_17(String column_17) {
        this.column_17 = column_17;
    }

    @Override
    public String getColumn_18() {
        return this.column_18;
    }

    @Override
    public void setColumn_18(String column_18) {
        this.column_18 = column_18;
    }

    @Override
    public Timestamp getColumn_19() {
        return this.column_19;
    }

    @Override
    public void setColumn_19(Timestamp column_19) {
        this.column_19 = column_19;
    }

    @Override
    public Boolean getColumn_20() {
        return this.column_20;
    }

    @Override
    public void setColumn_20(Boolean column_20) {
        this.column_20 = column_20;
    }

    @Override
    public Byte getColumn_21() {
        return this.column_21;
    }

    @Override
    public void setColumn_21(Byte column_21) {
        this.column_21 = column_21;
    }

    @Override
    public Integer getColumn_22() {
        return this.column_22;
    }

    @Override
    public void setColumn_22(Integer column_22) {
        this.column_22 = column_22;
    }

    @Override
    public Integer getColumn_23() {
        return this.column_23;
    }

    @Override
    public void setColumn_23(Integer column_23) {
        this.column_23 = column_23;
    }

    @Override
    public Timestamp getCreateTime() {
        return this.createTime;
    }

    @Override
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("S4ColumenGt22Pojo (");

        sb.append(id);
        sb.append(", ").append(column_1);
        sb.append(", ").append(column_2);
        sb.append(", ").append(column_3);
        sb.append(", ").append(column_4);
        sb.append(", ").append(column_5);
        sb.append(", ").append(column_6);
        sb.append(", ").append(column_7);
        sb.append(", ").append(column_8);
        sb.append(", ").append(column_9);
        sb.append(", ").append(column_10);
        sb.append(", ").append(column_11);
        sb.append(", ").append(column_12);
        sb.append(", ").append(column_13);
        sb.append(", ").append(column_14);
        sb.append(", ").append(column_15);
        sb.append(", ").append(column_16);
        sb.append(", ").append(column_17);
        sb.append(", ").append(column_18);
        sb.append(", ").append(column_19);
        sb.append(", ").append(column_20);
        sb.append(", ").append(column_21);
        sb.append(", ").append(column_22);
        sb.append(", ").append(column_23);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IS4ColumenGt22 from) {
        setId(from.getId());
        setColumn_1(from.getColumn_1());
        setColumn_2(from.getColumn_2());
        setColumn_3(from.getColumn_3());
        setColumn_4(from.getColumn_4());
        setColumn_5(from.getColumn_5());
        setColumn_6(from.getColumn_6());
        setColumn_7(from.getColumn_7());
        setColumn_8(from.getColumn_8());
        setColumn_9(from.getColumn_9());
        setColumn_10(from.getColumn_10());
        setColumn_11(from.getColumn_11());
        setColumn_12(from.getColumn_12());
        setColumn_13(from.getColumn_13());
        setColumn_14(from.getColumn_14());
        setColumn_15(from.getColumn_15());
        setColumn_16(from.getColumn_16());
        setColumn_17(from.getColumn_17());
        setColumn_18(from.getColumn_18());
        setColumn_19(from.getColumn_19());
        setColumn_20(from.getColumn_20());
        setColumn_21(from.getColumn_21());
        setColumn_22(from.getColumn_22());
        setColumn_23(from.getColumn_23());
        setCreateTime(from.getCreateTime());
        setUpdateTime(from.getUpdateTime());
    }

    @Override
    public <E extends IS4ColumenGt22> E into(E into) {
        into.from(this);
        return into;
    }
}
