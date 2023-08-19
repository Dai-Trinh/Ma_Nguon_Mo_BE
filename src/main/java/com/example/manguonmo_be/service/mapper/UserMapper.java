package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.service.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO convertToDTO(UserEntity user);

    UserEntity convertToEntity (UserDTO userDTO);

}
