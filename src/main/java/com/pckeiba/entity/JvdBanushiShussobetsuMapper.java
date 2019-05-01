package com.pckeiba.entity;

import com.pckeiba.entity.JvdBanushiShussobetsu;
import com.pckeiba.entity.JvdBanushiShussobetsuExample;
import com.pckeiba.entity.JvdBanushiShussobetsuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdBanushiShussobetsuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdBanushiShussobetsuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdBanushiShussobetsuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdBanushiShussobetsuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdBanushiShussobetsu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdBanushiShussobetsu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdBanushiShussobetsu> selectByExample(JvdBanushiShussobetsuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdBanushiShussobetsu selectByPrimaryKey(JvdBanushiShussobetsuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdBanushiShussobetsu record, @Param("example") JvdBanushiShussobetsuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdBanushiShussobetsu record, @Param("example") JvdBanushiShussobetsuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdBanushiShussobetsu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_banushi_shussobetsu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdBanushiShussobetsu record);
}