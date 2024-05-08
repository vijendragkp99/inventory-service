package com.ms.training.inventoryms.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="inventory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long productCatalogId;
    private int totalStock;
    private int availableStock;
    private String unitPrice;
    private int isActive;
    private Date createdDate;
    
    
}
