package com.heda.cy.system.mapper;

import com.heda.cy.system.pojo.Userrole;

public interface UserroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);

    void deleteByUserId(Integer userid);

    void updateByUserId(Userrole userrole);

    void deleteByRoleid(Integer roleid);
}