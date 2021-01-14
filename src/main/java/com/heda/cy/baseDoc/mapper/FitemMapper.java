package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Fitem;

import java.util.List;

public interface FitemMapper {
    int deleteByPrimaryKey(String citemClass);

    int insert(Fitem record);

    int insertSelective(Fitem record);

    Fitem selectByPrimaryKey(String citemClass);

    int updateByPrimaryKeySelective(Fitem record);

    int updateByPrimaryKey(Fitem record);

    List<Fitem> fitem(String u8name);
}