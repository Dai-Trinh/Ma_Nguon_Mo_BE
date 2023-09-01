package com.example.manguonmo_be.service.dto;

import javax.persistence.Column;
import javax.persistence.Lob;

public class DayDTO {

    private Integer id;

    private Integer dayNumber;

    private String dayName;


    private String dayContent;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
