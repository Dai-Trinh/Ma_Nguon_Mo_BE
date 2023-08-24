package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.service.dto.SystemPlanDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SystemPlanMapper {

    SystemPlanMapper INSTANCE = Mappers.getMapper(SystemPlanMapper.class);

    SystemPlanDTO convertToDTO(SystemPlanEntity systemPlanEntity);

}
