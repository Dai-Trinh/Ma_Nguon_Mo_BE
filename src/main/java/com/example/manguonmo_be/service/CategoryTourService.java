package com.example.manguonmo_be.service;

import java.io.File;
import java.io.IOException;

import javax.transaction.Transactional;

import com.example.manguonmo_be.model.CategoryTourEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.manguonmo_be.service.BaseService;

@Service
public class CategoryTourService extends BaseService<CategoryTourEntity>{

	@Override
	protected Class<CategoryTourEntity> clazz() {
		return CategoryTourEntity.class;
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
