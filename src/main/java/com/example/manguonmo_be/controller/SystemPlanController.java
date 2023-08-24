package com.example.manguonmo_be.controller;

import com.example.manguonmo_be.service.SystemPlanService;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SystemPlanController {

    @Autowired
    SystemPlanService systemPlanService;

    @PostMapping("/system_plan")
    public CommonResponse getSystemPlan(){
        return systemPlanService.getAllSystemPlan();
    }

}
