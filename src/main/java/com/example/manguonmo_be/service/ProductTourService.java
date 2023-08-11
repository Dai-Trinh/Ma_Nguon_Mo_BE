package com.example.manguonmo_be.service;


import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.QProductTourEntity;
import com.example.manguonmo_be.repository.ProductTourRepository;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.mapper.ProductTourMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductTourService {

    @Autowired
    ProductTourRepository productTourRepository;


    @PersistenceContext
    EntityManager entityManager;


    public CommonResponse getAllProductTour(PageInput<ProductTourDTO> input){

        List<ProductTourEntity> productTourEntities = new ArrayList<>();

        ProductTourDTO productTourDTO = input.getFilter();
        Pageable pageable = Pageable.unpaged();
        if(input.getPageSize() != 0){
            pageable = PageRequest.of(input.getPageNumber(), input.getPageSize());
        }
        QProductTourEntity qProductTourEntity = QProductTourEntity.productTourEntity;
        JPAQuery query = new JPAQueryFactory(entityManager)
                .selectFrom(qProductTourEntity);

        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qProductTourEntity.status.eq(true));
        if(!StringUtils.isEmpty(productTourDTO.getProductTourName())){
            booleanBuilder.and(qProductTourEntity.productTourName.containsIgnoreCase(productTourDTO.getProductTourName()));
        }

        if(!StringUtils.isEmpty(productTourDTO.getProductTourAddressStart())){
            booleanBuilder.and(qProductTourEntity.productTourAddressStart.containsIgnoreCase(productTourDTO.getProductTourAddressStart()));
        }

        query.where(booleanBuilder);

        productTourEntities = query.fetch();
        long count = query.fetchCount();
        Page<ProductTourEntity> productTourEntityPageable = new PageImpl<>(productTourEntities, pageable, count);
        List<ProductTourDTO> productTourDTOList = new ArrayList<>();
        for (ProductTourEntity productTourEntity : productTourEntityPageable.getContent()){
            productTourDTOList.add(ProductTourMapper.INSTANCE.convertToDTO(productTourEntity));
        }

        return new CommonResponse().success()
                .data(productTourDTOList)
                .dataCount(productTourEntityPageable.getTotalElements());

    }


}
