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
        Country Poland=new Country(new BigDecimal("12345678910"));
        Country Kongo=new Country(new BigDecimal("12345679999999"));
        Country China=new Country(new BigDecimal("60000000000"));

        Continent Europa=new Continent();
        Europa.addCountry(Poland);

        Continent Africa =new Continent();
        Africa.addCountry(Kongo);

        Continent Asia=new Continent();
        Asia.addCountry(China);

        world.addContinent(Europa);
        world.addContinent(Africa);
        world.addContinent(Asia);

        //Then

        BigDecimal expectedQuantity = new BigDecimal("12418025678909");
        Assert.assertEquals(expectedQuantity,world.getPeopleQuantity());
    }

}
