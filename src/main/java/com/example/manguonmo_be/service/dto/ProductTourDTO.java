package com.example.manguonmo_be.service.dto;


import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class ProductTourDTO {

    private String productTourCode;


    private String productTourName;

    private String productTourNameDetail;

    private String productTourTime;

    private String productTourTimeStart;

    private String productTourVehicle;

    private String productTourAddressStart;


    private BigDecimal productTourPrice;


    private BigDecimal productTourPriceSale;


    private String productTourAvatar;


    private float productTourAssess;


    private String productTourHighlightTour;

    private String productTourServiceTour;

    private String categoryTourDTO;

    private Set<ProductTourImageDTO> productTourImageDTOS = new HashSet<>();

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

    public String getProductTourVehicle() {
        return productTourVehicle;
    }

    public void setProductTourVehicle(String productTourVehicle) {
        this.productTourVehicle = productTourVehicle;
    }

    public String getProductTourAddressStart() {
        return productTourAddressStart;
    }

    public void setProductTourAddressStart(String productTourAddressStart) {
        this.productTourAddressStart = productTourAddressStart;
    }

    public String getProductTourAvatar() {
        return productTourAvatar;
    }

    public void setProductTourAvatar(String productTourAvatar) {
        this.productTourAvatar = productTourAvatar;
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

    public Set<ProductTourImageDTO> getProductTourImageDTOS() {
        return productTourImageDTOS;
    }

    public void setProductTourImageDTOS(Set<ProductTourImageDTO> productTourImageDTOS) {
        this.productTourImageDTOS = productTourImageDTOS;
    }

    public String getCategoryTourDTO() {
        return categoryTourDTO;
    }

    public void setCategoryTourDTO(String categoryTourDTO) {
        this.categoryTourDTO = categoryTourDTO;
    }
}
