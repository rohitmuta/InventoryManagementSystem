package com.example.inventorymanagement.service;

import com.example.inventorymanagement.entity.Item;
import com.example.inventorymanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ResponseEntity<?> getAllItems() {
        if (itemRepository.findAll().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Items found!");
        }
        else {
            return ResponseEntity.ok().body(itemRepository.findAll());
        }
    }

    public ResponseEntity<?> getItemById(UUID id) {
        if(itemRepository.existsById(id)){
            return ResponseEntity.ok().body(itemRepository.findById(id));
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item Not Found");
        }
    }

    public ResponseEntity<Item> addItem(Item item) {
        itemRepository.save(item);
        return ResponseEntity.ok(item);
    }

    public ResponseEntity<?> updateItems(UUID id, Item item) {
        item.setId(id);
        if(itemRepository.existsById(id)) {
            itemRepository.save(item);
            return ResponseEntity.ok(item);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item Not Found!");
        }

    }
    public ResponseEntity<String> deleteItem(UUID id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return ResponseEntity.ok("Item Deleted!");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item Not Found!");
        }
    }

    public String deleteAllItems() {
        itemRepository.deleteAll();
        return "All Items Deleted!";
    }
}
