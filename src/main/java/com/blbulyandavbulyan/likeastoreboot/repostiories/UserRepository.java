package com.blbulyandavbulyan.likeastoreboot.repostiories;

import com.blbulyandavbulyan.likeastoreboot.dtos.UserDto;
import com.blbulyandavbulyan.likeastoreboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    <T>Collection<T> findAllBy(Class<T> type);

    <T> T findById(Long id, Class<T> type);
    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.name = :#{#userDto.name}, u.age = :#{#userDto.age} WHERE u.id = :#{#userDto.id}")
    void updateUser(@Param("userDto") UserDto userDto);
}
