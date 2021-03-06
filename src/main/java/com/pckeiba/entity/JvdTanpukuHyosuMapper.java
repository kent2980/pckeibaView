package com.pckeiba.entity;

import com.pckeiba.entity.JvdTanpukuHyosu;
import com.pckeiba.entity.JvdTanpukuHyosuExample;
import com.pckeiba.entity.JvdTanpukuHyosuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdTanpukuHyosuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdTanpukuHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdTanpukuHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdTanpukuHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdTanpukuHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdTanpukuHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdTanpukuHyosu> selectByExample(JvdTanpukuHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdTanpukuHyosu selectByPrimaryKey(JvdTanpukuHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdTanpukuHyosu record, @Param("example") JvdTanpukuHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdTanpukuHyosu record, @Param("example") JvdTanpukuHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdTanpukuHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_tanpuku_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdTanpukuHyosu record);
}