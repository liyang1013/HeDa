package com.heda.cy.system.service.impl;

import com.heda.cy.system.mapper.UserMapper;
import com.heda.cy.system.mapper.UserroleMapper;
import com.heda.cy.system.pojo.User;
import com.heda.cy.system.pojo.Userrole;
import com.heda.cy.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserroleMapper userroleMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> userList(User user) {
        return userMapper.userList(user);
    }

    @Override
    @Transactional
    public void add(User user) {
        if(userMapper.selectByUserCode(user.getUsercode()) == null) {
            user.setIsadmin(false);
            userMapper.insertSelective(user);
            Userrole userrole = new Userrole();
            userrole.setRoleid(user.getRole().getRoleid());
            userrole.setUserid(user.getUserid());
            userroleMapper.insert(userrole);
        }else throw new RuntimeException("用户已存在");
    }

    @Override
    @Transactional
    public void update(User user) {
        if(userMapper.selectByUserCode(user.getUsercode()) == null) {
            throw new RuntimeException("用户不存在");
        }else {
            userMapper.updateByPrimaryKeySelective(user);
            Userrole userrole = new Userrole();
            userrole.setRoleid(user.getRole().getRoleid());
            userrole.setUserid(user.getUserid());
            userroleMapper.updateByUserId(userrole);
        }
    }

    @Override
    @Transactional
    public void del(User user) {
        userroleMapper.deleteByUserId(user.getUserid());
        userMapper.deleteByPrimaryKey(user.getUserid());
    }
}
