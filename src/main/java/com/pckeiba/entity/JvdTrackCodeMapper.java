package com.pckeiba.entity;

import com.pckeiba.entity.JvdTrackCode;
import com.pckeiba.entity.JvdTrackCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdTrackCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdTrackCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdTrackCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdTrackCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdTrackCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdTrackCode> selectByExample(JvdTrackCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdTrackCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdTrackCode record, @Param("example") JvdTrackCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdTrackCode record, @Param("example") JvdTrackCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdTrackCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_track_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdTrackCode record);
}