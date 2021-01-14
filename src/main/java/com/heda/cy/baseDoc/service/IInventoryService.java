package com.heda.cy.baseDoc.service;

import com.heda.cy.baseDoc.pojo.Inventory;
import com.heda.cy.baseDoc.pojo.Inventoryclass;

import java.util.List;

public interface IInventoryService {
    List<Inventoryclass> inventoryClass(Inventoryclass inventoryclass);

    void SyncInventoryClass(List<Inventoryclass> inventoryclassList, String u8name);

    List<Inventory> inventory(Inventory inventory);

    void SyncInventory(List<Inventory> inventoryList, String u8name);
}
