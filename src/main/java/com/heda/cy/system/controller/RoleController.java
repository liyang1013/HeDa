package com.heda.cy.system.controller;

import com.heda.cy.system.pojo.Role;
import com.heda.cy.system.service.IRoleService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @RequestMapping("/roleList")
    public BaseResult roleList(String rolename){
        return BaseResult.success(iRoleService.roleList(rolename));
    }

    @RequestMapping("/add")
    public BaseResult add(@RequestBody Role role){
        try{iRoleService.add(role);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/del")
    public BaseResult del(@RequestBody Role role){
        try{iRoleService.del(role);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
