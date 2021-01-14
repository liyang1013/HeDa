package com.heda.cy.system.service.impl;

import com.heda.cy.system.mapper.MenuMapper;
import com.heda.cy.system.mapper.RolemenuMapper;
import com.heda.cy.system.pojo.Menu;
import com.heda.cy.system.pojo.Role;
import com.heda.cy.system.pojo.Rolemenu;
import com.heda.cy.system.pojo.User;
import com.heda.cy.system.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private RolemenuMapper rolemenuMapper;

    @Override
    public List<Menu> getMenuList(User user) {
        List<Menu> menuList = menuMapper.getMenuList(user.getUserid());
        menuList.forEach(menu -> menu.setMenus(menuMapper.getChildrenList(menu.getMenucode(),user.getUserid())));
        return menuList;
    }

    @Override
    public List<Menu> menuList() {
        return menuMapper.menuList();
    }

    @Override
    public List<Menu> menuListByRole(Role role) {
        return menuMapper.menuListByRole(role.getRoleid());
    }

    @Override
    @Transactional
    public void changMenu(Integer roleid, Integer[] menuidList) {
        rolemenuMapper.deleteByRoleId(roleid);
        for(int menuid : menuidList){
            Rolemenu rolemenu = new Rolemenu();
            rolemenu.setMenuid(menuid);
            rolemenu.setRoleid(roleid);
            rolemenuMapper.insert(rolemenu);
        }
    }
}
