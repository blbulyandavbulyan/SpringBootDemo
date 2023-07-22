package com.blbulyandavbulyan.likeastoreboot.controllers;

import com.blbulyandavbulyan.likeastoreboot.dtos.UserAddRequest;
import com.blbulyandavbulyan.likeastoreboot.dtos.UserDto;
import com.blbulyandavbulyan.likeastoreboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
    public String addNewUser(@Valid UserAddRequest userAddRequest){
        userService.save(userAddRequest);
        return "redirect:/users";
    }
    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model){
        UserDto userDto = userService.findById(id);
        model.addAttribute("user", userDto);
        return "edit-user";
    }
    @PostMapping("/edit")
    public String editUser(@Valid UserDto userDto){
        userService.updateUser(userDto);
        return "redirect:/users";
    }
    // TODO: 22.07.2023 добавить возможность удаления пользователя
}
