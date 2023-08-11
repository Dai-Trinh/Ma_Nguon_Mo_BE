package com.example.manguonmo_be.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_day")
public class DayEntity extends AttributesCommon{

    @Column(name = "day_number")
    private Integer dayNumber;

    @Column(name = "day_name", length = 200)
    private String dayName;

    @Column(name = "day_content")
    private String dayContent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_tour_id")
    private ProductTourEntity productTourEntityDay;

    public Integer getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getDayContent() {
        return dayContent;
    }

    public void setDayContent(String dayContent) {
        this.dayContent = dayContent;
    }

    public ProductTourEntity getProductTourEntityDay() {
        return productTourEntityDay;
    }

    public void setProductTourEntityDay(ProductTourEntity productTourEntityDay) {
        this.productTourEntityDay = productTourEntityDay;
    }
}
