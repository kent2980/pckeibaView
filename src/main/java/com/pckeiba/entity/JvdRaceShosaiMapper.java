package com.pckeiba.entity;

import com.pckeiba.entity.JvdRaceShosai;
import com.pckeiba.entity.JvdRaceShosaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdRaceShosaiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String raceCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdRaceShosai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdRaceShosai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdRaceShosai> selectByExample(JvdRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdRaceShosai selectByPrimaryKey(String raceCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdRaceShosai record, @Param("example") JvdRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdRaceShosai record, @Param("example") JvdRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdRaceShosai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_race_shosai
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdRaceShosai record);
}