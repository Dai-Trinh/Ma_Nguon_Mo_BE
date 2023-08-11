package com.example.manguonmo_be.service;


import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.model.QCategoryTourEntity;
import com.example.manguonmo_be.repository.CategoryTourRepository;
import com.example.manguonmo_be.service.dto.CategoryTourDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class CategoryTourService {

    @Autowired
    CategoryTourRepository categoryTourRepository;

    @PersistenceContext
    EntityManager entityManager;

    public CommonResponse getAllCategoryTour(PageInput<CategoryTourDTO> input){
        Pageable pageable = Pageable.unpaged();
        if(input.getPageSize() != 0){
            pageable = PageRequest.of(input.getPageNumber(), input.getPageSize());
        }

        QCategoryTourEntity qCategoryTourEntity = QCategoryTourEntity.categoryTourEntity;
        JPAQuery query = new JPAQueryFactory(entityManager)
                .selectFrom(qCategoryTourEntity)
                .where(qCategoryTourEntity.status.eq(true));

        List<CategoryTourEntity> categoryTourEntityList = query.fetch();
        long count = query.fetchCount();

        Page<CategoryTourEntity> categoryTourEntities = new PageImpl<>(categoryTourEntityList, pageable, count);

        return new CommonResponse()
                .success()
                .data(categoryTourEntities.getContent())
                .dataCount(categoryTourEntities.getTotalElements());
    }

}
