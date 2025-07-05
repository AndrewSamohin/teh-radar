package com.example.teh_radar.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Справочник категорий технологий
@Entity
@Table(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long id;

    @Column(name = "cat_name", nullable = false)
    private String name;

    //Технологии, относящиеся к этой категории 
    @OneToMany(mappedBy = "category",  fetch = FetchType.LAZY)
    private List<Technology> technologies;

}
