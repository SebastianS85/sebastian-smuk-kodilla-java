package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac=new Bigmac.BurgerBuilder()
                .bun("sezam")
                .burgers(4)
                .ingredient("Mushrooms")
                .ingredient("Garlic")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
