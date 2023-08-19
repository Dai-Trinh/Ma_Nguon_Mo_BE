package com.example.manguonmo_be.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.example.manguonmo_be.model.DayEntity;
import com.example.manguonmo_be.repository.DayRepository;
import com.example.manguonmo_be.service.dto.DayDTO;
import com.example.manguonmo_be.service.mapper.DayMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DayTourService extends BaseService<DayEntity>{

	@Autowired
	DayRepository dayRepository;

	@Override
	protected Class<DayEntity> clazz() {
		return DayEntity.class;
	}

	public CommonResponse getDayTourByProductCode(String productTourCode){

		List<DayDTO> dayDTOS = new ArrayList<>();
		List<DayEntity> dayEntities = dayRepository.getDayByProductTour(productTourCode);
		for (DayEntity dayEntity : dayEntities){
			dayDTOS.add(DayMapper.INSTANCE.convertToDTO(dayEntity));
		}

		return new CommonResponse().success()
				.data(dayDTOS)
				.dataCount(dayDTOS.size());
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
