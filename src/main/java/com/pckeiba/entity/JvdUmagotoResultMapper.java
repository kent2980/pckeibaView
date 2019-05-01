package com.pckeiba.entity;

import com.pckeiba.entity.JvdUmagotoResult;
import com.pckeiba.entity.JvdUmagotoResultExample;
import com.pckeiba.entity.JvdUmagotoResultKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdUmagotoResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int countByExample(JvdUmagotoResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int deleteByExample(JvdUmagotoResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdUmagotoResultKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int insert(JvdUmagotoResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int insertSelective(JvdUmagotoResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    List<JvdUmagotoResult> selectByExample(JvdUmagotoResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    JvdUmagotoResult selectByPrimaryKey(JvdUmagotoResultKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdUmagotoResult record, @Param("example") JvdUmagotoResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdUmagotoResult record, @Param("example") JvdUmagotoResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdUmagotoResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_umagoto_result
     *
     * @mbggenerated Tue Apr 30 20:38:56 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdUmagotoResult record);
}