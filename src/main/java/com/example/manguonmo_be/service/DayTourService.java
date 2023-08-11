package com.example.manguonmo_be.service;

import java.io.IOException;

import javax.transaction.Transactional;

import com.example.manguonmo_be.model.DayEntity;
import org.springframework.stereotype.Service;


@Service
public class DayTourService extends BaseService<DayEntity>{

	@Override
	protected Class<DayEntity> clazz() {
		return DayEntity.class;
	}
	//them danh muc
	@Transactional
	public  DayEntity addDayTour(DayEntity dayTour) throws IllegalStateException, IOException {
		
		return super.saveOrUpdate(dayTour);
	}
	//sua danh muc
	@Transactional
	public DayEntity editDayTour(DayEntity dayTour) throws IllegalStateException, IOException {
		//lay thong tin category theo id
		DayEntity dayTourInDb = super.getById(dayTour.getId());
		return super.saveOrUpdate(dayTourInDb);
	}
}
