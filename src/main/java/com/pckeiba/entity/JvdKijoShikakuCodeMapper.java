package com.pckeiba.entity;

import com.pckeiba.entity.JvdKijoShikakuCode;
import com.pckeiba.entity.JvdKijoShikakuCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKijoShikakuCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdKijoShikakuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdKijoShikakuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdKijoShikakuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdKijoShikakuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdKijoShikakuCode> selectByExample(JvdKijoShikakuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdKijoShikakuCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKijoShikakuCode record, @Param("example") JvdKijoShikakuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKijoShikakuCode record, @Param("example") JvdKijoShikakuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKijoShikakuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kijo_shikaku_code
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKijoShikakuCode record);
}