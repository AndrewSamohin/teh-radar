package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Репозиторий для голосований пользователей
public interface PollRepository extends JpaRepository<Poll, Long> {

    //Получить историю голосований по технологии
    List<Poll> findByTechnologyId(Long techId);

    //История голосований конкретного пользователя
    List<Poll> findByUserId(Long userId);

    //Количество голосов за технологию в кольце
    long countByTechnologyIdAndRingId(Long techId, Long ringId);

}
