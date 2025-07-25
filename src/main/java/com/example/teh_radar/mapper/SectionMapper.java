package com.example.teh_radar.mapper;

import com.example.teh_radar.entity.Section;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface SectionMapper {

    default Section fromId(Long id) {
        if (id == null) return null;
        Section sec = new  Section();
        sec.setId(id);
        return sec;
    }

}
