package com.example.teh_radar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

//Технология в техрадаре
@Entity
@Table(name = "technologies")
@Data
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tech_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cat_id",  nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sec_id",   nullable = false)
    private Section section;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "ring_id", nullable = false)
    private Ring ring;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stat_id",   nullable = false)
    private Status status;

    @Column(name = "update_time",  nullable = false)
    private LocalDateTime updateTime;

    //История опросов по этой технологии
    @OneToMany(mappedBy = "technology", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Poll> polls;

}
