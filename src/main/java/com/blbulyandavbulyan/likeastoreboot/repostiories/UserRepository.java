package com.blbulyandavbulyan.likeastoreboot.repostiories;

import com.blbulyandavbulyan.likeastoreboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
