package com.example.manguonmo_be.service.mapper;


import com.example.manguonmo_be.model.ProductTourImageEntity;
import com.example.manguonmo_be.service.dto.ProductTourImageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductTourImageMapper {

    ProductTourImageMapper INSTANCE = Mappers.getMapper(ProductTourImageMapper.class);

    ProductTourImageDTO convertToDTO(ProductTourImageEntity productTourImageEntity);

}
