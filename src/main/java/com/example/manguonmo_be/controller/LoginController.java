package com.example.manguonmo_be.controller;


import com.example.manguonmo_be.service.LoginService;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login/{email}/{password}")
    public CommonResponse getLogin(@PathVariable("email") String email, @PathVariable("password") String password){
        return loginService.getLogIn(email, password);
    }

}
