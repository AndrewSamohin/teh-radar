package com.example.teh_radar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

//Входные данные для создания и обновления Technology
@Data
public class TechnologyRequestDto {

    @NotBlank(message = "Название технологии не может быть пустым")
    @Size(max = 255, message = "Длина названия не более 255 символов")
    private String name;

    @Size(max = 1000, message = "Описание не более 1000 символов")
    private String description;

    @NotNull(message = "Не указана категория (catId)")
    private Long categoryId;

    @NotNull(message = "Не указана секция (secId)")
    private Long sectionId;

    // При создании кольцо и статус устанавливаются по умолчанию (из сервиса),
    // при обновлении можно передавать новое ringId/statusId:
    private Long ringId;
    private Long statusId;

}
