package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Computationunit;

import java.util.List;

public interface ComputationunitMapper {
    int deleteByPrimaryKey(String ccomunitcode);

    int insert(Computationunit record);

    int insertSelective(Computationunit record);

    Computationunit selectByPrimaryKey(Computationunit computationunit);

    int updateByPrimaryKeySelective(Computationunit record);

    int updateByPrimaryKey(Computationunit record);

    List<Computationunit> computationgroup(Computationunit computationunit);
}