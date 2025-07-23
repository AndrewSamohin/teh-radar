package com.example.teh_radar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

//Входные данные для регистрации нового пользователя
@Data
public class UserRegistrationDto {

    @NotBlank(message = "Логин обязателен")
    @Size(min = 4, max = 50, message = "Логин от 4 до 50 символов")
    private String login;

    @NotBlank(message = "Email обязателен")
    @Email(message = "Неверный формат email")
    private String email;

    @NotBlank(message = "Пароль обязателен")
    @Size(min = 6, message = "Пароль не менее 6 символов")
    private String password;

}
