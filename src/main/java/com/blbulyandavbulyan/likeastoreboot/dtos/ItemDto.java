package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.Item;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record  ItemDto (@NotNull Long id, @NotEmpty String title, @NotNull @Min(1) Long price){
    public Item toItem(){
        return new Item(title, price);
    }
}
