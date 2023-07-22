package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.Item;
public record  ItemDto (String title, Long id, Long price){
    public Item toItem(){
        return new Item(title, price);
    }
}
