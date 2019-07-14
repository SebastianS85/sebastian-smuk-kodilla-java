package com.kodilla.good.patterns.flightService;

import java.util.HashMap;

public class FlightDisplayService implements ResultDisplay {


    public void displayFlights(HashMap<Integer,Flight> displayList){
        if(displayList.size()==0){System.out.println("Sorry no connection found");}
        displayList.entrySet().stream()
                .map(s->s.getValue()).forEach(System.out::println);

    }
}
