package com.pckeiba.entity;

import com.pckeiba.entity.JvdHinshuCode;
import com.pckeiba.entity.JvdHinshuCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdHinshuCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdHinshuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdHinshuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdHinshuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdHinshuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdHinshuCode> selectByExample(JvdHinshuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdHinshuCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdHinshuCode record, @Param("example") JvdHinshuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdHinshuCode record, @Param("example") JvdHinshuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdHinshuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_hinshu_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdHinshuCode record);
}