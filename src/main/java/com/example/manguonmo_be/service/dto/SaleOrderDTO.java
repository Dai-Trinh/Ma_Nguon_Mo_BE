package com.example.manguonmo_be.service.dto;

import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.UserEntity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

public class SaleOrderDTO {


    private String code;


    private BigDecimal total;

    private String customerName;


    private String customerPhone;


    private String customerEmail;


    private String note;


    private Integer numberAdult;


    private Integer numberChildrenBig;


    private Integer numberChildrenNormal;


    private Integer numberChildrenSmall;


    private String seo;

    private UserDTO userDTO;


    private ProductTourDTO productTourDTO;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getNumberAdult() {
        return numberAdult;
    }

    public void setNumberAdult(Integer numberAdult) {
        this.numberAdult = numberAdult;
    }

    public Integer getNumberChildrenBig() {
        return numberChildrenBig;
    }

    public void setNumberChildrenBig(Integer numberChildrenBig) {
        this.numberChildrenBig = numberChildrenBig;
    }

    public Integer getNumberChildrenNormal() {
        return numberChildrenNormal;
    }

    public void setNumberChildrenNormal(Integer numberChildrenNormal) {
        this.numberChildrenNormal = numberChildrenNormal;
    }

    public Integer getNumberChildrenSmall() {
        return numberChildrenSmall;
    }

    public void setNumberChildrenSmall(Integer numberChildrenSmall) {
        this.numberChildrenSmall = numberChildrenSmall;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public ProductTourDTO getProductTourDTO() {
        return productTourDTO;
    }

    public void setProductTourDTO(ProductTourDTO productTourDTO) {
        this.productTourDTO = productTourDTO;
    }
}
