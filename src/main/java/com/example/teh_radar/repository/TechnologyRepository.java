package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//Репозиторий для технологий
public interface TechnologyRepository extends
        JpaRepository<Technology, Long>,
        JpaSpecificationExecutor<Technology> {

    //Поиск по части названия
    List<Technology> findByName(String fragment);

    //Получить все технологии из конкретной категории и секции (для фильтрации)
    List<Technology> findByCategoryId(Long catId, Long secId);

    //Количество голосов по кольцам для данной технологии
    @Query("""
        SELECT r.name AS ringName, COUNT(p) AS voteCount 
        FROM Poll p 
        JOIN p.ring r 
        WHERE p.technology.id = :techId
        GROUP BY r.name 
        ORDER BY r.name
    """)
    List<Object[]> countVotesByRing(@Param("techId") Long techId);
}
