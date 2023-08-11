package com.example.manguonmo_be.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_category_tour")
public class CategoryTourEntity extends AttributesCommon{

    @Column(name = "name", length=100, nullable=false)
    private String categoryTourName;

    @Column(name = "number_guest")
    private int categoryTourNumberGuest;

    @Column(name = "avatar", length=200, nullable=false)
    private String categoryTourAvatar;

    @Column(name = "is_love", nullable = true)
    private Boolean categoryTourIsLove;

    @OneToMany(mappedBy = "categoryTourEntity", cascade = CascadeType.ALL)
    private Set<ProductTourEntity> productTourEntities = new HashSet<>();

    public String getCategoryTourName() {
        return categoryTourName;
    }

    public void setCategoryTourName(String categoryTourName) {
        this.categoryTourName = categoryTourName;
    }

    public int getCategoryTourNumberGuest() {
        return categoryTourNumberGuest;
    }

    public void setCategoryTourNumberGuest(int categoryTourNumberGuest) {
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
