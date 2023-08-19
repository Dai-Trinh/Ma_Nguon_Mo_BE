package com.example.manguonmo_be.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.model.QCategoryTourEntity;
import com.example.manguonmo_be.repository.CategoryTourRepository;
import com.example.manguonmo_be.service.dto.CategoryTourDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.mapper.CategoryTourMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.manguonmo_be.service.BaseService;

@Service
public class CategoryTourService extends BaseService<CategoryTourEntity>{

	@Autowired
	CategoryTourRepository categoryTourRepository;

	@PersistenceContext
	EntityManager entityManager;

	@Override
	protected Class<CategoryTourEntity> clazz() {
		return CategoryTourEntity.class;
	}

	public CommonResponse getAllCategoryTour(PageInput<CategoryTourDTO> input){
		QCategoryTourEntity qCategoryTourEntity = QCategoryTourEntity.categoryTourEntity;

		JPAQuery query = new JPAQueryFactory(entityManager)
				.selectFrom(qCategoryTourEntity)
				.where(qCategoryTourEntity.status.eq(true));

		List<CategoryTourEntity> categoryTourEntities = query.fetch();
		List<CategoryTourDTO> categoryTourDTOS = new ArrayList<>();

		for (CategoryTourEntity categoryTourEntity : categoryTourEntities){
			CategoryTourDTO categoryTourDTO = new CategoryTourDTO();
			categoryTourDTO.setCategoryTourName(categoryTourEntity.getCategoryTourName());
			categoryTourDTO.setCategoryTourNumberGuest(categoryTourEntity.getCategoryTourNumberGuest());
			categoryTourDTO.setCategoryTourAvatar(categoryTourEntity.getCategoryTourAvatar());
			categoryTourDTO.setCategoryTourIsLove(categoryTourEntity.getCategoryTourIsLove());
			categoryTourDTOS.add(categoryTourDTO);
		}

		return new CommonResponse().success()
				.data(categoryTourDTOS)
				.dataCount(categoryTourEntities.size());

	}

	private boolean isEmptyUploadFile(MultipartFile image) {
		return image == null || image.getOriginalFilename().isEmpty();
	}
	private String getUniqueUploadFileName(String fileName) {
		String[] splitFileName = fileName.split("\\.");
		return splitFileName[0] + System.currentTimeMillis() + "." + splitFileName[1];
	}
	//them danh muc
	@Transactional
	public  CategoryTourEntity addCategoryTour(CategoryTourEntity categoryTour, MultipartFile categoryAvatar) throws IllegalStateException, IOException {
		if(!isEmptyUploadFile(categoryAvatar)) { //co day avatar len
			String fileName = getUniqueUploadFileName(categoryAvatar.getOriginalFilename());
			
			String pathToAvatar = "D:/Computer/Pictures-admin/upload/categoryTour/avatar/" + fileName;
			
			//luu avatar vao dương dan
			categoryAvatar.transferTo(new File(pathToAvatar));
			
			categoryTour.setCategoryTourAvatar("categoryTour/avatar/"+fileName);
		}
		
		return super.saveOrUpdate(categoryTour);
	}
	//sua danh muc
	@Transactional
	public CategoryTourEntity editCategoryTour(CategoryTourEntity categoryTour, MultipartFile categoryAvatar) throws IllegalStateException, IOException {
		//lay thong tin category theo id
		CategoryTourEntity categoryTourInDb = super.getById(categoryTour.getId());
		if(!isEmptyUploadFile(categoryAvatar)) {
			//xoa  avatar 
			new File("D:/Computer/Pictures-admin/upload/"+categoryTourInDb.getCategoryTourAvatar()).delete();
			
			//update avatar moi
			String fileName = getUniqueUploadFileName(categoryAvatar.getOriginalFilename());
			String pathToAvatar = "D:/Computer/Pictures-admin/upload/productTour/avatar/" + fileName;
			categoryAvatar.transferTo(new File(pathToAvatar));
			categoryTour.setCategoryTourAvatar("categoryTour/avatar/"+fileName);
		}else {
			categoryTour.setCategoryTourAvatar(categoryTourInDb.getCategoryTourAvatar());
		}
		return super.saveOrUpdate(categoryTour);
	}
	
	
}
