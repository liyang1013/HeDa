package com.heda.cy.baseDoc.mapper;

import com.heda.cy.baseDoc.pojo.Computationgroup;

import java.util.List;

public interface ComputationgroupMapper {
    int deleteByPrimaryKey(String cgroupcode);

    int insert(Computationgroup record);

    int insertSelective(Computationgroup record);

    Computationgroup selectByPrimaryKey(Computationgroup computationgroup);

    int updateByPrimaryKeySelective(Computationgroup record);

    int updateByPrimaryKey(Computationgroup record);

    List<Computationgroup> computationGroup(Computationgroup computationgroup);
}