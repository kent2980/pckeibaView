package com.pckeiba.entity;

import com.pckeiba.entity.JvdKyosobaShussobetsu3;
import com.pckeiba.entity.JvdKyosobaShussobetsu3Example;
import com.pckeiba.entity.JvdKyosobaShussobetsu3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKyosobaShussobetsu3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdKyosobaShussobetsu3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdKyosobaShussobetsu3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdKyosobaShussobetsu3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdKyosobaShussobetsu3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdKyosobaShussobetsu3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdKyosobaShussobetsu3> selectByExample(JvdKyosobaShussobetsu3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdKyosobaShussobetsu3 selectByPrimaryKey(JvdKyosobaShussobetsu3Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKyosobaShussobetsu3 record, @Param("example") JvdKyosobaShussobetsu3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKyosobaShussobetsu3 record, @Param("example") JvdKyosobaShussobetsu3Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKyosobaShussobetsu3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_shussobetsu3
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKyosobaShussobetsu3 record);
}