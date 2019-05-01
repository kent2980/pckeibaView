package com.pckeiba.entity;

import com.pckeiba.entity.JvdSetupData;
import com.pckeiba.entity.JvdSetupDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdSetupDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdSetupDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdSetupDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String fileName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdSetupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdSetupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdSetupData> selectByExample(JvdSetupDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdSetupData selectByPrimaryKey(String fileName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdSetupData record, @Param("example") JvdSetupDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdSetupData record, @Param("example") JvdSetupDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdSetupData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_setup_data
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdSetupData record);
}