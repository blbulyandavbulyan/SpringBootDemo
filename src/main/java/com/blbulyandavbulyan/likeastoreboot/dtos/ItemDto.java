package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.Item;
public record  ItemDto (Long id, String title, Long price){
    public Item toItem(){
        return new Item(title, price);
    }
}
