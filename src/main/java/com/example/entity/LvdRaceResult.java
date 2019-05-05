package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LvdRaceResult {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lvd_race_result.RACE_CODE
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    private String raceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lvd_race_result.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    private String dataKubun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lvd_race_result.KAISAI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    private Date kaisaiNengappi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lvd_race_result.AVE_3F
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    private BigDecimal ave3f;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lvd_race_result.RPCI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    private BigDecimal rpci;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lvd_race_result.RACE_CODE
     *
     * @return the value of lvd_race_result.RACE_CODE
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public String getRaceCode() {
        return raceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lvd_race_result.RACE_CODE
     *
     * @param raceCode the value for lvd_race_result.RACE_CODE
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public void setRaceCode(String raceCode) {
        this.raceCode = raceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lvd_race_result.DATA_KUBUN
     *
     * @return the value of lvd_race_result.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public String getDataKubun() {
        return dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lvd_race_result.DATA_KUBUN
     *
     * @param dataKubun the value for lvd_race_result.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public void setDataKubun(String dataKubun) {
        this.dataKubun = dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lvd_race_result.KAISAI_NENGAPPI
     *
     * @return the value of lvd_race_result.KAISAI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public Date getKaisaiNengappi() {
        return kaisaiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lvd_race_result.KAISAI_NENGAPPI
     *
     * @param kaisaiNengappi the value for lvd_race_result.KAISAI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public void setKaisaiNengappi(Date kaisaiNengappi) {
        this.kaisaiNengappi = kaisaiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lvd_race_result.AVE_3F
     *
     * @return the value of lvd_race_result.AVE_3F
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public BigDecimal getAve3f() {
        return ave3f;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lvd_race_result.AVE_3F
     *
     * @param ave3f the value for lvd_race_result.AVE_3F
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public void setAve3f(BigDecimal ave3f) {
        this.ave3f = ave3f;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lvd_race_result.RPCI
     *
     * @return the value of lvd_race_result.RPCI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public BigDecimal getRpci() {
        return rpci;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lvd_race_result.RPCI
     *
     * @param rpci the value for lvd_race_result.RPCI
     *
     * @mbggenerated Thu May 02 12:32:56 GMT+09:00 2019
     */
    public void setRpci(BigDecimal rpci) {
        this.rpci = rpci;
    }
}