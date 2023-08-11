package com.example.manguonmo_be.service.dto;

import com.example.manguonmo_be.model.ProductTourEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class CategoryTourDTO {

    private String categoryTourName;

    private String categoryTourNumberGuest;

    private String categoryTourAvatar;

    private Boolean categoryTourIsLove;

    private Set<ProductTourEntity> productTourEntities = new HashSet<>();

    public String getCategoryTourName() {
        return categoryTourName;
    }

    public void setCategoryTourName(String categoryTourName) {
        this.categoryTourName = categoryTourName;
    }

    public String getCategoryTourNumberGuest() {
        return categoryTourNumberGuest;
    }

    public void setCategoryTourNumberGuest(String categoryTourNumberGuest) {
        this.categoryTourNumberGuest = categoryTourNumberGuest;
    }

    public String getCategoryTourAvatar() {
        return categoryTourAvatar;
    }

    public void setCategoryTourAvatar(String categoryTourAvatar) {
        this.categoryTourAvatar = categoryTourAvatar;
    }

    public Boolean getCategoryTourIsLove() {
        return categoryTourIsLove;
    }

    public void setCategoryTourIsLove(Boolean categoryTourIsLove) {
        this.categoryTourIsLove = categoryTourIsLove;
    }

    public Set<ProductTourEntity> getProductTourEntities() {
        return productTourEntities;
    }

    public void setProductTourEntities(Set<ProductTourEntity> productTourEntities) {
        this.productTourEntities = productTourEntities;
    }
}
