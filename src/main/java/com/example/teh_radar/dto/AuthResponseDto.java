package com.example.teh_radar.dto;

import lombok.Data;

//Ответ контроллера после успешной аутентификации
@Data
public class AuthResponseDto {

    private String accessToken;
    private String refreshToken;
    private String tokenType = "Bearer";

}
