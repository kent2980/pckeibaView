package com.pckeiba.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JvdSanrentanHyosuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public JvdSanrentanHyosuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRaceCodeIsNull() {
            addCriterion("RACE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRaceCodeIsNotNull() {
            addCriterion("RACE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRaceCodeEqualTo(String value) {
            addCriterion("RACE_CODE =", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeNotEqualTo(String value) {
            addCriterion("RACE_CODE <>", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeGreaterThan(String value) {
            addCriterion("RACE_CODE >", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RACE_CODE >=", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeLessThan(String value) {
            addCriterion("RACE_CODE <", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeLessThanOrEqualTo(String value) {
            addCriterion("RACE_CODE <=", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeLike(String value) {
            addCriterion("RACE_CODE like", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeNotLike(String value) {
            addCriterion("RACE_CODE not like", value, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeIn(List<String> values) {
            addCriterion("RACE_CODE in", values, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeNotIn(List<String> values) {
            addCriterion("RACE_CODE not in", values, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeBetween(String value1, String value2) {
            addCriterion("RACE_CODE between", value1, value2, "raceCode");
            return (Criteria) this;
        }

        public Criteria andRaceCodeNotBetween(String value1, String value2) {
            addCriterion("RACE_CODE not between", value1, value2, "raceCode");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1IsNull() {
            addCriterion("SANRENTAN_KUMIBAN1 is null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1IsNotNull() {
            addCriterion("SANRENTAN_KUMIBAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1EqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 =", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1NotEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 <>", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1GreaterThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 >", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1GreaterThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 >=", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1LessThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 <", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1LessThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 <=", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1Like(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 like", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1NotLike(String value) {
            addCriterion("SANRENTAN_KUMIBAN1 not like", value, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1In(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN1 in", values, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1NotIn(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN1 not in", values, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1Between(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN1 between", value1, value2, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban1NotBetween(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN1 not between", value1, value2, "sanrentanKumiban1");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2IsNull() {
            addCriterion("SANRENTAN_KUMIBAN2 is null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2IsNotNull() {
            addCriterion("SANRENTAN_KUMIBAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2EqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 =", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2NotEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 <>", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2GreaterThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 >", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2GreaterThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 >=", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2LessThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 <", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2LessThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 <=", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2Like(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 like", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2NotLike(String value) {
            addCriterion("SANRENTAN_KUMIBAN2 not like", value, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2In(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN2 in", values, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2NotIn(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN2 not in", values, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2Between(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN2 between", value1, value2, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban2NotBetween(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN2 not between", value1, value2, "sanrentanKumiban2");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3IsNull() {
            addCriterion("SANRENTAN_KUMIBAN3 is null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3IsNotNull() {
            addCriterion("SANRENTAN_KUMIBAN3 is not null");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3EqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 =", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3NotEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 <>", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3GreaterThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 >", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3GreaterThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 >=", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3LessThan(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 <", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3LessThanOrEqualTo(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 <=", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3Like(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 like", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3NotLike(String value) {
            addCriterion("SANRENTAN_KUMIBAN3 not like", value, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3In(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN3 in", values, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3NotIn(List<String> values) {
            addCriterion("SANRENTAN_KUMIBAN3 not in", values, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3Between(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN3 between", value1, value2, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andSanrentanKumiban3NotBetween(String value1, String value2) {
            addCriterion("SANRENTAN_KUMIBAN3 not between", value1, value2, "sanrentanKumiban3");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIsNull() {
            addCriterion("INSERT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIsNotNull() {
            addCriterion("INSERT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampEqualTo(Date value) {
            addCriterion("INSERT_TIMESTAMP =", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotEqualTo(Date value) {
            addCriterion("INSERT_TIMESTAMP <>", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampGreaterThan(Date value) {
            addCriterion("INSERT_TIMESTAMP >", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIMESTAMP >=", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampLessThan(Date value) {
            addCriterion("INSERT_TIMESTAMP <", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampLessThanOrEqualTo(Date value) {
            addCriterion("INSERT_TIMESTAMP <=", value, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampIn(List<Date> values) {
            addCriterion("INSERT_TIMESTAMP in", values, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotIn(List<Date> values) {
            addCriterion("INSERT_TIMESTAMP not in", values, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIMESTAMP between", value1, value2, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andInsertTimestampNotBetween(Date value1, Date value2) {
            addCriterion("INSERT_TIMESTAMP not between", value1, value2, "insertTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNull() {
            addCriterion("UPDATE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNotNull() {
            addCriterion("UPDATE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP =", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP <>", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThan(Date value) {
            addCriterion("UPDATE_TIMESTAMP >", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP >=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThan(Date value) {
            addCriterion("UPDATE_TIMESTAMP <", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMESTAMP <=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIn(List<Date> values) {
            addCriterion("UPDATE_TIMESTAMP in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotIn(List<Date> values) {
            addCriterion("UPDATE_TIMESTAMP not in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMESTAMP between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMESTAMP not between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdIsNull() {
            addCriterion("RECORD_SHUBETSU_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdIsNotNull() {
            addCriterion("RECORD_SHUBETSU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdEqualTo(String value) {
            addCriterion("RECORD_SHUBETSU_ID =", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdNotEqualTo(String value) {
            addCriterion("RECORD_SHUBETSU_ID <>", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdGreaterThan(String value) {
            addCriterion("RECORD_SHUBETSU_ID >", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_SHUBETSU_ID >=", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdLessThan(String value) {
            addCriterion("RECORD_SHUBETSU_ID <", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_SHUBETSU_ID <=", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdLike(String value) {
            addCriterion("RECORD_SHUBETSU_ID like", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdNotLike(String value) {
            addCriterion("RECORD_SHUBETSU_ID not like", value, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdIn(List<String> values) {
            addCriterion("RECORD_SHUBETSU_ID in", values, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdNotIn(List<String> values) {
            addCriterion("RECORD_SHUBETSU_ID not in", values, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdBetween(String value1, String value2) {
            addCriterion("RECORD_SHUBETSU_ID between", value1, value2, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andRecordShubetsuIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_SHUBETSU_ID not between", value1, value2, "recordShubetsuId");
            return (Criteria) this;
        }

        public Criteria andDataKubunIsNull() {
            addCriterion("DATA_KUBUN is null");
            return (Criteria) this;
        }

        public Criteria andDataKubunIsNotNull() {
            addCriterion("DATA_KUBUN is not null");
            return (Criteria) this;
        }

        public Criteria andDataKubunEqualTo(String value) {
            addCriterion("DATA_KUBUN =", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunNotEqualTo(String value) {
            addCriterion("DATA_KUBUN <>", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunGreaterThan(String value) {
            addCriterion("DATA_KUBUN >", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_KUBUN >=", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunLessThan(String value) {
            addCriterion("DATA_KUBUN <", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunLessThanOrEqualTo(String value) {
            addCriterion("DATA_KUBUN <=", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunLike(String value) {
            addCriterion("DATA_KUBUN like", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunNotLike(String value) {
            addCriterion("DATA_KUBUN not like", value, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunIn(List<String> values) {
            addCriterion("DATA_KUBUN in", values, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunNotIn(List<String> values) {
            addCriterion("DATA_KUBUN not in", values, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunBetween(String value1, String value2) {
            addCriterion("DATA_KUBUN between", value1, value2, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataKubunNotBetween(String value1, String value2) {
            addCriterion("DATA_KUBUN not between", value1, value2, "dataKubun");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiIsNull() {
            addCriterion("DATA_SAKUSEI_NENGAPPI is null");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiIsNotNull() {
            addCriterion("DATA_SAKUSEI_NENGAPPI is not null");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiEqualTo(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI =", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiNotEqualTo(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI <>", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiGreaterThan(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI >", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiGreaterThanOrEqualTo(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI >=", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiLessThan(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI <", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiLessThanOrEqualTo(Date value) {
            addCriterion("DATA_SAKUSEI_NENGAPPI <=", value, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiIn(List<Date> values) {
            addCriterion("DATA_SAKUSEI_NENGAPPI in", values, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiNotIn(List<Date> values) {
            addCriterion("DATA_SAKUSEI_NENGAPPI not in", values, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiBetween(Date value1, Date value2) {
            addCriterion("DATA_SAKUSEI_NENGAPPI between", value1, value2, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andDataSakuseiNengappiNotBetween(Date value1, Date value2) {
            addCriterion("DATA_SAKUSEI_NENGAPPI not between", value1, value2, "dataSakuseiNengappi");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuIsNull() {
            addCriterion("SANRENTAN_HYOSU is null");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuIsNotNull() {
            addCriterion("SANRENTAN_HYOSU is not null");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuEqualTo(Long value) {
            addCriterion("SANRENTAN_HYOSU =", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuNotEqualTo(Long value) {
            addCriterion("SANRENTAN_HYOSU <>", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuGreaterThan(Long value) {
            addCriterion("SANRENTAN_HYOSU >", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuGreaterThanOrEqualTo(Long value) {
            addCriterion("SANRENTAN_HYOSU >=", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuLessThan(Long value) {
            addCriterion("SANRENTAN_HYOSU <", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuLessThanOrEqualTo(Long value) {
            addCriterion("SANRENTAN_HYOSU <=", value, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuIn(List<Long> values) {
            addCriterion("SANRENTAN_HYOSU in", values, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuNotIn(List<Long> values) {
            addCriterion("SANRENTAN_HYOSU not in", values, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuBetween(Long value1, Long value2) {
            addCriterion("SANRENTAN_HYOSU between", value1, value2, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanHyosuNotBetween(Long value1, Long value2) {
            addCriterion("SANRENTAN_HYOSU not between", value1, value2, "sanrentanHyosu");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunIsNull() {
            addCriterion("SANRENTAN_NINKIJUN is null");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunIsNotNull() {
            addCriterion("SANRENTAN_NINKIJUN is not null");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunEqualTo(Short value) {
            addCriterion("SANRENTAN_NINKIJUN =", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunNotEqualTo(Short value) {
            addCriterion("SANRENTAN_NINKIJUN <>", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunGreaterThan(Short value) {
            addCriterion("SANRENTAN_NINKIJUN >", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunGreaterThanOrEqualTo(Short value) {
            addCriterion("SANRENTAN_NINKIJUN >=", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunLessThan(Short value) {
            addCriterion("SANRENTAN_NINKIJUN <", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunLessThanOrEqualTo(Short value) {
            addCriterion("SANRENTAN_NINKIJUN <=", value, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunIn(List<Short> values) {
            addCriterion("SANRENTAN_NINKIJUN in", values, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunNotIn(List<Short> values) {
            addCriterion("SANRENTAN_NINKIJUN not in", values, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunBetween(Short value1, Short value2) {
            addCriterion("SANRENTAN_NINKIJUN between", value1, value2, "sanrentanNinkijun");
            return (Criteria) this;
        }

        public Criteria andSanrentanNinkijunNotBetween(Short value1, Short value2) {
            addCriterion("SANRENTAN_NINKIJUN not between", value1, value2, "sanrentanNinkijun");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated do_not_delete_during_merge Thu May 02 12:36:46 GMT+09:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_sanrentan_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}