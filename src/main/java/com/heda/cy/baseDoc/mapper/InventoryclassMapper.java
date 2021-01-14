package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Inventoryclass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryclassMapper {
    int deleteByPrimaryKey(String cinvccode);

    int insert(Inventoryclass record);

    int insertSelective(Inventoryclass record);

    Inventoryclass selectByPrimaryKey(Inventoryclass inventoryclass);

    int updateByPrimaryKeySelective(Inventoryclass record);

    int updateByPrimaryKey(Inventoryclass record);

    List<Inventoryclass> inventoryClass(Inventoryclass inventoryclass);
}