package com.example.manguonmo_be.service;

import com.example.manguonmo_be.model.AttributesCommon;

import java.util.List;


public class PagerData<E extends AttributesCommon> {

	// danh sách items
	private List<E> data;

	// tổng số items
	private int totalItems;

	// trang hiện tại
	private int currentPage;

	// số lượng item trên 1 trang
	private int sizeOfPage;
	
	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSizeOfPage() {
		return sizeOfPage;
	}

	public void setSizeOfPage(int sizeOfPage) {
		this.sizeOfPage = sizeOfPage;
	}
	
	
}
