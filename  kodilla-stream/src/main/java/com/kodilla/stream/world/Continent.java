package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    List<Country>theCountryList=new ArrayList<>();

    public void addCountry(Country country){

        theCountryList.add(country);

    }

    public BigDecimal getContinentPeopleQuantity(){

        BigDecimal PeopleQuantity =theCountryList.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return PeopleQuantity;
    }

}
