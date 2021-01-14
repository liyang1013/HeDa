package com.heda.cy.system.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heda.cy.system.pojo.User;
import com.heda.cy.system.service.IUserService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/login")
    public BaseResult login(@RequestBody User user, HttpSession session){
        User user1 = iUserService.login(user);
        if(user1 == null) return BaseResult.fail();
        session.setAttribute("user",user1);
        return BaseResult.success();
    }

    @RequestMapping("/logout")
    public BaseResult logout(HttpSession session){
        session.removeAttribute("user");
        return BaseResult.success();
    }

    @RequestMapping("/userInfo")
    public BaseResult userInfo(HttpSession session){
        return BaseResult.success(session.getAttribute("user"));
    }

    @RequestMapping("/userList")
    public BaseResult userList(User user,Integer size,Integer pages){
        PageHelper.startPage(pages,size);
        Page<User> userList = (Page<User>)iUserService.userList(user);
        return BaseResult.success(userList,userList.getTotal());
    }

    @RequestMapping("/add")
    public BaseResult add(@RequestBody User user){
        try{iUserService.add(user);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/update")
    public BaseResult update(@RequestBody User user){
        try{iUserService.update(user);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/del")
    public BaseResult del(@RequestBody User user){
        try{iUserService.del(user);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
