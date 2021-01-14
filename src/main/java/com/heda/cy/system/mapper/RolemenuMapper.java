package com.heda.cy.system.mapper;

import com.heda.cy.system.pojo.Rolemenu;

public interface RolemenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    Rolemenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);

    void deleteByRoleId(Integer roleid);
}