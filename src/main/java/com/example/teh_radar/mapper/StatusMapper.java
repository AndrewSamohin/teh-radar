package com.example.teh_radar.mapper;

import com.example.teh_radar.entity.Status;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface StatusMapper {

    default Status fromId(Long id) {
        if (id == null) return null;
        Status st = new Status();
        st.setId(id);
        return st;
    }

}
