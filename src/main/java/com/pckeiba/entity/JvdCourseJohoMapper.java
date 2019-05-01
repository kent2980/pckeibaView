package com.pckeiba.entity;

import com.pckeiba.entity.JvdCourseJoho;
import com.pckeiba.entity.JvdCourseJohoExample;
import com.pckeiba.entity.JvdCourseJohoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdCourseJohoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdCourseJohoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdCourseJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdCourseJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdCourseJoho> selectByExampleWithBLOBs(JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdCourseJoho> selectByExample(JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdCourseJoho selectByPrimaryKey(JvdCourseJohoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdCourseJoho record, @Param("example") JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleWithBLOBs(@Param("record") JvdCourseJoho record, @Param("example") JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdCourseJoho record, @Param("example") JvdCourseJohoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdCourseJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeyWithBLOBs(JvdCourseJoho record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_course_joho
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdCourseJoho record);
}