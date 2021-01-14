package com.heda.cy.baseDoc.service.impl;

import com.heda.cy.baseDoc.mapper.InventoryMapper;
import com.heda.cy.baseDoc.mapper.InventoryclassMapper;
import com.heda.cy.baseDoc.pojo.Inventory;
import com.heda.cy.baseDoc.pojo.Inventoryclass;
import com.heda.cy.baseDoc.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements IInventoryService {

    @Autowired
    private InventoryclassMapper inventoryclassMapper;
    @Autowired
    private InventoryMapper inventoryMapper;


    @Override
    public List<Inventoryclass> inventoryClass(Inventoryclass inventoryclass) {
        return inventoryclassMapper.inventoryClass(inventoryclass);
    }

    @Override
    public void SyncInventoryClass(List<Inventoryclass> inventoryclassList, String u8name) {
        inventoryclassList.forEach(inventoryclass -> {
            inventoryclass.setU8name(u8name);
            Inventoryclass inventoryclass1 = inventoryclassMapper.selectByPrimaryKey(inventoryclass);
            if(inventoryclass1 == null) inventoryclassMapper.insertSelective(inventoryclass); else inventoryclassMapper.updateByPrimaryKeySelective(inventoryclass);
        });
    }

    @Override
    public List<Inventory> inventory(Inventory inventory) {
        return inventoryMapper.inventory(inventory);
    }

    @Override
    public void SyncInventory(List<Inventory> inventoryList, String u8name) {
        for(Inventory inventory : inventoryList){

            Inventoryclass inventoryclass = new Inventoryclass();
            inventoryclass.setU8name(u8name);
            inventoryclass.setCinvccode(inventory.getCinvccode());
            if(inventoryclassMapper.selectByPrimaryKey(inventoryclass) == null) throw new RuntimeException("存货大类"+inventory.getCinvccode()+"不存在");

            inventory.setU8name(u8name);
            Inventory inventory1 = inventoryMapper.selectByPrimaryKey(inventory);
            if(inventory1 == null) inventoryMapper.insertSelective(inventory); else inventoryMapper.updateByPrimaryKeySelective(inventory);
        }
    }
}
