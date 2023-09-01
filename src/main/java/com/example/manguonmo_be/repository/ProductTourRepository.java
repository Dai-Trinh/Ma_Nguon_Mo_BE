package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.ProductTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductTourRepository extends JpaRepository<ProductTourEntity, Integer> {

    @Query("select p from ProductTourEntity p where p.status = true and p.productTourCode = :productTourCode")
    ProductTourEntity getProductTourEntitiesByCode(@Param("productTourCode") String productTourCode);
}
