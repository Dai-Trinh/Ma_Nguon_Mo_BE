package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.CategoryTourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryTourRepository extends JpaRepository<CategoryTourEntity, Integer> {
    @Query(value = "SELECT * FROM tbl_category_tour WHERE name LIKE %:keyword%", nativeQuery = true)
    List<CategoryTourEntity> searchByCategoryNameContainingKeyword(@Param("keyword") String keyword);
}
