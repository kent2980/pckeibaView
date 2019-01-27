package com.example.entity;

import com.example.entity.ViewRaceShosai;
import com.example.entity.ViewRaceShosaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewRaceShosaiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int countByExample(ViewRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int deleteByExample(ViewRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int insert(ViewRaceShosai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int insertSelective(ViewRaceShosai record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    List<ViewRaceShosai> selectByExample(ViewRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") ViewRaceShosai record, @Param("example") ViewRaceShosaiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_race_shosai
     *
     * @mbggenerated Sun Jan 27 15:17:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") ViewRaceShosai record, @Param("example") ViewRaceShosaiExample example);
}