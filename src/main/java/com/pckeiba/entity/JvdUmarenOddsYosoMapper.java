package com.pckeiba.entity;

import com.pckeiba.entity.JvdUmarenOddsYoso;
import com.pckeiba.entity.JvdUmarenOddsYosoExample;
import com.pckeiba.entity.JvdUmarenOddsYosoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdUmarenOddsYosoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdUmarenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdUmarenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdUmarenOddsYosoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdUmarenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdUmarenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdUmarenOddsYoso> selectByExample(JvdUmarenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdUmarenOddsYoso selectByPrimaryKey(JvdUmarenOddsYosoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdUmarenOddsYoso record, @Param("example") JvdUmarenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdUmarenOddsYoso record, @Param("example") JvdUmarenOddsYosoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdUmarenOddsYoso record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umaren_odds_yoso
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdUmarenOddsYoso record);
}