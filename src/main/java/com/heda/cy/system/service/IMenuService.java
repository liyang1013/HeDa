package com.heda.cy.system.service;

import com.heda.cy.system.pojo.Menu;
import com.heda.cy.system.pojo.Role;
import com.heda.cy.system.pojo.User;

import java.util.List;

public interface IMenuService {
    List<Menu> getMenuList(User user);

    List<Menu> menuList();

    List<Menu> menuListByRole(Role role);

    void changMenu(Integer roleid, Integer[] menuidList);
}
