package com.heda.cy.baseDoc.controller;

import com.heda.cy.baseDoc.pojo.Fitem;
import com.heda.cy.baseDoc.pojo.FitemClass;
import com.heda.cy.baseDoc.pojo.Fitemss;
import com.heda.cy.baseDoc.service.IFitemService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fitem")
public class FitemController {

    @Autowired
    private IFitemService iFitemService;

    @RequestMapping("/fitem")
    public BaseResult fitem(String u8name){
        return BaseResult.success(iFitemService.fitem(u8name));
    }

    @RequestMapping("/fitemclass")
    public BaseResult fitemclass(@RequestBody Fitem fitem){
        return BaseResult.success(iFitemService.fitemclass(fitem));
    }

    @RequestMapping("/SyncFitemclass")
    public BaseResult SyncFitemclass(@RequestBody List<FitemClass> fitemClassList, String u8name,String cclasstable){
        try{iFitemService.SyncFitemclass(fitemClassList,u8name,cclasstable);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/fitemss")
    public BaseResult fitems(@RequestBody Fitemss fitemss){
        return BaseResult.success(iFitemService.fitems(fitemss));
    }

    @RequestMapping("/SyncFitemss")
    public BaseResult SyncFitemss(@RequestBody List<Fitemss> fitemssList, String u8name,String ctable){
        try{iFitemService.SyncFitemss(fitemssList,u8name,ctable);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
