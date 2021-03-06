package com.pckeiba.entity;

import com.pckeiba.entity.JvdKyosoJokenCode;
import com.pckeiba.entity.JvdKyosoJokenCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKyosoJokenCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdKyosoJokenCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdKyosoJokenCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdKyosoJokenCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdKyosoJokenCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdKyosoJokenCode> selectByExample(JvdKyosoJokenCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdKyosoJokenCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKyosoJokenCode record, @Param("example") JvdKyosoJokenCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKyosoJokenCode record, @Param("example") JvdKyosoJokenCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKyosoJokenCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyoso_joken_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKyosoJokenCode record);
}