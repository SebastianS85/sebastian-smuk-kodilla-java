package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country  {
   private String country;
   private BigDecimal quantity;
     public Country(String country,BigDecimal quantity) {
        this.quantity= quantity;
        this.country=country;
    }

    public  BigDecimal getPeopleQuantity(){

       return quantity;
    }

}
