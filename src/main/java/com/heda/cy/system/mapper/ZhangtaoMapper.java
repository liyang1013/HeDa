package com.heda.cy.system.mapper;

import com.heda.cy.system.pojo.Zhangtao;

import java.util.List;

public interface ZhangtaoMapper {
    int insert(Zhangtao record);

    int insertSelective(Zhangtao record);

    List<Zhangtao> minorZhangtao();

    Zhangtao majorZhangtao();
}