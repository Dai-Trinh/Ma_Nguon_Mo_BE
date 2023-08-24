package com.example.manguonmo_be.service.dto;

import javax.persistence.Column;

public class SytemPlanDTO {

    private Integer numberTrip;

    private Integer numberGuest;

    private Integer numberGuide;

    private Integer numberTour;

    public Integer getNumberTrip() {
        return numberTrip;
    }

    public void setNumberTrip(Integer numberTrip) {
        this.numberTrip = numberTrip;
    }

    public Integer getNumberGuest() {
        return numberGuest;
    }

    public void setNumberGuest(Integer numberGuest) {
        this.numberGuest = numberGuest;
    }

    public Integer getNumberGuide() {
        return numberGuide;
    }

    public void setNumberGuide(Integer numberGuide) {
        this.numberGuide = numberGuide;
    }

    public Integer getNumberTour() {
        return numberTour;
    }

    public void setNumberTour(Integer numberTour) {
        this.numberTour = numberTour;
    }
}
