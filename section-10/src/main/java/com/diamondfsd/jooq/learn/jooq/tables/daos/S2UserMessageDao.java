/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq.tables.daos;


import com.diamondfsd.jooq.learn.extend.AbstractExtendDAOImpl;
import com.diamondfsd.jooq.learn.jooq.tables.TS2UserMessage;
import com.diamondfsd.jooq.learn.jooq.tables.records.S2UserMessageRecord;
import com.diamondfsd.jooq.learn.pojos.S2UserMessage;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 用户消息内容
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class S2UserMessageDao extends AbstractExtendDAOImpl<S2UserMessageRecord, S2UserMessage, Integer> {

    /**
     * Create a new S2UserMessageDao without any configuration
     */
    public S2UserMessageDao() {
        super(TS2UserMessage.S2_USER_MESSAGE, S2UserMessage.class);
    }

    /**
     * Create a new S2UserMessageDao with an attached configuration
     */
    @Autowired
    public S2UserMessageDao(Configuration configuration) {
        super(TS2UserMessage.S2_USER_MESSAGE, S2UserMessage.class, configuration);
    }

    @Override
    public Integer getId(S2UserMessage object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<S2UserMessage> fetchById(Integer... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public S2UserMessage fetchOneById(Integer value) {
        return fetchOne(TS2UserMessage.S2_USER_MESSAGE.ID, value);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfUserId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<S2UserMessage> fetchByUserId(Integer... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>message_title BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfMessageTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.MESSAGE_TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>message_title IN (values)</code>
     */
    public List<S2UserMessage> fetchByMessageTitle(String... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.MESSAGE_TITLE, values);
    }

    /**
     * Fetch records that have <code>message_content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfMessageContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.MESSAGE_CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>message_content IN (values)</code>
     */
    public List<S2UserMessage> fetchByMessageContent(String... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.MESSAGE_CONTENT, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfCreateTime(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<S2UserMessage> fetchByCreateTime(Timestamp... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<S2UserMessage> fetchRangeOfUpdateTime(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(TS2UserMessage.S2_USER_MESSAGE.UPDATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<S2UserMessage> fetchByUpdateTime(Timestamp... values) {
        return fetch(TS2UserMessage.S2_USER_MESSAGE.UPDATE_TIME, values);
    }
}
