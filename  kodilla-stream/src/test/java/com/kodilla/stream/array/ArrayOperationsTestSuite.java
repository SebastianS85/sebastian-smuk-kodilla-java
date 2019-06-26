package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int []tab={1,1,2,4,7,19};
        //When
        double adv=ArrayOperations.getAverage(tab);
        //Then
        Assert.assertEquals(5.66,adv,0.01);

    }
    @Test
    public void testGetAverageZero(){
        //Given
        int []tab={};
        //When
        double adv=ArrayOperations.getAverage(tab);
        //Then
        Assert.assertEquals(0,adv,0);

    }
}