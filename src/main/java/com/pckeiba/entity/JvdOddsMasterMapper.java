package com.pckeiba.entity;

import com.pckeiba.entity.JvdOddsMaster;
import com.pckeiba.entity.JvdOddsMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdOddsMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdOddsMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdOddsMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String raceCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdOddsMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdOddsMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdOddsMaster> selectByExample(JvdOddsMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdOddsMaster selectByPrimaryKey(String raceCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdOddsMaster record, @Param("example") JvdOddsMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdOddsMaster record, @Param("example") JvdOddsMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdOddsMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_odds_master
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdOddsMaster record);
}