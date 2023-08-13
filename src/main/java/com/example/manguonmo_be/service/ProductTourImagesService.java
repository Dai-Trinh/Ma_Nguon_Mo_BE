package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.ProductTourImageEntity;
import org.springframework.stereotype.Service;


@Service
public class ProductTourImagesService extends BaseService<ProductTourImageEntity>{

	@Override
	protected Class<ProductTourImageEntity> clazz() {
		// TODO Auto-generated method stub
		return ProductTourImageEntity.class;
	}

}
