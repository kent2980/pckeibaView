package com.pckeiba.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JvdTanpukuOdds extends JvdTanpukuOddsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.INSERT_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Date insertTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.UPDATE_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Date updateTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private String recordShubetsuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private String dataKubun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Date dataSakuseiNengappi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.HAPPYO_TSUKIHI_JIFUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Date happyoTsukihiJifun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.TANSHO_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private BigDecimal tanshoOdds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.TANSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Short tanshoNinkijun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.FUKUSHO_MIN_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private BigDecimal fukushoMinOdds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.FUKUSHO_MAX_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private BigDecimal fukushoMaxOdds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_tanpuku_odds.FUKUSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Short fukushoNinkijun;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.INSERT_TIMESTAMP
     *
     * @return the value of jvd_tanpuku_odds.INSERT_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Date getInsertTimestamp() {
        return insertTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.INSERT_TIMESTAMP
     *
     * @param insertTimestamp the value for jvd_tanpuku_odds.INSERT_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setInsertTimestamp(Date insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.UPDATE_TIMESTAMP
     *
     * @return the value of jvd_tanpuku_odds.UPDATE_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.UPDATE_TIMESTAMP
     *
     * @param updateTimestamp the value for jvd_tanpuku_odds.UPDATE_TIMESTAMP
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.RECORD_SHUBETSU_ID
     *
     * @return the value of jvd_tanpuku_odds.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getRecordShubetsuId() {
        return recordShubetsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.RECORD_SHUBETSU_ID
     *
     * @param recordShubetsuId the value for jvd_tanpuku_odds.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setRecordShubetsuId(String recordShubetsuId) {
        this.recordShubetsuId = recordShubetsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.DATA_KUBUN
     *
     * @return the value of jvd_tanpuku_odds.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getDataKubun() {
        return dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.DATA_KUBUN
     *
     * @param dataKubun the value for jvd_tanpuku_odds.DATA_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setDataKubun(String dataKubun) {
        this.dataKubun = dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.DATA_SAKUSEI_NENGAPPI
     *
     * @return the value of jvd_tanpuku_odds.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Date getDataSakuseiNengappi() {
        return dataSakuseiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.DATA_SAKUSEI_NENGAPPI
     *
     * @param dataSakuseiNengappi the value for jvd_tanpuku_odds.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setDataSakuseiNengappi(Date dataSakuseiNengappi) {
        this.dataSakuseiNengappi = dataSakuseiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.HAPPYO_TSUKIHI_JIFUN
     *
     * @return the value of jvd_tanpuku_odds.HAPPYO_TSUKIHI_JIFUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Date getHappyoTsukihiJifun() {
        return happyoTsukihiJifun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.HAPPYO_TSUKIHI_JIFUN
     *
     * @param happyoTsukihiJifun the value for jvd_tanpuku_odds.HAPPYO_TSUKIHI_JIFUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setHappyoTsukihiJifun(Date happyoTsukihiJifun) {
        this.happyoTsukihiJifun = happyoTsukihiJifun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.TANSHO_ODDS
     *
     * @return the value of jvd_tanpuku_odds.TANSHO_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public BigDecimal getTanshoOdds() {
        return tanshoOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.TANSHO_ODDS
     *
     * @param tanshoOdds the value for jvd_tanpuku_odds.TANSHO_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setTanshoOdds(BigDecimal tanshoOdds) {
        this.tanshoOdds = tanshoOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.TANSHO_NINKIJUN
     *
     * @return the value of jvd_tanpuku_odds.TANSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Short getTanshoNinkijun() {
        return tanshoNinkijun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.TANSHO_NINKIJUN
     *
     * @param tanshoNinkijun the value for jvd_tanpuku_odds.TANSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setTanshoNinkijun(Short tanshoNinkijun) {
        this.tanshoNinkijun = tanshoNinkijun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.FUKUSHO_MIN_ODDS
     *
     * @return the value of jvd_tanpuku_odds.FUKUSHO_MIN_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public BigDecimal getFukushoMinOdds() {
        return fukushoMinOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.FUKUSHO_MIN_ODDS
     *
     * @param fukushoMinOdds the value for jvd_tanpuku_odds.FUKUSHO_MIN_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setFukushoMinOdds(BigDecimal fukushoMinOdds) {
        this.fukushoMinOdds = fukushoMinOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.FUKUSHO_MAX_ODDS
     *
     * @return the value of jvd_tanpuku_odds.FUKUSHO_MAX_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public BigDecimal getFukushoMaxOdds() {
        return fukushoMaxOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.FUKUSHO_MAX_ODDS
     *
     * @param fukushoMaxOdds the value for jvd_tanpuku_odds.FUKUSHO_MAX_ODDS
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setFukushoMaxOdds(BigDecimal fukushoMaxOdds) {
        this.fukushoMaxOdds = fukushoMaxOdds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_tanpuku_odds.FUKUSHO_NINKIJUN
     *
     * @return the value of jvd_tanpuku_odds.FUKUSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Short getFukushoNinkijun() {
        return fukushoNinkijun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_tanpuku_odds.FUKUSHO_NINKIJUN
     *
     * @param fukushoNinkijun the value for jvd_tanpuku_odds.FUKUSHO_NINKIJUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setFukushoNinkijun(Short fukushoNinkijun) {
        this.fukushoNinkijun = fukushoNinkijun;
    }
}