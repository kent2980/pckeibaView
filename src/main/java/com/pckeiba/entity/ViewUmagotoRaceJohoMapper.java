package com.pckeiba.entity;

import com.pckeiba.entity.ViewUmagotoRaceJoho;
import com.pckeiba.entity.ViewUmagotoRaceJohoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewUmagotoRaceJohoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(ViewUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(ViewUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(ViewUmagotoRaceJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(ViewUmagotoRaceJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<ViewUmagotoRaceJoho> selectByExample(ViewUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") ViewUmagotoRaceJoho record, @Param("example") ViewUmagotoRaceJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_umagoto_race_joho
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") ViewUmagotoRaceJoho record, @Param("example") ViewUmagotoRaceJohoExample example);
}