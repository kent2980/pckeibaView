package com.pckeiba.entity;

import com.pckeiba.entity.JvdJikeiretsuOddsMaster2;
import com.pckeiba.entity.JvdJikeiretsuOddsMaster2Example;
import com.pckeiba.entity.JvdJikeiretsuOddsMaster2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdJikeiretsuOddsMaster2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int countByExample(JvdJikeiretsuOddsMaster2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByExample(JvdJikeiretsuOddsMaster2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdJikeiretsuOddsMaster2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insert(JvdJikeiretsuOddsMaster2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int insertSelective(JvdJikeiretsuOddsMaster2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    List<JvdJikeiretsuOddsMaster2> selectByExample(JvdJikeiretsuOddsMaster2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    JvdJikeiretsuOddsMaster2 selectByPrimaryKey(JvdJikeiretsuOddsMaster2Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdJikeiretsuOddsMaster2 record, @Param("example") JvdJikeiretsuOddsMaster2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdJikeiretsuOddsMaster2 record, @Param("example") JvdJikeiretsuOddsMaster2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdJikeiretsuOddsMaster2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_jikeiretsu_odds_master2
     *
     * @mbggenerated Mon Apr 29 22:52:28 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdJikeiretsuOddsMaster2 record);
}