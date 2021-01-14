package com.heda.cy.system.service;

import com.heda.cy.system.pojo.Role;

import java.util.List;

public interface IRoleService {
    List<Role> roleList(String rolename);

    void add(Role role);

    void del(Role role);
}
