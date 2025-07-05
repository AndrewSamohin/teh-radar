package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SectionRepository extends JpaRepository<Section, Long> {

    //Для фалидации и фильтрации
    Optional<Section> findByName(String secName);

}
