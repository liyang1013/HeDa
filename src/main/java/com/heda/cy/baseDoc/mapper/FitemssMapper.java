package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Fitemss;

import java.util.List;

public interface FitemssMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Fitemss record);

    int insertSelective(Fitemss record);

    Fitemss selectByPrimaryKey(Fitemss fitemss);

    int updateByPrimaryKeySelective(Fitemss record);

    int updateByPrimaryKey(Fitemss record);

    List<Fitemss> fitemss(Fitemss fitemss);
}