package com.example.teh_radar.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

//Справочник ролей пользователей
@Entity
@Table(name = "roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name", nullable = false, unique = true)
    private String name;

    //Пользователи с данной ролью
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;

    //Список связей роль-функция
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mapping> mappings;

}
