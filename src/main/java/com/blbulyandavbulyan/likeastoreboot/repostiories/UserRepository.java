package com.blbulyandavbulyan.likeastoreboot.repostiories;

import com.blbulyandavbulyan.likeastoreboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    <T>Collection<T> findAllBy(Class<T> type);

    <T> T findById(Long id, Class<T> type);
}
