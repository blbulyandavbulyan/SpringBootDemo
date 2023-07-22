package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.User;

public record UserDto(Long userId, String name, Long age) {
    public UserDto(User user){
        this(user.getId(), user.getName(), user.getAge());
    }
}
