package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Inventory;

import java.util.List;

public interface InventoryMapper {
    int deleteByPrimaryKey(String cinvcode);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Inventory inventory);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    List<Inventory> inventory(Inventory inventory);
}