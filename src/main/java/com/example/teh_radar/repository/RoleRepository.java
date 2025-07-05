package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    //Ищет роль по имени(tech_lead, developer)
    Optional<Role> findByName(String roleName);
    //Проверка наличия роли перед создание/обновлением
    boolean existsByName(String roleName);

}
