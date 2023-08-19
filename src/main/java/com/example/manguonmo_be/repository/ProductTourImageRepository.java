package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.ProductTourImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductTourImageRepository extends JpaRepository<ProductTourImageEntity, Integer> {

    @Query("select p from ProductTourImageEntity p where p.productTourEntity.id = :id and p.status = true")
    List<ProductTourImageEntity> getProductTourImageEntitiesByIdProductTour(@Param("id") Integer id);

}
