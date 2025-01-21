package com.example.inventorymanagement.service;

import com.example.inventorymanagement.model.Item;
import com.example.inventorymanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        if(itemRepository.existsById(id)){
            return itemRepository.findById(id);
        }
        else{
            return Optional.empty();
        }
    }
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
    public void deleteItem(Long id) {
            itemRepository.deleteById(id);
    }
    public void deleteAllItems() {
        itemRepository.deleteAll();
    }
}
