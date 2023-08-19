package com.example.manguonmo_be.controller.customer;

import com.example.manguonmo_be.service.DayTourService;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DayTourController {

    @Autowired
    DayTourService dayTourService;


    @PostMapping(value = "/day-tour/{productTourCode}")
    public CommonResponse getDayTourByProductTourCode(@PathVariable("productTourCode") String productTourCode){
        return dayTourService.getDayTourByProductCode(productTourCode);
    }

}
