package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.dtos.ItemAddRequest;
import com.blbulyandavbulyan.likeastoreboot.entities.Item;
import com.blbulyandavbulyan.likeastoreboot.repostiories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    public void save(Item item) {
        itemRepository.save(item);
    }

    public Collection<Item> findAll() {
        return itemRepository.findAll();
    }

    public void save(ItemAddRequest itemAddRequest) {
        itemRepository.save(new Item(itemAddRequest.title(), itemAddRequest.price()));
    }
}
