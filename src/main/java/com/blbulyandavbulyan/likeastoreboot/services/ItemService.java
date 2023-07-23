package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.dtos.ItemAddRequest;
import com.blbulyandavbulyan.likeastoreboot.entities.Item;
import com.blbulyandavbulyan.likeastoreboot.exceptions.ItemNotFoundException;
import com.blbulyandavbulyan.likeastoreboot.repostiories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Collection<Item> findAll() {
        return itemRepository.findAll();
    }

    public void save(ItemAddRequest itemAddRequest) {
        itemRepository.save(new Item(itemAddRequest.title(), itemAddRequest.price()));
    }

    public void deleteById(Long id) {
        if(itemRepository.existsById(id))
            itemRepository.deleteById(id);
        else throw new ItemNotFoundException();
    }
}
