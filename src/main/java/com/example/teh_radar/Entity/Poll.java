package com.example.teh_radar.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

//Опрос пользователя по технологии
@Entity
@Table(name = "polls")
@Data
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "poll_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_id", nullable = false)
    private Technology technology;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ring_id", nullable = false)
    private Ring ring;

    //Время голосования; по умолчанию NOW()
    @Column(name = "time", nullable = false)
    private LocalDateTime time;

}