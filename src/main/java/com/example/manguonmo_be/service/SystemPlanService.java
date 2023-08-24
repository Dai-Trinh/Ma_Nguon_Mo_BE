package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.repository.SystemPlanRepository;
import com.example.manguonmo_be.service.dto.SystemPlanDTO;
import com.example.manguonmo_be.service.mapper.SystemPlanMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SystemPlanService extends BaseService<SystemPlanEntity>{
    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    SystemPlanRepository systemPlanRepository;

    @Override
    protected Class<SystemPlanEntity> clazz() {
        return SystemPlanEntity.class;
    }

    public CommonResponse<SystemPlanDTO> getAllSystemPlan(){
        SystemPlanEntity systemPlanEntity = systemPlanRepository.getSystemPlan();
        SystemPlanDTO systemPlanDTO = SystemPlanMapper.INSTANCE.convertToDTO(systemPlanEntity);
        return new CommonResponse<>().success().data(systemPlanDTO);
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
