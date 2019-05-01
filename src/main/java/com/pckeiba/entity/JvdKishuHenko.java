package com.pckeiba.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JvdKishuHenko extends JvdKishuHenkoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.INSERT_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Date insertTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.UPDATE_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Date updateTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String recordShubetsuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.DATA_KUBUN
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String dataKubun;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Date dataSakuseiNengappi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.KAISAI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Date kaisaiNengappi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.KEIBAJO_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String keibajoCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.KAISAI_KAIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Short kaisaiKaiji;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.KAISAI_NICHIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Short kaisaiNichiji;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.RACE_BANGO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private Short raceBango;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.BAMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String bamei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOGO_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private BigDecimal henkogoFutanJuryo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOGO_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkogoKishuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOGO_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkogoKishumei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOGO_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkogoKishuMinaraiCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOMAE_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private BigDecimal henkomaeFutanJuryo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOMAE_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkomaeKishuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOMAE_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkomaeKishumei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_kishu_henko.HENKOMAE_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    private String henkomaeKishuMinaraiCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.INSERT_TIMESTAMP
     *
     * @return the value of jvd_kishu_henko.INSERT_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Date getInsertTimestamp() {
        return insertTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.INSERT_TIMESTAMP
     *
     * @param insertTimestamp the value for jvd_kishu_henko.INSERT_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setInsertTimestamp(Date insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.UPDATE_TIMESTAMP
     *
     * @return the value of jvd_kishu_henko.UPDATE_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.UPDATE_TIMESTAMP
     *
     * @param updateTimestamp the value for jvd_kishu_henko.UPDATE_TIMESTAMP
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.RECORD_SHUBETSU_ID
     *
     * @return the value of jvd_kishu_henko.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getRecordShubetsuId() {
        return recordShubetsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.RECORD_SHUBETSU_ID
     *
     * @param recordShubetsuId the value for jvd_kishu_henko.RECORD_SHUBETSU_ID
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setRecordShubetsuId(String recordShubetsuId) {
        this.recordShubetsuId = recordShubetsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.DATA_KUBUN
     *
     * @return the value of jvd_kishu_henko.DATA_KUBUN
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getDataKubun() {
        return dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.DATA_KUBUN
     *
     * @param dataKubun the value for jvd_kishu_henko.DATA_KUBUN
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setDataKubun(String dataKubun) {
        this.dataKubun = dataKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.DATA_SAKUSEI_NENGAPPI
     *
     * @return the value of jvd_kishu_henko.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Date getDataSakuseiNengappi() {
        return dataSakuseiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.DATA_SAKUSEI_NENGAPPI
     *
     * @param dataSakuseiNengappi the value for jvd_kishu_henko.DATA_SAKUSEI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setDataSakuseiNengappi(Date dataSakuseiNengappi) {
        this.dataSakuseiNengappi = dataSakuseiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.KAISAI_NENGAPPI
     *
     * @return the value of jvd_kishu_henko.KAISAI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Date getKaisaiNengappi() {
        return kaisaiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.KAISAI_NENGAPPI
     *
     * @param kaisaiNengappi the value for jvd_kishu_henko.KAISAI_NENGAPPI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setKaisaiNengappi(Date kaisaiNengappi) {
        this.kaisaiNengappi = kaisaiNengappi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.KEIBAJO_CODE
     *
     * @return the value of jvd_kishu_henko.KEIBAJO_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getKeibajoCode() {
        return keibajoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.KEIBAJO_CODE
     *
     * @param keibajoCode the value for jvd_kishu_henko.KEIBAJO_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setKeibajoCode(String keibajoCode) {
        this.keibajoCode = keibajoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.KAISAI_KAIJI
     *
     * @return the value of jvd_kishu_henko.KAISAI_KAIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Short getKaisaiKaiji() {
        return kaisaiKaiji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.KAISAI_KAIJI
     *
     * @param kaisaiKaiji the value for jvd_kishu_henko.KAISAI_KAIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setKaisaiKaiji(Short kaisaiKaiji) {
        this.kaisaiKaiji = kaisaiKaiji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.KAISAI_NICHIJI
     *
     * @return the value of jvd_kishu_henko.KAISAI_NICHIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Short getKaisaiNichiji() {
        return kaisaiNichiji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.KAISAI_NICHIJI
     *
     * @param kaisaiNichiji the value for jvd_kishu_henko.KAISAI_NICHIJI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setKaisaiNichiji(Short kaisaiNichiji) {
        this.kaisaiNichiji = kaisaiNichiji;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.RACE_BANGO
     *
     * @return the value of jvd_kishu_henko.RACE_BANGO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public Short getRaceBango() {
        return raceBango;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.RACE_BANGO
     *
     * @param raceBango the value for jvd_kishu_henko.RACE_BANGO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setRaceBango(Short raceBango) {
        this.raceBango = raceBango;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.BAMEI
     *
     * @return the value of jvd_kishu_henko.BAMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getBamei() {
        return bamei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.BAMEI
     *
     * @param bamei the value for jvd_kishu_henko.BAMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setBamei(String bamei) {
        this.bamei = bamei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOGO_FUTAN_JURYO
     *
     * @return the value of jvd_kishu_henko.HENKOGO_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public BigDecimal getHenkogoFutanJuryo() {
        return henkogoFutanJuryo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOGO_FUTAN_JURYO
     *
     * @param henkogoFutanJuryo the value for jvd_kishu_henko.HENKOGO_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkogoFutanJuryo(BigDecimal henkogoFutanJuryo) {
        this.henkogoFutanJuryo = henkogoFutanJuryo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOGO_KISHU_CODE
     *
     * @return the value of jvd_kishu_henko.HENKOGO_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkogoKishuCode() {
        return henkogoKishuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOGO_KISHU_CODE
     *
     * @param henkogoKishuCode the value for jvd_kishu_henko.HENKOGO_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkogoKishuCode(String henkogoKishuCode) {
        this.henkogoKishuCode = henkogoKishuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOGO_KISHUMEI
     *
     * @return the value of jvd_kishu_henko.HENKOGO_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkogoKishumei() {
        return henkogoKishumei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOGO_KISHUMEI
     *
     * @param henkogoKishumei the value for jvd_kishu_henko.HENKOGO_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkogoKishumei(String henkogoKishumei) {
        this.henkogoKishumei = henkogoKishumei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOGO_KISHU_MINARAI_CODE
     *
     * @return the value of jvd_kishu_henko.HENKOGO_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkogoKishuMinaraiCode() {
        return henkogoKishuMinaraiCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOGO_KISHU_MINARAI_CODE
     *
     * @param henkogoKishuMinaraiCode the value for jvd_kishu_henko.HENKOGO_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkogoKishuMinaraiCode(String henkogoKishuMinaraiCode) {
        this.henkogoKishuMinaraiCode = henkogoKishuMinaraiCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOMAE_FUTAN_JURYO
     *
     * @return the value of jvd_kishu_henko.HENKOMAE_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public BigDecimal getHenkomaeFutanJuryo() {
        return henkomaeFutanJuryo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOMAE_FUTAN_JURYO
     *
     * @param henkomaeFutanJuryo the value for jvd_kishu_henko.HENKOMAE_FUTAN_JURYO
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkomaeFutanJuryo(BigDecimal henkomaeFutanJuryo) {
        this.henkomaeFutanJuryo = henkomaeFutanJuryo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOMAE_KISHU_CODE
     *
     * @return the value of jvd_kishu_henko.HENKOMAE_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkomaeKishuCode() {
        return henkomaeKishuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOMAE_KISHU_CODE
     *
     * @param henkomaeKishuCode the value for jvd_kishu_henko.HENKOMAE_KISHU_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkomaeKishuCode(String henkomaeKishuCode) {
        this.henkomaeKishuCode = henkomaeKishuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOMAE_KISHUMEI
     *
     * @return the value of jvd_kishu_henko.HENKOMAE_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkomaeKishumei() {
        return henkomaeKishumei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOMAE_KISHUMEI
     *
     * @param henkomaeKishumei the value for jvd_kishu_henko.HENKOMAE_KISHUMEI
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkomaeKishumei(String henkomaeKishumei) {
        this.henkomaeKishumei = henkomaeKishumei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_kishu_henko.HENKOMAE_KISHU_MINARAI_CODE
     *
     * @return the value of jvd_kishu_henko.HENKOMAE_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public String getHenkomaeKishuMinaraiCode() {
        return henkomaeKishuMinaraiCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_kishu_henko.HENKOMAE_KISHU_MINARAI_CODE
     *
     * @param henkomaeKishuMinaraiCode the value for jvd_kishu_henko.HENKOMAE_KISHU_MINARAI_CODE
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    public void setHenkomaeKishuMinaraiCode(String henkomaeKishuMinaraiCode) {
        this.henkomaeKishuMinaraiCode = henkomaeKishuMinaraiCode;
    }
}