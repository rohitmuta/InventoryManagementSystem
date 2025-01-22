package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.entity.Item;
import com.example.inventorymanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getItems")
    public ResponseEntity<?> getItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/getItemById/{id}")
    public ResponseEntity<?> getItemById(@PathVariable UUID id) {
            return itemService.getItemById(id);
    }

    @PostMapping("/addItem")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PutMapping("updateItem/{id}")
    public ResponseEntity<?> updateItem(@PathVariable UUID id, @RequestBody Item item) {
        return itemService.updateItems(id,item);
    }

    @DeleteMapping("/deleteItem/{id}")
    public ResponseEntity<String> deleteItemById(@PathVariable UUID id) {
        return itemService.deleteItem(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllItems(){
        return itemService.deleteAllItems();
    }
}
