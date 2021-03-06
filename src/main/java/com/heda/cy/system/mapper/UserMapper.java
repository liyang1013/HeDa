package com.heda.cy.system.mapper;

import com.heda.cy.system.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(User user);

    List<User> userList(User user);

    User selectByUserCode(String usercode);
}