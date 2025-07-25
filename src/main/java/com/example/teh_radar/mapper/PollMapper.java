package com.example.teh_radar.mapper;

import com.example.teh_radar.dto.PollRequestDto;
import com.example.teh_radar.entity.Poll;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        config = MapStructConfig.class,
        uses = { RingMapper.class, TechnologyMapper.class, UserMapper.class }
)
public interface PollMapper {

    @Mapping(target = "id",  ignore = true)
    @Mapping(source = "technologyId", target = "technology.id")
    @Mapping(source = "ringId", target = "ring.id")
    @Mapping(target = "time",  ignore = true)
    Poll toEntity(PollRequestDto dto);

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "technology.id", target = "technologyId")
    @Mapping(source = "ring.id", target = "ringId")
    @Mapping(source = "ring.name", target = "ringName")
    PollRequestDto toDto(Poll poll);

}
