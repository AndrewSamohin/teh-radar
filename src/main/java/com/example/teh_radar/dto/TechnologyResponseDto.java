package com.example.teh_radar.dto;

import lombok.Data;

import java.time.LocalDateTime;

//Ответ контроллера при GET /api/technology и подобных
@Data
public class TechnologyResponseDto {

    private Long id;
    private String name;
    private String description;

    private Long categoryId;
    private String categoryName;

    private Long sectionId;
    private String sectionName;

    private Long ringId;
    private String ringName;

    private Long statusId;
    private String statusName;

    private LocalDateTime updateTime;

}
