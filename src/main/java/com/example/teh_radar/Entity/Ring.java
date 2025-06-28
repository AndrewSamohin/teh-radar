package com.example.teh_radar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Справочник колец
@Entity
@Table(name = "rings")
@Data
public class Ring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ring_id")
    private Long id;

    @Column(name = "ring_name")
    private String name;

    //Технологии, находящиеся в этом кольце
    @OneToMany(mappedBy = "ring", fetch = FetchType.LAZY)
    private List<Technology> technologies;

    //Голоса пользователей, относившие технологию к этому кольцу
    @OneToMany(mappedBy = "ring", fetch = FetchType.LAZY)
    private List<Poll> polls;

}
