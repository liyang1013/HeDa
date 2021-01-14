package com.heda.cy.system.controller;

import com.heda.cy.system.pojo.Role;
import com.heda.cy.system.pojo.User;
import com.heda.cy.system.service.IMenuService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("/getMenuList")
    public BaseResult getMenuList(@RequestBody User user){
        return BaseResult.success(iMenuService.getMenuList(user));
    }

    @RequestMapping("/menuList")
    public BaseResult menuList(){
        return BaseResult.success(iMenuService.menuList());
    }

    @RequestMapping("/menuListByRole")
    public BaseResult menuListByRole(@RequestBody Role role){
        return BaseResult.success(iMenuService.menuListByRole(role));
    }

    @RequestMapping("/changMenu")
    public BaseResult changMenu(Integer roleid, @RequestBody Integer[] menuidList){
        try{iMenuService.changMenu(roleid,menuidList);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
