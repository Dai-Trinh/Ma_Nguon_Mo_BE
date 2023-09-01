package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.ProductTourRepository;
import com.example.manguonmo_be.repository.SaleOrderRepository;
import com.example.manguonmo_be.repository.SystemPlanRepository;
import com.example.manguonmo_be.repository.UserRepository;
import com.example.manguonmo_be.service.dto.SaleOrderDTO;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SaleOrderService extends BaseService<SaleOrderEntity> {

    @Autowired
    ProductTourRepository productTourRepository;

    @Autowired
    SaleOrderRepository saleOrderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    SystemPlanRepository systemPlanRepository;

    @Override
    protected Class<SaleOrderEntity> clazz() {
        return SaleOrderEntity.class;
    }

    public CommonResponse saveSaleOrder(SaleOrderDTO saleOrderDTO){
        SaleOrderEntity saleOrderEntity = new SaleOrderEntity();
        saleOrderEntity.setTotal(saleOrderDTO.getTotal());
        saleOrderEntity.setCustomerName(saleOrderDTO.getCustomerName());
        saleOrderEntity.setCustomerPhone(saleOrderDTO.getCustomerPhone());
        saleOrderEntity.setCustomerEmail(saleOrderDTO.getCustomerEmail());
        saleOrderEntity.setCreatedDate(new Date());
        saleOrderEntity.setNumberAdult(saleOrderDTO.getNumberAdult());
        saleOrderEntity.setNumberChildrenBig(saleOrderDTO.getNumberChildrenBig());
        saleOrderEntity.setNumberChildrenNormal(saleOrderDTO.getNumberChildrenNormal());
        saleOrderEntity.setNumberChildrenSmall(saleOrderDTO.getNumberChildrenSmall());
        ProductTourEntity productTourEntity = productTourRepository.getProductTourEntitiesByCode(saleOrderDTO.getCode());
        UserEntity user = userRepository.getUserByUserName(saleOrderDTO.getUserDTO().getUsername());
        saleOrderEntity.setProductTourEntity(productTourEntity);
        saleOrderEntity.setUser(user);
        saleOrderRepository.save(saleOrderEntity);
        SystemPlanEntity systemPlanEntity = systemPlanRepository.getSystemPlan();
        systemPlanEntity.setNumberTrip(systemPlanEntity.getNumberTrip()+1);
        systemPlanEntity.setNumberGuest(saleOrderDTO.getNumberAdult() + saleOrderDTO.getNumberChildrenNormal()
        + saleOrderDTO.getNumberChildrenBig() + saleOrderDTO.getNumberChildrenSmall());
        systemPlanRepository.save(systemPlanEntity);
        return new CommonResponse().success();

    }


}
