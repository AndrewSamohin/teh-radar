package com.example.teh_radar.dto;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

//Входные данные для создания нового опроса (голосования)
@Data
public class PollRequestDto {

    @NotNull(message = "Не указан ID технологии")
    private Long technologyId;

    @NotNull(message = "Не указан ID кольца для голосования")
    private Long ringId;

}
