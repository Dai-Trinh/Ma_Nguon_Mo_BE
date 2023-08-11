package com.example.manguonmo_be.service.mapper;


import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.service.dto.CategoryTourDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryTourMapper {

    CategoryTourMapper INSTANCE = Mappers.getMapper(CategoryTourMapper.class);

    CategoryTourDTO convertToDTO(CategoryTourEntity categoryTourEntity);

    CategoryTourEntity covertToEntity(CategoryTourDTO categoryTourDTO);


}
