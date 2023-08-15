package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserRepository;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;

    public CommonResponse getLogIn(String email, String password){
        UserEntity userEntity = userRepository.getUserEntity(email, password);
        if(userEntity != null){
            return new CommonResponse().success();
        } else {
            return new CommonResponse().error();
        }
    }

}
