package com.example.manguonmo_be.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_category_tour")
public class CategoryTourEntity extends AttributesCommon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String categoryTourName;

    @Column(name = "number_guest")
    private String categoryTourNumberGuest;

    @Column(name = "avatar")
    private String categoryTourAvatar;

    @Column(name = "is_love")
    private Boolean categoryTourIsLove;

    @Column(name = "status")
    private Boolean status;

    @OneToMany(mappedBy = "categoryTourEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<ProductTourEntity> productTourEntities = new HashSet<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Set<ProductTourEntity> getProductTourEntities() {
        return productTourEntities;
    }

    public void setProductTourEntities(Set<ProductTourEntity> productTourEntities) {
        this.productTourEntities = productTourEntities;
    }
}
