package com.example.manguonmo_be.controller.customer;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserTourRepository;
import com.example.manguonmo_be.request.UserRequest;
import com.example.manguonmo_be.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserTourRepository userTourRepository;
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<String> addRegisterUser(@RequestBody UserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setPassword(userRequest.getPassWord());
        userEntity.setUsername(userRequest.getUserName());
        userEntity.setPhone(userRequest.getPhone());
        if(userService.isEmailNumberExists(userRequest.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Tai khoan da ton tai!");
        }else{
            userTourRepository.save(userEntity);
            return  ResponseEntity.status(HttpStatus.CREATED).body("Luu thanh cong!");
        }
    }

}
