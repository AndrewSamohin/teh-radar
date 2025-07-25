package com.example.teh_radar.mapper;

import com.example.teh_radar.entity.Category;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface CategoryMapper {

    default Category fromId(Long id) {
        if (id == null) return null;
        Category cat = new  Category();
        cat.setId(id);
        return cat;
    }

}
