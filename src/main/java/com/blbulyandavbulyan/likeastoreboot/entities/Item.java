package com.blbulyandavbulyan.likeastoreboot.entities;

import lombok.*;

import javax.persistence.*;

/**
 * Предоставляет сущность товара у которого есть: ИД, название, цена
 */
@Entity
@Table(name = "items")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Item {
    /**
     * ИД товара
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;
    /**
     * Название товара
     */
    @Column(name = "title")
    private String title;
    /**
     * Цена товара
     */
    @Column(name = "price")
    private Long price;
    public Item(String title, Long price) {
        this.title = title;
        this.price = price;
    }
}
