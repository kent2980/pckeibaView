package com.pckeiba.entity;

import com.pckeiba.entity.JvdWakurenOddsYoso;
import com.pckeiba.entity.JvdWakurenOddsYosoExample;
import com.pckeiba.entity.JvdWakurenOddsYosoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdWakurenOddsYosoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdWakurenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdWakurenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdWakurenOddsYosoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdWakurenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdWakurenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdWakurenOddsYoso> selectByExample(JvdWakurenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdWakurenOddsYoso selectByPrimaryKey(JvdWakurenOddsYosoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdWakurenOddsYoso record, @Param("example") JvdWakurenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdWakurenOddsYoso record, @Param("example") JvdWakurenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdWakurenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdWakurenOddsYoso record);
}