package com.example.manguonmo_be.service;


import com.example.manguonmo_be.repository.ProductTourRepository;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class ProductTourService {

    @Autowired
    ProductTourRepository productTourRepository;


    @PersistenceContext
    EntityManager entityManager;


    public CommonResponse getAllProductTour(PageInput<ProductTourDTO> input){
        Pageable pageable = Pageable.unpaged();
        if(input.getPageSize() != 0){
            pageable = PageRequest.of(input.getPageNumber(), input.getPageSize());
        }

        return new CommonResponse().success();

    }


}
