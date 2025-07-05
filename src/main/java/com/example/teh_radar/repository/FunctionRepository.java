package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Function;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FunctionRepository extends JpaRepository<Function, Long> {

    //Ищет функцию по name из БД
    Optional<Function> findByName(String name);

}
