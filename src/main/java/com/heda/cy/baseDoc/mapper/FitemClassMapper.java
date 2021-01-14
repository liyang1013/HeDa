package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Fitem;
import com.heda.cy.baseDoc.pojo.FitemClass;

import java.util.List;

public interface FitemClassMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(FitemClass record);

    int insertSelective(FitemClass record);

    FitemClass selectByPrimaryKey(FitemClass fitemClass);

    int updateByPrimaryKeySelective(FitemClass record);

    int updateByPrimaryKey(FitemClass record);

    List<FitemClass> fitemclass(Fitem fitem);
}