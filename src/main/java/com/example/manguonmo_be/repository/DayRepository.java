package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DayRepository extends JpaRepository<DayEntity, Integer> {

    @Query("select d from DayEntity d where d.productTourEntityDay.productTourCode = :productCode")
    List<DayEntity> getDayByProductTour(@Param("productCode") String productCode);

}
