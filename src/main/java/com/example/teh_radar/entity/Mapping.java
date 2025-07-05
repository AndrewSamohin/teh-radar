package com.example.teh_radar.entity;

import jakarta.persistence.*;
import lombok.Data;

//Явная промежуточная таблица роль–функция
@Entity
@Table(name = "mapping")
@Data
public class Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fun_id",  nullable = false)
    private Function function;

}
