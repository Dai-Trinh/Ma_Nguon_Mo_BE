package com.example.manguonmo_be.service.dto;

import com.example.manguonmo_be.model.DayEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<DayEntity, Integer> {
}