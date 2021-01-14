package com.heda.cy.baseDoc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heda.cy.baseDoc.pojo.Code;
import com.heda.cy.baseDoc.pojo.CodeKey;
import com.heda.cy.baseDoc.pojo.Inventoryclass;
import com.heda.cy.baseDoc.service.ICodeService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/code")
public class CodeController {

    @Autowired
    private ICodeService iCodeService;

    @RequestMapping("/code")
    public BaseResult code(@RequestBody CodeKey codeKey, Integer size, Integer pages){
        PageHelper.startPage(pages,size);
        Page<Code> codePage = (Page<Code>)iCodeService.code(codeKey);
        return BaseResult.success(codePage,codePage.getTotal());
    }

    @RequestMapping("/SyncCode")
    public BaseResult SyncCode(@RequestBody List<Code> codeList,String u8name){
        try{iCodeService.SyncCode(codeList,u8name);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
