package com.heda.cy.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","index","login"})
    public String login(){
        return "login";
    }

    @RequestMapping("/main")
    public String index(){
        return "main";
    }

    @RequestMapping("/404")
    public String notFound(){
        return "/error/404";
    }
}
