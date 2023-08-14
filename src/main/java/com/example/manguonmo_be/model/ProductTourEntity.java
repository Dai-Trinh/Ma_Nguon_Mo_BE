package com.example.manguonmo_be.model;


import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessorOrder;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_product_tour")
public class ProductTourEntity extends AttributesCommon {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer productTourId ;

    @Column(name = "code", length = 45)
    private String productTourCode;

    @Column(name = "name", length = 200)
    private String productTourName;

    @Column(name = "name_detail", length = 300)
    private String productTourNameDetail;

    @Column(name = "time", length = 45)
    private String productTourTime;

    @Column(name = "time_start", length = 45)
    private String productTourTimeStart;

    @Column(name = "vehicle", length = 45)
    private String productTourVehicle;

    @Column(name = "address_start", length = 100)
    private String productTourAddressStart;

    @Column(name = "price", precision = 2, length = 13)
    private BigDecimal productTourPrice;

    @Column(name = "price_sale")
    private BigDecimal productTourPriceSale;

    @Column(name = "avatar", length = 200)
    private String productTourAvatar;

    @Column(name = "assess")
    private float productTourAssess;

    @Lob
    @Column(name = "highlight_tour", nullable = false, columnDefinition = "LONGTEXT")
    private String productTourHighlightTour;

    @Lob
    @Column(name = "service_tour", nullable = false, columnDefinition = "LONGTEXT")
    private String productTourServiceTour;

    @Column(name = "is_hot", nullable = true)
    private Boolean productTourIsHot = Boolean.TRUE;

    @Column(name = "is_sale", nullable = true)
    private Boolean productTourIsSale = Boolean.TRUE;

    @Column(name="seo", length=1000, nullable=true)
    private String seo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private CategoryTourEntity categoryTourEntity;

    @OneToMany(mappedBy = "productTourEntity", cascade = CascadeType.ALL)
    private Set<ProductTourImageEntity> productTourImageEntitySet = new HashSet<>();
    public void addProductTourImages(ProductTourImageEntity _proProductTourImages) {
        _proProductTourImages.setProductTourEntity(this);
        productTourImageEntitySet.add(_proProductTourImages);
    }
    public void deleteProductTourImages(ProductTourImageEntity _proProductTourImages) {
        _proProductTourImages.setProductTourEntity(null);
        productTourImageEntitySet.remove(_proProductTourImages);
    }

    @OneToMany(mappedBy = "productTourEntityDay", cascade = CascadeType.ALL)
    private Set<DayEntity> dayEntities = new HashSet<>();

    @OneToMany(mappedBy = "productTourEntity", cascade = CascadeType.ALL)
    private  Set<SaleOrderEntity> saleOrderEntities = new HashSet<>();

//    public Integer getProductTourId() {
//        return productTourId;
//    }
//
//    public void setProductTourId(Integer productTourId) {
//        this.productTourId = productTourId;
//    }

    public String getProductTourCode() {
        return productTourCode;
    }

    public void setProductTourCode(String productTourCode) {
        this.productTourCode = productTourCode;
    }

    public String getProductTourName() {
        return productTourName;
    }

    public void setProductTourName(String productTourName) {
        this.productTourName = productTourName;
    }

    public String getProductTourNameDetail() {
        return productTourNameDetail;
    }

    public void setProductTourNameDetail(String productTourNameDetail) {
        this.productTourNameDetail = productTourNameDetail;
    }

    public String getProductTourTime() {
        return productTourTime;
    }

    public void setProductTourTime(String productTourTime) {
        this.productTourTime = productTourTime;
    }

    public String getProductTourTimeStart() {
        return productTourTimeStart;
    }

    public void setProductTourTimeStart(String productTourTimeStart) {
        this.productTourTimeStart = productTourTimeStart;
    }

    public String getProductTourAvatar() {
        return productTourAvatar;
    }

    public void setProductTourAvatar(String productTourAvatar) {
        this.productTourAvatar = productTourAvatar;
    }

    public String getProductTourAddressStart() {
        return productTourAddressStart;
    }

    public void setProductTourAddressStart(String productTourAddressStart) {
        this.productTourAddressStart = productTourAddressStart;
    }

    public BigDecimal getProductTourPrice() {
        return productTourPrice;
    }

    public void setProductTourPrice(BigDecimal productTourPrice) {
        this.productTourPrice = productTourPrice;
    }

    public BigDecimal getProductTourPriceSale() {
        return productTourPriceSale;
    }

    public void setProductTourPriceSale(BigDecimal productTourPriceSale) {
        this.productTourPriceSale = productTourPriceSale;
    }

    public String getProductTourVehicle() {
        return productTourVehicle;
    }

    public void setProductTourVehicle(String productTourVehicle) {
        this.productTourVehicle = productTourVehicle;
    }

    public float getProductTourAssess() {
        return productTourAssess;
    }

    public void setProductTourAssess(float productTourAssess) {
        this.productTourAssess = productTourAssess;
    }

    public String getProductTourHighlightTour() {
        return productTourHighlightTour;
    }

    public void setProductTourHighlightTour(String productTourHighlightTour) {
        this.productTourHighlightTour = productTourHighlightTour;
    }

    public String getProductTourServiceTour() {
        return productTourServiceTour;
    }

    public void setProductTourServiceTour(String productTourServiceTour) {
        this.productTourServiceTour = productTourServiceTour;
    }

    public CategoryTourEntity getCategoryTourEntity() {
        return categoryTourEntity;
    }

    public void setCategoryTourEntity(CategoryTourEntity categoryTourEntity) {
        this.categoryTourEntity = categoryTourEntity;
    }

    public Set<ProductTourImageEntity> getProductTourImageEntitySet() {
        return productTourImageEntitySet;
    }

    public void setProductTourImageEntitySet(Set<ProductTourImageEntity> productTourImageEntitySet) {
        this.productTourImageEntitySet = productTourImageEntitySet;
    }

    public Set<DayEntity> getDayEntities() {
        return dayEntities;
    }

    public void setDayEntities(Set<DayEntity> dayEntities) {
        this.dayEntities = dayEntities;
    }

    public Boolean getProductTourIsHot() {
        return productTourIsHot;
    }

    public void setProductTourIsHot(Boolean productTourIsHot) {
        this.productTourIsHot = productTourIsHot;
    }

    public Boolean getProductTourIsSale() {
        return productTourIsSale;
    }

    public void setProductTourIsSale(Boolean productTourIsSale) {
        this.productTourIsSale = productTourIsSale;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public Set<SaleOrderEntity> getSaleOrderEntities() {
        return saleOrderEntities;
    }

    public void setSaleOrderEntities(Set<SaleOrderEntity> saleOrderEntities) {
        this.saleOrderEntities = saleOrderEntities;
    }
}
