package com.doopai.litemall.database.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.doopai.litemall.database.domain.LitemallGoodsAttribute;
import com.doopai.litemall.database.domain.LitemallGoodsAttributeExample;

public interface LitemallGoodsAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    long countByExample(LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int insert(LitemallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int insertSelective(LitemallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    LitemallGoodsAttribute selectOneByExample(LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    LitemallGoodsAttribute selectOneByExampleSelective(@Param("example") LitemallGoodsAttributeExample example, @Param("selective") LitemallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    List<LitemallGoodsAttribute> selectByExampleSelective(@Param("example") LitemallGoodsAttributeExample example, @Param("selective") LitemallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    List<LitemallGoodsAttribute> selectByExample(LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    LitemallGoodsAttribute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    LitemallGoodsAttribute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    LitemallGoodsAttribute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallGoodsAttribute record, @Param("example") LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallGoodsAttribute record, @Param("example") LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}