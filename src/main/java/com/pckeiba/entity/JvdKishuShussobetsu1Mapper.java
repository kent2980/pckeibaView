package com.pckeiba.entity;

import com.pckeiba.entity.JvdKishuShussobetsu1;
import com.pckeiba.entity.JvdKishuShussobetsu1Example;
import com.pckeiba.entity.JvdKishuShussobetsu1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKishuShussobetsu1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdKishuShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdKishuShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdKishuShussobetsu1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdKishuShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdKishuShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdKishuShussobetsu1> selectByExample(JvdKishuShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdKishuShussobetsu1 selectByPrimaryKey(JvdKishuShussobetsu1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKishuShussobetsu1 record, @Param("example") JvdKishuShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKishuShussobetsu1 record, @Param("example") JvdKishuShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKishuShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKishuShussobetsu1 record);
}