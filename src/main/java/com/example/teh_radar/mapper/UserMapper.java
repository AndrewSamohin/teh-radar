package com.example.teh_radar.mapper;

import com.example.teh_radar.dto.UserRegistrationDto;
import com.example.teh_radar.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper(
        config = MapStructConfig.class,
        componentModel = "spring",
        imports = PasswordEncoder.class
)
public abstract class UserMapper {

    @Autowired
    protected PasswordEncoder passwordEncoder;

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "passwordHash", expression = "java(passwordEncoder.encode(dto.getPassword()))")
    @Mapping(target = "refreshToken", ignore = true)
    @Mapping(target = "role", ignore = true)
    public abstract User toEntity(UserRegistrationDto dto);

}
