package com.kodilla.testing.collection;


import com.kodilla.testing.com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");}

    @Test
    public void testCaseEmptyList() {
        OddNumbersExterminator testExecutor = new OddNumbersExterminator();
        ArrayList<Integer> TestList = new ArrayList<>();
        System.out.println("testing empty list");
        Assert.assertTrue(testExecutor.exterminate(TestList).isEmpty());
    }
    @Test
    public void testList(){

        OddNumbersExterminator  testExecutor= new OddNumbersExterminator();
        System.out.println("testing full list");
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(i);
        }

        ArrayList<Integer>testList= new ArrayList<>();
        for(int i=0;i<100;i++){
            if(i%2==0){
                testList.add(i);
            }
        }

        assertEquals(testList, testExecutor.exterminate(list));

    }



    @After
    public void after(){
        System.out.println("Test Case: end");
        }
    }

