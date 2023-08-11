package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTourRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);
}
