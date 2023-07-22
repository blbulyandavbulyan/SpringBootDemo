package com.blbulyandavbulyan.likeastoreboot.controllers;

import com.blbulyandavbulyan.likeastoreboot.dtos.ItemDto;
import com.blbulyandavbulyan.likeastoreboot.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;
    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
    @PostMapping("/add")
    public String addNewItem(ItemDto itemDto){
        itemService.save(itemDto.toItem());
        return "redirect:/items";
    }
    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("items", itemService.findAll());
        return "items";
    }
}