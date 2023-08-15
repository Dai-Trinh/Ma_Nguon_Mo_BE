package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.ProductTourImageEntity;
import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.model.SystemPlanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class SystemPlanService extends BaseService<SystemPlanEntity>{
    @Autowired
    private SaleOrderService saleOrderService;

    @Override
    protected Class<SystemPlanEntity> clazz() {
        return SystemPlanEntity.class;
    }

    @Transactional
    public  SystemPlanEntity editNumberGuideModel(Integer numberGuideModel){
        SystemPlanEntity systemPlanEntity = super.getById(1);
        systemPlanEntity.setNumberGuide(numberGuideModel);
        return super.saveOrUpdate(systemPlanEntity);
    }
    @Transactional
    public  SystemPlanEntity editNumberTourModel(){
        SystemPlanEntity systemPlanEntity = super.getById(1);
        systemPlanEntity.setNumberTour(systemPlanEntity.getNumberTour()+1);
        return super.saveOrUpdate(systemPlanEntity);
    }
    @Transactional
    public  SystemPlanEntity editNumberTripModel(){
        SystemPlanEntity systemPlanEntity = super.getById(1);
        List<SaleOrderEntity> saleOrderEntityList = saleOrderService.findAll();
        systemPlanEntity.setNumberTrip(saleOrderEntityList.size());
        return super.saveOrUpdate(systemPlanEntity);
    }
}
