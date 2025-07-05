package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Репозиторий для связи Role–Function
public interface MappingRepository extends JpaRepository<Mapping, Long> {
    //Список доступных функций для заданной роли
    List<Mapping> findAllByRoleId(Long roleId);

}
