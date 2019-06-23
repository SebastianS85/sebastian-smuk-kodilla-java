package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    List<Continent>theContinentList=new ArrayList<>();

    public void addContinent(Continent continent){
        theContinentList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){

        BigDecimal totalPeopleQuantity =theContinentList.stream()
                .map(Continent::getContinentPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeopleQuantity;
    }
}
