package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.dtos.user.UserAddRequest;
import com.blbulyandavbulyan.likeastoreboot.dtos.user.UserDto;
import com.blbulyandavbulyan.likeastoreboot.entities.User;
import com.blbulyandavbulyan.likeastoreboot.exceptions.UserNotFoundException;
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

    public UserDto findById(Long id) {
        if (existsById(id))
            return userRepository.findById(id, UserDto.class);
        else throw new UserNotFoundException();
    }

    public void updateUser(UserDto userDto) {
        if (existsById(userDto.id()))
            userRepository.updateUser(userDto);
        else throw new UserNotFoundException();
    }

    public void deleteById(Long id) {
        if (existsById(id))
            userRepository.deleteById(id);
        else throw new UserNotFoundException();
    }

    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }
}
