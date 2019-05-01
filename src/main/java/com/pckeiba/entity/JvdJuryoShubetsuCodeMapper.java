package com.pckeiba.entity;

import com.pckeiba.entity.JvdJuryoShubetsuCode;
import com.pckeiba.entity.JvdJuryoShubetsuCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdJuryoShubetsuCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdJuryoShubetsuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdJuryoShubetsuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdJuryoShubetsuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdJuryoShubetsuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdJuryoShubetsuCode> selectByExample(JvdJuryoShubetsuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdJuryoShubetsuCode selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdJuryoShubetsuCode record, @Param("example") JvdJuryoShubetsuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdJuryoShubetsuCode record, @Param("example") JvdJuryoShubetsuCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdJuryoShubetsuCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_juryo_shubetsu_code
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdJuryoShubetsuCode record);
}