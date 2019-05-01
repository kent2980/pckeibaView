package com.pckeiba.entity;

import com.pckeiba.entity.JvdSeisanshaMaster;
import com.pckeiba.entity.JvdSeisanshaMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdSeisanshaMasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdSeisanshaMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdSeisanshaMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(String seisanshaCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdSeisanshaMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdSeisanshaMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdSeisanshaMaster> selectByExample(JvdSeisanshaMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdSeisanshaMaster selectByPrimaryKey(String seisanshaCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdSeisanshaMaster record, @Param("example") JvdSeisanshaMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdSeisanshaMaster record, @Param("example") JvdSeisanshaMasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdSeisanshaMaster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_seisansha_master
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdSeisanshaMaster record);
}