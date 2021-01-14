package com.heda.cy.system.controller;

import com.heda.cy.system.service.IZhangtaoService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zhangtao")
public class ZhangtaoController {

    @Autowired
    private IZhangtaoService iZhangtaoService;

    @RequestMapping("/minorZhangtao")
    public BaseResult minorZhangtao(){
        return BaseResult.success(iZhangtaoService.minorZhangtao());
    }

    @RequestMapping("/majorZhangtao")
    public BaseResult  majorZhangtao(){
        return BaseResult.success(iZhangtaoService.majorZhangtao());
    }
}
