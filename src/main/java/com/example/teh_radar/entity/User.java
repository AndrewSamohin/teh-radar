package com.example.teh_radar.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Пользователь системы
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "password_hash",  nullable = false)
    private String passwordHash;

    @Column(name = "refresh_token")
    private String refreshToken;

    //Опросы, проведённые пользователем
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Poll> polls;

}
