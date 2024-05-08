package com.ms.training.inventoryms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ms.training.inventoryms.entity.InventoryEntity;
import com.ms.training.inventoryms.service.InventoryServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/inventoryms")
public class InventoryController {
    @Autowired
    private InventoryServiceImpl service;

    @RequestMapping(value="/fetchByproductCatalogId/{id}", method = RequestMethod.GET)
    public Optional<InventoryEntity> getInventoryByProductCatalogId(@PathVariable Long id){
        return service.getInventoryByProductCatalogID(id);
    }
    
    
    @RequestMapping(value="/fetch", method = RequestMethod.GET)
    public List<InventoryEntity> getInventories(){
        return service.getInventories();
    }
   
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public InventoryEntity saveInventory(@RequestBody InventoryEntity entity){
        return service.saveInventory(entity);
    }
    
    @RequestMapping(value="/edit", method = RequestMethod.PUT)
    public InventoryEntity editInventory(@RequestBody InventoryEntity entity){
        return service.editInventory(entity);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Long id){
        System.out.println("ID=" + id);
         service.deleteInventory(id);
         return "SUCCESS";
    }
    
    
}
