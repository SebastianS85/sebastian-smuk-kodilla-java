package com.kodilla.hibernate.carshop;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "REPAIRS")
public class RepairsCarriedOut {

    private int id;
    private Date created;
    private String repair;

    private CarList carList;


    public RepairsCarriedOut() {
    }

    public RepairsCarriedOut(String repair) {
        this.repair = repair;
        this.created = new Date();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "REPAIR_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @NotNull
    @Column
    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    @ManyToOne
    @JoinColumn(name = "CARS_ID")
    public CarList getCarList() {
        return carList;
    }

    public void setCarList(CarList carList) {
        this.carList = carList;
    }
}
