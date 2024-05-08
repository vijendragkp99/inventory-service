package com.ms.training.inventoryms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.training.inventoryms.entity.InventoryEntity;
import com.ms.training.inventoryms.repo.InventoryRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository repository;

		
	public List<InventoryEntity> getInventories() {
		return repository.findAll();
	}

	
	
	public InventoryEntity saveInventory(InventoryEntity entity) {
		entity.setCreatedDate(new Date());
		repository.save(entity);
		return entity;
	}

	public InventoryEntity editInventory(InventoryEntity entity) {
		Optional<InventoryEntity> enFromDb = repository.findById(entity.getId());

		if (enFromDb.isPresent()) {
			InventoryEntity b = enFromDb.get();
			b.setProductCatalogId(entity.getProductCatalogId());
			b.setTotalStock(entity.getTotalStock());
			b.setAvailableStock(entity.getAvailableStock());
			b.setUnitPrice(entity.getUnitPrice());
			b.setIsActive(entity.getIsActive());
			repository.save(b);

		} else {
			repository.save(entity);
		}

		return entity;
	}

	public void deleteInventory(Long id) {
		repository.deleteById(id);
	}



	
	public Optional<InventoryEntity> getInventoryByProductCatalogID(Long productCatalogId) {
		// TODO Auto-generated method stub
		return repository.getInventoryByProductCatalogID(productCatalogId);
		
	}

	
}
