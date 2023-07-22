package com.blbulyandavbulyan.likeastoreboot.services;

import com.blbulyandavbulyan.likeastoreboot.entities.User;
import com.blbulyandavbulyan.likeastoreboot.repostiories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
