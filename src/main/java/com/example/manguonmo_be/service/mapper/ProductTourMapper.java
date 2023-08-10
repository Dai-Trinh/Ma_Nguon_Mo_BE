package com.example.manguonmo_be.service.mapper;


import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductTourMapper {

    ProductTourMapper INSTANCE = Mappers.getMapper(ProductTourMapper.class);

    ProductTourDTO convertToDTO(ProductTourEntity productTourEntity);

    ProductTourEntity convertToEntity(ProductTourDTO productTourDTO);
}
