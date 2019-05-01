package com.pckeiba.entity;

import com.pckeiba.entity.JvdWideHyosu;
import com.pckeiba.entity.JvdWideHyosuExample;
import com.pckeiba.entity.JvdWideHyosuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdWideHyosuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdWideHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdWideHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdWideHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdWideHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdWideHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdWideHyosu> selectByExample(JvdWideHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdWideHyosu selectByPrimaryKey(JvdWideHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdWideHyosu record, @Param("example") JvdWideHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdWideHyosu record, @Param("example") JvdWideHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdWideHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wide_hyosu
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdWideHyosu record);
}