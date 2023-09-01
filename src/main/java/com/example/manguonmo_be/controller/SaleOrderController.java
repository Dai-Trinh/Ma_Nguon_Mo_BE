package com.example.manguonmo_be.controller;

import com.example.manguonmo_be.service.SaleOrderService;
import com.example.manguonmo_be.service.dto.SaleOrderDTO;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleOrderController {

    @Autowired
    SaleOrderService saleOrderService;

    @PostMapping("/saleorder")
    public CommonResponse salẻOrder(@RequestBody SaleOrderDTO saleOrderDTO){
        return saleOrderService.saveSaleOrder(saleOrderDTO);
    }


}
