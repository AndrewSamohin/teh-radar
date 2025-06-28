package com.example.teh_radar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Справочник статусов перемещения
@Entity
@Table(name = "statuses")
@Data
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stat_id")
    private Long id;

    @Column(name = "stat_name", nullable = false)
    private String name;

    //Технологии с этим статусом последнего опроса
    @OneToMany(mappedBy = "status",  fetch = FetchType.LAZY)
    private List<Technology> technologies;

}
