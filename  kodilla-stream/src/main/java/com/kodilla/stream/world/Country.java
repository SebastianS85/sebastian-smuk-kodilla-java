package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country  {
    String country;
    BigDecimal quantity;
     public Country(String country,BigDecimal quantity) {
        this.quantity= quantity;
        this.country=country;
    }

    public  BigDecimal getPeopleQuantity(){

       return quantity;
    }

}
