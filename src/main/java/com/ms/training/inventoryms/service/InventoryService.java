package com.ms.training.inventoryms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.ms.training.inventoryms.entity.InventoryEntity;



public interface InventoryService {
	
	public List<InventoryEntity> getInventories();
	public InventoryEntity saveInventory(InventoryEntity entity);
	public InventoryEntity editInventory(InventoryEntity entity) ;
	public void deleteInventory(Long id);
	
}
