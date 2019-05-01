package com.pckeiba.entity;

import com.pckeiba.entity.JvdKyosobaSeiseki;
import com.pckeiba.entity.JvdKyosobaSeisekiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKyosobaSeisekiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdKyosobaSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdKyosobaSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String kettoTorokuBango);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdKyosobaSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdKyosobaSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdKyosobaSeiseki> selectByExample(JvdKyosobaSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdKyosobaSeiseki selectByPrimaryKey(String kettoTorokuBango);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKyosobaSeiseki record, @Param("example") JvdKyosobaSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKyosobaSeiseki record, @Param("example") JvdKyosobaSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKyosobaSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kyosoba_seiseki
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKyosobaSeiseki record);
}