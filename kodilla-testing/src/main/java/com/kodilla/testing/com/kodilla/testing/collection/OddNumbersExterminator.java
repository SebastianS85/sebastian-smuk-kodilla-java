package com.kodilla.testing.com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {



    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumbersList=new ArrayList<Integer>();
        for (int i=0;i<numbers.size();i++) {
           int odd=numbers.get(i)%2;

           if(odd==0){
               oddNumbersList.add(numbers.get(i));
           }

        }


     return oddNumbersList;
    }
}
