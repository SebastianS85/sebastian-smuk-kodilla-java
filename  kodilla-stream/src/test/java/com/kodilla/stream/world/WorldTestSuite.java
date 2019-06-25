package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world =new World();

        //When

        Continent Europa=new Continent();
        Europa.addCountry(new Country("Poland",new BigDecimal("420700000")));

        Continent Africa =new Continent();
        Africa.addCountry(new Country("Kongo",new BigDecimal("12345678910")));

        Continent Asia=new Continent();
        Asia.addCountry(new Country("China",new BigDecimal("800000000")));


        world.addContinent(Europa);
        world.addContinent(Africa);
        world.addContinent(Asia);

        //Then

        BigDecimal expectedQuantity = new BigDecimal("13566378910");
        Assert.assertEquals(expectedQuantity,world.getPeopleQuantity());
    }

}
