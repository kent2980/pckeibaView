package com.pckeiba.entity;

import com.pckeiba.entity.JvdWakurenHyosu;
import com.pckeiba.entity.JvdWakurenHyosuExample;
import com.pckeiba.entity.JvdWakurenHyosuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdWakurenHyosuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdWakurenHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdWakurenHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdWakurenHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdWakurenHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdWakurenHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdWakurenHyosu> selectByExample(JvdWakurenHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdWakurenHyosu selectByPrimaryKey(JvdWakurenHyosuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdWakurenHyosu record, @Param("example") JvdWakurenHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdWakurenHyosu record, @Param("example") JvdWakurenHyosuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdWakurenHyosu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_wakuren_hyosu
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdWakurenHyosu record);
}