package com.blbulyandavbulyan.likeastoreboot.entities;

import javax.persistence.*;
import lombok.*;

/**
 * Предоставляет сущность пользователя у которого есть: ИД, имя, возраст
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    /**
     * ИД пользователя
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    /**
     * Имя пользователя
     */
    @Column(name = "name")
    private String name;
    /**
     * Возраст пользователя
     */
    @Column(name = "age")
    private Long age;

    public User(String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
