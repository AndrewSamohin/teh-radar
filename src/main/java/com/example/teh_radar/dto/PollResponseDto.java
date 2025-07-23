package com.example.teh_radar.dto;

import lombok.Data;

import java.time.LocalDateTime;

//Ответ контроллера после создания или запроса истории опросов
@Data
public class PollResponseDto {

    private Long id;
    private Long userId;
    private Long technologyId;
    private Long ringId;
    private String ringName;
    private LocalDateTime time;

}
