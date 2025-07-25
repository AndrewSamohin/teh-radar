package com.example.teh_radar.mapper;

import com.example.teh_radar.entity.Ring;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface RingMapper {

    default Ring fromId(Long id) {
        if (id == null) return null;
        Ring r = new Ring();
        r.setId(id);
        return r;
    }

}
