package com.pckeiba.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JvdUmagotoResultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public JvdUmagotoResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
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
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
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

        public Criteria andBameiIsNull() {
            addCriterion("BAMEI is null");
            return (Criteria) this;
        }

        public Criteria andBameiIsNotNull() {
            addCriterion("BAMEI is not null");
            return (Criteria) this;
        }

        public Criteria andBameiEqualTo(String value) {
            addCriterion("BAMEI =", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiNotEqualTo(String value) {
            addCriterion("BAMEI <>", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiGreaterThan(String value) {
            addCriterion("BAMEI >", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiGreaterThanOrEqualTo(String value) {
            addCriterion("BAMEI >=", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiLessThan(String value) {
            addCriterion("BAMEI <", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiLessThanOrEqualTo(String value) {
            addCriterion("BAMEI <=", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiLike(String value) {
            addCriterion("BAMEI like", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiNotLike(String value) {
            addCriterion("BAMEI not like", value, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiIn(List<String> values) {
            addCriterion("BAMEI in", values, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiNotIn(List<String> values) {
            addCriterion("BAMEI not in", values, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiBetween(String value1, String value2) {
            addCriterion("BAMEI between", value1, value2, "bamei");
            return (Criteria) this;
        }

        public Criteria andBameiNotBetween(String value1, String value2) {
            addCriterion("BAMEI not between", value1, value2, "bamei");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoIsNull() {
            addCriterion("KETTO_TOROKU_BANGO is null");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoIsNotNull() {
            addCriterion("KETTO_TOROKU_BANGO is not null");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoEqualTo(String value) {
            addCriterion("KETTO_TOROKU_BANGO =", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoNotEqualTo(String value) {
            addCriterion("KETTO_TOROKU_BANGO <>", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoGreaterThan(String value) {
            addCriterion("KETTO_TOROKU_BANGO >", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoGreaterThanOrEqualTo(String value) {
            addCriterion("KETTO_TOROKU_BANGO >=", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoLessThan(String value) {
            addCriterion("KETTO_TOROKU_BANGO <", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoLessThanOrEqualTo(String value) {
            addCriterion("KETTO_TOROKU_BANGO <=", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoLike(String value) {
            addCriterion("KETTO_TOROKU_BANGO like", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoNotLike(String value) {
            addCriterion("KETTO_TOROKU_BANGO not like", value, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoIn(List<String> values) {
            addCriterion("KETTO_TOROKU_BANGO in", values, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoNotIn(List<String> values) {
            addCriterion("KETTO_TOROKU_BANGO not in", values, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoBetween(String value1, String value2) {
            addCriterion("KETTO_TOROKU_BANGO between", value1, value2, "kettoTorokuBango");
            return (Criteria) this;
        }

        public Criteria andKettoTorokuBangoNotBetween(String value1, String value2) {
            addCriterion("KETTO_TOROKU_BANGO not between", value1, value2, "kettoTorokuBango");
            return (Criteria) this;
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

        public Criteria andFutanJuryoIsNull() {
            addCriterion("FUTAN_JURYO is null");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoIsNotNull() {
            addCriterion("FUTAN_JURYO is not null");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoEqualTo(BigDecimal value) {
            addCriterion("FUTAN_JURYO =", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoNotEqualTo(BigDecimal value) {
            addCriterion("FUTAN_JURYO <>", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoGreaterThan(BigDecimal value) {
            addCriterion("FUTAN_JURYO >", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FUTAN_JURYO >=", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoLessThan(BigDecimal value) {
            addCriterion("FUTAN_JURYO <", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FUTAN_JURYO <=", value, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoIn(List<BigDecimal> values) {
            addCriterion("FUTAN_JURYO in", values, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoNotIn(List<BigDecimal> values) {
            addCriterion("FUTAN_JURYO not in", values, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUTAN_JURYO between", value1, value2, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andFutanJuryoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FUTAN_JURYO not between", value1, value2, "futanJuryo");
            return (Criteria) this;
        }

        public Criteria andZisokuIsNull() {
            addCriterion("ZISOKU is null");
            return (Criteria) this;
        }

        public Criteria andZisokuIsNotNull() {
            addCriterion("ZISOKU is not null");
            return (Criteria) this;
        }

        public Criteria andZisokuEqualTo(BigDecimal value) {
            addCriterion("ZISOKU =", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuNotEqualTo(BigDecimal value) {
            addCriterion("ZISOKU <>", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuGreaterThan(BigDecimal value) {
            addCriterion("ZISOKU >", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZISOKU >=", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuLessThan(BigDecimal value) {
            addCriterion("ZISOKU <", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZISOKU <=", value, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuIn(List<BigDecimal> values) {
            addCriterion("ZISOKU in", values, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuNotIn(List<BigDecimal> values) {
            addCriterion("ZISOKU not in", values, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZISOKU between", value1, value2, "zisoku");
            return (Criteria) this;
        }

        public Criteria andZisokuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZISOKU not between", value1, value2, "zisoku");
            return (Criteria) this;
        }

        public Criteria andHoseiIsNull() {
            addCriterion("HOSEI is null");
            return (Criteria) this;
        }

        public Criteria andHoseiIsNotNull() {
            addCriterion("HOSEI is not null");
            return (Criteria) this;
        }

        public Criteria andHoseiEqualTo(BigDecimal value) {
            addCriterion("HOSEI =", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiNotEqualTo(BigDecimal value) {
            addCriterion("HOSEI <>", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiGreaterThan(BigDecimal value) {
            addCriterion("HOSEI >", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOSEI >=", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiLessThan(BigDecimal value) {
            addCriterion("HOSEI <", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOSEI <=", value, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiIn(List<BigDecimal> values) {
            addCriterion("HOSEI in", values, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiNotIn(List<BigDecimal> values) {
            addCriterion("HOSEI not in", values, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOSEI between", value1, value2, "hosei");
            return (Criteria) this;
        }

        public Criteria andHoseiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOSEI not between", value1, value2, "hosei");
            return (Criteria) this;
        }

        public Criteria andKijunIsNull() {
            addCriterion("KIJUN is null");
            return (Criteria) this;
        }

        public Criteria andKijunIsNotNull() {
            addCriterion("KIJUN is not null");
            return (Criteria) this;
        }

        public Criteria andKijunEqualTo(BigDecimal value) {
            addCriterion("KIJUN =", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunNotEqualTo(BigDecimal value) {
            addCriterion("KIJUN <>", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunGreaterThan(BigDecimal value) {
            addCriterion("KIJUN >", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KIJUN >=", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunLessThan(BigDecimal value) {
            addCriterion("KIJUN <", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KIJUN <=", value, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunIn(List<BigDecimal> values) {
            addCriterion("KIJUN in", values, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunNotIn(List<BigDecimal> values) {
            addCriterion("KIJUN not in", values, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KIJUN between", value1, value2, "kijun");
            return (Criteria) this;
        }

        public Criteria andKijunNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KIJUN not between", value1, value2, "kijun");
            return (Criteria) this;
        }

        public Criteria andSrunRowIsNull() {
            addCriterion("SRun_row is null");
            return (Criteria) this;
        }

        public Criteria andSrunRowIsNotNull() {
            addCriterion("SRun_row is not null");
            return (Criteria) this;
        }

        public Criteria andSrunRowEqualTo(BigDecimal value) {
            addCriterion("SRun_row =", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowNotEqualTo(BigDecimal value) {
            addCriterion("SRun_row <>", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowGreaterThan(BigDecimal value) {
            addCriterion("SRun_row >", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SRun_row >=", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowLessThan(BigDecimal value) {
            addCriterion("SRun_row <", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SRun_row <=", value, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowIn(List<BigDecimal> values) {
            addCriterion("SRun_row in", values, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowNotIn(List<BigDecimal> values) {
            addCriterion("SRun_row not in", values, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRun_row between", value1, value2, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrunRowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRun_row not between", value1, value2, "srunRow");
            return (Criteria) this;
        }

        public Criteria andSrun55IsNull() {
            addCriterion("SRun_55 is null");
            return (Criteria) this;
        }

        public Criteria andSrun55IsNotNull() {
            addCriterion("SRun_55 is not null");
            return (Criteria) this;
        }

        public Criteria andSrun55EqualTo(BigDecimal value) {
            addCriterion("SRun_55 =", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55NotEqualTo(BigDecimal value) {
            addCriterion("SRun_55 <>", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55GreaterThan(BigDecimal value) {
            addCriterion("SRun_55 >", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SRun_55 >=", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55LessThan(BigDecimal value) {
            addCriterion("SRun_55 <", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SRun_55 <=", value, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55In(List<BigDecimal> values) {
            addCriterion("SRun_55 in", values, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55NotIn(List<BigDecimal> values) {
            addCriterion("SRun_55 not in", values, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRun_55 between", value1, value2, "srun55");
            return (Criteria) this;
        }

        public Criteria andSrun55NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRun_55 not between", value1, value2, "srun55");
            return (Criteria) this;
        }

        public Criteria andChakujunIsNull() {
            addCriterion("CHAKUJUN is null");
            return (Criteria) this;
        }

        public Criteria andChakujunIsNotNull() {
            addCriterion("CHAKUJUN is not null");
            return (Criteria) this;
        }

        public Criteria andChakujunEqualTo(Short value) {
            addCriterion("CHAKUJUN =", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunNotEqualTo(Short value) {
            addCriterion("CHAKUJUN <>", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunGreaterThan(Short value) {
            addCriterion("CHAKUJUN >", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunGreaterThanOrEqualTo(Short value) {
            addCriterion("CHAKUJUN >=", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunLessThan(Short value) {
            addCriterion("CHAKUJUN <", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunLessThanOrEqualTo(Short value) {
            addCriterion("CHAKUJUN <=", value, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunIn(List<Short> values) {
            addCriterion("CHAKUJUN in", values, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunNotIn(List<Short> values) {
            addCriterion("CHAKUJUN not in", values, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunBetween(Short value1, Short value2) {
            addCriterion("CHAKUJUN between", value1, value2, "chakujun");
            return (Criteria) this;
        }

        public Criteria andChakujunNotBetween(Short value1, Short value2) {
            addCriterion("CHAKUJUN not between", value1, value2, "chakujun");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
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