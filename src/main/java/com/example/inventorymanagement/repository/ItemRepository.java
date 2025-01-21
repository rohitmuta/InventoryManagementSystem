package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
