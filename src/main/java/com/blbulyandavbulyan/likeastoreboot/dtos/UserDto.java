package com.blbulyandavbulyan.likeastoreboot.dtos;

import com.blbulyandavbulyan.likeastoreboot.entities.User;

public record UserDto(Long userId, String name, Long age) {
    public User toUser() {
        return new User(name, age);
    }
}
