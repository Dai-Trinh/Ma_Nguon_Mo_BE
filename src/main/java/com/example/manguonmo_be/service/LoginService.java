package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserRepository;
import com.example.manguonmo_be.service.dto.UserDTO;
import com.example.manguonmo_be.service.mapper.UserMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.example.manguonmo_be.service.respone.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserRepository userRepository;

    public CommonResponse getLogIn(String email, String password){
        UserEntity userEntity = userRepository.getUserEntity(email, password);
        if(userEntity != null){
            return new CommonResponse().success().data(userEntity);
        } else {
            return new CommonResponse().error();
        }
    }

    public CommonResponse dangKy(UserDTO userDTO){
        UserEntity userEntity = userRepository.getUserByUserName(userDTO.getUsername());
        if(userEntity != null){
            return new CommonResponse(new Result("400", "Đã tồn tại user", false), null, 0);
        }
        userEntity = UserMapper.INSTANCE.convertToEntity(userDTO);
        userRepository.save(userEntity);
        return new CommonResponse().success();
    }



}
