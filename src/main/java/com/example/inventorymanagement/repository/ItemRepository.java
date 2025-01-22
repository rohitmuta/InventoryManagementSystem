package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
}
