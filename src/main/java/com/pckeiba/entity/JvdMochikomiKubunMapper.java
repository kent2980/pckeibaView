package com.pckeiba.entity;

import com.pckeiba.entity.JvdMochikomiKubun;
import com.pckeiba.entity.JvdMochikomiKubunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdMochikomiKubunMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdMochikomiKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdMochikomiKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdMochikomiKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdMochikomiKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdMochikomiKubun> selectByExample(JvdMochikomiKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdMochikomiKubun selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdMochikomiKubun record, @Param("example") JvdMochikomiKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdMochikomiKubun record, @Param("example") JvdMochikomiKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdMochikomiKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_mochikomi_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdMochikomiKubun record);
}