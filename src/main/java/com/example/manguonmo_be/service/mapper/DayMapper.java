package com.example.manguonmo_be.service.mapper;


import com.example.manguonmo_be.model.DayEntity;
import com.example.manguonmo_be.service.dto.DayDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DayMapper {

    DayMapper INSTANCE = Mappers.getMapper(DayMapper.class);

    DayDTO convertToDTO(DayEntity dayEntity);

}
