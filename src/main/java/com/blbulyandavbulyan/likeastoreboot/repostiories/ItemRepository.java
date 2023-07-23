package com.blbulyandavbulyan.likeastoreboot.repostiories;

import com.blbulyandavbulyan.likeastoreboot.dtos.ItemDto;
import com.blbulyandavbulyan.likeastoreboot.dtos.UserDto;
import com.blbulyandavbulyan.likeastoreboot.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    <T> Collection<T> findAllBy(Class<T> type);
    <T> T findById(Long id, Class<T> type);
    @Transactional
    @Modifying
    @Query("UPDATE Item i SET i.title = :#{#itemDto.title}, i.price = :#{#itemDto.price} WHERE i.id = :#{#itemDto.id}")
    void updateItem(@Param("itemDto") ItemDto itemDto);
}
