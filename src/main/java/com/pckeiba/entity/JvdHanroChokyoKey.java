package com.pckeiba.entity;

import java.util.Date;

public class JvdHanroChokyoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_hanro_chokyo.CHOKYO_JIKOKU
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private Date chokyoJikoku;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_hanro_chokyo.KETTO_TOROKU_BANGO
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private String kettoTorokuBango;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jvd_hanro_chokyo.TRACEN_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    private String tracenKubun;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_hanro_chokyo.CHOKYO_JIKOKU
     *
     * @return the value of jvd_hanro_chokyo.CHOKYO_JIKOKU
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public Date getChokyoJikoku() {
        return chokyoJikoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_hanro_chokyo.CHOKYO_JIKOKU
     *
     * @param chokyoJikoku the value for jvd_hanro_chokyo.CHOKYO_JIKOKU
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setChokyoJikoku(Date chokyoJikoku) {
        this.chokyoJikoku = chokyoJikoku;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_hanro_chokyo.KETTO_TOROKU_BANGO
     *
     * @return the value of jvd_hanro_chokyo.KETTO_TOROKU_BANGO
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getKettoTorokuBango() {
        return kettoTorokuBango;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_hanro_chokyo.KETTO_TOROKU_BANGO
     *
     * @param kettoTorokuBango the value for jvd_hanro_chokyo.KETTO_TOROKU_BANGO
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setKettoTorokuBango(String kettoTorokuBango) {
        this.kettoTorokuBango = kettoTorokuBango;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jvd_hanro_chokyo.TRACEN_KUBUN
     *
     * @return the value of jvd_hanro_chokyo.TRACEN_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public String getTracenKubun() {
        return tracenKubun;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jvd_hanro_chokyo.TRACEN_KUBUN
     *
     * @param tracenKubun the value for jvd_hanro_chokyo.TRACEN_KUBUN
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    public void setTracenKubun(String tracenKubun) {
        this.tracenKubun = tracenKubun;
    }
}