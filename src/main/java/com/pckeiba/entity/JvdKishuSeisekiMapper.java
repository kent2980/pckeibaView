package com.pckeiba.entity;

import com.pckeiba.entity.JvdKishuSeiseki;
import com.pckeiba.entity.JvdKishuSeisekiExample;
import com.pckeiba.entity.JvdKishuSeisekiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKishuSeisekiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdKishuSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdKishuSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdKishuSeisekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdKishuSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdKishuSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdKishuSeiseki> selectByExample(JvdKishuSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdKishuSeiseki selectByPrimaryKey(JvdKishuSeisekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKishuSeiseki record, @Param("example") JvdKishuSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKishuSeiseki record, @Param("example") JvdKishuSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKishuSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKishuSeiseki record);
}