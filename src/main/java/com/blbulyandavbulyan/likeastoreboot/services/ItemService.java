package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.dtos.item.ItemAddRequest;
import com.blbulyandavbulyan.likeastoreboot.dtos.item.ItemDto;
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

    public Collection<ItemDto> findAll() {
        return itemRepository.findAllBy(ItemDto.class);
    }

    public void save(ItemAddRequest itemAddRequest) {
        itemRepository.save(new Item(itemAddRequest.title(), itemAddRequest.price()));
    }

    public void deleteById(Long id) {
        if (existsById(id))
            itemRepository.deleteById(id);
        else throw new ItemNotFoundException();
    }

    public boolean existsById(Long id) {
        return itemRepository.existsById(id);
    }

    public ItemDto findById(Long id) {
        if (existsById(id))
            return itemRepository.findById(id, ItemDto.class);
        else throw new ItemNotFoundException();
    }

    public void updateItem(ItemDto itemDto) {
        if(existsById(itemDto.id())){
            itemRepository.updateItem(itemDto);
        }
        else throw new ItemNotFoundException();
    }
}
