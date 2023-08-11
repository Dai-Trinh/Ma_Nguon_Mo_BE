package com.example.manguonmo_be.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_system_plan")
public class SystemPlanEntity extends AttributesCommon{

    @Column(name="number_trip", nullable = false)
    private Integer numberTrip;
    @Column(name="number_guest", nullable = false)
    private Integer numberGuest;
    @Column(name="number_guide", nullable = false)
    private Integer numberGuide;
    @Column(name="number_tour", nullable = false)
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
