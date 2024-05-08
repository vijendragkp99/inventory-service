package com.ms.training.inventoryms.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ms.training.inventoryms.entity.InventoryEntity;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM inventory e where e.product_catalog_id=?")
	public Optional<InventoryEntity> getInventoryByProductCatalogID(Long productCatalogId);
	
}
