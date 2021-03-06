package com.pckeiba.entity;

import com.pckeiba.entity.JvdChokyoshiSeiseki;
import com.pckeiba.entity.JvdChokyoshiSeisekiExample;
import com.pckeiba.entity.JvdChokyoshiSeisekiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdChokyoshiSeisekiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdChokyoshiSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdChokyoshiSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdChokyoshiSeisekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdChokyoshiSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdChokyoshiSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdChokyoshiSeiseki> selectByExample(JvdChokyoshiSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdChokyoshiSeiseki selectByPrimaryKey(JvdChokyoshiSeisekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdChokyoshiSeiseki record, @Param("example") JvdChokyoshiSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdChokyoshiSeiseki record, @Param("example") JvdChokyoshiSeisekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdChokyoshiSeiseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_chokyoshi_seiseki
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdChokyoshiSeiseki record);
}