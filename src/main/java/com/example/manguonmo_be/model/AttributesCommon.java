package com.example.manguonmo_be.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AttributesCommon {
    @Id // khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @Column(name = "id") // tên colunm mapping với property này
    private Integer id;
    @Column(name = "status", nullable = true)
    private Boolean status = Boolean.TRUE;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Column(name = "created_by", nullable = true)
    private int createdBy;
    @Column(name = "updated_date", nullable = true)
    private Date updatedDate;
    @Column(name = "updated_by", nullable = true)
    private int updatedBy;

    public Boolean getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }
}
