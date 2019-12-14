package com.doopai.litemall.database.dao;

import java.util.List;

import com.doopai.litemall.database.domain.LitemallLog;
import com.doopai.litemall.database.domain.LitemallLogExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    long countByExample(LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int insert(LitemallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int insertSelective(LitemallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    LitemallLog selectOneByExample(LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    LitemallLog selectOneByExampleSelective(@Param("example") LitemallLogExample example, @Param("selective") LitemallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    List<LitemallLog> selectByExampleSelective(@Param("example") LitemallLogExample example, @Param("selective") LitemallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    List<LitemallLog> selectByExample(LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    LitemallLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    LitemallLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    LitemallLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallLog record, @Param("example") LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallLog record, @Param("example") LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_log
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}