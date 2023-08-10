package com.example.manguonmo_be.controller;


import com.example.manguonmo_be.service.ProductTourService;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductTourController {

    @Autowired
    ProductTourService productTourService;

    @PostMapping(value = "/product-tours", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponse getAllProductEntity(@RequestBody(required = false) PageInput<ProductTourDTO> input){
        return productTourService.getAllProductTour(input);
    }

}
