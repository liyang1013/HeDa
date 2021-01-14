package com.heda.cy.baseDoc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heda.cy.baseDoc.pojo.Code;
import com.heda.cy.baseDoc.pojo.Computationgroup;
import com.heda.cy.baseDoc.pojo.Computationunit;
import com.heda.cy.baseDoc.service.IComputationService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computation")
public class ComputationController {

    @Autowired
    private IComputationService iComputationService;

    @RequestMapping("/computationGroup")
    public BaseResult computationGroup(@RequestBody Computationgroup computationgroup){
        return BaseResult.success(iComputationService.computationGroup(computationgroup));
    }

    @RequestMapping("/SynccomputationGroup")
    public BaseResult SynccomputationGroup(@RequestBody List<Computationgroup> computationgroupList, String u8name){
        try{iComputationService.SynccomputationGroup(computationgroupList,u8name);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/computationunit")
    public BaseResult computationgroup(@RequestBody Computationunit computationunit,Integer size, Integer pages){
        PageHelper.startPage(pages,size);
        Page<Computationunit> computationunitPage = (Page<Computationunit>)iComputationService.computationgroup(computationunit);
        return BaseResult.success(computationunitPage,computationunitPage.getTotal());
    }

    @RequestMapping("/Synccomputationunit")
    public BaseResult Synccomputationunit(@RequestBody List<Computationunit> computationunitList, String u8name){
        try{iComputationService.Synccomputationunit(computationunitList,u8name);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
