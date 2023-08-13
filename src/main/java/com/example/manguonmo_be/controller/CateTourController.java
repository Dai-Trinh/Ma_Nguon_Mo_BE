package com.example.manguonmo_be.controller;


import com.example.manguonmo_be.service.CategoryTourService;
import com.example.manguonmo_be.service.dto.CategoryTourDTO;
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
public class CateTourController {

    @Autowired
    CategoryTourService categoryTourService;

    @PostMapping(value = "/cate-tours", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponse getAllCateTour(@RequestBody PageInput<CategoryTourDTO> input){
        return categoryTourService.getAllCategoryTour(input);
    }

}
