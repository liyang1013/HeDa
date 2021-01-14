package com.heda.cy.system.service.impl;

import com.heda.cy.system.mapper.RoleMapper;
import com.heda.cy.system.mapper.RolemenuMapper;
import com.heda.cy.system.mapper.UserroleMapper;
import com.heda.cy.system.pojo.Role;
import com.heda.cy.system.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolemenuMapper rolemenuMapper;
    @Autowired
    private UserroleMapper userroleMapper;

    @Override
    public List<Role> roleList(String rolename) {
        return roleMapper.roleList(rolename);
    }

    @Override
    public void add(Role role) {
        roleMapper.insertSelective(role);
    }

    @Override
    @Transactional
    public void del(Role role) {
        userroleMapper.deleteByRoleid(role.getRoleid());
        rolemenuMapper.deleteByRoleId(role.getRoleid());
        roleMapper.deleteByPrimaryKey(role.getRoleid());
    }
}
