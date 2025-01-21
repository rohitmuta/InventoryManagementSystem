package com.example.inventorymanagement.controller;

import com.example.inventorymanagement.model.Item;
import com.example.inventorymanagement.repository.ItemRepository;
import com.example.inventorymanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Items/")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/getItems")
    public List<Item> getItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/getItemById/{id}")
    public Object getItemById(@PathVariable Long id){
            return itemService.getItemById(id);
    }

    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item){
        itemService.saveItem(item);
        return "Item Saved!";
    }
    @PutMapping("updateItem/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item){
        itemService.getItemById(id);
        item.setName(item.getName());
        item.setDescription(item.getDescription());
        item.setQuantity(item.getQuantity());
        itemService.saveItem(item);
        return item;
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItemById(@PathVariable Long id){
        if(itemRepository.existsById(id)) {
            itemService.deleteItem(id);
            return "Item Deleted!";
        }
        else {
            return "Item Not Found";
        }
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllItems(){
        itemService.deleteAllItems();
        return "All items deleted!";
    }
}
