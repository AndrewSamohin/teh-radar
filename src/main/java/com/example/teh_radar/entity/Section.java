package com.example.teh_radar.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Справочник секций (секции в техрадаре)
@Entity
@Table(name = "sections")
@Data
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sec_id")
    private Long id;

    @Column(name = "sec_name", nullable = false)
    private String name;

    //Технологии, относящиеся к этой секции
    @OneToMany(mappedBy = "section",  fetch = FetchType.LAZY)
    private List<Technology> technologies;

}
