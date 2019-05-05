package com.pckeiba.entity;

import com.pckeiba.entity.JvdKishuChokyoshiComment;
import com.pckeiba.entity.JvdKishuChokyoshiCommentExample;
import com.pckeiba.entity.JvdKishuChokyoshiCommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JvdKishuChokyoshiCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int countByExample(JvdKishuChokyoshiCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByExample(JvdKishuChokyoshiCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int deleteByPrimaryKey(JvdKishuChokyoshiCommentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insert(JvdKishuChokyoshiComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int insertSelective(JvdKishuChokyoshiComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    List<JvdKishuChokyoshiComment> selectByExample(JvdKishuChokyoshiCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    JvdKishuChokyoshiComment selectByPrimaryKey(JvdKishuChokyoshiCommentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExampleSelective(@Param("record") JvdKishuChokyoshiComment record, @Param("example") JvdKishuChokyoshiCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByExample(@Param("record") JvdKishuChokyoshiComment record, @Param("example") JvdKishuChokyoshiCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKeySelective(JvdKishuChokyoshiComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvd_kishu_chokyoshi_comment
     *
     * @mbggenerated Thu May 02 12:36:46 GMT+09:00 2019
     */
    int updateByPrimaryKey(JvdKishuChokyoshiComment record);
}