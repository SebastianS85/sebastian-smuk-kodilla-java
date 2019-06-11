package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,2);
        int subResult_=calculator.substract(10,5);

        if (addResult==4){
            System.out.println(" Add test OK");
        } else {
            System.out.println("Add Error!");
        }
        if (subResult_==5){
            System.out.println(" Sub test OK");
        } else {
            System.out.println("Sub Error!");
        }
    }
}
