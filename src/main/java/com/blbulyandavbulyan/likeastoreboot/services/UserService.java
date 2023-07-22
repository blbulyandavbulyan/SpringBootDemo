package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.dtos.UserAddRequest;
import com.blbulyandavbulyan.likeastoreboot.dtos.UserDto;
import com.blbulyandavbulyan.likeastoreboot.entities.User;
import com.blbulyandavbulyan.likeastoreboot.repostiories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Collection<UserDto> findAll() {
        return userRepository.findAllBy(UserDto.class);
    }
    public void save(UserAddRequest userAddRequest) {
        userRepository.save(new User(userAddRequest.name(), userAddRequest.age()));
    }
}
