package com.pckeiba.entity;

import com.pckeiba.entity.JvdBataiju;
import com.pckeiba.entity.JvdBataijuExample;
import com.pckeiba.entity.JvdBataijuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdBataijuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdBataijuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdBataijuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdBataijuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdBataiju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdBataiju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdBataiju> selectByExample(JvdBataijuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdBataiju selectByPrimaryKey(JvdBataijuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdBataiju record, @Param("example") JvdBataijuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdBataiju record, @Param("example") JvdBataijuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdBataiju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_bataiju
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdBataiju record);
}