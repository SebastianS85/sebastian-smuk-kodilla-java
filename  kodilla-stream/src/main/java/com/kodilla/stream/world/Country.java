package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country implements PeopleQ {

    BigDecimal quantity;
     public Country(BigDecimal quantity) {
        this.quantity= quantity;

    }
    @Override
    public  BigDecimal getPeopleQuantity(){

       return quantity;
    }

}
