package com.pckeiba.entity;

import com.pckeiba.entity.JvdTanpukuOdds;
import com.pckeiba.entity.JvdTanpukuOddsExample;
import com.pckeiba.entity.JvdTanpukuOddsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdTanpukuOddsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdTanpukuOddsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdTanpukuOddsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdTanpukuOddsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdTanpukuOdds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdTanpukuOdds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdTanpukuOdds> selectByExample(JvdTanpukuOddsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdTanpukuOdds selectByPrimaryKey(JvdTanpukuOddsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdTanpukuOdds record, @Param("example") JvdTanpukuOddsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdTanpukuOdds record, @Param("example") JvdTanpukuOddsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdTanpukuOdds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_odds
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdTanpukuOdds record);
}