package com.pckeiba.entity;

import com.pckeiba.entity.JvdChokyoshiShussobetsu1;
import com.pckeiba.entity.JvdChokyoshiShussobetsu1Example;
import com.pckeiba.entity.JvdChokyoshiShussobetsu1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdChokyoshiShussobetsu1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdChokyoshiShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdChokyoshiShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdChokyoshiShussobetsu1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdChokyoshiShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdChokyoshiShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdChokyoshiShussobetsu1> selectByExample(JvdChokyoshiShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdChokyoshiShussobetsu1 selectByPrimaryKey(JvdChokyoshiShussobetsu1Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdChokyoshiShussobetsu1 record, @Param("example") JvdChokyoshiShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdChokyoshiShussobetsu1 record, @Param("example") JvdChokyoshiShussobetsu1Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdChokyoshiShussobetsu1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_shussobetsu1
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdChokyoshiShussobetsu1 record);
}