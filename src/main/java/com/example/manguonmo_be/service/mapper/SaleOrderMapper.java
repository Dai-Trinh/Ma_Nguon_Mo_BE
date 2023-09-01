package com.example.manguonmo_be.service.mapper;

import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.service.dto.SaleOrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SaleOrderMapper {

    SaleOrderMapper INSTANCE = Mappers.getMapper(SaleOrderMapper.class);

    SaleOrderEntity converToEntity(SaleOrderDTO saleOrderDTO);

}
