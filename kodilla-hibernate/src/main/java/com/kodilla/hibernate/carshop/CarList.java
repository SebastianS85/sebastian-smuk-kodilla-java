package com.kodilla.hibernate.carshop;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "CARS")
public class CarList {

    private int id;
    private String brand;
    private int buildYear;
    private List<RepairsCarriedOut>repairsCarriedOutList=new ArrayList<>();



    public CarList() {
    }

    public CarList(String brand, int buildYear) {
        this.brand = brand;
        this.buildYear = buildYear;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "CAR_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "BRAND")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @NotNull
    @Column(name = "BUILD_YEAR")
    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @OneToMany
            (
                    targetEntity = RepairsCarriedOut.class,
                    cascade = CascadeType.ALL,
                    fetch = FetchType.LAZY
            )
    public List<RepairsCarriedOut> getRepairsCarriedOutList() {
        return repairsCarriedOutList;
    }

    public void setRepairsCarriedOutList(List<RepairsCarriedOut> repairsCarriedOutList) {
        this.repairsCarriedOutList = repairsCarriedOutList;
    }
}
