package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Ring;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RingRepository extends JpaRepository<Ring, Long> {

    //Для логики опроса и расчета перемещения технологий
    Optional<Ring> findByName(String ringName);

}
