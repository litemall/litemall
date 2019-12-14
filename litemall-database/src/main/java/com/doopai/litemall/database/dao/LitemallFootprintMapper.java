package com.doopai.litemall.database.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.doopai.litemall.database.domain.LitemallFootprint;
import com.doopai.litemall.database.domain.LitemallFootprintExample;

public interface LitemallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    long countByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int insert(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    LitemallFootprint selectOneByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    LitemallFootprint selectOneByExampleSelective(@Param("example") LitemallFootprintExample example, @Param("selective") LitemallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    List<LitemallFootprint> selectByExampleSelective(@Param("example") LitemallFootprintExample example, @Param("selective") LitemallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    List<LitemallFootprint> selectByExample(LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    LitemallFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    LitemallFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    LitemallFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallFootprint record, @Param("example") LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallFootprint record, @Param("example") LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}