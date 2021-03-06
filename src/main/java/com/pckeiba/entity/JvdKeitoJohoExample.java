package com.pckeiba.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JvdKeitoJohoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public JvdKeitoJohoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
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
     * This method corresponds to the database table jvd_keito_joho
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
     * This method corresponds to the database table jvd_keito_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_keito_joho
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
     * This class corresponds to the database table jvd_keito_joho
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

        public Criteria andHanshokuTorokuBangoIsNull() {
            addCriterion("HANSHOKU_TOROKU_BANGO is null");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoIsNotNull() {
            addCriterion("HANSHOKU_TOROKU_BANGO is not null");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoEqualTo(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO =", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoNotEqualTo(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO <>", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoGreaterThan(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO >", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoGreaterThanOrEqualTo(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO >=", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoLessThan(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO <", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoLessThanOrEqualTo(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO <=", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoLike(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO like", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoNotLike(String value) {
            addCriterion("HANSHOKU_TOROKU_BANGO not like", value, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoIn(List<String> values) {
            addCriterion("HANSHOKU_TOROKU_BANGO in", values, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoNotIn(List<String> values) {
            addCriterion("HANSHOKU_TOROKU_BANGO not in", values, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoBetween(String value1, String value2) {
            addCriterion("HANSHOKU_TOROKU_BANGO between", value1, value2, "hanshokuTorokuBango");
            return (Criteria) this;
        }

        public Criteria andHanshokuTorokuBangoNotBetween(String value1, String value2) {
            addCriterion("HANSHOKU_TOROKU_BANGO not between", value1, value2, "hanshokuTorokuBango");
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

        public Criteria andKeitoIdIsNull() {
            addCriterion("KEITO_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeitoIdIsNotNull() {
            addCriterion("KEITO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeitoIdEqualTo(String value) {
            addCriterion("KEITO_ID =", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdNotEqualTo(String value) {
            addCriterion("KEITO_ID <>", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdGreaterThan(String value) {
            addCriterion("KEITO_ID >", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdGreaterThanOrEqualTo(String value) {
            addCriterion("KEITO_ID >=", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdLessThan(String value) {
            addCriterion("KEITO_ID <", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdLessThanOrEqualTo(String value) {
            addCriterion("KEITO_ID <=", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdLike(String value) {
            addCriterion("KEITO_ID like", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdNotLike(String value) {
            addCriterion("KEITO_ID not like", value, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdIn(List<String> values) {
            addCriterion("KEITO_ID in", values, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdNotIn(List<String> values) {
            addCriterion("KEITO_ID not in", values, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdBetween(String value1, String value2) {
            addCriterion("KEITO_ID between", value1, value2, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoIdNotBetween(String value1, String value2) {
            addCriterion("KEITO_ID not between", value1, value2, "keitoId");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiIsNull() {
            addCriterion("KEITO_MEI is null");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiIsNotNull() {
            addCriterion("KEITO_MEI is not null");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiEqualTo(String value) {
            addCriterion("KEITO_MEI =", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiNotEqualTo(String value) {
            addCriterion("KEITO_MEI <>", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiGreaterThan(String value) {
            addCriterion("KEITO_MEI >", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiGreaterThanOrEqualTo(String value) {
            addCriterion("KEITO_MEI >=", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiLessThan(String value) {
            addCriterion("KEITO_MEI <", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiLessThanOrEqualTo(String value) {
            addCriterion("KEITO_MEI <=", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiLike(String value) {
            addCriterion("KEITO_MEI like", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiNotLike(String value) {
            addCriterion("KEITO_MEI not like", value, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiIn(List<String> values) {
            addCriterion("KEITO_MEI in", values, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiNotIn(List<String> values) {
            addCriterion("KEITO_MEI not in", values, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiBetween(String value1, String value2) {
            addCriterion("KEITO_MEI between", value1, value2, "keitoMei");
            return (Criteria) this;
        }

        public Criteria andKeitoMeiNotBetween(String value1, String value2) {
            addCriterion("KEITO_MEI not between", value1, value2, "keitoMei");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_keito_joho
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
     * This class corresponds to the database table jvd_keito_joho
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