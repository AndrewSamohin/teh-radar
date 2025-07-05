package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    //Для валидации входных данных при создании/фильтрации технологий
    Optional<Category> findByName(String catName);

}
