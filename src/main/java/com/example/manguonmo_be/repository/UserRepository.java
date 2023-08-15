package com.example.manguonmo_be.repository;

import com.example.manguonmo_be.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query("select u from UserEntity u where u.email = :email and u.password = :password")
    UserEntity getUserEntity(@Param("email") String email, @Param("password") String password);

}
