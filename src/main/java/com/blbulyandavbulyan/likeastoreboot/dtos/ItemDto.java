package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.Item;
public record  ItemDto (String title, Long itemId, Long price){

    public ItemDto(Item item){
        this(item.getTitle(), item.getId(), item.getPrice());
    }
    public Item toItem(){
        return new Item(title, price);
    }
}
