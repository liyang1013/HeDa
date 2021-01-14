package com.heda.cy.baseDoc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heda.cy.baseDoc.pojo.Inventory;
import com.heda.cy.baseDoc.pojo.Inventoryclass;
import com.heda.cy.baseDoc.service.IInventoryService;
import com.heda.cy.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private IInventoryService iInventoryService;

    @RequestMapping("/inventoryClass")
    public BaseResult inventoryClass(@RequestBody Inventoryclass inventoryclass,Integer size,Integer pages){
        PageHelper.startPage(pages,size);
        Page<Inventoryclass> inventoryclasses = (Page<Inventoryclass>)iInventoryService.inventoryClass(inventoryclass);
       return BaseResult.success(inventoryclasses,inventoryclasses.getTotal());
    }

    @RequestMapping("/SyncInventoryClass")
    public BaseResult SyncInventoryClass(@RequestBody List<Inventoryclass> inventoryclassList, String u8name){
        try{iInventoryService.SyncInventoryClass(inventoryclassList,u8name);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }

    @RequestMapping("/inventory")
    public BaseResult inventory(@RequestBody Inventory inventory, Integer size, Integer pages){
        PageHelper.startPage(pages,size);
        Page<Inventory> inventoryclasses = (Page<Inventory>)iInventoryService.inventory(inventory);
        return BaseResult.success(inventoryclasses,inventoryclasses.getTotal());
    }

    @RequestMapping("/SyncInventory")
    public BaseResult SyncInventory(@RequestBody List<Inventory> inventoryList, String u8name){
        try{iInventoryService.SyncInventory(inventoryList,u8name);}
        catch (Exception e){return BaseResult.fail(e.getMessage());}
        return BaseResult.success();
    }
}
