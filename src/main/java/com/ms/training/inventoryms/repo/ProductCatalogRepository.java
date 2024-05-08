package com.ms.training.inventoryms.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ms.training.inventoryms.entity.ProductCatalogEntity;


@Repository
public interface ProductCatalogRepository extends JpaRepository<ProductCatalogEntity, Long> {

}
