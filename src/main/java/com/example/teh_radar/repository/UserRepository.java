package com.example.teh_radar.repository;

import com.example.teh_radar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //Для аутентификации
    Optional<User> findByLogin(String login);
    //Проверка уникальности логина при регистрации
    boolean existsByLogin(String login);

}
