package com.blbulyandavbulyan.likeastoreboot.controllers;

import com.blbulyandavbulyan.likeastoreboot.dtos.UserDto;
import com.blbulyandavbulyan.likeastoreboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showMainPage(Model model){
        model.addAttribute("users", userService.findAll());
        return "users";
    }
    @PostMapping("/add")
    public String addNewUser(UserDto userDto){
        userService.save(userDto.toUser());
        return "redirect:/users";
    }

}