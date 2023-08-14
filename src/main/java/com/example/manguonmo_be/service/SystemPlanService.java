package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.SystemPlanEntity;
import org.springframework.stereotype.Service;

@Service
public class SystemPlanService extends BaseService<SystemPlanEntity>{
    @Override
    protected Class<SystemPlanEntity> clazz() {
        return SystemPlanEntity.class;
    }
}
