package com.pckeiba.entity;

import com.pckeiba.entity.IpatTohyoRireki;
import com.pckeiba.entity.IpatTohyoRirekiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpatTohyoRirekiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int countByExample(IpatTohyoRirekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int deleteByExample(IpatTohyoRirekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int insert(IpatTohyoRireki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int insertSelective(IpatTohyoRireki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    List<IpatTohyoRireki> selectByExample(IpatTohyoRirekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") IpatTohyoRireki record, @Param("example") IpatTohyoRirekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ipat_tohyo_rireki
     *
     * @mbggenerated Mon Apr 29 22:52:29 GMT+09:00 2019
     */
    int updateByExample(@Param("record") IpatTohyoRireki record, @Param("example") IpatTohyoRirekiExample example);
}