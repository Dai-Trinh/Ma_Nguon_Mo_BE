package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SaleOrderService extends BaseService<SaleOrderEntity> {
    @Override
    protected Class<SaleOrderEntity> clazz() {
        return SaleOrderEntity.class;
    }
}
