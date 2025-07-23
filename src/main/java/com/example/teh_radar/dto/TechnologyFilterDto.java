package com.example.teh_radar.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

//Параметры фильтрации и пагинации для GET /api/technology
@Data
public class TechnologyFilterDto {

    private String search; // фрагмент названия

    private Long categoryId;
    private Long sectionId;

    @PositiveOrZero(message = "Номер страницы не может быть отрицательным")
    private Integer page = 0;

    @Min(value = 1, message = "Размер страницы не менее 1")
    private Integer size = 20;

    // Сортировка (пример: "name,asc" или "updateTime,desc")
    private String sort;

}
