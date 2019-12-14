package com.doopai.litemall.database.dao;

import java.util.List;

import com.doopai.litemall.database.domain.LitemallRegion;
import com.doopai.litemall.database.domain.LitemallRegionExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    long countByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int insert(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int insertSelective(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    LitemallRegion selectOneByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    LitemallRegion selectOneByExampleSelective(@Param("example") LitemallRegionExample example, @Param("selective") LitemallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    List<LitemallRegion> selectByExampleSelective(@Param("example") LitemallRegionExample example, @Param("selective") LitemallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    List<LitemallRegion> selectByExample(LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    LitemallRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    LitemallRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallRegion record, @Param("example") LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallRegion record, @Param("example") LitemallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallRegion record);
}