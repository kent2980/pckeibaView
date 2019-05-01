package com.pckeiba.entity;

import com.pckeiba.entity.JvdKoryuKubun;
import com.pckeiba.entity.JvdKoryuKubunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKoryuKubunMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdKoryuKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdKoryuKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdKoryuKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdKoryuKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdKoryuKubun> selectByExample(JvdKoryuKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdKoryuKubun selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKoryuKubun record, @Param("example") JvdKoryuKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKoryuKubun record, @Param("example") JvdKoryuKubunExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKoryuKubun record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_koryu_kubun
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKoryuKubun record);
}