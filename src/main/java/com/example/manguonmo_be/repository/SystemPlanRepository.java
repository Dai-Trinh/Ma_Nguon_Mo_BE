package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.SystemPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface SystemPlanRepository extends JpaRepository<SystemPlanEntity, Integer> {

    @Query("select s from SystemPlanEntity s order by s.id desc")
    SystemPlanEntity getSystemPlan();

}
