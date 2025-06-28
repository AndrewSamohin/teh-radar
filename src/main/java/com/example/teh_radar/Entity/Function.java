package com.example.teh_radar.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

//Справочник функций, доступных в системе
@Entity
@Table(name = "functions")
@Data
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id")
    private Long id;

    @Column(name = "fun_name", nullable = false)
    private String name;

    //Список связей роль-функция
    @OneToMany(mappedBy = "function", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mapping>  mappings;

}
