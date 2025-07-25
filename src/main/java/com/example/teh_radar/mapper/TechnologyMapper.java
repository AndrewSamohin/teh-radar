package com.example.teh_radar.mapper;

import com.example.teh_radar.dto.TechnologyRequestDto;
import com.example.teh_radar.dto.TechnologyResponseDto;
import com.example.teh_radar.entity.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        config = MapStructConfig.class,
        uses = { CategoryMapper.class, SectionMapper.class, RingMapper.class, StatusMapper.class }
)
public interface TechnologyMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "sectionId", target = "section.id")
    @Mapping(source = "ringId", target = "ring.id")
    @Mapping(source = "statusId", target = "status.id")
    Technology toEntity(TechnologyRequestDto dto);

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(source = "section.id", target = "sectionId")
    @Mapping(source = "section.name", target = "sectionName")
    @Mapping(source = "ring.id", target = "ringId")
    @Mapping(source = "ring.name", target = "ringName")
    @Mapping(source = "status.id", target = "statusId")
    @Mapping(source = "status.name", target = "statusName")
    TechnologyResponseDto toDto(Technology entity);

}
