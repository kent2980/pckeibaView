package com.pckeiba.entity;

import com.pckeiba.entity.JvdUmagotoRaceJoho;
import com.pckeiba.entity.JvdUmagotoRaceJohoExample;
import com.pckeiba.entity.JvdUmagotoRaceJohoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdUmagotoRaceJohoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdUmagotoRaceJohoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdUmagotoRaceJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdUmagotoRaceJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdUmagotoRaceJoho> selectByExample(JvdUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdUmagotoRaceJoho selectByPrimaryKey(JvdUmagotoRaceJohoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdUmagotoRaceJoho record, @Param("example") JvdUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdUmagotoRaceJoho record, @Param("example") JvdUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdUmagotoRaceJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_race_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdUmagotoRaceJoho record);
}